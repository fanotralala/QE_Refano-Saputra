# Fundamental Performance Test

## Performance Test
Teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja. Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) dan penggunaan sumber daya.

## Apa yang diukur dari Performance Test
1. Performa suatu aplikasi sampai batas terentu
2. Bukan functional-testing 
3. Busa memahami macam bentuk seperti reliabiliy, stability dan availability pada environment. Seperti mengamati respon time dan melihat sistem berinteraksi dengan jumlah data yang besar

## Mengapa jarang dilakukan
Dikarenakan biayanya cukup mahal, tetapi dapat dijadikan tolak ukur apakah cukup dalam mengakomodasi traffic yang ada. Karena disaat pengetesan perlu persiapan yang memerlukan untuk membuat environment secara terpisah dari production agar tidak tercampur dengan data test. Sehingga memerlukan server cloud untuk menyimpan environment tersebut. Selain itu juga perlu memerhatikan **throughput** dan **response data**, contoh :
* /login
* /beli-pulsa
* /cek-out

## Langkah yang harus dilakukan
1. Membuat test plan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test


## Metode Perfomance Test
### Membuat Test Plan
- Kenali yang dibutuhkan seperti Endpoint yang akan ditest serta kebutuhan masing masing endpoint, contoh username; password dll

### Menentukan Metode Test
- Pilih berdasarkan kondisi sistem, apakah belum pernah dites atau sudah
- Selalu awali dengan load test untuk tahu kondisi awal sistem
- Pilih berdasarkan situasi yang akan dihadapi

### Some Types of Perfomance Test
1. Smoke Testing : Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tapa masala sama sekali. Biasanya hanya 1-2 VUs.
2. Load Testing : Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya. Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test. Bagaiman jika sistem belum masuk ke production dan tidak diketahui idealnya? Dapat menggunakan Table Tier
3. Stress Testing : Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turn untuk melihat proses recovery.
4. Spike Testing : Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyakya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.
5. Soak Testing : Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam angka panjang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, b connection dsb. Tips: metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem lika test dilakukan di production.

### Beberapa Istilah Penting 
* System Under Test (SUT) : Sebutan untuk sistem yang sedang dilakukan test
* Load Generator : Sebutan untuk server yang digunakan untuk membuat request.
* Throughput : Satan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM)
* Performance Threshold : Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, Max CPU usage 70% dan sebagainya
* Saturation : Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.
* Virtual Users : Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi.
* Response Time : Lama waktu pengiriman request hingga menerima response

   



