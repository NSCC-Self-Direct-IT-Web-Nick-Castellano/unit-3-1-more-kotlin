package com.example.morekotlinfundamentals.generics


//// here we learn how to use singleton objects
//// its an object pattern where you create the object just one time
//// and next time, it just calls the SINGLE object that was firstly
//// created
//object StudentProgress {
//    var total: Int = 10
//    var answered: Int = 3
//}

// now create a class called quiz to store the quiz questions
// and the companion object of the quiz class is StudentProgress
// use singleton pattern with extended properties
class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // the companion student progress object
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

// method 1 - extensible functions

// an extended property to print the progress message
val Quiz.StudentProgress.progressText: String
    get() = "$answered of $total answered"

// an extended property to add progress brars
fun Quiz.StudentProgress.printProgressBar() {
    repeat(answered) { print("▓") }
    repeat(total - answered) { print("▒") }
    println()
    // we print the progress text so we can bundle all in one call
    println(Quiz.progressText)
}

fun main() {

    // // the old way to display the text without the extended properties
    // println("${Quiz.answered} of ${Quiz.total} answered.")

    // // when we use extended properties of the class quiz progressText,
    // // we can add the custom text or any other return value we need
    // // this does the same as the above println method
     println(Quiz.printProgressBar())
}


