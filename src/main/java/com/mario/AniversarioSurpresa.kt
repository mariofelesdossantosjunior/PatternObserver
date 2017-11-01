package com.mario


fun main(args: Array<String>) {
    var namorada = Namorada()
    var porteiro = Porteiro()

    porteiro.addChegadaAniversarianteObserver(namorada)
    porteiro.start()

}
