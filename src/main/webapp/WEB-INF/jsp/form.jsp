<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buat Mobil</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>

<body class="container bg-dark text-white d-flex flex-column">
    <div class="d-flex flex-column m-5">
        <div class="d-flex flex-row justify-content-center">
            <h1 class="headline">JAVA CAR RENTAL</h1> <!-- Contoh dari non self closing Tag -->
            <h5 class="subheadline">BY SENDIKO</h5> <!-- Contoh dari non self closing Tag -->
        </div>
        <p class="align-self-center">Sebuah website penyewaan mobil yang berlokasi di Purwokerto.</p>
    </div>

    <a href="/view/index.html" class="btn btn-outline-light w-25 mx-5 mb-3">Kembali</a>
    <form class="form mx-5 p-3 gap-3 border border-light rounded-3 d-flex flex-column">
        <div>
            <label for="nama_mobil" class="form-label">Nama Mobil</label>
            <input name="nama_mobil" type="text" class="form-control bg-dark text-light" />
        </div>
        <div>
            <label for="plat_nomer" class="form-label">Plat Nomer</label>
            <input name="plat_nomer" type="text" class="form-control bg-dark text-light" />
        </div>
        <div>
            <label for="brand" class="form-label">Brand</label>
            <input name="brand" type="text" class="form-control bg-dark text-light" />
        </div>
        <div>
            <label for="model" class="form-label">Model</label>
            <input name="model" type="text" class="form-control bg-dark text-light" />
        </div>
        <div>
            <label for="tahun_keluaran" class="form-label">Tahun Keluaran</label>
            <input name="tahun_keluaran" type="number" class="form-control bg-dark text-light" />
        </div>
        <div>
            <label for="harga_sewa" class="form-label">Harga Sewa</label>
            <div class="input-group">
                <span class="input-group-text bg-dark text-light">Rp. </span>
                <input name="harga_sewa" type="number" class="form-control bg-dark text-light" />
                <span class="input-group-text bg-dark text-light">/Hari</span>
            </div>
        </div>
        <div>
            <label for="jumlah_kursi" class="form-label">Jumlah Kursi</label>
            <input name="jumlah_kursi" type="number" class="form-control bg-dark text-light" />
        </div>
        <button type="submit" class="btn btn-primary m-3 align-self-center w-75">Simpan Mobil</button>
    </form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
        crossorigin="anonymous"></script>
</body>

</html>