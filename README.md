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
We timed how long it took to run 10,000 binary/linear searches of the worst case type (searching for an element not in the list) on arrays of length 1,000 10,000 100,000 1,000,000 10,000,000 and 100,000,000

# Results
**NOTE** Linary refers to linear test cases
```
List Size = 1000
=============
Binary worst case = 7
Linary worst case = 20

List Size = 10000
=============
Binary worst case = 1
Linary worst case = 60

List Size = 100000
=============
Binary worst case = 1
Linary worst case = 613

List Size = 1000000
=============
Binary worst case = 0
Linary worst case = 6406

List Size = 10000000
=============
Binary worst case = 1
Linary worst case = 74222

List Size = 100000000
=============
Binary worst case = 1
Linary worst case = 760961
```

# Conclusions
Binary is FAST!
