
package org.example

fun main() {
    /**-----Example 01-----*/
    // Функция associate()
    // Функция associate() используется для создания Map из коллекции, где ключи и значения задаются по парам, сформированным на основе элементов коллекции. Пример:
    val dogs = listOf(
        DogAltB("Шарик", 5, 1),
        DogAltB("Клык", 9, 2)
    )

    val associatedMap = dogs.associate { it.name to it.age }
    println(associatedMap) // InConsole: {Шарик=5, Клык=9}
    // Здесь мы создаем список котов и используем associate, чтобы создать Map, где имена котов становятся ключами, а их возраст — значениями.

    /**-----Example 02-----*/
    // Функция associateTo()
    // Функция associateTo() похожа на associate(), но она позволяет заполнять уже существующее отображение (Map).
    // Это полезно, когда нужно добавлять новые данные в существующее отображение.

    val originalMap = mutableMapOf<String, Int>()
    dogs.associateTo(originalMap) { it.name to it.weight }
    println(originalMap) // InConsole: {Шарик=1, Клык=2}
    // В этом примере мы создаем пустое отображение originalMap и затем добавляем в него пары "имя - вес" собак из списка dogs.

    /**-----Example 03-----*/
    // Функция associateBy()
    // Функция associateBy() используется, если нужно создать Map с уникальными ключами, которые выбираются на основе определенного свойства элементов коллекции.
    // Значением в Map будет сам объект или любое другое значение, которое можно извлечь из объекта.
    val dogsMapByAge = dogs.associateBy { it.age }
    println(dogsMapByAge) // InConsole: {5=DogAltB(name=Шарик, age=5, weight=1), 9=DogAltB(name=Клык, age=9, weight=2)}
    // В этом примере мы создаем Map, где возраст котов является ключом, а значения - сами объекты котов.
}





data class DogAltB(val name: String,val age: Int, val weight: Int)