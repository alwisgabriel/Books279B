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

## Raciocínio

Como os tempos de leitura são positivos, uma janela contínua que ultrapassa `t` só pode voltar a ser válida removendo livros pelo início. Mantemos dois índices: `left` marca o começo da janela e `right` avança pelo vetor. A cada passo, somamos o tempo do novo livro; enquanto a soma exceder `t`, avançamos `left` e subtraímos os livros removidos. Depois disso, atualizamos a maior quantidade de livros encontrada.

Por exemplo, com `[3, 1, 2, 1]` e `t = 5`, a janela começa com `[3, 1]`, que leva 4 minutos. Ao incluir o próximo livro, a soma chega a 6, então removemos o livro de 3 minutos e a janela passa a ser `[1, 2]`. Incluindo o último livro, temos `[1, 2, 1]`, que leva 4 minutos e contém 3 livros. Essa é a maior quantidade possível dentro do limite.

Cada livro entra na janela uma vez e sai no máximo uma vez, então o tempo total é `O(n)`. O vetor com os tempos de leitura ocupa `O(n)` de memória.
