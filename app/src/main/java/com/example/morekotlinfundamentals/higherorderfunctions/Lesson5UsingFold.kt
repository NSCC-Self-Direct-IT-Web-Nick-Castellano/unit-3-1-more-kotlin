package com.example.morekotlinfundamentals.higherorderfunctions


fun main() {

    // use fold
    // it receives 2 params:
    // an initial value,
    // and a lambda expression that return value of the same type as initial value

    // we will use it to sum the price values of cookies
    // this way, it is similar to aggregate in python pandas
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }

    // print the values
    println("Total price: $${totalPrice}")

}