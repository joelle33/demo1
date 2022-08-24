<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
 <div align="center">
 <header>
                <nav class="navbar navbar-expand-md navbar-light" style="background-color: rgb(255,215,0)">
                    <div>
                         <p class="navbar-brand" style="font-size:30px;" ><i> MTN everywhere you go! </i></p>
                    </div>
                </nav>
 </header>
  <form action="ThisServlet" method="post">
   <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" required="required" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" required="required" /></td>
    </tr>

   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>