package com.leetcode.kerikir.beginner

import kotlin.math.max


/**
 * Тема: Итерация по двумерному массиву
 *
 * Задание: Определить строку с наибольшей суммой
 * Ограничения: 1 <= M <= 50
 *              1 <= N <= 50
 *              1 <= K <= 100
 *
 * Время = 0 мс (100.00 %)
 * Память = 42.54 МБ (97.64 %)
 *
 * Временная сложность = O(M * N) = O(N^2)
 * Пространственная сложность = O(1)
 */
class Solution4 {
    fun maximumWealth(accounts: Array<IntArray>): Int {

        var maxSum = 0
        var currentSum = 0

        for (account in accounts) {
            currentSum = 0

            for (sum in account) {
                currentSum += sum
            }

            maxSum = max(maxSum, currentSum)
        }

        return maxSum
    }
}



fun main() {
    val array = arrayOf(intArrayOf(1,5), intArrayOf(7,3), intArrayOf(3,5))
    val result = Solution4().maximumWealth(array)
    println(result)
}