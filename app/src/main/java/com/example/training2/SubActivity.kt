package com.example.training2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val state = intent.getSerializableExtra("onepiece") as Onepiece

        val imageView = findViewById<ImageView>(R.id.icon)
//        imageView.setImageResource(state.imageId)

        val textView1 = findViewById<TextView>(R.id.tv)
//        textView1.text = state.title

        val textView2 = findViewById<TextView>(R.id.nv)
//        textView2.text = state.name


        if (state is Onepiece) {
            when (state.name) {
                "モンキー・D・ルフィ" -> {
                    imageView.setImageResource(state.imageId)
                    textView1.text = state.title
                    textView2.text = state.name
                }
                "ロロノア・ゾロ" -> {
                    imageView.setImageResource(state.imageId)
                    textView1.text = state.title
                    textView2.text = state.name
                }
                "ナミ" -> {
                    imageView.setImageResource(state.imageId)
                    textView1.text = state.title
                    textView2.text = state.name
                }
                "サンジ" -> {
                    imageView.setImageResource(state.imageId)
                    textView1.text = state.title
                    textView2.text = state.name
                }
                "トニートニー・チョッパー" -> {
                    imageView.setImageResource(state.imageId)
                    textView1.text = state.title
                    textView2.text = state.name
                }

            }
        }

    }


    //            　戻るボタンをタップした時の処理
    fun backButton(view: View) {
        finish()
    }
}

