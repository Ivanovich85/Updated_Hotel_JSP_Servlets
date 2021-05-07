<!-- *************************************************************************** -->

<!-- Updated HOME.HTML -->

<!-- *************************************************************************** -->

<!-- header -->
<%@ include file="include/header.jsp" %>
<!-- end of header -->

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<c:set var="date" value="<%= new java.util.Date()%>" />

<div id="headerwrap">
   <div class="container">
     <div class="row">
     
     
       <div class="col-lg-8 col-lg-offset-2">
         <h3>Time: <fmt:formatDate type="time" value="${date}"/></h3>
         <h1>Date: <fmt:formatDate type="date" value="${date}"/></h1>
         <%-- <h5>Date and Time: <strong><fmt:formatDate type="both" value="${date}"/></strong></h5>
         <h5>Date: <fmt:formatDate type="date" value="${date}"/></h5> --%>
       </div>
       
       <div class="col-lg-8 col-lg-offset-2 img">
         <h1>Welcome to Ventana Hotels</h1>
		<img src="assets/images/poolday.jpeg" alt="" style="width:440px;height:267px;"><img src="assets/images/stairwell.jpeg" alt="" style="width:440px;height:267px;"><img src="assets/images/poolnight.jpeg" alt="" style="width:440px;height:267px;">
		<br><br>
       </div>
       
       
     </div><!-- /row -->
   </div><!-- /container -->
 </div>
 
 
 <div class="container">
	<div class="row">
		<div class="col-lg-6">
		<h1>Hello World this is an updated project originally created by my group in college</h1>
		<p>Starting to understand the MVC framework still have a ways to go but I am getting this and understanding what i am doing. Also getting better at troubleshooting any issues I run into.
		</div>
	</div> 
</div>

<!-- footer -->
<%@ include file="include/footer.jsp" %>
<!-- end of footer -->