 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><!-- <th>Id</th> --><th>Name</th><!-- <th>Salary</th><th>Designation</th> --></tr>  
   <c:forEach var="stu" items="${list}">   
   <tr>  
  <%--  <td>${stu.id}</td> --%>  
   <td align="center">${stu.name}</td>  
   <%-- <td>${stu.salary}</td>  
   <td>${stu.designation}</td>   --%>
   </tr>  
   </c:forEach>  
   </table> 