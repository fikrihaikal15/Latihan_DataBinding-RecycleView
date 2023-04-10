package com.example.latihan_databindingrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.latihan_databindingrecycleview.databinding.ActivityDetailBeritaBinding

class DetailBeritaActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDetail = intent.getSerializableExtra("detailBerita") as ListBerita
        binding.imgItemPhoto.setImageResource(getDetail.img)
        binding.tvItemName.text=(getDetail.judul)
        binding.tvItemDescription.text=(getDetail.detail)


    }
}