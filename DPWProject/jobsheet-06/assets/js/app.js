// ===== SIMPUS-Mini — assets/js/app.js =====
// Jobsheet 5: JavaScript DOM & Event
// Jobsheet 6: initHapusConfirm() diubah ke event delegation (lihat §2)
// File ini sama persis dimuat di semua halaman (lihat <script> sebelum
// </body>), jadi tiap fungsi punya guard clause supaya aman dipanggil
// walau elemen yang dicari tidak ada di halaman tersebut.

// ===== 1. Menu Hamburger (digerakkan JS, menggantikan checkbox hack Jobsheet 3) =====
function initNavToggle() {
    const toggleBtn = document.getElementById("nav-toggle-btn");
    const nav = document.querySelector("header nav");
    if (!toggleBtn || !nav) return;

    toggleBtn.addEventListener("click", function () {
        nav.classList.toggle("nav-open");
    });
}

// ===== 2. Konfirmasi Hapus (baru di tampilan, belum ke server) =====
// Jobsheet 6: diubah ke event delegation — baris tabel sekarang dibuat
// dinamis oleh buku.js/anggota.js setelah fetch() selesai, jadi tombol
// .btn-hapus belum tentu ada saat DOMContentLoaded. Dengan memasang
// listener di document (elemen yang selalu ada sejak awal), klik pada
// tombol yang baru muncul kapan pun tetap akan tertangkap lewat event
// bubbling.
function initHapusConfirm() {
    document.addEventListener("click", function (e) {
        const btn = e.target.closest(".btn-hapus");
        if (!btn) return;

        const row = btn.closest("tr");
        const nama = row ? row.querySelector("td")?.textContent : "data ini";
        const yakin = confirm("Yakin ingin menghapus \"" + nama + "\"?");
        if (yakin && row) {
            row.remove();
        }
    });
}

// ===== 3. Filter Tabel Real-Time =====
function initTableFilter() {
    const input = document.getElementById("search-input");
    const table = document.querySelector(".table-responsive table");
    if (!input || !table) return;

    input.addEventListener("keyup", function () {
        const kataKunci = input.value.toLowerCase();
        const rows = table.querySelectorAll("tbody tr");
        rows.forEach(function (row) {
            const teks = row.textContent.toLowerCase();
            row.style.display = teks.includes(kataKunci) ? "" : "none";
        });
    });
}

// ===== 4. Validasi Form (client-side) =====
function tampilkanError(input, pesan) {
    hapusError(input); // bersihkan pesan error lama dulu supaya tidak dobel
    const span = document.createElement("span");
    span.className = "error";
    span.textContent = pesan;
    input.insertAdjacentElement("afterend", span);
}

function hapusError(input) {
    const next = input.nextElementSibling;
    if (next && next.classList.contains("error")) {
        next.remove();
    }
}

function initValidasiForm() {
    const form = document.getElementById("form-tambah");
    if (!form) return;

    form.addEventListener("submit", function (e) {
        let valid = true;

        // Kolom utama: judul buku ATAU nama anggota, tergantung form mana
        // yang sedang aktif (hanya salah satu yang ada di tiap halaman).
        const utama = form.querySelector("[name='judul'], [name='nama']");
        if (utama && utama.value.trim() === "") {
            tampilkanError(utama, "Kolom ini wajib diisi.");
            valid = false;
        } else if (utama) {
            hapusError(utama);
        }

        // Pengarang — hanya ada di form Tambah Buku
        const pengarang = form.querySelector("[name='pengarang']");
        if (pengarang) {
            if (pengarang.value.trim() === "") {
                tampilkanError(pengarang, "Kolom ini wajib diisi.");
                valid = false;
            } else {
                hapusError(pengarang);
            }
        }

        // Tahun terbit — hanya ada di form Tambah Buku
        const tahun = form.querySelector("[name='tahun']");
        if (tahun) {
            const nilaiTahun = parseInt(tahun.value, 10);
            if (isNaN(nilaiTahun) || nilaiTahun < 1900 || nilaiTahun > 2026) {
                tampilkanError(tahun, "Tahun harus di antara 1900-2026.");
                valid = false;
            } else {
                hapusError(tahun);
            }
        }

        // Stok — hanya ada di form Tambah Buku
        const stok = form.querySelector("[name='stok']");
        if (stok) {
            const nilaiStok = parseInt(stok.value, 10);
            if (isNaN(nilaiStok) || nilaiStok < 0) {
                tampilkanError(stok, "Stok wajib diisi dan tidak boleh negatif.");
                valid = false;
            } else {
                hapusError(stok);
            }
        }

        // No. Anggota — hanya ada di form Tambah Anggota
        const noAnggota = form.querySelector("[name='no_anggota']");
        if (noAnggota) {
            if (noAnggota.value.trim() === "") {
                tampilkanError(noAnggota, "Kolom ini wajib diisi.");
                valid = false;
            } else {
                hapusError(noAnggota);
            }
        }

        if (!valid) {
            e.preventDefault();
        }
    });
}

// ===== Entry point: jalankan semua fitur setelah DOM siap =====
document.addEventListener("DOMContentLoaded", function () {
    initNavToggle();
    initHapusConfirm();
    initTableFilter();
    initValidasiForm();
});
