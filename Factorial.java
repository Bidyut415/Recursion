import java.util.*;

public class Factorial {

  static int factorial(int n){
    if(n==0){//base condition
      return 1;
    }else{
      return n*factorial(n-1);//recursiv call
    }
  }
  public static void main(String[] args) {
    int result=factorial(5);
    System.out.println("Factorial : "
     + result);
  }
}
