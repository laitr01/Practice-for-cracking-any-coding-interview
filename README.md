# Practice for cracking any coding interview
## Mathematical
### 1. Print the pattern | Set-1 [Answer](https://github.com/laitr01/Practice-for-cracking-any-coding-interview/blob/master/Algothrims/src/mathematical/PrintThePattern.kt)
```
You a given a number N. You need to print the pattern for the given value of N.
for N=2 the pattern will be 
2 2 1 1
2 1
for N=3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1

Input Format:
The first line of input is the number of testcases T. The T test cases follow. The first line of each test case is an integer N.

Output Format:
For each test case, in a new line, print the required pattern in a singleline . 
Note : Instead of printing new line print a "$" without quotes.

Your Task:
Since this is a function problem, you don't need to worry about the testcases. Your task is to complete the function printPat which takes one argument 'N' denoting the length of the pattern.

Constraints:
1 <= T <= 20
1 <= N <= 40

Example:
Input
2
2
3
Output
2 2 1 1 $2 1 $
3 3 3 2 2 2 1 1 1 $3 3 2 2 1 1 $3 2 1 $
```

### 2. Print table (This is a full code problem. Please see sample codes [here](https://www.geeksforgeeks.org/how-to-begin-with-competitive-programming) before attempting the problem) [Answer](http://)
```
Print the table of a given number N upto 10. 

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each testcase cotains one line of input denoting N.

Output:
For each testcase, print the table of N upto 10.

Constraints: 
1 <= T <= 100
1 <= N <= 100

Example:
Input:
1
9 

Output:
9 18 27 36 45 54 63 72 81 90

** For More Input/Output Examples Use 'Expected Output' option **
```

### 3. Series AP [Answer](http://)
```
Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every test case it contains of an integer N.

Output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.

Constraints:
1 <= T <= 30
-100 <= A <= 100
-100 <= B <= 100
1 <= N <= 100

Example:
Input:
2
2 3
4
1 2
10
Output:
5
10
```

### 4. Series GP [Answer](http://)
```
Given the first 2 terms A and B of a Geometric Series, tell the Nth term of the series.

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case in its first line contains two positive integer A and B (First 2 terms of GP). In the second line of every test case it contains of an integer N.

Output:
In each seperate line print the Nth term of the Geometric Progression. Print the floor ( floor(2.3)=2 ) of the answer.

Constraints:
1 <= T <= 30
-100 <= A <= 100
-100 <= B <= 100
1 <= N <= 5

Example:
Input:
2
2 3
1
1 2
2
Output:
2
2
```

### 5. Closest Number [Answer](http://)
```
Given two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

Input:
The first line consists of an integer T i.e number of test cases. T testcases follow.  The first and only line of each test case contains two space separated integers N and M.

Output:
For each testcase, in a new line, print the closest number to N which is also divisible by M.

Constraints: 
1 <= T <= 100
-1000 <= N, M <= 1000

Example:
Input:
2
13 4
-15 6
Output:
12
-18
```

### 6. Armstrong Numbers [Answer](http://)
```
For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 33 + 73 + 13 = 371

Input:
First line contains an integer, the number of test cases 'T'. T testcases follow. Each test case contains a positive integer N.

Output:
For each testcase, in a new line, print "Yes" if it is a armstrong number else print "No".

Constraints:
1 <= T <= 31
100 <= N < 1000

Example:
Input:
1
371
Output:
Yes
```

### 7. Sum of Digit is Pallindrome or not [Answer](http://)
```
Write a program to check if the sum of digits of a given number N is a palindrome number or not.

Input:
The first line of the input contains T denoting the number of testcases. T testcases follow. Then each of the T lines contains single positive integer N denoting the value of number.

Output:
For each testcase, in a new line, output "YES" if pallindrome else "NO". (without the quotes)

Constraints:
1 <= T <= 200
1 <= N <= 1000

Example:
Input:
2
56
98
Output:
YES
NO
```
### 8. Reverse digits [Answer](http://)
```
Write a program to reverse digits of a number N.

Input:
The first line of input contains an integer T, denoting the number of test cases. T testcases follow. Each test case contains an integer N.

Output:
For each test case, print the reverse digits of number N .

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 109

Example:
Input:
2
200
122
Output:
2
221
```
### 9. Print the Kth Digit [Answer](http://)
```
Given two numbers A and B, find Kth digit from right of AB.

Input:
The first line of the input contains T denoting the number of test cases. T testcases follow.  Each of the next T lines contains three space separated positive integers denoting the value of a , b and k respectively.

Output:
For each test case, in a new line, output the Kth digit from right of AB in new line.

Constraints:
1 <= T <= 100
1 <= A , B <=15
1 <= K <= |totaldigits in AB|

Example:
Input:
2
3 3 1
5 2 2
Output:
7
2
```
### 10. Binary number to decimal number [Answer](http://)
```
Given a Binary Number B, Print its decimal equivalent.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follow. Each test case contains a single Binary number B. 

Output: 
For each testcase, in a new line, print each Decimal number in new line.

Constraints:
1 < T < 100
1 <= Digits in Binary <= 16

Example:
Input:
2
10001000
101100
Output:
136
44
```
