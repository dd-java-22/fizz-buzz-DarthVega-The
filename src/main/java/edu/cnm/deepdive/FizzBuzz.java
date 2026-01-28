package edu.cnm.deepdive;

public class FizzBuzz {

  public String fizzBuzz(int position) {
    boolean isFizz = position % 3 == 0;
    boolean isBuzz = position % 5 == 0;
    if (isFizz && isBuzz) {
      return "FizzBuzz";
    }
    if (position % 3 == 0 && position % 5 == 0) {
      return "FizzBuzz";
    } else if (position % 3 == 0) {
      return "Fizz";
    } else if (position % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(position);
    }
  }


  public static void main(String[] args) {
    int max = 100;
    int parsedArg;
    if (args.length > 0 && (parsedArg = Integer.parseInt(args[0])) > 0) {
      max = parsedArg;
    }
    FizzBuzz fizzBuzz = new FizzBuzz();
    for (int i = 0; i < max; i++) {
      System.out.println(fizzBuzz.fizzBuzz(i + 1));
    }
  }
}