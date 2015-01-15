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
