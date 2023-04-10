package com.example.latihan_databindingrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan_databindingrecycleview.MainActivity.Companion.INTENT_PARCELABLE
import com.example.latihan_databindingrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listProdukData = arrayListOf(
            ListBerita("AG Eks Mario Dandy Dihukum 3 Tahun 6 Bulan Bui\n" +
                    ", Ayah David Ozora: One Down, Two More To Go",
                "10 Apr 2023, 18:11 WIB","Dyah Puspita Wisnuwardani",
                "Liputan6.com, Jakarta - Terdakwa anak AG dalam kasus penganiayaan terhadap Crystalino David Ozora Latumahina divonis hukuman penjara 3 tahun 6 bulan. Masa hukuman yang dijatuhkan hakim kepada AG eks Mario Dandy sedikit lebih pendek dari tuntutan Jaksa Penuntut Umum.\n" +
                        "\n" +
                        "\"Menjatuhkan pidana terhadap Anak oleh karena itu dengan pidana selama 3 tahun 6 bulan di Lembaga Pembinaan Khusus Anak. Menetapkan masa penahanan yang telah dijalani anak dikurangi seluruhnya dari yang telah dijatuhkan,\" demikian putusan Hakim tunggal Sri Wahyuni Batubara di Pengadilan Negeri Jakarta Selatan, Senin, 10 April 2023.",
                R.drawable.mario_pajak),
            ListBerita("5,4 Juta Data Pengguna Terekspos, Twitter Akui\n" +
                    " Sudah Tambal Kerentanan", "07 Agu 2022, 16:30 WIB","Yuslianson",
                "Liputan6.com, Jakarta - Twitter sempat tersandung masalah terkait kebocoran 5,4 juta data penggunanya pada akhir Juli 2022 lalu.\n" +
                        "\n" +
                        "Sempat bungkam, perusahaan akhirnya mengakui platform mereka miliki kerentanan zero-day. Hal itu mengakibatkan pelaku kejahatan menyusun profil pengguna Twitter.", R.drawable.twitter),
            ListBerita("Hacker Jual 5,4 Juta Data Pengguna Twitter di Forum Peretasan", "23 Jul 2022, 11:00 WIB","Yuslianson",
                "Liputan6.com, Jakarta - Baru-baru ini, Twitter mengalami pelanggaran data setelah penjahat siber mengeksploitasi kelemahan di platform media sosial itu.\n" +
                        "\n" +
                        "Memanfaatkan kerentanan di Twitter, hacker mampu\n" +
                        " mencuri database berisikan nomor telepon, dan alamat email milik 5,4 juta akun.", R.drawable.hacker),
            ListBerita("Inikah Tampilan Casing iPad Pro 10,5 Inci?", "02 Jun 2017, 16:00 WIB","Andina Librianty",
                "Liputan6.com, Jakarta - Microsoft dan Apple akan berhadapan di pasar perangkat 2-in-1. Pasalnya, iPad Pro 10,5 inci disebut akan menjadi kompetitor utama bagi tablet terbaru Microsoft, Surface.\n" +
                        "\n" +
                        "Dilansir Softpedia, Jumat (1/6/2017), sejumlah sumber mengatakan, Apple akan mengumumkan iPad Pro 10,5 inci dalam acara Worldwide Developers Conference (WWDC) pada Juni 2017. Tablet ini akan hadir dengan serangkaian performa lebih baik, termasuk tampilan baru dengan bezel lebih tipis.\n" +
                        "\n" +
                        "Tampilan yang dimaksud sumber itu, kini bisa dilihat dari bocoran gambar casing diduga milik iPad Pro 10,5 inci. Berdasarkan gambar, casing tablet itu mengindikasikan iPad Pro 10,5 inci hanya sedikit lebih besar daripada iPad Pro 9,7 inci. Artinya, ukuran layarnya memang lebih besar, \n" +
                        "tapi keseluruhan dimensinya masih sama.", R.drawable.ipad),
            ListBerita("5,5 Miliar Orang di Dunia Akan Pakai Ponsel di 2020", "07 Feb 2016, 08:07 WIB","Agustin Setyo Wardani",
                "Liputan6.com, Jakarta - Telepon selular telah mendominasi dunia, hal itu sepertinya tidak akan berubah dalam beberapa waktu ke depan.\n" +
                        "\n" +
                        "Terlebih, banyak pengguna di negara maju menggunakan ponsel untuk mengecek email atau mengakses Google guna mendapatkan informasi tentang sesuatu. Tampaknya hal ini juga akan terjadi pada banyak negara berkembang.\n" +
                        "\n" +
                        "Berdasarkan informasi yang dikutip tim Tekno Liputan6.com dari Tech Times, Minggu (7/2/2016), merujuk data yang dirilis Cisco pada laporan tahunan mengenai pertumbuhan ponsel, disebutkan bahwa pada tahun 2020 sekitar 5,5 miliar orang di dunia akan menggunakan telepon seluler, meski tidak semuanya adalah ponsel pintar.\n" +
                        "\n" +
                        "Jumlah tersebut cukup mengejutkan jika disandingkan dengan hasil survei lainnya yang menyebutkan, 5,3 miliar orang akan merasakan penggunaan listik, 3,5 miliar orang mendapatkan akses air bersih, serta 2,8 miliar orang akan menyetir mobil.", R.drawable.ponsel)
        )
        val adapterBerita = BeritaAdapter(listProdukData)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProduk.layoutManager = lm
        binding.rvProduk.adapter = adapterBerita

        adapterBerita.onClick = {
            var pindah = Intent(this,DetailBeritaActivity::class.java)
            pindah.putExtra("detailBerita",it)
            startActivity(pindah)
        }

    }
}