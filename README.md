tdd-katas
============================
Katas using Groovy and Spock


Build Version Comparator Kata
----------------------------------

Comparator that compares two build version values.
Build versions are made of some numbers separated by dots.

For example:

* 1
* 1.3.1
* 2.0.178.14.10

FizzBuzz Kata
--------------

Program that prints the numbers from 1 to 100.
Instead of numbers for multiples of three prints "Fizz", for the multiples of five prints "Buzz"
and for multiples of both three and five prints "FizzBuzz".
  
Anagrams Kata
-------------

[http://codekata.com/kata/kata06-anagrams/](http://codekata.com/kata/kata06-anagrams/)

Find the longest words that are anagrams, and find the set of anagrams containing the most words.

String Calculator Kata
----------------------

String calculator with a method int add(string numbers). The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0).
For example:

* ""
* "1"
* "1,2"

Allow to handle an unknown amount of numbers.
Allow to handle new lines between numbers (instead of commas).
For example:

* "1\n2,3" (will equal 6)
* "1,\n" (is NOT ok)

Support different delimiters.

Bowling Game Kata
-----------------

[Uncle Bob’s Bowling Game Kata](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata)

The game consists of 10 frames as shown above.  In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.  So in frame 3
above, the score is 10 (the total number knocked down) plus a bonus of 5 (the
number of pins knocked down on the next roll.)

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll the extra
balls to complete the frame.  However no more than three balls can be rolled in
tenth frame.

#### Requirements

Write a class named "Game" that has two methods:

* roll(pins : int) is called each time the player rolls a ball.  The argument is the number of pins knocked down.
* score() : int is called only at the very end of the game.  It returns the total score for that game.

Counting Code Lines Kata
------------------------

[http://codekata.com/kata/kata13-counting-code-lines/](http://codekata.com/kata/kata13-counting-code-lines/)

Roman Numerals Kata
-------------------

Convert Arabic numbers ( 1, 2, 3, 4, 5, etc.) into Roman equivalents: I, II, III, IV, V, etc.

Prime Factors Kata
------------------

Write a class named "PrimeFactors" that has one static method: generate.
The generate method takes an integer argument and returns a collection of integers. That list
contains the prime factors in numerical sequence.

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


OddEven Kata
-------------

For a specified range of numbers, eg. from 1 to 100:

* if number is odd, print 'Odd' instead of the number  
* if number is even, print 'Even' instead of number
* else if number is Prime, print number