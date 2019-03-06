package com.example.aluno.vikings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        val intentRagnar = Intent(this, RagnarActivity::class.java)

        btnRagnar_Floki.setOnClickListener{
            val it = Intent(this, RagnarActivity::class.java)

            val personagem = "Floki"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentRagnar.putExtras(bundle)

            startActivity(intentRagnar)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            textoFloki.setText("Você chegou neste personagem através do personagem: ")
            anteriorFloki.setText(personagem)
        }

    }
}
