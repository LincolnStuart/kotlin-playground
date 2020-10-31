package com.github.lincolnstuart.playground.models

data class TabObject(
    val value1: String,
    val value2: String
){
    override fun toString(): String {
        return "{ value1 : $value1 , value2 : $value2 }"
    }
}
