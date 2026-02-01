package com.leetcode.kerikir.beginner


/**
 * Тема: Условное выражение
 *       Вычисление остатка от деления
 *       Конкатенация строк
 *
 * Задание: Сформировать строку исходя из входного числа
 * Ограничения: 1 <= N <= 10_000
 *
 * Время = 1 мс (100.00 %)
 * Память = 44.80 МБ (96.70 %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(1)
 */
class Solution8 {
    fun fizzBuzz(n: Int): List<String> {
        val result = mutableListOf<String>()

        var i = 0
        var isDividedInto3 = false
        var isDividedInto5 = false

        while (i < n) {
            i++

            var resultString = ""

            isDividedInto3 = (i % 3) == 0
            isDividedInto5 = (i % 5) == 0

            if (isDividedInto3) {
                resultString += "Fizz"

            }
            if (isDividedInto5) {
                resultString += "Buzz"

            }
            if (resultString.isEmpty()) {
                resultString += i
            }

            result.add(resultString)
        }

        return result
    }
}



fun main() {
    val n = 5
    val result = Solution8().fizzBuzz(n)    // [1, 2, Fizz, 4, Buzz]
    println(result)
}