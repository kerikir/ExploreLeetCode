package com.leetcode.kerikir.beginner


/**
 * Тема: Четность числа
 *       Побитовый операции
 *
 * Задание: Количество шагов для уменьшения числа до нуля
 * Ограничения: 0 <= N <= 1_000_000
 *
 * Время = 0 мс (100.00 %)
 * Память = 39.53 МБ (100.00 %)
 *
 * Временная сложность = O(2 * logN) = O(logN)
 * Пространственная сложность = O(1)
 */
class Solution9 {
    fun numberOfSteps(num: Int): Int {
        var number = num

        var numberOfSteps = 0

        while (number > 0) {

            // Проверка четности числа - побитовое умножение на 1 (проверка последней цифры)
            if (number and 1 == 0) {
                // Деление числа на 2 - сдвиг битов вправо на 1
                number = number shr 1

            } else {
                number--
            }

            numberOfSteps++
        }

        return numberOfSteps
    }
}



fun main() {
    val n = 123
    val result = Solution9().numberOfSteps(n) // 12 шагов
    println(result)
}