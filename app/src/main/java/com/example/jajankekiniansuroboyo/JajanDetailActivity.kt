package com.example.jajankekiniansuroboyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jajan_detail.*

class JajanDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jajan_detail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgj = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsi = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var harga = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

            imagej.setImageResource(imgj)
            namaj.text = nama
            deskripsij.text = deskripsi
            hargaj.text = harga
        }
    }
}