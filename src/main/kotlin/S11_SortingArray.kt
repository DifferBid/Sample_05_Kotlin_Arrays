
package org.example

fun main() {

    /**-----Example 01-----*/
    // Сортировка числовых массивов
    // Сортировка по возрастанию Метод sort() сортирует массив по возрастанию на месте,
    // то есть изменяет сам массив, не создавая нового.
    val numbers: IntArray = intArrayOf(7, 5, 8, 4, 9, 6, 1, 3, 2)
    numbers.sort()
    println("Sorted array: ${numbers.contentToString()}") // InConsole: Sorted array: [1, 2, 3, 4, 5, 6, 7, 8, 9]

    /**-----Example 02-----*/
    // Сортировка определенного диапазона
    // Можно сортировать только часть массива, указав начальный и конечный индексы.
    val numbersAltA: IntArray = intArrayOf(7, 5, 8, 4, 9, 6, 1, 3, 2)
    numbersAltA.sort(0, 3)
    println("Partially sorted array: ${numbersAltA.contentToString()}") // InConsole: Partially sorted array: [5, 7, 8, 4, 9, 6, 1, 3, 2]

    /**-----Example 03-----*/
    // Сортировка по убыванию
    // Для сортировки в обратном порядке используется метод sortDescending().
    numbers.sortDescending()
    println("Descending sorted array: ${numbers.contentToString()}") // InConsole: Descending sorted array: [9, 8, 7, 6, 5, 4, 3, 2, 1]

    /**-----Example 04-----*/
    // Создание отсортированных копий массива
    // Если нужно сохранить исходный массив неизменным, можно использовать методы sortedArray()
    // и sortedArrayDescending(), которые возвращают новый массив, отсортированный по возрастанию или убыванию соответственно.
    val numbersAltB: IntArray = intArrayOf(7, 5, 8, 4, 9, 6, 1, 3, 2)
    val sortedNumbers: IntArray = numbersAltB.sortedArray()
    val descendingSortedNumbers: IntArray = numbersAltB.sortedArrayDescending()

    println("Original array: ${numbersAltB.contentToString()}") // InConsole: Original array: [7, 5, 8, 4, 9, 6, 1, 3, 2]
    println("Sorted array: ${sortedNumbers.contentToString()}") // InConsole: Sorted array: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    println("Descending sorted array: ${descendingSortedNumbers.contentToString()}") // InConsole: Descending sorted array: [9, 8, 7, 6, 5, 4, 3, 2, 1]

    /**-----Example 05-----*/
    // Сортировка объектов
    // Для сортировки массивов объектов, таких как собаки, можно использовать sortWith() и sortBy().

    // Сортировка с использованием компаратора
    // Можно создать компаратор, чтобы определить порядок сортировки, например, по возрасту собак.
    val dogs = arrayOf(Dog("Клык", 8), Dog("Шарик", 4), Dog("Дог", 9))
    dogs.sortWith(Comparator { d1: Dog, d2: Dog -> d1.age - d2.age })
    dogs.forEach { println(it) }
    /* InConsole:
    Dog(name=Шарик, age=4)
    Dog(name=Клык, age=8)
    Dog(name=Дог, age=9)
    */

    /**-----Example 06-----*/
    // Сортировка с использованием функции sortBy()
    // Функция sortBy() упрощает процесс сортировки, позволяя указать свойство объекта, по которому нужно отсортировать массив.
    // В этом примере собаки сортируются по именам.
    dogs.sortBy { dog -> dog.name }
    dogs.forEach { println("name $it") }
    /* InConsole:
    name Dog(name=Дог, age=9)
    name Dog(name=Клык, age=8)
    name Dog(name=Шарик, age=4)
    */
    // В этом примере собаки сортируются по возрасту.
    dogs.sortBy { dog -> dog.age }
    dogs.forEach { println("age $it") }
    /* InConsole:
    age Dog(name=Шарик, age=4)
    age Dog(name=Клык, age=8)
    age Dog(name=Дог, age=9)
    */

    /**-----Example 07-----*/
    // Сортировка строковых массивов в Kotlin также легко выполняется с помощью встроенных методов,
    // таких как sort(), sortDescending(), sortedArray(), sortedArrayDescending(), а также функций, таких как sortBy().
    // Рассмотрим несколько примеров сортировки строковых массивов.

    // Сортировка по возрастанию
    val strings = arrayOf("Banana", "Apple", "Orange", "Grapes", "Pineapple")
    strings.sort()
    println(strings.contentToString()) // InConsole: [Apple, Banana, Grapes, Orange, Pineapple]
    // Сортировка по убыванию
    strings.sortDescending()
    println(strings.contentToString()) // InConsole: [Pineapple, Orange, Grapes, Banana, Apple]
}

data class Dog(val name: String, val age: Int)
