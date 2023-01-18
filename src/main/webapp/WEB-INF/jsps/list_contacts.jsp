<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ include file="menu.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h2>List Contacts</h2>
       <table>
           <thead>
              <tr>
                 <th>FirstName</th>
                 <th>LastName</th>
                 <th>Email</th>
                 <th>Mobile</th>
                 <th>Source</th>
                 <th>Billing</th>
              </tr>
        </thead>
             <c:forEach var="contact" items="${contact}" >
                <tr>
                  <td><a href="contactCompose?id=${contact.id}">${contact.firstName}</a></td>
                  <td>${contact.lastName}</td>
                  <td>${contact.email}</td>
                  <td>${contact.mobile}</td> 
                  <td>${contact.source}</td>
                  <td><a href="billing?id=${contact.id}">Billing</a></td>
                </tr>
             </c:forEach>
           
        </table>

</body>
</html>