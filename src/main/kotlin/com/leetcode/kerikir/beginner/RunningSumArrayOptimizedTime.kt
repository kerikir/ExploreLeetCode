package com.leetcode.kerikir.beginner


/**
 * Тема: Массив префиксных сумм
 *
 * Задание: Текущая сумма одномерного массива
 * Ограничения: 1 <= N <= 1000
 *              -10^6 <= K <= 10^6
 *
 * Время = 0 мс (100,00 %)
 * Память = 42,80 МБ (35,59 %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(1)
 */
class Solution2 {
    fun runningSum(nums: IntArray) : IntArray {

        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }

        return nums
    }
}



fun main() {
    val array = intArrayOf(1,2,3,4)
    val result = Solution2().runningSum(array)
    println(result.joinToString(","))
}