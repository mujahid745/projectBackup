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
        <table>
           <thead>
              <tr>
                 <th>FirstName</th>
                 <th>LastName</th>
                 <th>Email</th>
                 <th>Mobile</th>
                 <th>Source</th>
              </tr>
           </thead>
             <c:forEach var="lead" items="${lead}" >
                <tr>
                  <td><a href="leadCompose?id=${lead.id}">${lead.firstName}</a></td>
                  <td>${lead.lastName}</td>
                  <td>${lead.email}</td>
                  <td>${lead.mobile}</td> 
                  <td>${lead.source}</td>
                </tr>
             </c:forEach>
           
        </table>

</body>
</html>