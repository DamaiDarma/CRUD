<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Absen Siswa List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <table class="table table-striped">
   <thead class="thead-dark">
    <th scope="row">Id_absen</th>
    <th scope="row">Nis</th>
    <th scope="row">Jam Hadir</th>
    <th scope="row">Id Hari</th>
    <th scope="row">Id Tanggal</th>
    <th scope="row">Id Jam</th>
    <th scope="row">Id Pelajaran</th>
    <th scope="row">Id Kelas</th>
    <th scope="row">Nik</th>
    <th scope="row">Keterangan</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${absen_siswaList}" var="absen_siswa" >
     <tr>
      <td>${absen_siswa.id_absen}</td>
      <td>${absen_siswa.nis}</td>
      <td>${absen_siswa.jam_hadir}</td>
      <td>${absen_siswa.id_hari}</td>
      <td>${absen_siswa.id_tanggal}</td>
      <td>${absen_siswa.id_jam}</td>
      <td>${absen_siswa.id_pelajaran}</td>
      <td>${absen_siswa.id_kelas}</td>
      <td>${absen_siswa.nik}</td>
      <td>${absen_siswa.keterangan}</td>
      <td>
       <spring:url value="/absensiswa/editAbsenSiswa/${absensiswa.id}" var="editURL" />
       <a class="btn btn-info" href="${editURL}" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/absensiswa/deleteAbsensiswa/${absensiswa.id}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/absensiswa/addAbsenSiswa/" var="addURL" />
  <a class="btn btn-success" href="${addURL}" role="button" >Tambah Absen Siswa</a>
 </div>
</body>
</html>