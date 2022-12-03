package com.fakhrulasa.calculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var answer : MutableLiveData<Int> = MutableLiveData()

    fun saveAnswer(ans: Int){
        answer.value = ans
    }
    fun getAns() : MutableLiveData<Int>{
        return  answer
    }
}