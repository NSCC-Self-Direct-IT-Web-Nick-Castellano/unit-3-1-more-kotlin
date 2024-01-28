package com.example.morekotlinfundamentals.collections

// -------------------------------------------------------------------------------------
// A set is a collection that does not have a specific order and does not allow duplicate values.
// these are faster than list and arrays
// -------------------------------------------------------------------------------------

fun main() {

    // declare the set
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
        "Uranus", "Neptune")

    // get the size of the set
    println(solarSystem.size)

    // add pluto to the set. You can because sets don't care about initial facts, not like
    // list or array.
    solarSystem.add("Pluto")

    // print the solar system set again and you'll see the difference
    println(solarSystem.size)

    // check if set contains pluto (it should)
    println(solarSystem.contains("Pluto"))

    // you shouldn't add an extra "Pluto" because any value can only be once in the set
    // it will not return exception but it is not adding Pluto again either
    solarSystem.add("Pluto")

    println(solarSystem.size)

    // remove pluto
    solarSystem.remove("Pluto")

    // you'll see that "Pluto" doesn't exist
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))



}