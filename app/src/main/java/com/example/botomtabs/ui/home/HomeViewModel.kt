package com.example.botomtabs.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.botomtabs.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
        private val _dado = MutableLiveData<Array<Int>>().apply {
            value = arrayOf(
                R.drawable.dice_um, R.drawable.dice_2, R.drawable.dice_3,
                R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

        }

    val text: LiveData<String> = _text
    val dado: LiveData<Array<Int>> = _dado
}