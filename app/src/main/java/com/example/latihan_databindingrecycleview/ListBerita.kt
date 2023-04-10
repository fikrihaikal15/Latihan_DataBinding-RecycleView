package com.example.latihan_databindingrecycleview

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize



data class ListBerita(var judul:String,
                      var tglRelease:String,
                      var penulis:String,
                      var detail:String, var img:Int) : java.io.Serializable
