package com.imastudio.firstkotlinapp.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.imastudio.firstkotlinapp.R
import com.imastudio.firstkotlinapp.adapter.GridBuahAdapter
import com.imastudio.firstkotlinapp.helper.DataList
import kotlinx.android.synthetic.main.activity_grid.*

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        var namaBuah = DataList.nama_buah
        var gambarBuah = DataList.gambar_buah
        var deskSingkatBuah = DataList.desk_singkat_buah
        var deskFullBuah = DataList.desk_full_buah
        var suaraBuah = DataList.suara_buah
        var webBuah = DataList.web_buah

        val adapter = GridBuahAdapter(this,namaBuah,gambarBuah)
        gridbuah.adapter=adapter
    }
}
