<%@page import="eCommerce.demo.model.Blazers_table"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products Info</title>
</head>
<body>

	 
	 <%-- 	 <c:forEach var = "i" items="${listblazer}">
	         <c:out value = "${i.getImage1()}"/> 
	         <c:out value = "${i.getTitle()}"/> 
	         <c:out value = "${i.getPrice_dis()}"/> 
	         <c:out value = "${i.getOff()}"/>
	         <c:out value = "${i.getColor()}"/>
	    </c:forEach>  --%>
    
<%-- <%--     ${listblazer} --%> 
    
		
    
    
    
    <%
    
    	List<Blazers_table> listblazer = (List<Blazers_table>)request.getAttribute("listblazer");
    	
    	for(Blazers_table b:listblazer)
    	{
    %>
    		
    		
    		
    		
    	<div class="col">
    		
    		<%-- <%= b.getImage1()%> --%>
    	
<!--        <img src= "*{'data:image/jpeg;base64, '+{b.getImage1()}}" style="height:100px; width:100px;">-->

            <img src="data:image/jpg;base64, ${b.getImage1()}" alt="Blazer Image" style="height:100px; width:100px;">

            <p><%= b.getTitle() %></p>
            <p>Price - &#8377 <%= b.getPrice_dis() %></p>
            <h3><%= b.getOff() %>% OFF</h3>
            <button>SALE</button>
        </div>

    <%
    	}
    %>
    
    
    
    
    
</body>
</html>