public class ReverseNumber{
  public static int reverse(int n,int rev){
    if(n==0){
      return rev;
    }
    int lastDigit = n%10;
    rev=rev*10+lastDigit;

    return reverse(n/10,rev);
  }
  public static void main(String[] args){
    int number=1234;
    int reversed=reverse(number,0);
    System.out.println("Reversed number: "+ reversed);
  }
}