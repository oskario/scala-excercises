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

Write a function that will recursively calculate the value at the given position (row and column, zero-indexed).

```
def pascal(row: Int, column: Int): Int
```

Example:

```
pascal(0, 0) = 1
pascal(2, 1) = 2
pascal(3, 2) = 3
```