package com.example.daggerusage

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor(var adress: Adress) {

//    var adress = Adress("Maltepe/Istanbul")

    fun sendCargo(){
        Log.e("result","Cargo sent to ${adress.adressInfo}")
    }


}