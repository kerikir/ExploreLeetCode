package com.leetcode.kerikir.beginner


/**
 * Тема: Четность числа
 *       Побитовый операции
 *
 * Задание: Количество шагов для уменьшения числа до нуля
 * Ограничения: 0 <= N <= 1_000_000
 *
 * Время = 0 мс ( %)
 * Память =  МБ ( %)
 *
 * Временная сложность = O(2 * logN) = O(logN)
 * Пространственная сложность = O(1)
 */
class Solution6 {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var isEven = false

        var numberOfSteps = 0

        while (number > 0) {
            isEven = (number % 2) == 0

            if (isEven) {
                number /= 2

            } else {
                number--
            }

            numberOfSteps++
        }

        return numberOfSteps
    }
}



fun main() {
    val n = 14
    val result = Solution6().numberOfSteps(n)
    println(result)
}