
package org.example

fun main() {

    /**-----Example 01-----*/
    // Умножение каждого элемента на себя
    val list = listOf(1, 2, 3)
    val destination = list.map { it * it }
    println(destination) // InConsole: [1, 4, 9]
    // В этом примере map() применяет лямбда-выражение { it * it } к каждому элементу списка list,
    // создавая новый список destination, где каждый элемент является квадратом соответствующего элемента исходного списка.

    /**-----Example 02-----*/
    // Извлечение имен из объектов класса DogsAltC
    val dogs = listOf(
        DogsAltC("Шарик", 5, true),
        DogsAltC("Бобик", 9, true)
    )

    println(dogs.map(DogsAltC::name))  // InConsole: [Шарик, Бобик]
    // или
    println(dogs.map { it.name })
    println(dogs.map { "${it.name} is ${it.age} years old" })

    // В этом примере мы используем map() для извлечения имени (name) из каждого объекта DogsAltC в списке dogs. Результат — список строк с именами собак.

    /**-----Example 03-----*/
    //  Фильтрация и трансформация данных
    val dogsAltA = listOf(
        DogsAltC("Шарик", 5, true),
        DogsAltC("Бобик", 9, true)
    )

    println(dogsAltA.filter { it.age > 5 }.map(DogsAltC::name)) // InConsole: [Бобик]
    // Здесь мы сначала фильтруем собак, чей возраст больше 5 лет, используя метод filter(). Затем применяем map(), чтобы получить имена этих собак.

    /**-----Example 04-----*/
    // Удаление префикса у строк
    val cats = listOf("!Мурзик", "!Рыжик", "Барсик")
    val shortCats = cats.map { name ->
        name.removePrefix("!")
    }
    println(shortCats) // InConsole: [Мурзик, Рыжик, Барсик]
    // В этом примере map() используется для удаления префикса "!" из каждой строки списка cats.
    // Лямбда-выражение { name.removePrefix("!") } применяется к каждому элементу, и результат сохраняется в новом списке shortCats.

}

data class DogsAltC(val name: String, val age: Int, val isFriendly: Boolean)