[![Gourav Vashistha]](https://www.linkedin.com/in/gourav-vashistha/)
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
  