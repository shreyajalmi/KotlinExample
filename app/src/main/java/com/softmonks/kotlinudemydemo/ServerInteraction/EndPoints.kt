package com.softmonks.kotlinudemydemo.ServerInteraction

object EndPoints {
    private val URL_ROOT = "http://192.168.1.106/WebApi/v1/?op="
    val URL_ADD_ARTIST = URL_ROOT + "addartist"
    val URL_GET_ARTIST = URL_ROOT + "getartists"
}