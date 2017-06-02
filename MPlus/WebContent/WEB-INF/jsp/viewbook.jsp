<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h1>${test}</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>ISBN</th><th>Title</th><th>Edition</th><th>Copyright</th>
        <th>Author</th><th>Publisher</th><th>Price</th>
        <th>Edit</th><th>Delete</th>
    </tr>
    <c:forEach var="book" items="${list}"> 
        <tr>
            <td>${book.isbn}</td>
            <td>${book.title}</td>
            <td>${book.editionNumber}</td>
            <td>${book.copyright}</td>
            <td>${book.author}</td>
            <td>${book.publisher}</td>
            <td>${book.price}</td>
            <td><a href="editbook/${book.isbn}">Edit</a></td>
            <td><a href="deletebook/${book.isbn}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="bookform">Add New Book</a>
