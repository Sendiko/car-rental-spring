<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html> <!-- Sebuah tag diawali dengan < dan diakhiri > -->
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Belajar Dasar HTML</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Plus+Jakarta+Sans:ital,wght@0,200..800;1,200..800&display=swap"
        rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <!-- <link rel="stylesheet" href="styles.css"> -->
</head>

<body class="container bg-dark text-white d-flex flex-column">
    <div class="d-flex flex-column m-5">
        <div class="d-flex flex-row justify-content-center">
            <h1 class="headline">JAVA CAR RENTAL</h1> <!-- Contoh dari non self closing Tag -->
            <h5 class="subheadline">BY SENDIKO</h5> <!-- Contoh dari non self closing Tag -->
        </div>
        <p class="align-self-center">Sebuah website penyewaan mobil yang berlokasi di Purwokerto.</p>
    </div>

    <div class="table-responsive">
        <table class="table table-dark table-bordered border-light align-middle w-100">
            <thead>
                <tr>
                    <th>Nama Pelanggan</th>
                    <th>Nomor Induk Kependudukan</th>
                    <th>Nomor Handphone</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td>${customer.name}</td>
                        <td>${customer.nik}</td>
                        <td>${customer.phoneNumber}</td>
                    </tr>
                </c:forEach>
                <tr>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>
</body>

</html>