package com.sl3v1.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView aluno = new TextView(this);
        aluno.setText("Samuel Levi");
        setContentView(aluno);
    }
    /* Este modo funciona, mas não é considerado uma boa prática, por colocar
    muita responsabilidade na activity, e ela é uma entidade que tende a crescer
    muito durante o desenvolvimento, portanto, quanto menos responsabilidade for
    colocar dentro dela, é melhor. Outro motivo que desencoraja a criação de views
    de maneira manual, é a complexidade de algumas views, o que torna a manutenção
    do código muito mais complicada.
     */

}
