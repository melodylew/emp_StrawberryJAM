# emp_StrawberryJAM
  *\~Sophia Eiden\~* \
  *\~Melody Lew\~* \
  *\~Josiah Moltz\~*


      Section with heading “Tests Performed” delineating test performed.
          Should reflect plan, after any peer-suggested modifications.
          Only tests actually run. (ie, Not portions of plan that never got implemented.)
          Abstraction level: Specific enough for an interested party to assess whether or not your experiment is valid – but not so detail-rich that your test methodology becomes obfuscated. (There should be little to no Java; anyone can read your source code if they need to see those specifics.)
      Section with heading “Results” containing clear summary of generated data.
      Section with heading “Conclusions” containing clearly stated conclusions drawn from generated data.


# Tests Performed
We timed how long it took to run 10,000 binary/linear searches of the worst case type (searching for an element not in the list) on arrays of length **ADD POPULATE** 1,000 10,000 100,000 1,000,000 10,000,000 and 100,000,000.

# Results

```
List Size = 1000
=============
Binary worst case = 7
Linear worst case = 20
```
With an array of length 1,000 it took 7 milliseconds to find an element not in the array using a binary search 10,000 times, and 20 milliseconds to find an element not in the array using a linear search 10,000 times.

```
List Size = 10000
=============
Binary worst case = 1
Linear worst case = 60
```
With an array of length 10,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 60 milliseconds to find an element not in the array using a linear search 10,000 times.

```
List Size = 100000
=============
Binary worst case = 1
Linear worst case = 613
```
With an array of length 100,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 613 milliseconds to find an element not in the array using a linear search 10,000 times.

```
List Size = 1000000
=============
Binary worst case = 0
Linear worst case = 6406
```
With an array of length 1,000,000 it took 0 milliseconds to find an element not in the array using a binary search 10,000 times, and 6,406 milliseconds to find an element not in the array using a linear search 10,000 times.

```
List Size = 10000000
=============
Binary worst case = 1
Linear worst case = 74222
```
With an array of length 10,000,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 74,222 milliseconds to find an element not in the array using a linear search 10,000 times.

```
List Size = 100000000
=============
Binary worst case = 1
Linear worst case = 760961
```
With an array of length 100,000,000 it took 1 millisecond to find an element not in the array using a binary search 10,000 times, and 760,961 milliseconds to find an element not in the array using a linear search 10,000 times.

# Conclusions
Binary is **FAST**.

Due to the fact that we, [and other people](https://piazza.com/class/kue5pmk0w7n70n?cid=382_f3), observed over inflated values on the first runs for both linear and binary searches, we decided to ignore these data values.

The linear cases tended to show something resembling *linear growth*. \
Note that as the list size increases by a factor of 10, the linear time also increases by roughly a factor of 10.

Even though it doesn't represent logarithmic growth as well as the linear case represents linear growth, the binary worst cases stay very close to 0 and 1, suggesting a more logarithmic growth.
<details>
  <summary> Better Example of Logarithmic Data </summary>

  To better demonstrate logarithmic growth, we ran Binary Search 1,000,000 times on lists of size 1 10 100 1,000 10,000 100,000 1,000,000 10,000,000 and 100,000,000. \
  Here was our data
  ```
  List Size = 1
  =============
  Binary worst case = 67

  List Size = 10
  =============
  Binary worst case = 278

  List Size = 100
  =============
  Binary worst case = 671

  List Size = 1000
  =============
  Binary worst case = 1160

  List Size = 10000
  =============
  Binary worst case = 2028

  List Size = 100000
  =============
  Binary worst case = 2622

  List Size = 1000000
  =============
  Binary worst case = 3350

  List Size = 10000000
  =============
  Binary worst case = 4389

  List Size = 100000000
  =============
  Binary worst case = 5167
  ```
  Note that as we exponentially increase the list size, the time increases roughly linearly (a change of around 8,000 each time). This suggests logarithmic growth.
</details>
