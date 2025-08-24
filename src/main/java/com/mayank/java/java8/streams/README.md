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

