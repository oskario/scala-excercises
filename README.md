# Scala exercises

A small collection of interesting Scala exercises I found on a web.
 
Most solutions are test-driven developed.


### 1. Pascal's triangle

The figure below is to be known as a Pascal's Triangle (each value is calculated as a sum of two values immediately above it):

```
   1
  1 1
 1 2 1
1 3 3 1
```

Write a function that will recursively calculate the value at the given position (row and column, zero-based).

```
def pascal(row: Int, column: Int): Int
```

Example:

```
pascal(0, 0) = 1
pascal(2, 1) = 2
pascal(3, 2) = 3
```


### 2. Fibonacci sequence sum

A fibonacci sequence is a sequence of numbers in which every number is the sum of two previous numbers, like that:

```
1 1 2 3 5 8 13 21 34 ...
```

Write a function that will calculate the sum of the first n elements.

```
def fibonacciSum(n: Int): Int
```

Example:

```
fibonacciSum(0) = 0
fibonacciSum(1) = 1
fibonacciSum(3) = 4
fibonacciSum(7) = 34
```


### 3. Reverse Polish notation

A Reverse Polish notation is a mathematical notation in which every operator follows all of its operands. For example ```2 + 2``` would be translated to ```2 2 +```,
and ```( 2 + 3 ) * 5``` would become ```2 3 + 5 *```.

Write a function that will evaluate an expression in Reverse Polish notation.

```
def rpn(expr: String): Int
```

Example:

```
rpn("2 2 +") = 4
rpn("2 3 + 5 *") = 25
```