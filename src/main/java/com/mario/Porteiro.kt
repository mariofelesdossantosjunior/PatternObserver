package com.mario

import java.util.*

class Porteiro : Thread() {

    var observers : MutableList<ChegadaAniversarianteObserver> = mutableListOf()

    fun addChegadaAniversarianteObserver(observer: ChegadaAniversarianteObserver) = observers.add(observer)

    override fun run() {

        val scanner = Scanner(System.`in`)

        while (true){
            var valor = scanner.nextInt()

            if(valor == 1){
                val event = ChegadaAniversarianteEvent(Date())
                //Notificar os observers

                observers.forEach { observer -> observer.chegou(event) }

            }else{
                println("Alarme Falso!")
            }
        }

    }
}