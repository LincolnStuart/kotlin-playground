package com.github.lincolnstuart.playground.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.lincolnstuart.playground.models.Example

class TabViewModel: ViewModel() {

    val onExampleChanged: MutableLiveData<Example> = MutableLiveData()

}