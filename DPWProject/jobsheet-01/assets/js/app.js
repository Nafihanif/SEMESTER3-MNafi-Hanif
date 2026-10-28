function initNavToggle() {
  const toggleBtn = document.getElementById("nav-toggle-btn");
  const nav = document.querySelector("header nav");
  
  if (!toggleBtn || !nav) return; // Guard clause agar tidak error di halaman tanpa nav

  toggleBtn.addEventListener("click", function () {
    nav.classList.toggle("nav-open"); // Tambah/hapus class 'nav-open' saat diklik
  });
}

function initHapusConfirm() {
  document.querySelectorAll(".btn-hapus").forEach(function (btn) {
    btn.addEventListener("click", function () {
      const row = btn.closest("tr"); // Cari baris <tr> terdekat
      const nama = row ? row.querySelector("td")?.textContent : "data ini";
      
      const yakin = confirm("Yakin ingin menghapus \"" + nama + "\"?");
      if (yakin && row) {
        row.remove(); // Hapus baris dari tampilan DOM
      }
    });
  });
}

function initTableFilter() {
  const input = document.getElementById("search-input");
  const table = document.querySelector(".table-responsive table");
  
  if (!input || !table) return;

  input.addEventListener("keyup", function () {
    const keyword = input.value.toLowerCase();
    const rows = table.querySelectorAll("tbody tr");

    rows.forEach(function (row) {
      const teks = row.textContent.toLowerCase();
      // Sembunyikan baris jika teks tidak mengandung kata kunci
      row.style.display = teks.includes(keyword) ? "" : "none";
    });
  });
}

// Fungsi membuat pesan error
function tampilkanError(input, pesan) {
  hapusError(input);
  const span = document.createElement("span");
  span.className = "error";
  span.textContent = pesan;
  input.insertAdjacentElement("afterend", span);
}

// Fungsi menghapus pesan error
function hapusError(input) {
  const next = input.nextElementSibling;
  if (next && next.classList.contains("error")) {
    next.remove();
  }
}

// Fungsi utama validasi
function initValidasiForm() {
  const form = document.getElementById("form-tambah");
  if (!form) return;

  form.addEventListener("submit", function (e) {
    let valid = true;
    const judul = form.querySelector("[name='judul'], [name='nama']");

    if (judul && judul.value.trim() === "") {
      tampilkanError(judul, "Field ini wajib diisi.");
      valid = false;
    } else if (judul) {
      hapusError(judul);
    }

    if (!valid) {
      e.preventDefault(); // Batalkan reload/submit jika form belum valid
    }
  });
}

// Entry point utama
document.addEventListener("DOMContentLoaded", function () {
  initNavToggle();
  initHapusConfirm();
  initTableFilter();
  initValidasiForm();
});