package com.example.aluno.vikings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        val intentLagertha = Intent(this, LagerthaActivity::class.java)
        val intentRagnar = Intent(this, RagnarActivity::class.java)
        val intentFloki = Intent(this, FlokiActivity::class.java)
        val intentAthelstan = Intent(this, AthelstanActivity::class.java)

        btnLagertha_Bjorn.setOnClickListener{
            val it = Intent(this, LagerthaActivity::class.java)

            val personagem = "Bjorn"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentLagertha.putExtras(bundle)

            startActivity(intentLagertha)
        }

        btnRagnar_Bjorn.setOnClickListener{
            val it = Intent(this, RagnarActivity::class.java)

            val personagem = "Bjorn"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentRagnar.putExtras(bundle)

            startActivity(intentRagnar)
        }

        btnFloki_Bjorn.setOnClickListener{
            val it = Intent(this, FlokiActivity::class.java)

            val personagem = "Bjorn"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentFloki.putExtras(bundle)

            startActivity(intentFloki)
        }

        btnAthelstan_Bjorn.setOnClickListener{
            val it = Intent(this, AthelstanActivity::class.java)

            val personagem = "Bjorn"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentAthelstan.putExtras(bundle)

            startActivity(intentAthelstan)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            textoBjorn.setText("Você chegou neste personagem através do personagem: ")
            anteriorBjorn.setText(personagem)
        }

    }
}
