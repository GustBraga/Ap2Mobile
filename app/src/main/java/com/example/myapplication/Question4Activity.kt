package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Question4Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")
        val telefone = intent.getStringExtra("telefone")
        val opThiago = intent.getStringExtra("opThiago")
        val opBira = intent.getStringExtra("opBira")
        val valor = intent.getStringExtra("valor")

        val bundle = Bundle()
        bundle.putString("nome", "Avaliação: ".plus(valor))


        val fragment = Fragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().add(R.id.frameInfo, fragment).commit()

        val ganhador = findViewById<ImageView>(R.id.ganhador)

        val nomeVotante = findViewById<EditText>(R.id.nomeVotante)
        val emailVotante = findViewById<EditText>(R.id.emailVotante)
        val telefoneVotante = findViewById<EditText>(R.id.telefoneVotante)
        val textView = findViewById<TextView>(R.id.texto2)

        if (opBira.equals("Sim")){
            ganhador.setImageResource(R.drawable.bira)
            nomeVotante.setText(nome)
            emailVotante.setText(email)
            telefoneVotante.setText(telefone)
            textView.setText("Ganhador: Bira!")

        }
        if(opThiago.equals("Sim")){
            ganhador.setImageResource(R.drawable.thiago)
            nomeVotante.setText(nome)
            emailVotante.setText(email)
            telefoneVotante.setText(telefone)
            textView.setText("Ganhador: Thiago!")
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener{
            val intent = Intent(this, Question5Activity::class.java)
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