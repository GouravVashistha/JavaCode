
[Gourav Vashistha Linkdin](https://www.linkedin.com/in/gourav-vashistha/)

# What Is an Array?

  An Array is a collection of items. The items could be integers, strings, DVDs, games, books—anything really. T
  he items are stored in neighboring (contiguous) memory locations. Because they're stored together, 
  checking through the entire collection of items is straightforward.

## Creating an Array:-
> On a computer, Arrays can hold up to N items. The value of N is decided by you, the programmer, 
> at the time you create the Array. This is the same as when we found a big enough cardboard box for the DVDs.
> Additionally, you also need to specify the type of item that will be going into the Array.

## In Java, we use the following code to create an Array to hold up to 15 DVDs. Note that we've also included a simple 
definition of a DVD for clarity.

// The actual code for creating an Array to hold DVD's.
DVD[] dvdCollection = new DVD[15];
``` java
// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

```
## Accessing Elements in Arrays:-
  The two most primitive Array operations are writing elements into them, and reading elements from them. All other Array 
  operations are built on top of these two primitive operations.

##  Writing Items into an Array:-
  To put a DVD into the Array, we need to decide which of the 15 places we'd like it to go in. Each of the places is 
  identified using a number in the range of 0 to N - 1. The 1st place is 0, the 2nd place is 1, the 3rd place is 2... 
  all the way up to the 15th place, which is 14. We call these numbers that identify each place indexes.

  `Let's put the DVD for The Avengers into the eighth place of the Array we created above.`

``` java
  // Firstly, we need to actually create a DVD object for The Avengers.
  DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

// Next, we'll put it into the 8th place of the Array. Remember, because we
// started numbering from 0, the index we want is 7.
  dvdCollection[7] = avengersDVD;

And that's it. We've put the DVD for The Avengers into our Array! Let's put a few more DVD's in.


DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

// Put "The Incredibles" into the 4th place: index 3.
  dvdCollection[3] = incrediblesDVD;

// Put "Finding Dory" into the 10th place: index 9.
  dvdCollection[9] = findingDoryDVD;

// Put "The Lion King" into the 3rd place: index 2.
  dvdCollection[2] = lionKingDVD;

 ```
 ##  Array Insertions
 Inserting a new element into an Array can take many forms:
- Inserting a new element at the end of the Array.
- Inserting a new element at the beginning of the Array.
- Inserting a new element at any given index inside the Array.
 
 ## Inserting at the End of an Array
 At any point in time, we know the index of the last element of the Array, as we've kept track of it in our length variable. All we need to do for inserting an element at the end is to assign the new element to one index past the current last element

 ``` java
 // Declare an integer array of 6 elements
int[] intArray = new int[6];
int length = 0;

// Add 3 elements to the Array
for (int i = 0; i < 3; i++) {
    intArray[length] = i;
    length++;
}
```
Let's define a function, printArray, to help us visualise what's happening.

```java
for (int i = 0; i < intArray.length; i++) {
    System.out.println("Index " + i + " contains " + intArray[i]);
}
```
If we run our printArray function, we'll get the following output.
```java
Index 0 contains 0.
Index 1 contains 1.
Index 2 contains 2.
Index 3 contains 0.
Index 4 contains 0.
Index 5 contains 0.
```

## Inserting at the Start of an Array
To insert an element at the start of an Array, we'll need to shift all other elements in the Array to the right by one index to create space for the new element. This is a very costly operation, since each of the existing elements has to be shifted one step to the right. The need to shift everything implies that this is not a constant time operation. In fact, the time taken for insertion at the beginning of an Array will be proportional to the length of the Array. In terms of time complexity analysis, this is a linear time complexity: O(N), where N is the length of the Array.

```java
// First, we will have to create space for a new element.
// We do that by shifting each element one index to the right.
// This will firstly move the element at index 3, then 2, then 1, then finally 0.
// We need to go backwards to avoid overwriting any elements.
for (int i = 3; i >= 0; i--) {
    intArray[i + 1] = intArray[i];
}

// Now that we have created space for the new element,
// we can insert it at the beginning.
intArray[0] = 20;
```
And here's the result of running printArray.
```java
Index 0 contains 20.
Index 1 contains 0.
Index 2 contains 1.
Index 3 contains 2.
Index 4 contains 10.
Index 5 contains 0.
```
### Inserting Anywhere in the Array
Similarly, for inserting at any given index, we first need to shift all the elements from that index onwards one position to the right. Once the space is created for the new element, we proceed with the insertion. If you think about it, insertion at the beginning is basically a special case of inserting an element at a given index—in that case, the given index was 0.

> Again, this is also a costly operation since we could potentially have to shift almost all the other elements to the right before actually inserting the new element. As you saw above, shifting lots of elements one place to the right adds to the time complexity of the insertion task.

```java
// Say we want to insert the element at index 2.
// First, we will have to create space for the new element.
for (int i = 4; i >= 2; i--)
{
    // Shift each element one position to the right.
    intArray[i + 1] = intArray[i];
}

// Now that we have created space for the new element,
// we can insert it at the required index.
intArray[2] = 30;
```
And here's the result of running printArray.

```java
Index 0 contains 20.
Index 1 contains 0.
Index 2 contains 30.
Index 3 contains 1.
Index 4 contains 2.
Index 5 contains 10.
```

Does that all sound good? The main thing to be careful of is remembering that array.length gives you the total capacity of the Array.
 If you want to know the last used slot, you'll need to keep track of this yourself using a length variable. Other than that, 
 just be careful to read any elements you want to keep, before you overwrite them!