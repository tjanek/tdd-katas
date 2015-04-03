Game of Life Kata
-----------------

The Game of Life is a mathematical “zero-player” game devised by John Conway.
It simulates the behavior of populations following simple rules.
Life is played on a grid of cells. Each cell can be either alive or dead.
The game progresses in a series of iterations, called generations.
In each generation, the value of a cell (whether it is alive or dead) is determined 
by the value of that cell and its neighbors in the previous generation using the following rules:

* If a living cell has less than 2 living neighbors, it will die (of loneliness).
* If a living cell has more than 3 living neighbors, it will die (it’s overcrowded).
* If a dead cell has exactly 3 living neighbors, it will come to life (it is born).
* Otherwise, the cell’s value will not be changed.

For more information see the [Wikipedia](http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life) article.
