public class ProductOfDigits {
  public static int product(int n){
    if(n==0){
      return 0;
    }
    if(n<10){
      return n;
    }
    return (n%10)*product(n/10);
  }
  public static void main(String[] args) {
    int num=123;
    int result =product(num);
    System.out.println("product of digits of " + num + " is:" + result);
  }
}
