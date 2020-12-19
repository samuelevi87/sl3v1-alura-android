package com.sl3v1.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
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
                Arrays.asList("Samuel", "Deylerson", "Bruno", "Leandro"));
        //Obtendo os campos identificados no layout
        TextView primeiroAluno = findViewById(R.id.textView);
        TextView segundoAluno = findViewById(R.id.textView2);
        TextView terceiroAluno = findViewById(R.id.textView3);
        TextView quartoAluno = findViewById(R.id.textView4);
        //Vinculando o texto do campo obtido pela classe R
        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));
        quartoAluno.setText(alunos.get(3));
    }
    /* Este método de inclusão de dados, é proposital para indicar a inflexibilidade do
    código, ao adicionar tudo de maneira "hard code", toda vez que houver alteração na lista
    de objetos a serem adicionados ou excluídos, deverá ser alterado a activity. Esta não é
    uma solução viável para este tipo de comportamento. Além disso o código fica muito extenso
    tornando mais cansativo e aumentando a propensão à erros.
    * */

}
