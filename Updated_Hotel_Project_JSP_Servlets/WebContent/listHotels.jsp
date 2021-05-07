<!-- header -->
<%@include file="include/header.jsp" %>
<!-- end of header -->

<%@ page import = "java.util.List" %>
<%@ page import = "training.entity.Hotel" %>
<%@ page import = "training.entity.Address" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<h1>List of Hotels</h1>
			<hr>
			<table border ="1">
			  <thead>
			    <th> Hotel ID </th>
			    <th> Hotel Name </th>
			    <th> Rooms Available </th>
			    <th> Address </th>
			  </thead>
			  
			  <c:forEach items="${listHotels}" var="hotel">
			  	
			  	<tr>
			  	<td> ${hotel.lic_no}</td>
			  	<td> ${hotel.hotel_name}</td>
			  	<td> ${hotel.rooms_available}</td>
			  	<td> 
			  		${hotel.hotelAddress.street}<br>
			  		${hotel.hotelAddress.city}, ${hotel.hotelAddress.state} ${hotel.hotelAddress.zipCode}
			  	</td>
			  	</tr>
			  </c:forEach>
			  
			  
			  
			  
			</table>
			
		</div>
	</div> 
</div>




<!-- footer -->
<%@include file="include/footer.jsp" %>
<!-- end of footer -->