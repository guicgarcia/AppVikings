package com.example.aluno.vikings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_athelstan.*

class AthelstanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        val intentRagnar = Intent(this, RagnarActivity::class.java)
        val intentBjorn = Intent(this, BjornActivity::class.java)

        btnRagnar_Athelstan.setOnClickListener{
            val it = Intent(this, RagnarActivity::class.java)

            val personagem = "Athelstan"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentRagnar.putExtras(bundle)

            startActivity(intentRagnar)
        }

        btnBjorn_Athelstan.setOnClickListener{
            val it = Intent(this, BjornActivity::class.java)

            val personagem = "Athelstan"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentBjorn.putExtras(bundle)

            startActivity(intentBjorn)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            TextoAthelstan.setText("Você chegou neste personagem através do personagem: ")
            anteriorAthelstan.setText(personagem)
        }

    }
}
