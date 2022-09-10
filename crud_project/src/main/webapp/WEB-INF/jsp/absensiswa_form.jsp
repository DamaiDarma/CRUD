<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Tambah Absen Siswa</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/ansensiswa/addAbsenSiswa" var="addURL" />
  <h2>Add Absen Siswa</h2>
  <form:form modelAttribute="absensiswaForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
        <label>Id Absen</label>
        <form:input path="id_absen" cssClass="form-control" id="id_absen" />
   </div>
   <div class="form-group">
        <label>Nis</label>
        <form:input path="nis" cssClass="form-control" id="nis" />
   </div>
   <div class="form-group">
        <label>Jam Hadir</label>
        <form:input path="jam_hadir" cssClass="form-control" id="jam_hadir" />
   </div>
   <div class="form-group">
        <label>Id_Hari</label>
        <form:input path="id_hari" cssClass="form-control" id="id_hari" />
   </div>
   <div class="form-group">
        <label>Id Tanggal</label>
        <form:input path="id_tanggal" cssClass="form-control" id="id_tanggal" />
   </div>
   <div class="form-group">
        <label>Id_jam</label>
        <form:input path="id_jam" cssClass="form-control" id="id_jam" />
   </div>
   <div class="form-group">
        <label>Id_Pelajaran</label>
        <form:input path="id_pelajaran" cssClass="form-control" id="id_pelajaran" />
   </div>
   <div class="form-group">
        <label>Id Kelas</label>
        <form:input path="id_kelas" cssClass="form-control" id="id_kelas" />
    </div>
    <div class="form-group">
        <label>Nik</label>
        <form:input path="nik" cssClass="form-control" id="nik" />
    </div>
    <div class="form-group">
        <label>Keterangan</label>
        <form:input path="keterangan" cssClass="form-control" id="keterangan" />
    </div>
        <button type="submit" class="btn btn-success">Add Absen Siswa</button>
  </form:form>
  
 </div>
</body>
</html>