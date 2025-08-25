# Stream API
Package: `java.util.stream`

## Operations
Operation are classified into 2 types:
1. Intermediate Operations 
   - Transforms a stream into another stream
   - Examples: filter, map, distinct, sorted, limit

2. Terminal Operations
   - It produces a result and terminates the stream
   - Example: forEach, collect, reduce, count

> Collection to stream: `Stream s = collection.stream()`


## toArray

- To convert stream of objects into Array
- `Integer[] i = list.stream.toArray(Integer[]::new);`
- Returns an array containing elements of the stream
- Terminal operation

## Array to Stream

- To convert arrays to Stream
- `Arrays.stream(arr)`: Specifically for arrays
- `Stream.of(arr)`: Argument can be of any type array or any group of collection
- Ex: `Stream<?> list = Stream.of(1, 2, 3, "a", "b");`

### forEach

- To perform an action for each element in the list
- Terminal operation


### Filter
Syntax: `Stream filteredStream = originalStream.filter(Predicate)`

- It is used to filter data from a Stream and create a new Stream 
- filter takes Predicate as an argument, and returns a boolean type
- It is an intermediate operation

Q: Find the even number from ArrayList using Stream

### Map
Syntax: `Stream mappedStream = originalStream.map(Function)`

- Map is used to transform each element of the Stream and return a new Stream.
- Map takes Function as argument and return type is based on types of data.
- Intermediate Operation

Q: Multiply by two for each element from the list: `MultiplyEach.java`
Q: Select only passed students: `PassedStudents.java`
Q: Add the 5 grace marks to all the failed students: `GraceMarks.java`


### Count

- To count the number of elements in the stream

Q: Get the total number of failed students: `FailedCount.java`

### Sorted

- To sort the elements of the stream 
- Sorted according to natural order.

Q: Sort the elements from stream: `Sorted.java`

If we want to sort in reverse order? 
- If we want to sort according to customized order, we should use `Comparator` interface.
- Comparator is a functional interface, having only `compare(obj1, obj2)` method
- `sorted(Comparator)` is used for reverse sorting order.

Q: Sort the elements in descending order using comparator from stream: `RevSorted.java`

**Comparable**

Method: `compareTo(obj1)`

Natural order: `list.stream().sorted((a,b) -> a.compareTo(b)).toList();`

Reverse order: `list.stream().sorted(a,b) -> -a.compareTo(b)).toList();`

Q: Sort the elements based on the length of the ArrayList: `LenSorted.java`

### min() & max()

- Both method takes Comparator as an argument, and based on the Comparator result it will return the value
- `min(Comparator)`: returns 1st element from Comparator result
- `max(Comparator)`: returns last element form Comparator result
- `LenSorted.java`


---
## Interview Questions
1. Find employee with maximum salary: `EmpMaxSal.java`
2. Find employee with second-highest salary: `SecondHighSal.java`
3. Find employee who is most senior based on joining data
4. Count employee based on gender: `GenderCount.java`
5. Remove duplicate from a list and preserve order: `RemoveDuplicate.java`
6. Find all numbers starting with 1 using streams: `StartingWithOne.java`
7. Join two streams: `JoinStreams.java`
8. Merge two sorted lists into a single sorted list: `JoinSortedList.java`
9. Check if a list of integers contains a prime number: `CheckPrime.java`
10. How to debug streams using `peek()`: `PeekDebug.java`
11. Given a list of Strings, find out those strings which start with a number: `StartWithNum.java`
12. Check given String is palindrome or not using streams: `Palindrome.java`
13. How do you sort the given list of decimals in reverse order: `SortDecimal.java`
14. Find the nth smallest element in an array using streams: `NSmallest.java`
15. How do you get last element of an array: `LastElement.java`
16. Given a list of strings, join the strings with `[` as prefix, `]` as suffix, and `,` as delimiter: `JoinString.java`
17. Find the sum of first two numbers in the list: `SumFirstTwo.java`
18. Find the multiplication of first two numbers in the list: `MulFirstTwo.java`
19. Find the sum of the unique numbers in a given list: `SumUnique.java`
20. Find the words with k number of vowels in a given sentence: `FindVowels.java`