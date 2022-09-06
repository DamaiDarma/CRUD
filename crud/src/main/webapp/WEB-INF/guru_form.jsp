<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Tambah Guru</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/student/addGuru" var="addURL" />
  <h2>Add Guru</h2>
  <form:form modelAttribute="guruForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Nik</label>
    <form:input path="nik" cssClass="form-control" id="nik" />
   </div>
   <div class="form-group">
    <label>Namaptk</label>
    <form:input path="lastname" cssClass="form-control" id="namaptk" />
   </div>
   <div class="form-group">
    <label>Jenis Kelamin</label>
    <form:input path="jenis_kelamin" cssClass="form-control" id="jenis_kelamin" />
   </div>
   <div class="form-group">
    <label>Tempat Lahir</label>
    <form:input path="tempat_lahir" cssClass="form-control" id="tempat_lahir" />
   </div>
   <div class="form-group">
    <label>Agama</label>
    <form:input path="agama" cssClass="form-control" id="agama" />
   </div>
   <div class="form-group">
    <label>Tanggal Lahir</label>
    <form:input path="tgl_lahir" cssClass="form-control" id="tgl_lahir" />
   </div>
   <div class="form-group">
    <label>NPWP</label>
    <form:input path="npwp" cssClass="form-control" id="npwp" />
   </div>
   <div class="form-group">
    <label>Alamat</label>
    <form:input path="alamat" cssClass="form-control" id="alamat" />
   </div>
   <div class="form-group">
    <label>Status Perkawinan</label>
    <form:input path="status_perkawinan" cssClass="form-control" id="status_perkawinan" />
   </div>
   <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control" id="email" />
   </div>
   <div class="form-group">
    <label>Foto</label>
    <form:input path="foto" cssClass="form-control" id="foto" />
   </div>
   <button type="submit" class="btn btn-success">Add Guru</button>
  </form:form>
  
 </div>
</body>
</html>