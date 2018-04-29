package com.example.fujit.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frase = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será melhor que o sucesso de todos",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum",
            "O único lugar que o sucesso vem antes do trabalho é no dicionário"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frase.length );

                textoNovaFrase.setText( frase[ numeroAleatorio ] );
            }
        });
    }
}
