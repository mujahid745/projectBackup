<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <div>
         ${msg}
     </div>
    <h2>Lead  |    Details</h2>
    First name: ${lead.firstName}<br/>
    Last name: ${lead.lastName}<br/>
    Email: ${lead.email}<br/>
    Mobile: ${lead.mobile}<br/>
    Source: ${lead.source}<br/>
    
    
    <form action="sendEmail" method="post">
       <input type="hidden" name="email" value="${lead.email}"/>
       <input type="submit" value="send"/>
    </form>
    
     <form action="convertLead" method="post">
       <input type="hidden" name="id" value="${lead.id}"/>
       <input type="submit" value="convert"/>

</body>
</html>