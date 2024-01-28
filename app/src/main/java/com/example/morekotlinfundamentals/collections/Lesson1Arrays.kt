package com.example.morekotlinfundamentals.collections

// -------------------------------------------------------------------------------------
// An array is the simplest way to group an arbitrary number of values in your programs.
// -------------------------------------------------------------------------------------

// declare and initialize array by specifying data type
val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")

// declare and initialize array using type inference
val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

// you can sum array of the same type
val solarSystem = rockPlanets + gasPlanets

// use this array for getting the position 8 of the planet
// nobody recongizes as a planet: pluto
val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")

fun main() {

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    println()
    println("Renaming the planet mars, new name is:")
    // rename the string on position 3 of the array (mars)
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

//    // this wont work because it is outside of the initial array lenght
//    // if you want to resize the array, use mutableArrays instead of arrays
//    solarSystem[8] = "Pluto"

    println()
    println("and there is an extra planet:")
    // print pluto from the newSolarSystem array
    println(newSolarSystem[8])

}
