package com.example.morekotlinfundamentals.higherorderfunctions

fun main() {

    // as the name suggest, sorted by sorts the collection by some value that the
    // collection contains
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    // print the sorted values of the meny
    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }

}