# Sprint1_T3_JavaCollections

Level 1
- Exercise 1
Create a class called Month with a "name" attribute (which will store the name of the month of the year). Add 11 Month objects (each with a different attribute) to an ArrayList, except for the object with the "August" attribute. Then, it performs the insertion in the place that corresponds to that month and shows that the ArrayList maintains the correct order.

Convert the ArrayList from the previous exercise into a HashSet and make sure it doesn't allow duplicates.

Iterate through the list with a for and an iterator.

- Exercise 2
Create and populate a List<Integer>.

Create a second List<Integer> and insert the elements of the first list into the second list in reverse order.

Use ListIterator objects to read the elements of the first list and insert them into the second.

- Exercise 3
Given the file countries.txt (check the resources section) that contains countries and capitals. The program must read the file and store the data in a HashMap<String, String>. The program asks for the name of the user, and then it must show a random country, saved in the HashMap. It is about what the user has to write the name of the capital of the country in question. If you get it right, you get a point. This action is repeated 10 times. Once the capitals of 10 countries have been requested randomly, then the name of the user and their score must be saved in a file called classificacio.txt.

Level 2
- Exercise 1
Create a class called Restaurant with two attributes: name(String) and score(int). Implement the necessary methods so that Restaurant objects with the same name and the same score cannot be entered in a HashSet created in the main() of the application.

  important

There can be restaurants with the same name with different ratings, but there cannot be restaurants with the same name and the same rating.

- Exercise 2
Using the program class above, create the necessary implementation so that the objects of the Restaurant class are sorted by name and by score in ascending order.

Example:

name: restaurant1, score: 8

name: restaurant1, rating: 7

Level 3
- Exercise 1
Create an application capable of reading a CSV file. This file has 3 fields: first name, last name and ID, for each record. It is about sorting the people read from the file, by their first name, last name or ID. You can use whichever list you think is most appropriate.

The Person class has 3 attributes:

first name

surname

identity card



The main class has the following menu:

1.- Enter person.

2.- Show people sorted by name (A-Z).

3.- Show people sorted by name (Z-A).

4.- Show people sorted by last name (A-Z).

5.- Show people sorted by last name (Z-A).

6.- Show people sorted by ID (1-9).

7.- Show the people sorted by ID (9-1).

0.- Exit.



The program should list the people like the following example:

___Name___ ____Surnames___ __NIF__

Andreu Ballestero Llenas 34835767J

Miquel Bayona Source 48743957B

Guillem Capdevila Riu 33957834J

Albert Carbonell Ferrer 77364986R

Ferran Casas Coderch 23047848P

Maria Casellas Fuste 47102244S

Genius Ciutat Vendrell 39718459N