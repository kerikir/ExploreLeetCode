package com.leetcode.kerikir.beginner


/**
 * Тема: Массив префиксных сумм
 *
 * Задание: Текущая сумма одномерного массива
 * Ограничения: 1 <= N <= 1000
 *              -10^6 <= K <= 10^6
 *
 * Время = 10 мс (13,14 %)
 * Память = 45,43 МБ (11,44 %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(N)
 */
class Solution {
    fun runningSum(nums: IntArray) : IntArray {
        val runningSum = IntArray(nums.size)

        runningSum[0] = nums[0]
        for (i in 1..nums.lastIndex) {
            runningSum[i] = runningSum[i - 1] + nums[i]
        }

        return runningSum
    }
}



fun main() {
    val array = intArrayOf(1,2,3,4)
    val result = Solution().runningSum(array)
    println(result.joinToString(","))
}