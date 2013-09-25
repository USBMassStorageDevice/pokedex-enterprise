<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="examplePokemonId" value="123"/>
<c:set var="exampleSpeciesId" value="123"/>
<c:set var="exampleVersionId" value="1"/>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<c:url value="/showMessage.html" var="messageUrl" />
		<ul>			
			<c:forEach items="${endpoints}" var="endpoint">
				<c:set var="example" value="${fn:replace(endpoint.value, '{pokemonId}', examplePokemonId)}"/>
				<c:set var="example" value="${fn:replace(example, '{speciesId}', exampleSpeciesId)}"/>
				<c:set var="example" value="${fn:replace(example, '{versionId}', exampleVersionId)}"/>
				<li>${fn:replace(endpoint.key, 'get', '')} : <a href="${example}">${endpoint.value}</a></li>
			</c:forEach>
		</ul>		
	</body>
</html>
