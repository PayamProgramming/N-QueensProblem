# N-QueensProblem
The aim of N-Queens Problem is to place N queens on an N x N chessboard, in a way so that 
no queen is in conflict with the others. I used Back Tracking Algorythm .

Backtracking is a general algorithm for finding solutions to some computational problems, notably constraint satisfaction problems,
that incrementally builds candidates to the solutions, and abandons a candidate ("backtracks") as soon as it determines that the
candidate cannot possibly be completed to a valid solution.

The classic textbook example of the use of backtracking is the eight queens puzzle, that asks for all arrangements of 
eight chess queens on a standard chessboard so that no queen attacks any other. In the common backtracking approach,
the partial candidates are arrangements of k queens in the first k rows of the board, all in different rows and columns.
Any partial solution that contains two mutually attacking queens can be abandoned.

Backtracking can be applied only for problems which admit the concept of a "partial candidate solution" and
a relatively quick test of whether it can possibly be completed to a valid solution. It is useless, for example, 
for locating a given value in an unordered table. When it is applicable, however, backtracking is often much faster than brute-force enumeration of all complete candidates, since it can eliminate many candidates with a single test.
