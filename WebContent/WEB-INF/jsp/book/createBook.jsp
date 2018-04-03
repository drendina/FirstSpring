<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aggiungi un libro</title>
</head>
<body>
<form:form commandName="book" method="post" action="create">
  <fieldset>
    <legend>Aggiungi un libro</legend>
    <p>
      <form:label for="nome" path="nome">Nome</form:label><br/>
      <form:input path="nome" /> <form:errors path="nome" />			
    </p>
    <p>	
      <form:label for="autore" path="autore">Autore</form:label><br/>
      <form:input path="autore" /> <form:errors path="autore" />
    </p>
    <p>
      <form:label for="dataDiUscita" path="dataDiUscita">Data di Creazione</form:label><br/>
      <form:input path="dataDiUscita" /> <form:errors path="dataDiUscita" />
    </p>
    <p>	
      <input type="submit" value="Crea Libro" />
    </p>
  </fieldset>
</form:form>
</body>
</html>