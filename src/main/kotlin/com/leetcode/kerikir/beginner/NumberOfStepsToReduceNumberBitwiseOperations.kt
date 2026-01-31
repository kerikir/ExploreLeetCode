package com.leetcode.kerikir.beginner


/**
 * Тема: Четность числа
 *       Побитовый операции
 *
 * Задание: Количество шагов для уменьшения числа до нуля
 * Ограничения: 0 <= N <= 1_000_000
 *
 * Время =  мс ( %)
 * Память =  МБ ( %)
 *
 * Временная сложность = O()
 * Пространственная сложность = O()
 */
class Solution7 {
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
    val result = Solution7().numberOfSteps(n)
    println(result)
}