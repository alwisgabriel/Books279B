# 279B — Books

[Problem on Codeforces](https://codeforces.com/problemset/problem/279/B)

## Problem statement

Valera has `t` minutes available for reading and `n` books arranged in a row. Reading book `i` takes `a_i` minutes. He may choose any starting book, then must read consecutive books in order. A book is counted only if he has enough time to finish it. Determine the greatest number of books he can read.

### Input

The first line contains two integers `n` and `t` (`1 ≤ n ≤ 10^5`; `1 ≤ t ≤ 10^9`), the number of books and the available reading time. The second line contains `n` integers `a_1, a_2, ..., a_n` (`1 ≤ a_i ≤ 10^4`), where `a_i` is the time required to read book `i`.

### Output

Print one integer: the maximum number of books Valera can finish.

### Example 1

**Input**

```text
4 5
3 1 2 1
```

**Output**

```text
3
```

### Example 2

**Input**

```text
3 3
2 2 3
```

**Output**

```text
1
```
