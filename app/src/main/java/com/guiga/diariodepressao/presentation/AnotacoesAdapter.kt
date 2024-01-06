package com.guiga.diariodepressao.presentation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.guiga.diariodepressao.R

class AnotacoesAdapter(private val context: Context, private val listaAnotacoes: List<String>) :
    RecyclerView.Adapter<AnotacoesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val etDataAnotacao: EditText = itemView.findViewById(R.id.et_dataAnotacao)
        val etValorPressao: EditText = itemView.findViewById(R.id.et_valorPressao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_anotacoes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val anotacao = listaAnotacoes[position]

        // Se você tem algum objeto ou modelo relacionado à anotação,
        // você pode acessar os dados e definir os valores nos EditTexts.
        // Aqui estou apenas definindo os EditTexts com o texto da anotação.
        holder.etDataAnotacao.setText(anotacao)
        holder.etValorPressao.setText(anotacao)
    }

    override fun getItemCount(): Int {
        return listaAnotacoes.size
    }
}
