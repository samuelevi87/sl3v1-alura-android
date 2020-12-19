package com.sl3v1.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(
                Arrays.asList("Samuel", "Deylerson", "Bruno", "Leandro", "Maria", "Ana"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_listaDeAlunos);

        /* Diferentemente do TextView, não existe o método setText para o ListView, o procedimento
        * é diferente, pois não há métodos get e set. Será usado um componente intermediário que
        * ficará responsável por coletar os dados e renderizar com a view desejada. Este componente
        * é o Adapter*/

        listaDeAlunos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                alunos));

    }
}
