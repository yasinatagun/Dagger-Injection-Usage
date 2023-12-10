package com.example.daggerusage

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adress: Adress) {

//    var adress = Adress("Maltepe/Istanbul")

    fun makeAnApplication(){
        Log.e("result","Application for ${adress.adressInfo} adress is done")
    }
}