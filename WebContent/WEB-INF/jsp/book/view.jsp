<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista dei libri</title>
</head>
<body>
<p>
  <a href="createBook">Inserisci un altro libro</a>
</p>
<fieldset>
<legend>Libri inseriti</legend>
<c:forEach items="${bookList}" var="book">
  Nome: <c:out value="${book.nome}" /><br/><br/>
  Autore: <c:out value="${book.autore}" /><br/><br/>
  Anno: <c:out value="${book.dataDiUscita}" /><br/><br/>
  <hr/>
</c:forEach>
</fieldset>

</body>
</html>