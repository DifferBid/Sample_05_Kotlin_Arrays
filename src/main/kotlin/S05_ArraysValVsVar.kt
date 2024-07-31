
package org.example

fun main() {

    /**-----Example 01-----*/
    // var (variable):
    var myArray = arrayOf(1, 2, 3) // Создаем массив с элементами 1, 2, 3
    myArray = arrayOf(4, 5) // Создаем новый массив и присваиваем его переменной myArray

    // Итог: В этом случае первоначальный массив [1, 2, 3] больше не доступен через myArray,
    // так как переменной присвоен новый массив [4, 5].

    /**-----Example 02-----*/
    val myArrayAltA = arrayOf(1, 2, 3) // Создаем массив с элементами 1, 2, 3

    // Нельзя присвоить новой ссылке:
    // myArray = arrayOf(4, 5) // Ошибка компиляции

    // Но можно изменить элементы массива:
    myArrayAltA[0] = 10 // Изменяем первый элемент массива на 10
    myArrayAltA[1] = 20 // Изменяем второй элемент массива на 20
    myArrayAltA[2] = 30 // Изменяем третий элемент массива на 30

    // Важные моменты
    // var и val относятся к самой переменной, а не к данным, на которые она указывает.
    // Для var переменная может указывать на разные объекты в течение времени, а val будет указывать только на один объект, однако сам объект может быть изменяемым.
    // Использование val рекомендуется, если не планируется изменять ссылку на объект, так как это улучшает читаемость кода и предотвращает случайные изменения.
}