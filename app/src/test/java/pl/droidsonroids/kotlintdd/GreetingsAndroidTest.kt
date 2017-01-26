package pl.droidsonroids.kotlintdd

import org.junit.Assert.*
import org.junit.Test

class GreetingsAndroidTest {

    @Test
    @Throws(Exception::class)
    fun test_hello() {
        val greetings = GreetingsAndroid()
        assertEquals(greetings.sayHi(), "Hi Android!")
    }
}