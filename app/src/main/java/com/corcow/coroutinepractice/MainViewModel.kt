package com.corcow.coroutinepractice

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val output: MutableLiveData<String> = MutableLiveData()


    fun executeThread() {
        Log.d("QWEQWE", "executeThread")

    }

    fun executeRx() {
        Log.d("QWEQWE", "executeRx")

    }

    fun executeCoroutine() {
        Log.d("QWEQWE", "executeCoroutine")
    }


}