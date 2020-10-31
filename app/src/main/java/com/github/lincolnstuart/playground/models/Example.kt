package com.github.lincolnstuart.playground.models

data class Example(
    val value1: String,
    val value2: String,
    val value3: Int = 0
){
    override fun toString(): String {
        return "{ value1 : $value1 , value2 : $value2 , value3 : $value3 }"
    }
}
