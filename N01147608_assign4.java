import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Decimal Input
    Scanner input = new Scanner(System.in);
    int integer;
    int remainder = 0;
    int octal = 0;
    int power = 1;
    int decimal;

    System.out.print("Please enter a number between 0 and 2097151 to convert: ");
    integer = input.nextInt();
    
    decimal = integer;


    if (decimal > 2097151){
      System.out.print("UNABLE TO CONVERT");
      return;
    }

    while (decimal > 0) {
      remainder = decimal % 8;
      octal += remainder*power;
      decimal  = decimal / 8;
      power *= 10;
    }

    System.out.printf("Your integer number %d is %07d in octal.", integer, octal);
  }
}