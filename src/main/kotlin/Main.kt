fun main(args: Array<String>) {


// if else expression
    val time : Int = 20
    if (time > 20){
        println("this is right")

    }
    // else if can use after if only
    else if (time == 20){
        println("You are decent ")
    }
    else {
        println("You are stupid")
    }

// if...else expressions


//   val time1: Int = 20
//   val time 2 = if (time1 < 18){
//       "whatver ."
//    } else {
//        "yes there you are"
//
//    }
//    print
        val x : Int = 3
        val y : Int = 4
        if (x>y){
            println(x)
        }
        else {
            println(y)
        }
    // another example
        val numberInt = 60
    // if numberInt is smaller than 0 then..
        val result = if (numberInt<0) {
            "negative number"

        }else if (numberInt >1){
            "positive number "
        }
        else {
            "idk what's that too"
        }
        println(result)

    // test the number is the even or odd number

        val numberTesting : Int = 20
        if (numberTesting % 2 ==0){

            println("this number is the even number")
        }
        else if (numberTesting == 20){
            println("numberTesting 20")
        }

        else {
            println("this number is the odd number ")
        }

    // time for meals of the day

        val mealTime : Int = 12

        if (mealTime in 0..11){

            println("Time for breakfast")
        }
        else if (mealTime == 12){
            println("Time for lunch")
        }
        else {
            println("Time for diet Man ! ")
        }

}