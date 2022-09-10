<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Jadwal Pelajaran List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row">Id</th>
    <th scope="row">Nik</th>
    <th scope="row">Id Hari</th>
    <th scope="row">Id Pelajaran</th>
    <th scope="row">id Jam</th>
    <th scope="row">Id Kelas</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${jadwalpelajaranList}" var="jadwalpelajaran" >
     <tr>
      <td>${jadwalpelajaran.id}</td>
      <td>${jadwalpelajaran.nik}</td>
      <td>${jadwalpelajaran.id_hari}</td>
      <td>${jadwalpelajaran.id_pelajaran}</td>
      <td>${jadwalpelajaran.id_jam}</td>
      <td>${jadwalpelajaran.id_kelas}</td>
      <td>
       <spring:url value="/jadwalpelajaran/editjadwalpelajaran/${jadwalpelajaran.id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/jadwalpelajaran/deleteJadwalPelajaran/${jadwalpelajaran.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/jadwalpelajaran/addJadwalPelajaran/" var="addURL" />
  <a class="btn btn-success" href="${addURL}" role="button" >Tambah Jadwal Pelajaran</a>
 </div>
</body>
</html>