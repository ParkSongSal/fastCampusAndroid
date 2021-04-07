package com.example.fastcampusandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_glide_lib.*

class GlideLibActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide_lib)

        Glide.with(this@GlideLibActivity)
             .load(R.drawable.board)
             .fitCenter()
             .into(glideImg)

        Glide.with(this@GlideLibActivity)
            .load(R.drawable.board)
            .centerCrop()
            .into(glideImg2)

        Glide.with(this@GlideLibActivity)
            .load(R.drawable.board)
            .centerInside()
            .into(glideImg3)
    }
}