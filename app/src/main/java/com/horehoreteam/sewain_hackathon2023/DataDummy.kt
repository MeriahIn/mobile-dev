package com.horehoreteam.sewain_hackathon2023

import com.horehoreteam.sewain_hackathon2023.model.CateringPreview
import com.horehoreteam.sewain_hackathon2023.model.HistoryPackage
import com.horehoreteam.sewain_hackathon2023.model.HistoryPacket
import com.horehoreteam.sewain_hackathon2023.model.ItemHistoryPacket
import com.horehoreteam.sewain_hackathon2023.model.ItemRequestPacket
import com.horehoreteam.sewain_hackathon2023.model.Notification
import com.horehoreteam.sewain_hackathon2023.model.OrderHistory
import com.horehoreteam.sewain_hackathon2023.model.OrderOnProcess
import com.horehoreteam.sewain_hackathon2023.model.Packages
import com.horehoreteam.sewain_hackathon2023.model.RequestPackage
import com.horehoreteam.sewain_hackathon2023.model.RequestPacket
import com.horehoreteam.sewain_hackathon2023.model.ServicePreview
import com.horehoreteam.sewain_hackathon2023.model.SubmittedItem

object DataDummy {

    fun generateNotificationMessageRecent(): List<Notification> {
        return listOf(
            Notification(message = "Selamat! Alif Ramdhani telah memesan layanan Pesta Pernikahan. Silahkan periksa detail pemesanan dan jadwal pelanggan dalam akun Anda."),
            Notification(message = "Hore! Layanan Pesta Pernikahan telah dipesan oleh Fajar. Cek detail pemesanan dan jadwal pelanggan di akun Anda untuk informasi lebih lanjut."),
        )
    }

    fun generateNotificationMessageWeek(): List<Notification> {
        return listOf(
            Notification(message = "Pemesanan untuk layanan Dekorasi Pelaminan oleh Anisa Malik telah diverifikasi. Detail pemesanan dan jadwal pelanggan telah diperbarui pada akun Anda"),
            Notification(message = "Pemberitahuan! Layanan Katering Resepsi Pernikahan telah dipesan oleh Budi Pratama. Lihat detail pemesanan dan jadwal pelanggan Anda sekarang di akun Anda"),
            Notification(message = "Hore! Layanan Fotografi Pernikahan telah dipesan oleh Rina Setiawan. Cek detail pemesanan dan jadwal pelanggan di akun Anda untuk informasi lebih lanjut"),
            Notification(message = "Kabar baik! Pemesanan layanan Hiburan Musik Pernikahan atas nama Dani Rizky telah tercatat. Informasi lengkap tentang pemesanan dan jadwal dapat ditemukan di akun Anda"),
            Notification(message = "Pemberitahuan penting! Layanan Dekorasi Ruang Resepsi telah dipesan oleh Nindy Sari. Segera periksa detail pemesanan dan jadwal pelanggan di akun Anda."),
        )
    }

    fun generateNotificationMessageMonth(): List<Notification> {
        return listOf(
            Notification(message = "Layanan Fotografi Pra-Wedding oleh Nisa Rahman telah berhasil dipesan. Lihat detail pemesanan dan jadwal pelanggan pada akun Anda sekarang."),
            Notification(message = "Selamat! Pemesanan untuk layanan Catering Pernikahan oleh Rama Jaya telah terverifikasi. Periksa detail pemesanan dan jadwal pelanggan di akun Anda."),
            Notification(message = "Informasi penting! Layanan Hiburan Live Band telah dipesan oleh Siti Rahma. Segera cek detail pemesanan dan jadwal pelanggan di akun Anda."),
            Notification(message = "Pemesanan layanan Taman Bunga Wedding oleh Agung Santoso telah sukses. Detail pemesanan dan jadwal pelanggan telah diperbarui di akun Anda."),
            Notification(message = "Notifikasi baru! Layanan Penataan Meja Resepsi oleh Lina Susanto telah tercatat. Temukan informasi lengkapnya di akun Anda sekarang."),
            Notification(message = "Pemberitahuan: Layanan Dekorasi Ruang Pesta oleh Bayu Aditya telah berhasil dipesan. Lihat rincian pemesanan dan jadwal pada akun Anda."),
            Notification(message = "Pemesanan untuk layanan Pelaminan Elegan oleh Rini Permata telah diverifikasi. Detail pemesanan dan jadwal pelanggan telah diperbarui pada akun Anda."),
            Notification(message = "Selamat! Layanan Katering Pernikahan oleh Dini Rizki telah berhasil dipesan. Lihat detail pemesanan dan jadwal pelanggan di akun Anda sekarang."),
            Notification(message = "Pemesanan untuk layanan Fotografi Wedding oleh Faisal Ramdhani telah berhasil diverifikasi. Detail pemesanan dan jadwal pelanggan telah diperbarui di akun Anda."),
            Notification(message = "Hore! Layanan Tata Rias Pengantin oleh Lutfi Akbar telah dipesan. Cek detail pemesanan dan jadwal pelanggan di akun Anda untuk informasi lebih lanjut."),
        )
    }

    fun generateNotificationMessage(): List<Notification> {
        return listOf(
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            Notification(message = "Morbi congue lectus ac tellus aliquet, sit amet vehicula sem tempus. Quisque pretium bibendum iaculis. Aliquam elit elit, volutpat id libero et"),
            Notification(message = "Integer molestie nisl id metus iaculis pulvinar!"),
            Notification(message = "Mauris in hendrerit libero, a luctus velit. Quisque vel risus diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra!"),
            Notification(message = "Maecenas placerat justo ac turpis iaculis consequat. Aenean non lacinia nisl, nec laoreet ex."),
            Notification(message = "Etiam enim nisi, blandit ac sodales et, mattis id nibh!"),
            Notification(message = "Nullam pretium facilisis viverra. Nullam eleifend massa ac eros varius mollis!"),
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."),
            Notification(message = "Nullam pretium facilisis viverra. Nullam eleifend massa cuare eros varius mollis."),
            Notification(message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi congue lectus ac tellus aliquet, sit amet vehicula sem tempus."),
            Notification(message = "Duis vel elit orci. In rutrum dolor eu quam rhoncus eleifend!"),
        )
    }

    fun createServiceCatering(): List<ServicePreview> {
        return listOf(
            ServicePreview(
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipNfyB2cCvcjGq2E-DiyPFCTGHT-KMxu6icr2qGx=s1360-w1360-h1020",
                name = "Istana Lady Catering",
                address = "jln baruang indah 1 A No 66, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipMczDJadC3xJBuw5boH48QmAsV27H5E3_TDQ12u=s1360-w1360-h1020",
                name = "Angkringan pakdang 65",
                address = "Jl. Air Camar No.65, Kota Padang",
                rating = 4.7
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipOKdPmuKdWgh-EdcbZb63UOaRJ9HfEtPhG2yt4D=w408-h306-k-no",
                name = "Mutia Catering",
                address = "Jl. Jawa Gadut No.kel, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipNvMCFfAO_hm8FuSF43frZsCQXIggWFlqtl7Qqw=w408-h544-k-no",
                name = "AA CATERING",
                address = "Jl. Pramuka Raya No.20, Kota Padang",
                rating = 4.5
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipPlEzn2Eo1C9HYtB5IzF2Ee5wLOHbX2Phsy0uYk=w408-h306-k-no",
                name = "Catering UMMI",
                address = "Jl. Seranti, Air Tawar Tim., Kota Padang",
                rating = 4.4
            )
        )
    }

    fun createServiceWardobe(): List<ServicePreview> {
        return listOf(
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipMI0BEglrBvTHQjddIiw30yqfydhO-C-SRgZLPW=w426-h240-k-no",
                name = "Rumah Penyewaan Pakaian",
                address = "Jl. Raya Ampang No.34, Kota Padang",
                rating = 4.3
            ),
            ServicePreview(
                imageUrl = "https://lh3.googleusercontent.com/p/AF1QipMczDJadC3xJBuw5boH48QmAsV27H5E3_TDQ12u=s1360-w1360-h1020",
                name = "Ummura Bridal & Boutique",
                address = "Jl. Gajah Mada No.15, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipN6BJavgahS22pyMYoJv5LFWsziAUseaE76xeku=w408-h408-k-no",
                name = "Remizy Ivonny Bridal Padang",
                address = "Jl. S. Parman No.90B, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipPYm5EeuirMm86HzFk1PKUCae0i5wqDPIbC0rka=w408-h884-k-no",
                name = "Meria shop sewa baju anak / dewasa",
                address = "Jl. Air Camar, Parak Gadang Tim., Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipNFVzIC4vmpxxjoPkj3F2zw92XV3MMK3Wh2-zJT=w408-h544-k-no",
                name = "Sharie Penganten Indah",
                address = "39G2+XCH, Jl. S. Parman No.84, Kota Padang",
                rating = 4.2
            )
        )
    }

    fun createServiceDekorasi(): List<ServicePreview> {
        return listOf(
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipNDivxpZq97S3ql1KAcXYpucG_Ag-JWs9Yu71yz=w408-h306-k-no",
                name = "Duna Fancy",
                address = "Jl. Jhoni Anwar No.2, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipPFjMCuPzVe5zTtvNAOOfs-PMY4bVFOCNSo9SCd=w408-h510-k-no",
                name = "Cahaya Pesta Pelaminan",
                address = "Komplek Taruko III Blok K/15, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipNk6XOL_dCmBe6ZzIDtLXHfPqsZUgUUXZ8sF-Tb=w408-h544-k-no",
                name = "Indra weddingdecor",
                address = "Jl. Tabek Batu, Aie Pacah, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipNaoSw6ulrEtZ5IFSZW1ivMlhC9E3FOaT6jpPbb=w408-h544-k-no",
                name = "Padang Pesta Pelaminan",
                address = "Gn. Sarik, Kec. Kuranji, Kota Padang",
                rating = 4.9
            ),
            ServicePreview(
                imageUrl = "https://lh5.googleusercontent.com/p/AF1QipOR9IjQIVIVC3lj6bw9fZuNTgr9j2_GTrn2ycc=w408-h258-k-no",
                name = "Restu Pesta",
                address = "Jl. Karang Indah No.1, Kota Padang",
                rating = 4.7
            )
        )
    }

    fun createServicePaket(): List<ServicePreview> {
        return listOf(
            ServicePreview(
                imageUrl = "https://www.dictio.id/uploads/db3342/original/3X/7/0/70fa31abcc18243f192c28297636f8f0cfb306c0.jpeg",
                name = "Pesta Pernikahan",
                address = "jln baruang indah 1 A No 66, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://ae01.alicdn.com/kf/S9e3a17b728c945c7a597e8b04445192fd/Dekorasi-Pesta-Ulang-Tahun-Ke-50-Dekorasi-Ulang-Tahun-Pernikahan-Emas-Glitter-Emas-50-Tahun-Set.jpg",
                name = "Paket Anniversary",
                address = "Jl. Air Camar No.65, Kota Padang",
                rating = 5.0
            ),
            ServicePreview(
                imageUrl = "https://image.cermati.com/q_70,w_1200,h_800,c_fit/txdm5mmzk88fi3vnicjk",
                name = "Paket Ulang Tahun",
                address = "Jl. Jawa Gadut No.kel, Kota Padang",
                rating = 4.8
            ),
            ServicePreview(
                imageUrl = "https://www.ascomaxx.com/uploads/large/10d5276a566b7d959f70a10ca9fb203e.jpg",
                name = "Paket Bazar",
                address = "Jl. Pramuka Raya No.20, Kota Padang",
                rating = 4.5
            ),
            ServicePreview(
                imageUrl = "https://kotabogor.go.id/uploads/post/Halalbihalal_(6).jpg",
                name = "Paket Halal Bihalal",
                address = "Jl. Seranti, Air Tawar Tim., Kota Padang",
                rating = 4.4
            )
        )
    }

    fun createMyPackageDataDummy(): List<Packages> {
        return listOf(
            Packages(
                title = "Paket Wood Marriage Theme",
                subtitle = "Terinsipirasi dari hutan lebat menjadikan satu.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "2 Layanan Wardrobe",
                decorationServiceCount = "10 Layanan Dekorasi",
                imageService = "https://picsum.photos/1200/800",
            ),
            Packages(
                title = "Paket Titanic Marriage Theme",
                subtitle = "Sensasi Titanic tanpa yang lainnya.",
                foodServiceCount = "3 Layanan Catering",
                wardrobeServiceCount = "20 Layanan\nWardrobe",
                decorationServiceCount = "5 Layanan Dekorasi",
                imageService = "https://picsum.photos/1200/800",
            ),
            Packages(
                title = "Yellow Plains Marriage Theme",
                subtitle = "Padang rumput yang anggun nan luar biasa.",
                foodServiceCount = "2 Layanan Catering",
                wardrobeServiceCount = "2 Layanan Wardrobe",
                decorationServiceCount = "5 Layanan Dekorasi",
                imageService = "https://picsum.photos/1200/800",
            ),
        )
    }

    fun createPackageExplore(): List<Packages> {
        return listOf(
            Packages(
                title = "Pesta Pernikahan",
                subtitle = "Apakah Anda sedang merencanakan pesta pernikahan impian? Kami adalah satu-satunya tempat yang Anda butuhkan untuk menjadikan pernikahan Anda sesuai dengan yang Anda impikan. Dengan paket layanan eksklusif kami, Anda dapat merayakan momen besar dalam hidup Anda tanpa stres dan tanpa batasan.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "1 Layanan Wardrobe",
                decorationServiceCount = "1 Layanan Dekorasi",
                imageService = "https://www.dictio.id/uploads/db3342/original/3X/7/0/70fa31abcc18243f192c28297636f8f0cfb306c0.jpeg",
            ),
            Packages(
                title = "Paket Anniversary",
                subtitle = "Rayakan cinta dan kesetiaan Anda dengan Paket Anniversary kami. Hadirkan momen istimewa yang akan dikenang sepanjang masa. Dengan layanan eksklusif dan berbagai pilihan, Anda dapat merayakan hari bersejarah Anda dengan sempurna.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "1 Layanan Wardrobe",
                decorationServiceCount = "1 Layanan Dekorasi",
                imageService = "https://ae01.alicdn.com/kf/S9e3a17b728c945c7a597e8b04445192fd/Dekorasi-Pesta-Ulang-Tahun-Ke-50-Dekorasi-Ulang-Tahun-Pernikahan-Emas-Glitter-Emas-50-Tahun-Set.jpg",
            ),
            Packages(
                title = "Paket Ulang Tahun",
                subtitle = "Buat hari ulang tahun Anda menjadi tak terlupakan dengan Paket Ulang Tahun kami. Temukan beragam layanan yang memukau untuk merayakan momen spesial ini bersama orang-orang terkasih Anda.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "1 Layanan Wardrobe",
                decorationServiceCount = "1 Layanan Dekorasi",
                imageService = "https://image.cermati.com/q_70,w_1200,h_800,c_fit/txdm5mmzk88fi3vnicjk",
            ),
            Packages(
                title = "Paket Bazar",
                subtitle = "Bergabunglah dalam bazar kami! Dapatkan kesempatan untuk menampilkan produk unik Anda dan menjadikan acara bazzar ini penuh semangat dengan kehadiran Anda.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "1 Layanan Wardrobe",
                decorationServiceCount = "1 Layanan Dekorasi",
                imageService = "https://www.ascomaxx.com/uploads/large/10d5276a566b7d959f70a10ca9fb203e.jpg",
            ),
            Packages(
                title = "Paket Halal Bihalal",
                subtitle = "Rayakan acara aqiqah dengan layanan yang lengkap dan berkualitas. Kami hadir untuk membantu menjadikan momen spesial ini berjalan lancar tanpa khawatir.",
                foodServiceCount = "1 Layanan Catering",
                wardrobeServiceCount = "1 Layanan Wardrobe",
                decorationServiceCount = "1 Layanan Dekorasi",
                imageService = "https://kotabogor.go.id/uploads/post/Halalbihalal_(6).jpg",
            )
        )
    }


    fun generateOrderHistory(): List<OrderHistory> {
        return listOf(
            OrderHistory(
                orderId = "SI091236",
                imgUrl = "https://static.vecteezy.com/system/resources/previews/018/838/223/original/avatar-of-a-chef-character-free-vector.jpg",
                userName = "Sarah Adam",
                serviceName = "Rasa Nusantara",
                price = "Rp 600.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091237",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Rina Malik",
                serviceName = "Delicieux Catering",
                price = "Rp 1.200.000",
                status = "Dibatalkan"
            ),
            OrderHistory(
                orderId = "SI091238",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Arya Surya",
                serviceName = "Eleganza Tuxedo",
                price = "Rp 900.000",
                status = "Dibatalkan"
            ),
            OrderHistory(
                orderId = "SI091239",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6lZRVAi4cLxnDSPCTm0s7A1FUu1o9GYTi7_4ZApIuK5pg9tYf_4KAgUYDoQ543zrWQAA&usqp=CAU",
                userName = "Rizka Adzani",
                serviceName = "Fairy Dress Rental",
                price = "Rp 1.000.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091240",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpumTyBB7zgUcv-XjuTLQg2RR-R8X9dYbySCGCmyWSplaIToj3lMw_Nih3xeklZvddWoQ&usqp=CAU",
                userName = "Lani Wati",
                serviceName = "Gardenia Decor Services",
                price = "Rp 750.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091241",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7YEz4RT4NzMvuyaO9lQE88cVrrmc-NNSsiQ&usqp=CAU",
                userName = "Dewi Tri",
                serviceName = "Elegant Events Decor",
                price = "Rp 700.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091242",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Ivan Darmawan",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 1.500.000",
                status = "Selesai"
            ),
            OrderHistory(
                orderId = "SI091243",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Rima Shofiya",
                serviceName = "Saji Sejahtera",
                price = "Rp 900.000",
                status = "Selesai"
            )
        )
    }

    fun generateOrderOnProcess(): List<OrderOnProcess> {
        return listOf(
            OrderOnProcess(
                orderId = "SI091244",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Alex Johnson",
                serviceName = "Elegant Events Decor",
                price = "Rp 750.000"
            ),
            OrderOnProcess(
                orderId = "SI091245",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Eva Martinez",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 900.000"
            ),
            OrderOnProcess(
                orderId = "SI091246",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Daniel Lee",
                serviceName = "Saji Sejahtera",
                price = "Rp 820.000"
            ),
            OrderOnProcess(
                orderId = "SI091247",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Sophie Brown",
                serviceName = "Rasa Nusantara",
                price = "Rp 700.000"
            ),
            OrderOnProcess(
                orderId = "SI091248",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Liam Wilson",
                serviceName = "Gardenia Decor Services ",
                price = "Rp 600.000"
            ),
            OrderOnProcess(
                orderId = "SI091249",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6aFkmK5B0Zw_udaEn6Z9hLJ17h0l2gm43jw&usqp=CAU",
                userName = "Olivia Davis",
                serviceName = "Fantasi Kreasi Dekor",
                price = "Rp 850.000"
            ),
            OrderOnProcess(
                orderId = "SI091250",
                imgUrl = "https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg",
                userName = "Noah Taylor",
                serviceName = "Delicieux Catering",
                price = "Rp 950.000"
            ),
            OrderOnProcess(
                orderId = "SI091251",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Hb5xzFZJCTW4cMqmPwsgfw-gILUV7QevvQ&usqp=CAU",
                userName = "Mia Garcia",
                serviceName = "Vintage Vibe Rentals",
                price = "Rp 780.000"
            )
        )
    }

    fun generateOrderRequest(): List<OrderOnProcess> {
        return listOf(
            OrderOnProcess(
                orderId = "SI091249",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6aFkmK5B0Zw_udaEn6Z9hLJ17h0l2gm43jw&usqp=CAU",
                userName = "Olivia Davis",
                serviceName = "Gardenia Decor Services",
                price = "Rp 850.000"
            ),
            OrderOnProcess(
                orderId = "SI091247",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_1bpO0XDD8fbmRvnbnkCoQNFFoH3AqofVTg&usqp=CAU",
                userName = "Sophie Brown",
                serviceName = "Gourmet Eksklusif",
                price = "Rp 700.000"
            ),
            OrderOnProcess(
                orderId = "SI091251",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Hb5xzFZJCTW4cMqmPwsgfw-gILUV7QevvQ&usqp=CAU",
                userName = "Mia Garcia",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 780.000"
            ),
            OrderOnProcess(
                orderId = "SI091245",
                imgUrl = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?cs=srgb&dl=pexels-pixabay-220453.jpg&fm=jpg",
                userName = "Eva Martinez",
                serviceName = "Saji Sejahtera",
                price = "Rp 900.000"
            ),
            OrderOnProcess(
                orderId = "SI091246",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Daniel Lee",
                serviceName = "Fairy Dress Rental",
                price = "Rp 820.000"
            ),
            OrderOnProcess(
                orderId = "SI091248",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRij6dtiHizH96qpCOe8WeXXP3yLyQJkPdGVg&usqp=CAU",
                userName = "Liam Wilson",
                serviceName = "Delicieux Catering",
                price = "Rp 600.000"
            ),
            OrderOnProcess(
                orderId = "SI091244",
                imgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6fbEXoQw0SBxg8ppqN2kiHYVz65sUaYAgHZMlsqfnIMraDDD4PiNWDowodi9TkAwJfEM&usqp=CAU",
                userName = "Alex Johnson",
                serviceName = "Saji Sejahtera",
                price = "Rp 750.000"
            ),
            OrderOnProcess(
                orderId = "SI091250",
                imgUrl = "https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg",
                userName = "Noah Taylor",
                serviceName = "Makanan Lezat Abadi",
                price = "Rp 950.000"
            ),

            )
    }

    fun generateRequestPackage(): List<RequestPackage> {
        return listOf(
            RequestPackage(
                orderId = "PI091231",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Mutia Catering",
                serviceName = "Layanan Makanan",
                listOne = "Rendang",
                listTwo = "Soto",
                listThree = "Gulai"
            ),
            RequestPackage(
                orderId = "PI091232",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Rumah Penyewaan Pakaian",
                serviceName = "Layanan Wardobe",
                listOne = "Baju Kurung",
                listTwo = "Jas",
                listThree = "Gaun"
            ),
            RequestPackage(
                orderId = "PI091233",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Duna Fancy",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Tenda",
                listTwo = "Pelaminan",
                listThree = "Orgen"
            ),
            RequestPackage(
                orderId = "PI091239",
                imgUrl = "https://example.com/image6.jpg",
                userName = "AA CATERING",
                serviceName = "Layanan Makanan",
                listOne = "Gulai",
                listTwo = "Ayam Bakar",
                listThree = "Es Campur"
            ),
            RequestPackage(
                orderId = "PI091240",
                imgUrl = "https://example.com/image7.jpg",
                userName = "Ummura Bridal & Boutique",
                serviceName = "Layanan Wardrobe",
                listOne = "Dress Formal",
                listTwo = "Kemeja Putih",
                listThree = "Setelan Jas"
            ),
            RequestPackage(
                orderId = "PI091241",
                imgUrl = "https://example.com/image8.jpg",
                userName = "Cahaya Pesta Pelaminan",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Bunga Dekorasi",
                listTwo = "Lampu Hias",
                listThree = "Kain Drapery"
            ),
            RequestPackage(
                orderId = "PI091242",
                imgUrl = "https://example.com/image9.jpg",
                userName = "Catering UMMI",
                serviceName = "Layanan Makanan",
                listOne = "Sate Ayam",
                listTwo = "Gado-Gado",
                listThree = "Rujak Buah"
            ),
            RequestPackage(
                orderId = "PI091243",
                imgUrl = "https://example.com/image10.jpg",
                userName = "Sharie Penganten Indah",
                serviceName = "Layanan Wardrobe",
                listOne = "Gaun Pesta",
                listTwo = "Jas Rapi",
                listThree = "Rok Panjang"
            )
        )
    }

    fun generateHistoryPackage(): List<HistoryPackage> {
        return listOf(
            HistoryPackage(
                orderId = "PI091241",
                imgUrl = "https://example.com/image8.jpg",
                userName = "Cahaya Pesta Pelaminan",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Bunga Dekorasi",
                listTwo = "Lampu Hias",
                listThree = "Kain Drapery",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091232",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Rumah Penyewaan Pakaian",
                serviceName = "Layanan Wardobe",
                listOne = "Baju Kurung",
                listTwo = "Jas",
                listThree = "Gaun",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091240",
                imgUrl = "https://example.com/image7.jpg",
                userName = "Ummura Bridal & Boutique",
                serviceName = "Layanan Wardrobe",
                listOne = "Dress Formal",
                listTwo = "Kemeja Putih",
                listThree = "Setelan Jas",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091233",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Duna Fancy",
                serviceName = "Layanan Dekorasi Pesta",
                listOne = "Tenda",
                listTwo = "Pelaminan",
                listThree = "Orgen",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091242",
                imgUrl = "https://example.com/image9.jpg",
                userName = "Catering UMMI",
                serviceName = "Layanan Makanan",
                listOne = "Sate Ayam",
                listTwo = "Gado-Gado",
                listThree = "Rujak Buah",
                statuslistOne = "Diterima",
                statuslistTwo = "Diterima",
                statuslistThree = "Diterima"
            ),
            HistoryPackage(
                orderId = "PI091231",
                imgUrl = "https://media.gettyimages.com/id/662284095/photo/chef-fisinshing-dishes-in-the-kitchen.jpg?s=612x612&w=gi&k=20&c=9n-l6-RE3dXeaLpdWkpWCSJjaPyhkkQVMm6mZ66E2A0=",
                userName = "Mutia Catering",
                serviceName = "Layanan Makanan",
                listOne = "Rendang",
                listTwo = "Soto",
                listThree = "Gulai",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091243",
                imgUrl = "https://example.com/image10.jpg",
                userName = "Sharie Penganten Indah",
                serviceName = "Layanan Wardrobe",
                listOne = "Gaun Pesta",
                listTwo = "Jas Rapi",
                listThree = "Rok Panjang",
                statuslistOne = "Ditolak",
                statuslistTwo = "Diterima",
                statuslistThree = "Ditolak"
            ),
            HistoryPackage(
                orderId = "PI091239",
                imgUrl = "https://example.com/image6.jpg",
                userName = "AA CATERING",
                serviceName = "Layanan Makanan",
                listOne = "Gulai",
                listTwo = "Ayam Bakar",
                listThree = "Es Campur",
                statuslistOne = "Diterima",
                statuslistTwo = "Ditolak",
                statuslistThree = "Diterima"
            )
        )
    }

    fun generateRequestPacket(): List<RequestPacket> {
        return listOf(
            RequestPacket(
                time = "Baru Saja",
                requestItems = listOf(
                    ItemRequestPacket(
                        imageUrl = "https://o-cdn-cas.sirclocdn.com/parenting/images/Chef_Vindex_exquisite-taste-magaz.width-800.format-webp.webp",
                        requestId = "PI081240",
                        userName = "AA Catering",
                        packetName = "Pesta Pernikahan",
                        contact = "6281275651571",
                        submittedCaterings = listOf(
                            "AA Catering\nCatering Pernikahan",
                            "AA Catering\nHome Catering"
                        ),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf(),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://image.cermati.com/q_70,w_1200,h_800,c_fit/txdm5mmzk88fi3vnicjk",
                        requestId = "PI081241",
                        userName = "Duna Fancy",
                        packetName = "Pesta Ulang Tahun",
                        contact = "6281275651571",
                        submittedCaterings = listOf(),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf(
                            "Duna Fancy\nPelaminan",
                            "Duna Fancy\nDekorasi Ruangan"
                        ),
                    ),
                )
            ),
            RequestPacket(
                time = "1 Minggu Terakhir",
                requestItems = listOf(
                    ItemRequestPacket(
                        imageUrl = "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/jawapos/2022/04/IKLAN-DANTI.jpg",
                        requestId = "PI081230",
                        userName = "UMMI Catering",
                        packetName = "Paket Halal Bihalal",
                        contact = "6281278235287",
                        submittedCaterings = listOf(
                            "UMMI Catering\nCatering Pesta",
                            "AA Catering\nMobile Catering"
                        ),
                        submittedWardrobes = listOf("UMMI Catering\nPakaian Adat"),
                        submittedDecoration = listOf(),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://rayaboga.com/tinymce/images/raya_boga_catering_crest_koki_lower.png",
                        requestId = "PI081233",
                        userName = "Boga Catering",
                        packetName = "Konferensi Internasional",
                        contact = "6281278235231",
                        submittedCaterings = listOf("Boga Catering\nKonferensi Internasional"),
                        submittedWardrobes = listOf(),
                        submittedDecoration = listOf(
                            "Boga Catering\nDekorasi Ruangan",
                            "Boga Catering\nTenda"
                        ),
                    ),
                    ItemRequestPacket(
                        imageUrl = "https://static.vecteezy.com/system/resources/previews/006/696/223/original/boutique-fashion-logo-design-template-vector.jpg",
                        requestId = "PI081235",
                        userName = "Ummura Bridal & Boutique",
                        packetName = "Pesta Anniversary",
                        contact = "6281254235231",
                        submittedCaterings = listOf(),
                        submittedWardrobes = listOf(
                            "Ummura Pakaian Adat",
                            "Ummura Gaun",
                            "Ummura Jas"
                        ),
                        submittedDecoration = listOf(),
                    ),
                )
            )

        )
    }

    fun generateHistoryPacket(): List<HistoryPacket> {
        val imageUrl =
            "https://cdn3.vectorstock.com/i/1000x1000/77/17/chef-avatar-icon-vector-32077717.jpg"

        return listOf(
            HistoryPacket(
                time = "Baru Saja",
                requestItems = listOf(
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081240",
                        userName = "Catering King Alam",
                        packetName = "Pesta Pernikahan",
                        contact = "6281275651571",
                        submittedCaterings = listOf(
                            SubmittedItem(
                                "Catering King Alam\nCatering Pernikahan", true
                            ),
                            SubmittedItem(
                                "Catering King Alam\nHome Catering", true
                            )
                        ),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = emptyList()
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081241",
                        userName = "Catering King Alam",
                        packetName = "Pesta Ulang Tahun",
                        contact = "6281275651571",
                        submittedCaterings = emptyList(),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = listOf(
                            SubmittedItem(
                                "Catering King Alam\n Pelaminan", false
                            ),
                            SubmittedItem(
                                "Catering King Alam\n Dekorasi Ruangan", true
                            )
                        )
                    )
                )
            ),
            HistoryPacket(
                time = "1 Minggu Terakhir",
                requestItems = listOf(
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081230",
                        userName = "Catering King Alam",
                        packetName = "Paket Halal Bihalal",
                        contact = "6281278235287",
                        submittedCaterings = listOf(
                            SubmittedItem(
                                "Catering King Alam\nCatering Pesta", true
                            ),
                            SubmittedItem(
                                "Catering King Alam\nMobile Catering", false
                            )
                        ),
                        submittedWardrobes = listOf(
                            SubmittedItem(
                                "King Alam\nPakaian Adat", false
                            )
                        ),
                        submittedDecoration = emptyList()
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081233",
                        userName = "Catering King Alam",
                        packetName = "Konferensi Internasional",
                        contact = "6281278235231",
                        submittedCaterings = listOf(
                            SubmittedItem(
                                "Catering King Alam\nKonferensi Internasional", true
                            )
                        ),
                        submittedWardrobes = emptyList(),
                        submittedDecoration = listOf(
                            SubmittedItem(
                                "King Alam\nDekorasi Ruangan", true
                            ),
                            SubmittedItem(
                                "King Alam\nTenda", false
                            )
                        )
                    ),
                    ItemHistoryPacket(
                        imageUrl = imageUrl,
                        requestId = "PI081235",
                        userName = "Catering King Alam",
                        packetName = "Pesta Anniversary",
                        contact = "6281254235231",
                        submittedCaterings = emptyList(),
                        submittedWardrobes = listOf(
                            SubmittedItem(
                                "King Alam Pakaian Adat", false
                            ),
                            SubmittedItem(
                                "King Alam Gaun", true
                            ),
                            SubmittedItem(
                                "King Alam Jas", true
                            )
                        ),
                        submittedDecoration = emptyList()
                    )
                )
            )
        )
    }

    fun generateCateringPreview(): List<CateringPreview> {
        return listOf(
            CateringPreview(
                imageUrl = "https://1.bp.blogspot.com/-xtvWTRugjbk/X_WzOdQW7HI/AAAAAAAAPr8/PVMiow-Lhb0NbfVs3obq3oVXo0d7g39mgCLcBGAsYHQ/w1200-h630-p-k-no-nu/Pengertian-dan-Jenis-Catering-728w.jpg'",
                name = "Catering Pesta Pernikahan",
                price = "Rp 1.500.000",
                rating = "5.0"
            ),
            CateringPreview(
                imageUrl = "https://www.diajengcatering.com/wp-content/uploads/2016/04/catering-bekasi-1024x685.jpg",
                name = "Catering Halal Bihalal",
                price = "Rp 750.000",
                rating = "5.0"
            ),
            CateringPreview(
                imageUrl = "https://bestchef.biz/wp-content/uploads/2018/01/ccccc.jpg",
                name = "Catering Seminar",
                price = "Rp 900.000",
                rating = "5.0"
            ),
            CateringPreview(
                imageUrl = "https://www.flokq.com/blog/wp-content/uploads/2020/08/take.jpg",
                name = "Koki Pribadi",
                price = "Rp 1.000.000",
                rating = "5.0"
            ), CateringPreview(
                imageUrl = "https://miro.medium.com/v2/resize:fit:912/1*KHrPWdx_unWp0MVEcyctjw.jpeg",
                name = "Home Catering",
                price = "Rp 300.000",
                rating = "5.0"
            ),
            CateringPreview(
                imageUrl = "https://www.zandonellacatering.com/wp-content/uploads/2014/11/anniversary-party.jpg",
                name = "Catering Anniversary",
                price = "Rp 500.000",
                rating = "5.0"
            )
        )
    }


}