
package org.example

fun main() {
    /**-----Example 01-----*/
    // Рассмотрим пример, где мы проверяем, содержится ли определенное число в массиве:
    val array = arrayOf(1, 2, 3, 4, 5) // Создаем массив из целых чисел
    val isContains = array.contains(9) // Проверяем, содержится ли число 9 в массиве
    println(isContains) // InConsole: false
    // В данном примере массив array содержит числа от 1 до 5. Метод contains(9) проверяет, есть ли в массиве число 9, и возвращает false, так как этого числа в массиве нет.

    /**-----Example 02-----*/
    // Можно использовать оператор in, который выполняет ту же функцию и часто делает код более читаемым.
    val isContainsAltB = 9 in array // Проверяем, содержится ли число 9 в массиве
    println(isContainsAltB) // InConsole: false
    // Этот код делает то же самое, что и предыдущий пример, но использует оператор in для проверки наличия элемента в массиве.

    /**-----Example 03-----*/
    // Проверка наличия строк и объектов
    // Метод contains() и оператор in работают не только с числами, но и с другими типами данных, такими как строки и объекты.
    val stringArray = arrayOf("apple", "banana", "cherry")
    val isContainsBanana = "banana" in stringArray
    println(isContainsBanana) // InConsole: true

    /**-----Example 04-----*/
    // Пример с объектами
    val dogArray = arrayOf(DogAltA("Клык"), DogAltA("Шарик"))
    val isContainsDog = dogArray.contains(DogAltA("Рекс"))
    println(isContainsDog) // InConsole: false

    val existingDog = dogArray[0]
    val isContainsExistingCat = existingDog in dogArray
    println(isContainsExistingCat) // InConsole: true
    // В последнем примере важно отметить, что проверка объектов по умолчанию использует метод equals(),
    // который, если не переопределен, проверяет ссылки на объекты.
    // Поэтому важно убедиться, что сравниваемые объекты являются одним и тем же экземпляром или что метод equals() корректно переопределен для сравнения содержимого объектов.
}

data class DogAltA(val name: String)