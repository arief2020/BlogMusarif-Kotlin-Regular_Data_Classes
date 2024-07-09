package org.test_kotlin

class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hello, my name is $name. i am $age years old")
    }
}

data class User(val id: Int, val name: String, val email: String)

fun main() {
    val person1 = Person("arief", 22)
    println(person1.greet())

    val user1 = User(1, "Alice", "alice@example.com")
    val user2 = user1.copy(id = 2, name = "Ice")

    println(user1) // Output: User(id=1, name=Alice, email=alice@example.com)
    println(user2) // Output: User(id=1, name=Bob, email=alice@example.com)
}