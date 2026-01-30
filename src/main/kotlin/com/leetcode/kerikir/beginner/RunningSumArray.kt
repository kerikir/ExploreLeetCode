package com.leetcode.kerikir.beginner


/**
 * Тема: Массив префиксных сумм
 *
 * Задание: Текущая сумма одномерного массива
 *
 * 
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
    println(result)
}