package pl.droidsonroids.kotlintdd

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

/**
 * Created by droids on 26.01.2017.
 */
@RunWith(JUnitPlatform::class)
class GreetinsAndroidSpekTest : Spek({

    given("a warm welcome") {
        val greetings = GreetingsAndroid()

        on("hearing someone is saying hello") {
            it("should respond nicely") {
                greetings.sayHi() shouldEqual "Hi Android!"
            }
        }
    }
})