package com.example.jogoaleatorio1a10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View) {
         var texto = findViewById(R.id.tv2textoSorteio) as TextView

         var numeroSorteado = Random1.nextInt(11)
        texto.setText("O número sorteado é: $numeroSorteado")
    }

}