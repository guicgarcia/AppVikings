package com.example.aluno.vikings

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rollo.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        val intentRollo = Intent(this, BjornActivity::class.java)

        btnBjorn_Rollo.setOnClickListener{
            val it = Intent(this, BjornActivity::class.java)

            val personagem = "Rollo"
            val bundle = Bundle()

            bundle.putString("nomePersonagem", personagem)
            intentRollo.putExtras(bundle)

            startActivity(intentRollo)
        }

        //Verificação
        val personagem = intent.getStringExtra("nomePersonagem")

        if(intent.hasExtra("nomePersonagem")) {
            textoRollo.setText("Você chegou neste personagem através do personagem: ")
            anteriorRollo.setText(personagem)
        }

    }
}
