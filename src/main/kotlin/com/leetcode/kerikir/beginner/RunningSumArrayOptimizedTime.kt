package com.leetcode.kerikir.beginner


/**
 * Тема: Массив префиксных сумм
 *
 * Задание: Текущая сумма одномерного массива
 * Ограничения: 1 <= N <= 1000
 *              -10^6 <= K <= 10^6
 *
 * Время = 0 мс (100,00 %)
 * Память = 41,85 МБ (95,34 %)
 *
 * Временная сложность = O(N)
 * Пространственная сложность = O(1)
 */
class Solution2 {
    fun runningSum(nums: IntArray) : IntArray {

        for (i in 1..(nums.size - 1)) {
            nums[i] = nums[i - 1] + nums[i]
        }

        return nums
    }
}



fun main() {
    val array = intArrayOf(1,2,3,4)
    val result = Solution2().runningSum(array)
    println(result.joinToString(","))
}