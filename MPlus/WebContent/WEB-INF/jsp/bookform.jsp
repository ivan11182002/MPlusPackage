<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<h1>Add New Book</h1>
<form:form method="post" action="save">  
    <table>   
        <tr>  
            <td>ISBN : </td> 
            <td><form:input path="isbn"  /></td>
        </tr>  
        <tr>  
            <td>Title : </td> 
            <td><form:input path="title"  /></td>
        </tr>  
        <tr>  
            <td>Edition :</td>  
            <td><form:input path="editionNumber" /></td>
        </tr> 
        <tr>  
            <td>Copyright :</td>  
            <td><form:input path="copyright" /></td>
        </tr>
        <tr>  
            <td>Author :</td>  
            <td><form:input path="author" /></td>
        </tr> 
        <tr>  
            <td>Publisher :</td>  
            <td><form:input path="publisher" /></td>
        </tr> 
        <tr>  
            <td>Price :</td>  
            <td><form:input path="price" /></td>
        </tr> 
        <tr>  
            <td> </td>  
            <td><input type="submit" value="Save" /></td>  
        </tr>  
    </table>  
</form:form>  
