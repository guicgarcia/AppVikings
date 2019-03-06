package com.example.aluno.vikings

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        val intentLagertha = Intent(this, LagerthaActivity::class.java)
        val intentBjorn = Intent(this, BjornActivity::class.java)
        val intentFloki = Intent(this, FlokiActivity::class.java)

        btnLagertha_Ragnar.setOnClickListener {
            val it = Intent(this, LagerthaActivity::class.java)

            val personagem = "Ragnar"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentLagertha.putExtras(bundle)

            startActivity(intentLagertha)
        }

        btnBjorn_Ragnar.setOnClickListener {
            val it = Intent(this, BjornActivity::class.java)

            val personagem = "Ragnar"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentBjorn.putExtras(bundle)

            startActivity(intentBjorn)
        }

        btnFloki_Ragnar.setOnClickListener {
            val it = Intent(this, FlokiActivity::class.java)

            val personagem = "Ragnar"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentFloki.putExtras(bundle)

            startActivity(intentFloki)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            textoRagnar.setText("Você chegou neste personagem através do personagem: ")
            anteriorRagnar.setText(personagem)
        }

    }
}
