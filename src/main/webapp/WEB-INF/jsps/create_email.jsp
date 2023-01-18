<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      <h2>Send email page</h2>
       <form action="compose" method="post">
         <pre>
           To <input type="text" name="to" value="${email}"/>
           Subject <input type="text" name="subject"/>
           <textarea name="message" rows="4" cols="50">
           </textarea>
           <input type="submit" value="send"/>
         </pre>
        </form>
    
         
         

</body>
</html>