package com.leetcode.kerikir.beginner


/**
 * Тема: Массив префиксных сумм
 *
 * Задание: Текущая сумма одномерного массива
 * Ограничения: 1 <= N <= 1000
 *              -10^6 <= K <= 10^6
 *
 * Время = 10 мс (13,14 %)
 * Память = 45,52 МБ (10,59 %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(1)
 */
class Solution1 {
    fun runningSum(nums: IntArray) : IntArray {

        for (i in 1..nums.lastIndex) {
            nums[i] += nums[i - 1]
        }

        return nums
    }
}



fun main() {
    val array = intArrayOf(1,2,3,4)
    val result = Solution1().runningSum(array)
    println(result.joinToString(","))
}