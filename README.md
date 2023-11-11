# Sprint1_T3_JavaCollections

Level 1

- Exercise 1

Create a class called Month with a "name" attribute (which will store the name of the month of the year). Add 11 Month objects (each with a different attribute) to an ArrayList, except for the object with the "August" attribute. Then, it performs the insertion in the place that corresponds to that month and shows that the ArrayList maintains the correct order.

Convert the ArrayList from the previous exercise into a HashSet and make sure it doesn't allow duplicates.

Iterate through the list with a for and an iterator.

> ##### Solution notes:
> - Month class override hashCode() and equals(Object obj) methods
> - Demostrates the ordering and duplication behaviors of this collection types: List, Set.

- Exercise 2

Create and populate a List<Integer>.

Create a second List<Integer> and insert the elements of the first list into the second list in reverse order.

Use ListIterator objects to read the elements of the first list and insert them into the second.

> ##### Solution notes:
> - ListIterator<Integer> iterator = integerList2.listIterator(4);
> - while (iterator.hasPrevious()) {integerList1.add(iterator.previous());}
> - for (Integer m : integerList1) {System.out.println(m);}


- Exercise 3

Given the file countries.txt (check the resources section) that contains countries and capitals. The program must read the file and store the data in a HashMap<String, String>. The program asks for the name of the user, and then it must show a random country, saved in the HashMap. It is about what the user has to write the name of the capital of the country in question. If you get it right, you get a point. This action is repeated 10 times. Once the capitals of 10 countries have been requested randomly, then the name of the user and their score must be saved in a file called classificacio.txt.

> ##### Solution notes:
> - HashMap<String, String> gameCountryCapitalMapToGuess;
> - HashMap<String, Integer> gamePlayerPointMapClassification;
>>
>> - public void gameLogic() {
>> - Random random = new Random();
>> - Object[] countries = gameCountryCapitalMapToGuess.keySet().toArray();
>> - for (int i=0; i<gameAttempt; i++) {
>> - country = countries[random.nextInt(countries.length)];
>> - System.out.println(country);
>> - getGuess();
>> - if (gameCountryCapitalMapToGuess.get(country).equals(gamePlayerCapitalGuess)) {
>> - incrementGamePoints(); } } }


Level 2

- Exercise 1

Create a class called Restaurant with two attributes: name(String) and score(int). Implement the necessary methods so that Restaurant objects with the same name and the same score cannot be entered in a HashSet created in the main() of the application.

Important:

There can be restaurants with the same name with different ratings, but there cannot be restaurants with the same name and the same rating.

> ##### Solution notes:
> - @Override public int hashCode() method.


- Exercise 2

Using the program class above, create the necessary implementation so that the objects of the Restaurant class are sorted by name and by score in ascending order.

> ##### Solution notes:
> - @Override public boolean equals(Object obj) method.


Level 3

- Exercise 1

Create an application capable of reading a CSV file. This file has 3 fields: first name, last name and ID, for each record. It is about sorting the people read from the file, by their first name, last name or ID. You can use whichever list you think is most appropriate.

The Person class has 3 attributes:

- first name
- surname
- identity card

The main class has the following menu:

- Enter person.
- Show people sorted by name (A-Z).
- Show people sorted by name (Z-A).
- Show people sorted by last name (A-Z).
- Show people sorted by last name (Z-A).
- Show people sorted by ID (1-9).
- Show the people sorted by ID (9-1).
- Exit.
