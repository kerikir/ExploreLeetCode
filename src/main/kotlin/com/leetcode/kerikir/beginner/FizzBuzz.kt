package com.leetcode.kerikir.beginner


/**
 * Тема: Условное выражение
 *       Вычисление остатка от деления
 *       Конкатенация строк
 *
 * Задание: Сформировать строку исходя из входного числа
 * Ограничения: 1 <= N <= 10_000
 *
 * Время = 0 мс ( %)
 * Память =  МБ ( %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(N)
 */
class Solution5 {
    fun fizzBuzz(n: Int): List<String> {
        val result = mutableListOf<String>()

        var i = 0
        var isDividedInto3 = false
        var isDividedInto5 = false

        while (i < n) {
            i++

            isDividedInto3 = (i % 3) == 0
            isDividedInto5 = (i % 5) == 0

            if (isDividedInto3 && isDividedInto5) {
                result.add("FizzBuzz")

            } else if (isDividedInto3) {
                result.add("Fizz")

            } else if (isDividedInto5) {
                result.add("Buzz")

            } else {
                result.add(i.toString())
            }
        }

        return result
    }
}



fun main() {
    val n = 5
    val result = Solution5().fizzBuzz(n)    // [1, 2, Fizz, 4, Buzz]
    println(result)
}