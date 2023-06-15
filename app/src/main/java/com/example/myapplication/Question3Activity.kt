package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar

class Question3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")
        val telefone = intent.getStringExtra("telefone")
        val opThiago = intent.getStringExtra("opThiago")
        val opBira = intent.getStringExtra("opBira")

        val bundle = Bundle()
        bundle.putString("nome", nome)

        val fragment = Fragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().add(R.id.frameInfo, fragment).commit()

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener{

            val valor = ratingBar.rating.toString()
            val intent = Intent(this, Question4Activity::class.java)
            intent.putExtra("nome", nome)
            intent.putExtra("email", email)
            intent.putExtra("telefone", telefone)
            intent.putExtra("opThiago", opThiago)
            intent.putExtra("opBira", opBira)
            intent.putExtra("valor", valor)

            startActivity(intent)
        }

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
