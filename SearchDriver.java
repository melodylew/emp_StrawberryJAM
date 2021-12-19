/*
0. Instantiate BinSearch and LinSearch
1. populate( int[] a)
  -for loop that iterates through the indices of a and fills a with its index


*in binSearchTime( Comparable[] a, Comparable target)*
1. long variables: start and finish
  - start = currentTimeMillis
2. Run BinSearch
3. finish = currentTimeMillis
4. return finish-start


*in linSearchTime( Comparable[] a, Comparable target)*
1. long variables: start and finish
  - start = currentTimeMillis
2. Run LinSearch
3. finish = currentTimeMillis
4. return finish-start


**Use different array sizes to test**
*/

public class SearchDriver{
  private static BinSearch bin = new BinSearch();
  private static LinSearch lin = new LinSearch();

  public static void populate(Integer[] a){
    for (int i = 0; i < a.length; i++){
      a[i] = i;
    }
  }

  public static long binSearchTime(Comparable[] a, Comparable target){
    long start, finish;
    start = System.currentTimeMillis();

    bin.binSearch(a, target);
    finish = System.currentTimeMillis();

    return finish - start;
  }

  public static long linSearchTime(Comparable[] a, Comparable target){
    long start, finish;
    start = System.currentTimeMillis();

    lin.linSearch(a, target);
    finish = System.currentTimeMillis();

    return finish - start;
  }

  public static void main(String[] args) {
    Integer[] a = new Integer[1];
    int i = 1;
    while (i < 100_000_000){
      long binSum = 0;
      long linSum = 0;
      a = new Integer[i];
      populate(a);
      //MAKE TIME MORE ACCURATE
      //start time here
      for (int j = -1; j < i; j++){
        binSum += binSearchTime(a, j);
        linSum += linSearchTime(a,j);
      }
      //end time here
      //will unfortunately include for loop time, but will be MUCH more accurate
      //will avoid rounding issues
      System.out.println("List Size = " + i);
      System.out.println("=============");
      System.out.println("Binary = " + binSum);
      System.out.println("Linary = " + linSum);
      System.out.println("Binary worst case = " + binSearchTime(a,-1));
      System.out.println("Linary worst case = " + linSearchTime(a,-1) + "\n");
      i *= 3;
    }
  }
}
