package com.example.aluno.vikings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intentRagnar = new Intent(this, RagnarActivity.class);
        final Intent intentLagertha = new Intent(this, LagerthaActivity.class);
        final Intent intentRollo = new Intent(this, RolloActivity.class);
        final Intent intentFloki = new Intent(this, FlokiActivity.class);
        final Intent intentAthelstan = new Intent(this, AthelstanActivity.class);
        final Intent intentBjorn = new Intent(this, BjornActivity.class);

        Button botaoRagnar = (Button) findViewById(R.id.botaoRagnar);
        Button botaoLagertha = (Button) findViewById(R.id.botaoLagertha);
        Button botaoRollo = (Button) findViewById(R.id.botaoRollo);
        Button botaoFloki = (Button) findViewById(R.id.botaoFloki);
        Button botaoAthelstan = (Button) findViewById(R.id.botaoAthelstan);
        Button botaoBjorn = (Button) findViewById(R.id.botaoBjorn);

        botaoRagnar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RagnarActivity.class);
                startActivity(intentRagnar);
            }
        });

        botaoLagertha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RagnarActivity.class);
                startActivity(intentLagertha);
            }
        });

        botaoRollo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, RolloActivity.class);
                startActivity(intentRollo);
            }
        });

        botaoFloki.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, FlokiActivity.class);
                startActivity(intentFloki);
            }
        });

        botaoAthelstan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, AthelstanActivity.class);
                startActivity(intentAthelstan);
            }
        });

        botaoBjorn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, BjornActivity.class);
                startActivity(intentBjorn);
            }
        });

    }

}
