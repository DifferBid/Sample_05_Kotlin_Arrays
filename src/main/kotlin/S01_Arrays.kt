package org.example

fun main() {

    /**-----Example 01-----*/
    // Создание массива с помощью arrayOf()
    // Метод arrayOf() позволяет создать массив с элементами различных типов.
    val myArray = arrayOf(1, 2, 3, 4, 5)
    println(myArray[2]) // InConsole: 3
    // Итог: Этот массив содержит пять чисел, и мы можем получить третий элемент (индексация начинается с нуля) с помощью myArray[2].
    /**-----Example 02-----*/
    // Определение длины массива
    // Длину массива можно узнать, используя свойство size
    println(myArray.size) // InConsole: 5

    /**-----Example 03-----*/
    // Создание массива смешанного типа
    // Kotlin позволяет создавать массивы, содержащие элементы разных типов.
    val mixedArray = arrayOf(1, 2, 3, 4, 5, "зайчик", "вышел", "погулять")
    println(mixedArray[1]) /// InConsole: 2
    println(mixedArray[5]) //  InConsole: зайчик
    // Итог: Такие массивы работают нормально, но они не обеспечивают строгую типизацию.

    /**-----Example 04-----*/
    // Строгая типизация
    // Для создания массива с элементами только одного типа, используйте обобщения.
    // Например, массив только с целыми числами:
    val intArray = arrayOf<Int>(1, 2, 3, 4, 5)

    /**-----Example 05-----*/
    // Также существуют специализированные методы, которые явно указывают тип массива в названии,
    // например, intArrayOf(), charArrayOf(), booleanArrayOf() и так далее:
    val intArrayAltA = intArrayOf(1, 2, 3, 4, 5)
    val charArray= charArrayOf('A','B','C')
    val booleanArray = booleanArrayOf(true, false, 2>1)

    /**-----Example 06-----*/
    // Перебор элементов массива
    // Для перебора элементов массива с получением индексов можно использовать метод withIndex():
    val numbersArray = intArrayOf(1, 2, 3, 4, 5)
    // Проходим по каждому элементу массива с помощью метода withIndex()
    // withIndex() возвращает объект, который при итерации дает пары (индекс, значение)
    for ((index, value) in numbersArray.withIndex()) {
        // На каждой итерации цикла переменные index и value получают значения индекса и соответствующего элемента массива
        println("Значение индекса $index равно $value") // InConsole: Выводим индекс и значение элемента
    }
    // Использование метода withIndex():
    // Метод withIndex() используется для перебора элементов массива вместе с их индексами.
    // Он возвращает последовательность объектов IndexedValue, которые содержат пару (index, value), где index - индекс элемента в массиве, а value - значение этого элемента.
    // Итерация по массиву:
    // Цикл for проходит по каждому элементу массива, распаковывая пары (index, value) в переменные index и value.
    // Для каждой пары выводится сообщение, которое включает индекс и значение элемента.

    // Выводит каждый элемент массива вместе с его индексом.
    // Итог: Этот метод удобен для ситуаций, когда вам нужно знать не только значения элементов массива, но и их индексы.
}