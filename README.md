# Following questions are selected by _Mayukh Hazari_:

## Question 1: Split Array Largest Sum

`Difficulty:` `hard`

`Related Topics:` `Array` `Binary Search` `Dynamic Programming` `Greedy`

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is **minimized**.

Return _the minimized largest sum of the split_.

A **subarray** is a contiguous part of the array.

**Constraints:**

- `1 <= nums.length <= 1000`
- `0 <= nums[i] <= 106`
- `1 <= k <= min(50, nums.length)`

| **Test case 1**     | **Test case 2**    |
| ------------------- | ------------------ |
| `nums=[7,2,5,10,8]` | `nums=[1,2,3,4,5]` |
| `k=2`               | ` k=2`             |

### Click Here 👇

[**Solution in Java**]() ☕

##

## Question 2: First Bad Version

`Difficulty:` `easy`

`Related Topics:` `Binary Search`

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have `n` versions `[1, 2, ..., n]` and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool `isBadVersion(version)` which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

**Constraints:**

- `1 <= bad <= n <= 231 - 1`

| **Test case 1** | **Test case 2** |
| --------------- | --------------- |
| `n=5`           | `n=1`           |
| `returns 2`     | ` returns 1`    |

### Click Here 👇

[**Solution in Java**]() ☕

##

## Question 3: Two Sum II - Input Array Is Sorted

`Difficulty:` `easy`

`Related Topics:` `Binary Search`

Given a **1-indexed** array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index1] and numbers[index2]` where` 1 <= index1 < index2 <= numbers.length.`

Return the indices of the two numbers, `index1` and `index2`, **added by one** as an integer array `[index1, index2]` of length 2.

The tests are generated such that there is **exactly one solution**. You may not use the same element twice.

Your solution must use only constant extra space.

**Constraints:**

- `2 <= numbers.length <= 3 * 104`
- `-1000 <= numbers[i] <= 1000`
- `numbers` is sorted in **non-decreasing order**.
- `-1000 <= target <= 1000`
- The tests are generated such that there is **exactly one solution**.

| **Test case 1**                 | **Test case 2**                     |
| ------------------------------- | ----------------------------------- |
| `numbers = [2,3,4], target = 6` | `numbers = [2,7,11,15], target = 9` |
| `Output: [1,3]`                 | ` Output: [1,2]`                    |

### Click Here 👇

[**Solution in Java**]() ☕

##

## Question 4: Check If N and Its Double Exist

`Difficulty:` `easy`

`Related Topics:` `Binary Search`

Given an array `arr` of integers, check if there exist two indices `i` and `j` such that :

- `i != j`
- `0 <= i, j < arr.length`
- `arr[i] == 2 * arr[j]`

**Constraints:**

- `2 <= arr.length <= 500`
- `-10^3 <= arr[i] <= 10^3`

| **Test case 1**           | **Test case 2**           |
| ------------------------- | ------------------------- |
| `Input: arr = [10,2,5,3]` | `Input: arr = [3,1,7,11]` |
| `Output: true`            | `Output: false`           |

### Click Here 👇

[**Solution in Java**]() ☕

