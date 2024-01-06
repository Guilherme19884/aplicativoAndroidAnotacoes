package com.guiga.diariodepressao.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.guiga.diariodepressao.R

lateinit var nomePaciente : EditText;
lateinit var dataNascimento : EditText;
lateinit var seuPeso : EditText;
lateinit var pressaoAlta : CheckBox;
lateinit var diabetes : CheckBox;
lateinit var colesterol : CheckBox;
lateinit var renal : CheckBox;
lateinit var salvar : Button;
lateinit var anotarPressao : Button;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews();
        setupListeners();
    }

    fun setupViews(){
        nomePaciente = findViewById(R.id.et_nomePaciente);
        dataNascimento = findViewById(R.id.et_dataNascimento);
        seuPeso = findViewById(R.id.et_peso);
        pressaoAlta = findViewById(R.id.cb_pressao);
        diabetes = findViewById(R.id.cb_diabetes);
        colesterol = findViewById(R.id.cb_colesterol);
        renal = findViewById(R.id.cb_renal);
        salvar = findViewById(R.id.bt_salvar);
        anotarPressao = findViewById(R.id.bt_calendario);
    }

    fun setupListeners() {
        anotarPressao.setOnClickListener {
           val intent = Intent (this, AnotacoesActivity::class.java);
            startActivity(intent);
        }
    }
}