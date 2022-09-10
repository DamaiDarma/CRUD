<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Tambah Absen Guru</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/guru/addGuru" var="addURL" />
  <h2>Add Absen Guru</h2>
  <form:form modelAttribute="guruForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
        <label>Nik</label>
        <form:input path="nik" cssClass="form-control" id="nik" />
   </div>
   <div class="form-group">
        <label>id dosen</label>
        <form:input path="id_dosen" cssClass="form-control" id="id_dosen" />
   </div>
   <div class="form-group">
        <label>Jam Datang</label>
        <form:input path="jam_datang" cssClass="form-control" id="jam_datang" />
   </div>
   <div class="form-group">
        <label>Jam Pulang</label>
        <form:input path="jam_pulang" cssClass="form-control" id="jam_pulang" />
   </div>
   <div class="form-group">
        <label>Hari</label>
        <form:input path="hari" cssClass="form-control" id="hari" />
   </div>
   <div class="form-group">
        <label>Tanggal</label>
        <form:input path="tanggal" cssClass="form-control" id="tanggal" />
   </div>
   <div class="form-group">
        <label>Keterangan</label>
        <form:input path="keterangan" cssClass="form-control" id="keterangan" />
   </div>
        <button type="submit" class="btn btn-success">Add Absen Guru</button>
  </form:form>
  
 </div>
</body>
</html>