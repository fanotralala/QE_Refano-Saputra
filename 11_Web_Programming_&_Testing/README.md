# Web Programming and Testing

## Front End
Frontend adalah bagian dari sebuah website yang bertanggung jawab untuk menciptakan tampilan yang menarik bagi pengunjung.

## HTML
HTML adalah singkatan dari Hypertext Markup Language, HTML digunakan sebagai standar untuk menampilkan halaman web.

### Manfaat HTML
- Buat struktur situs
- Mengontrol tampilan dan konten situs web
- Buat tabel menggunakan tag tabel HTML
- Membuat formulir HTML
- Membuat gambar di atas kanvas
- Publikasikan halaman web secara online

## Editor HTML
- Notepad
- Notepad++
- VSCode

## Dokumentasi HTML
- *! DOCTYPE html*, berguna untuk mendefinisikan dokumen sebagai HTML5
- *html*, untuk element tool
- *head*, untuk memberi tahu informasi mengenai dokumen
- *title*, untuk judul
- *body*, untuk menampilkan konten halaman

## Tag Heading and Paragraph
- *h1* - *h6* untuk heading
- *p* untuk paragraph

## Styling Paragraph
- *strong* untuk bold
- *em* untuk italic
- *s* untuk strikethrough
- *br* untuk line break

=====================================================

# CSS (Cascading Style Sheet)

## CSS
CSS adalah singkatan dari Cascading Style Sheet, yang berguna untuk menghias halaman web, dapat menambahkan warna, font, background, dan lainnnya, kemudian juga dapat mengatur posisi pada halaman web seperti float, align, display, dan lainnya.

## Tag Table
Tag table berguna untuk membuat tabel pada halaman website dengan menggunakan tag *table* kemudian untuk barisnya menggunakan <tr> dan kolom menggunakan *td*, dan kolom pada tabel header menggunakan *th*.

## Tag form
Berguna untuk membuat form pada laman website dengan tag *form*

## Cara menambah file CSS
1. External CSS, disisipkan dalam tag *head*
2. Internal CSS, didefinisikan dalam elemen *style*, *head*, *body*
3. Inline CSS, dapat digunakan untuk elemen tunggal pada HTML, untuk menerapkan style yang unik

## CSS Selector
Digunakan untuk memilih element yang akan distyling

## Penanda HTML
### ID (#)
- Setia
- p elemen hanya dapat memiliki satu tag id
- Dalam satu halaman tidak boleh ada dua penamaan id yang berbeda

### Class (.)
- Tag class dengan nama yang sama dapat dipakai berulang-ulang dalam halaman yang sama
- Satu elemen dapat memiliki lebih dari satu Class yang berbeda.

## CSS Grouping
Beberapa selector dapat dikelompokkan dalam satu deklarasi style

## CSS Font
Font yang digunakan untuk teks, seperti ukuran, ketebalan,kemiringan, dan lainnya. Font-font yang dapat digunakan dapat dicari pada google dan mendowloadnya.

## CSS Margin and Padding
Untuk membuat ruang di sekitar element

## CSS Background
Untuk membuat style pada background, contohnya seperti color untuk menentukan warna, image untuk menentukan gambar, size untuk menentukan ukuran gambar, dan lainnya

## CSS Link
- :hover, untuk kondisi mouse ketika terdapat pada atas elemen
- :active, style yang diberikan ketika link ditekan
- :visited, style yang diberikan ketika link sudah ditekan

## CSS Transisi
Berguna untuk mengubah value properti menjadi lebih halus dalam durasi yang ditentukan.

## CSS Display
Untuk menentukan tampilan pada elemen yang dipilih, dapat dengan block (yang selalu dimulai pada baris baru), inline-block (membutuhkan lebar sesuai yang diperlukan), dan none untuk menyembunyikan elemen untuk tidak ditampilkan

## CSS Table
Untuk membuat style pada elemen table HTML, dapat dengan menambah border, border-collapse untuk menjadi single border, dan :nth-child(even) untuk membuat backgroun stripe.

## Frontend Framework
Frontend Framework merupakan sekumpulan aturan kode yang dapat digunakan untuk mempermudah kita dalam membuat suatu tampilan website.

## Kelebihan Bootsrap
- Gratis
- Mudah untuk dipelajari
- Cepat
- Support responsive

## Class pada bootstrap
Terdapat beberapa kelas pada bootstrap seperti container, row, column, dan button.

## Sistem Grid
Sistem grid digunakan pada column yang mana dalam satu halaman terdapat sejumalah 12 kemudian dapat dipisah sesuai dengan kebutuhan.

====================================================

# Serenity BBD

## Architecture Serenity BDD
Serenity merupakan open source BDD framework yang membantu pengembang dalam pembuatan penulisan well-structured dan maintainable automated acceptance test.

## Define Requirement
- Ketika menggunakan serenity harus memulai dengan kebutuhan yang akan diimplementasikan
- Sering diibaratkan sebagai user storie dengan kriteria yang membantu perjelas persyaratan.
- Terdapat stories yang serenity automate

## Automate Acceptance Criteria
- Menjelaskan acceptance criteria dalam high level business term
- Menggunakan BDD tool untuk record seperti cucumber dan lainnya, kemudian mengimplementasikannya

## Report on Test Result
Setiap test yang kita lakukan harus terdapat report hasilnya, salah satunya dengan serenity yang memberikan hasil detail pada pengujian yang dilakukan.

## BDD with Cucumber
### Steps
Write Story - Map Steps to Java - Configure Stories - Run Stories - View Reports

## Yang harus disiapkan
- Maven
- Homebrew
- Chrome
- Intellij

## Writing the Test
Serenity Cucumber - Create File Stories - Create File Test Class - Create File Test Steps - Create File Page Object