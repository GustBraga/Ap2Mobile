package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioGroup

class Question1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        val nome = intent.getStringExtra("nome")
        val email = intent.getStringExtra("email")
        val telefone = intent.getStringExtra("telefone")


        val bundle = Bundle()
        bundle.putString("nome", nome)

        val fragment = Fragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().add(R.id.frameInfo, fragment).commit()


        val nextButton = findViewById<Button>(R.id.nextButton)
        val votingRadioGroup = findViewById<RadioGroup>(R.id.votingRadioGroup)

        nextButton.setOnClickListener {
            val selectedOptionThiago = when (votingRadioGroup.checkedRadioButtonId) {
                R.id.radioButtonYes -> "Sim"
                R.id.radioButtonNo -> "Não"
                else -> ""
            }

            val intent = Intent(this, Question2Activity::class.java)

            intent.putExtra("nome", nome)
            intent.putExtra("email", email)
            intent.putExtra("telefone", telefone)
            intent.putExtra("opThiago", selectedOptionThiago)

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
