package com.example.morekotlinfundamentals.higherorderfunctions

fun main() {
    // use map to structure the return value we will print
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    // on top of the menu, we will print what it is as a header title
    println("Full menu:")

    // for each menu item from the mapping, print values
    fullMenu.forEach {
        println(it)
    }


}