package com.mario

class Namorada : ChegadaAniversarianteObserver{

    override fun chegou(event: ChegadaAniversarianteEvent) {
        println("Apagar as luzes...")
        println("Fazer silêncio...")
        println("Surpresa...")
    }
}