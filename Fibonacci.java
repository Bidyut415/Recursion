import java.util.*;
public class Fibonacci {
  static int fib(int n){
    if(n==0){
      return 0;
    }else if(n==1){
      return 1;
    }else{
      return fib(n-1)+fib(n-2);
    }
  }
  public static void main(String[] args) {
    int n=6;
    System.out.println("Fibonacci number at position " + n  +  " is " + fib(n));
  }
}
