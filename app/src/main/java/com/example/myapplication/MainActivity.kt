package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var nome: EditText
    lateinit var email: EditText
    lateinit var telefone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nome = findViewById(R.id.nome)
        email = findViewById(R.id.email)
        telefone = findViewById(R.id.telefone)

        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener{

            val nome = nome.text.toString()
            val email = email.text.toString()
            val telefone = telefone.text.toString()

            val fragment = Fragment()
            val bundle = Bundle()
            bundle.putString("nome", nome)

            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.frameInfo, fragment).commit()
            val intent = Intent(this,Question1Activity::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("email", email)
            intent.putExtra("telefone", telefone)
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

