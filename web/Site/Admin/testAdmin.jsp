
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="clubadminclasses.*" %>

<jsp:useBean id="db" scope="page" class="clubadminclasses.DBConnector" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Softy's Online Bookstore - Admin System</title>
    </head>
    <body bgcolor="D0CFFD"><font face="comic sans ms">
        <h1>Data Administration Subsystem</h1>
        
        This allows you to maintain the book list by adding, modifying and
        deleting details of the books available. To modify or delete a book,
        click  <b>edit</b> or <b>delete</b> link alongside the book.
        To add a new book, click the <b>Add new book</b> link at the top or 
        bottom of the list.
        
        Books are normally shown in alphabetical order of title. If you wish to 
        change this, click one of these buttons:
        <p/>
        <form name="sortdata" method="put" action="testAdmin.jsp">
            <input type="submit" name="order" value="clubName" > &nbsp;
            <input type="submit" name="order" value="clubTown" > &nbsp;
            <input type="submit" name="order" value="clubEmail" > &nbsp;
            
        </form>
        
        
        <%
            db.createConnection();
            String clubOrder = "clubName";
            if (request.getParameter("order") != null)
                clubOrder = request.getParameter("order");
            ClubList list = db.selectAllClubs(clubOrder);
            db.closeConnection();
     

        %>
        
        


  </body>
</html>