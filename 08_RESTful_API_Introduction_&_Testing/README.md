# Pengenalan RESTful API

## API
- API adalah singkatan dari Application Programming Interface
- API membuat komuniasi  dan penukaran data dengan software yang lain
- API Workflow
  ![API Workflow](https://d32myzxfxyl12w.cloudfront.net/assets/images/article_images/602bac42d4b43d46f8ab9b94128e0463a193b649.png?1556265395)

## REST API
- REST adalah singkatan dari Representational State Transfer
- HTTP Method : ***GET, PUT, POST, DELETE***
- HTTP Response Code : 200 OK, 400 Bad Request, 500 Internal Server Error

==================================================

# API Testing 

## Pendekatan API
- **Mengerti** fungsi dari API
- Dapat **mengaplikasikan** teknik testing
- Input Parameter untuk API perlu **direncanaka**n dan ditentukna sebelumnya
- Jalankan test case dan **bandingkan** antara hasil yang diharapkan dengan hasil yang didapatkan

## Macam API Testing
- Functionality testing
- Load Test testing
- Security testing

## API Testing Tools
![Postman](https://seeklogo.com/images/P/postman-logo-F43375A2EB-seeklogo.com.png)
![JMeter](https://assets-global.website-files.com/5dfb2c5f5b18187014b68b84/5e2aaaf0e8da5a419c2239f1_jmeter_square.svg)
![Frisby.js](https://3449745325-files.gitbook.io/~/files/v0/b/gitbook-legacy-files/o/assets%2F-M-RfV58soRdBGcVkpSF%2F-M-RfWKxtjzRNqtHplVi%2F-M-RfWdecutzQ0EZemPw%2Ffrisbyjs.png?generation=1581029138563311&alt=media)
![Rest Assured](https://qaautomationexpert.files.wordpress.com/2021/05/image-103.png)

## Perbedaan API test & Unit test
### Unit Test
- Dilakukan Developer
- Fungsi terpisah
- Developer bisa akses source code
- Scopenya terbatas

### API Test
- Tester perform it
- End to End
- Tidak bisa akses source code
- Hanya fungsi API saja

## API Testing Process
- Specification Review
- Specification Development
- Framework Development
- Test Case Development
- Execution & Report

## Test Case untuk API Testing
- Mendapatkan balikan yang sesuai dengan inputan
- Apakah memberikan balikan atau tidak
- Apakah mengganggu fitur yang lain atau tidak
- Update struktu data
- Memodifikasi data yang ada

## Cara melatih API Testing
- Kelompokkan test case kedalam kategori
- Beri judul sesuai test
- Berhati hati ketika melakukan test yang berhubungan dengan menghapus sesuatu
- Memikirkan kombinasi saat input pada API

## Type Output API
- JSON dan XML
- Response passed or fail
- Memverifikasi data yang input/update sudah bertambah ato kurang
- Memverifikasi waktu response

## Type Bug API
- Gagal melakukan error handling
- Kesulitan menyambung API
- Isu keamanan
- Perfomance issuses
- Error
- Struktur data respon tidak benar

## Kelebihan Testing API
- Efisiensi waktu
- Bahasa yg independen
- Mengurangi biaya testing
- Mengurangi resiko

## Tantangan API Testing
- Kombinasi parameter
- Tidak ada GUI
- Mengetahui parameter terlebih dahulu
- Test error handling setiap API

### Referensi : 
- PPT Alta.id 
- https://qaautomation.expert/2021/05/22/rest-assured-tutorials/
- https://www.360logica.com/blog/jmeter-performance-testing/