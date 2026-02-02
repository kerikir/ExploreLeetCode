package com.leetcode.kerikir.beginner


/**
 * Тема: Четность числа
 *       Побитовый операции
 *
 * Задание: Количество шагов для уменьшения числа до нуля
 * Ограничения: 0 <= N <= 1_000_000
 *
 * Время = 0 мс (100.00 %)
 * Память = 40.55 МБ (25.33 %)
 *
 * Временная сложность = O(2 * logN) = O(logN)
 * Пространственная сложность = O(1)
 */
class Solution7 {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var isEven = false

        // Число для уменьшения на 1 (сброс последней цифры в 0)
        val value = 0b11111111111111111110

        var numberOfSteps = 0

        while (number > 0) {
            // Проверка четности числа - побитовое умножение на 1 (проверка последней цифры)
            isEven = (number and 1) == 0

            if (isEven) {
                // Деление числа на 2 - сдвиг битов вправо на 1
                number = number shr 1

            } else {
                // Вычитание 1 - сброс последней цифры в 0
                number = number and value
            }

            numberOfSteps++
        }

        return numberOfSteps
    }
}



fun main() {
    val n = 123
    val result = Solution7().numberOfSteps(n)
    println(result)
}