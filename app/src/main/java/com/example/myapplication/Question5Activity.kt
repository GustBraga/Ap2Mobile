package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Question5Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        val instagramButton = findViewById<ImageView>(R.id.instagramIcon)
        instagramButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/tsejus/?hl=pt-br"))
            startActivity(intent)
        }

        val wppButton = findViewById<ImageView>(R.id.whatsappIcon)
        wppButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send/?phone=556196371078&text&type=phone_number&app_absent=0"))
            startActivity(intent)
        }

        val twitterButton = findViewById<ImageView>(R.id.twitterIcon)
        twitterButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/TSEjusbr?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"))
            startActivity(intent)
        }
    }
}