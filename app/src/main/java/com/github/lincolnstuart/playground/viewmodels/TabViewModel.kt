package com.github.lincolnstuart.playground.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.lincolnstuart.playground.models.TabObject

class TabViewModel: ViewModel() {

    val onTabObjectChanged: MutableLiveData<TabObject> = MutableLiveData()

}