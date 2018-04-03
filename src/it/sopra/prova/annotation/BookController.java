package it.sopra.prova.annotation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.sopra.prova.dto.Book;

@Controller
public class BookController {

	private List<Book> bookList;

	public BookController() {
		bookList = new ArrayList<Book>();
	}

	// Mostra la pagina di creazione
	@RequestMapping(value = "/createBook", method = RequestMethod.GET)
	public String welcome(Model model) {
		model.addAttribute("book", new Book());
		return "/book/createBook";
	}

	// controlla se ci sono errori di validazione e in caso contrario aggiunge
	// il libro alla lista
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Valid Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/book/createBook";
		}
		bookList.add(book);
		return "redirect:getview";
	}

	// mostra la lista dei libri
	@RequestMapping(value = "/getview")
	public String view(Model model) {
		model.addAttribute("bookList", bookList);
		return "/book/view";
	}

}