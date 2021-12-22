# emp_StrawberryJAM
  *\~Sophia Eiden\~* \
  *\~Melody Lew\~* \
  *\~Josiah Moltz\~*

# Tests Performed
We timed how long it took to run 10,000 binary/linear searches of the worst case type (searching for an element not in the list) on arrays of length 1,000 10,000 100,000 1,000,000 10,000,000 and 100,000,000 where each element in the array is equal to its index. \
Then, to show non 1 or 0 values for binary search times, we timed how long it took to run 100,000,000 binary searches of the worst case type on arrays of length 1,000 10,000 100,000 1,000,000 10,000,000 and 100,000,000 where each element in the array is equal to its index.

# Results
```
List Size = 1000
=============
Binary worst case = 1
Linary worst case = 6

Boosted Binary = 1352
```
With an array of length 1,000 it took 7 milliseconds to find an element not in the array using a binary search 10,000 times, and 20 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 1000 it took 1352 milliseconds to find an element not in the array using a binary search 100,000,000 times.

```
List Size = 10000
=============
Binary worst case = 1
Linear worst case = 60

Boosted Binary = 2281
```
With an array of length 10,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 60 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 10,000 it took 2281 milliseconds to find an element not in the array using a binary search 100,000,000 times.

```
List Size = 100000
=============
Binary worst case = 1
Linear worst case = 613

Boosted Binary = 2869
```
With an array of length 100,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 613 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 100,000 it took 2869 milliseconds to find an element not in the array using a binary search 100,000,000 times.

```
List Size = 1000000
=============
Binary worst case = 0
Linear worst case = 6406

Boosted Binary = 3651
```
With an array of length 1,000,000 it took 0 milliseconds to find an element not in the array using a binary search 10,000 times, and 6,406 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 1,000,000 it took 3651 milliseconds to find an element not in the array using a binary search 100,000,000 times.

```
List Size = 10000000
=============
Binary worst case = 1
Linear worst case = 74222

Boosted Binary = 4654
```
With an array of length 10,000,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 74,222 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 10,000,000 it took 4654 milliseconds to find an element not in the array using a binary search 100,000,000 times.

```
List Size = 100000000
=============
Binary worst case = 1
Linear worst case = 760961

Boosted Binary = 5167
```
With an array of length 100,000,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 760,961 milliseconds to find an element not in the array using a linear search 10,000 times. \
With an array of length 100,000,000 it took 5167 milliseconds to find an element not in the array using a binary search 100,000,000 times.

# Conclusions
Binary is **FAST**.

Due to the fact that we, [and other people](https://piazza.com/class/kue5pmk0w7n70n?cid=382_f3), observed over inflated values on the first runs for both linear and binary searches, we decided to ignore these data values.

The linear cases tended to show something resembling *linear growth*. \
Note that as the list size increases by a factor of 10, the time it takes increases by roughly a factor of 10.

The binary cases tended to show somethign resembling *logarithmic growth* \
Note that as the array length increases exponentially the time it takes increases roughly linearly (for the Boosted Binary values), suggesting logarithmic growth.
