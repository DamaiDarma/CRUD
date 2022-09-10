<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Tambah Jadwal Pelajaran</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/jadwalpelajaran/addJadwalPelajaran" var="addURL" />
  <h2>Add Jadwa Pelajaran</h2>
  <form:form modelAttribute="jadwalpelajaranForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
        <label>Id</label>
        <form:input path="id" cssClass="form-control" id="id" />
   </div>
   <div class="form-group">
        <label>nik</label>
        <form:input path="nik" cssClass="form-control" id="nik" />
   </div>
   <div class="form-group">
    <label>Id Hari</label>
    <form:input path="id_hari" cssClass="form-control" id="id_hari" />
    </div>
   <div class="form-group">
        <label>Id Pelajaran</label>
        <form:input path="id_pelajaran" cssClass="form-control" id="id_pelajaran" />
   </div>
   <div class="form-group">
        <label>Id Jam</label>
        <form:input path="id_jam" cssClass="form-control" id="id_jam" />
   </div>
   <div class="form-group">
        <label>Id Kelas</label>
        <form:input path="id_kelas" cssClass="form-control" id="id_kelas" />
   </div>
        <button type="submit" class="btn btn-success">Add Jadwal Pelajaran</button>
  </form:form>
  
 </div>
</body>
</html>