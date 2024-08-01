
package org.example

fun main() {

    /**-----Example 01-----*/
    // Создание и заполнение двумерного массива
    // В этом примере мы создаем двумерный массив размером 5x5 и заполняем его нулями.
    // Создаём двумерный массив размером 5x5
    var cinema = arrayOf<Array<Int>>()

    // Заполняем массив нулями
        for (i in 0..4) {
            var array = arrayOf<Int>()
            for (j in 0..4) {
                array += 0
            }
            cinema += array
        }

    // Выводим данные массива
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }   // InConsole:
            // 0 0 0 0 0
            // 0 0 0 0 0
            // 0 0 0 0 0
            // 0 0 0 0 0
            // 0 0 0 0 0

    // КАК ЭТО РАБОТАЕТ:
    // Создание пустого двумерного массива:
    // var cinema = arrayOf<Array<Int>>(): Создается пустой массив, который будет содержать другие массивы (Array<Int>).
    // Это и есть основа двумерного массива.
    // Добавление строк в двумерный массив:
    // Внешний цикл for (i in 0..4) выполняется 5 раз (для создания 5 строк).
    // Внутри этого цикла создается пустой массив array = arrayOf<Int>() для каждой строки.
    // Заполнение строк элементами:
    // Внутренний цикл for (j in 0..4) добавляет 5 элементов со значением 0 в каждую строку.
    // Метод array += 0 добавляет элемент в массив array.
    // Добавление строк в двумерный массив:
    // После заполнения каждой строки массивом array, эта строка добавляется в основной массив cinema с помощью cinema += array.
    // Таким образом, cinema становится двумерным массивом.

    /**-----Example 02-----*/
    // Использование Array и функции инициализации
    // Более идиоматический способ создания двумерного массива в Kotlin:
    // Создаём двумерный массив размером 5x5, заполненный нулями
    val cinemaAltA = Array(5) { Array(5) { 0 } }
    // КАК ЭТО РАБОТАЕТ:
    // Создание основного массива:
    // Array(5) { ... } создает массив длиной 5, где каждый элемент инициализируется с помощью функции-инициализатора { ... }.
    // Создание строк внутри массива:
    // Внутри функции-инициализатора для основного массива создается новый массив Array(5) { 0 }, который также имеет длину 5 и заполнен нулями.

    // Таким образом, cinema становится двумерным массивом размером 5x5, где все элементы равны 0.
    // Этот способ проще и более читаем, особенно если все элементы массива нужно инициализировать одинаковым значением.

    // ИТОГ: Оба метода создают двумерный массив, но второй способ (с использованием Array и функции инициализации) является более кратким и рекомендуемым в Kotlin для создания массивов с предопределенными значениями.

    /**-----Example 03-----*/
    // Обновление данных в массиве
    // Теперь, когда зрители занимают места, мы обновим массив, чтобы отразить занятые места.
    // Центр зала (ряды и места нумеруются с 0)
    cinema[2][2] = 1

    // Три места во втором ряду (третьем по счёту)
    for (i in 1..3) {
        cinema[3][i] = 1
    }

    // Весь первый ряд (пятый по счёту)
    for (i in 0..4) {
        cinema[4][i] = 1
    }

    // Выводим обновленные данные массива
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    // InConsole:
    // 0 0 0 0 0
    // 0 0 0 0 0
    // 0 0 1 0 0
    // 0 1 1 1 0
    // 1 1 1 1 1

    // КАК ЭТО РАБОТАЕТ:
    // Создание массива:
    // var cinema = arrayOf<Array<Int>>(): Создаем пустой двумерный массив.
    // Внешний цикл (for (i in 0..4)) создает строки массива, а внутренний (for (j in 0..4)) заполняет их значениями 0.
    // Обновление массива:
    // cinema[2][2] = 1: Устанавливает значение в центре зала (третья строка, третье место) как занятое (1).
    // Циклы for используются для установки значений в соответствующих строках и столбцах для занятых мест.
    // Вывод массива:
    // Мы используем вложенные циклы для вывода каждой строки массива и её значений.

    // ИТОГ: Этот код представляет собой простой пример работы с двумерными массивами в Kotlin, включая создание, инициализацию и изменение данных.
}
