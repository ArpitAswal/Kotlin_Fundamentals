package com.example.myapplication

class Variable{

    companion object{

        @JvmStatic
        fun main(args: Array<String>){
            //By using var variable we can change this variable value later
            var count : Int =10 //or var count =10
            //The type you store in a variable is inferred when the compiler can figure it out from context. If you want, you can always specify the type of a variable explicitly, using the colon notation.
            // var is a type of variable
            // count is a variable name
            // Int is a data type of variable, it is explicitly given type here we can remove it
            // initialize variable with 10

            println("before change count=$count")
            count = 15
            changeCount(count)

            //By using val variable we can not change this variable value later
            val counter = 1
            println("initialize counter value=$counter")
            //counter =2 here we have an error val can not be reassigned

            //  Call some methods on numbers. Kotlin keeps numbers as primitives, but it lets you call methods on numbers as if they were objects

            changeCount(15.times(2))
            changeCount(15.plus(3))
            changeCount(15.minus(5))
            changeCount(15.div(3))
            changeCount(15.mod(5))
            typeCast()

            //To make long numeric constants more readable, Kotlin allows you to place underscores in the numbers, where it makes sense to you. Try entering different numeric constants.
            val oneMillion = 1_000_000
            val socialSecurityNumber = 999_99_9999L
            val hexBytes = 0xFF_EC_DE_5E
            val bytes = 0b11010010_01101001_10010100_10010010
        }

        private fun changeCount(count: Int) {
            println("after change count=$count")
        }

        /*
        Note: It is possible to create actual object wrappers around numbers, which is known as boxing. Boxing happens automatically, such as for collections, where numbers are boxed and unboxed as needed.

        Warning: Using object wrappers requires more memory than storing just a number primitive. Do not use boxing unless it is needed, such as in a collection, which is covered later.
         */
        //Kotlin does not allow implicit type conversions. So you can't assign a short value directly to a long variable, or an Int to a Long. This is because implicit number conversion is a common source of errors in programs. You can always assign values of different types by casting.

        private fun typeCast(){

            val v1 : Int =6
            val v2 = v1.toByte()

            println("v1:$v1 and v2:$v2")

            //val v3 : String =v2
            //error: type mismatch: inferred type is Byte but String was expected
        }
    }
}