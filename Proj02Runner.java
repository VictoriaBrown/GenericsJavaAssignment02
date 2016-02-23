// Project02Runner.java
// Victoria Brown 02/22/2016

public class Proj02Runner<X, T> {
  
  private String stringVariable;
  private int intVariable;
  private boolean stringFirst = true;

  // Constructor to initialize the objects passed to this class when it's instantiated.
  public Proj02Runner(String string, int x) {
    stringVariable = string;
    intVariable = x;
  }
  
  public Proj02Runner(int x, String string) {
    intVariable = x;
    stringVariable = string;
    stringFirst = false;
  }

  // get1 method to return the first item passed to this object and my name.
  public String get1() {
    if (stringFirst == true) {
      return "Victoria Brown\n" + stringVariable;
    } else {
      return "Victoria Brown\n" + intVariable;
    }
  }

  // get2 method to return the first item passed to this object and my name.
  public String get2() {
    if (stringFirst == true) {
      return Integer.toString(intVariable); 
    } else {
      return stringVariable;
    }
  }
}
