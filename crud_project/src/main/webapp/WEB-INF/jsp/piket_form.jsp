<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Tambah Piket</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/piket/addPiket" var="addURL" />
  <h2>Add Piket</h2>
  <form:form modelAttribute="piketForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
        <label>Id Piket</label>
        <form:input path="id_piket" cssClass="form-control" id="id_piket" />
   </div>
   <div class="form-group">
        <label>Nik</label>
        <form:input path="nik" cssClass="form-control" id="nik" />
   </div>
   <div class="form-group">
    <label>Id Hari</label>
    <form:input path="id_hari" cssClass="form-control" id="id_hari" />
    </div>
        <button type="submit" class="btn btn-success">Add Piketn</button>
  </form:form>
  
 </div>
</body>
</html>