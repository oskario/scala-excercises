# Scala exercises

A small collection of interesting Scala exercises I found on a web.
 
Most of solutions are test-driven developed.


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


### 2. Fibonacci sequence

A fibonacci sequence is a sequence of numbers in which every number is the sum of two previous numbers, like that:

```
1 1 2 3 5 8 13 21 34 ...
```

Write a function that will recursively calculate the value at the given position (zero-based).

```
def fibonacci(n: Int): Int
```

Example:

```
fibonacci(0) = 1
fibonacci(2) = 2
fibonacci(6) = 13
```