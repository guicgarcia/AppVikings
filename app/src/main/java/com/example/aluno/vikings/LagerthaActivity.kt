package com.example.aluno.vikings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lagertha.*
import kotlinx.android.synthetic.main.activity_ragnar.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        val intentBjorn = Intent(this, BjornActivity::class.java)
        val intentRagnar = Intent(this, RagnarActivity::class.java)

        btnBjorn_Lagertha.setOnClickListener{
            val it = Intent(this, BjornActivity::class.java)

            val personagem = "Lagertha"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentBjorn.putExtras(bundle)

            startActivity(intentBjorn)
        }

        btnRagnar_Lagertha.setOnClickListener{
            val it = Intent(this, RagnarActivity::class.java)

            val personagem = "Lagertha"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentRagnar.putExtras(bundle)

            startActivity(intentRagnar)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            lbTexto.setText("Você chegou neste personagem através do personagem: ")
            personagemAnterior.setText(personagem)
        }


    }
}
