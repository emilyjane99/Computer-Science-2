
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char userInput;
    char letter = 0;
    char leet = 0;
    char leet2 = 0;
    char leet3 = 0;
    char leet4 = 0;
    System.out.print("Letter: ");
    userInput = input.next().charAt(0);
    System.out.print(userInput);
     switch(userInput){
      case 'a':
      case 'A': 
        letter = '@'; 
        break;
      case 'B': 
      case 'b':
        letter = 'I';
        leet = 'B';
        break;
      case 'C':
      case 'c':
        letter = '<';
        break;
      case 'D':
      case 'd':
        letter = '[';
        leet = ')';
        break;
      case 'E':
      case 'e':
        letter = '&';
        break;
      case 'F':
      case 'f':
        letter = ']';
        leet = '=';
        break;
      case 'G':
      case 'g':
        letter = '6';
        break;
      case 'H':
      case 'h':
        letter = '[';
        leet = '-';
        leet2 = '[';
        break;
      case 'I':
      case 'i':
        letter = '1';
        break;
      case 'J':
      case 'j':
        letter = '_';
        leet = '/';
        break;
      case 'K':
      case 'k':
        letter = 'X';
        break;
      case 'L':
      case 'l':
        letter = 'L';
        break;
      case 'M':
      case 'm':
        letter = '/';
        leet2 = '\\';
        leet3 = '/';
        leet4 = '\\';
        break;
      case 'N':
      case 'n':
        letter = '|';
        leet = '\\';
        leet2 = '|';
        break;
      case 'O':
      case 'o':
        letter = '(';
        leet = ')';
        break;
      case 'P':
      case 'p':
        letter = '|';
        leet = '*';
        break;
      case 'Q':
      case 'q':
        letter = '0';
        break;
      case 'R':
      case 'r':
        letter = 'I';
        leet = '2';
        break;
      case 'S':
      case 's':
        letter = '$';
        break;
      case 'T':
      case 't':
        letter = '+';
        break;
      case 'U':
      case 'u':
        letter = '(';
        leet = '_';
        leet2 = ')';
        break;
      case 'V':
      case 'v':
        letter = '\\';
        leet = '/';
        break;
      case 'W':
      case 'w':
        letter = 'v';
        leet = 'v';
        break;
      case 'X':
      case 'x':
        letter = '>';
        leet = '<';
        break;
      case 'Y':
      case 'y':
        letter = 'j';
        break;
      case 'Z':
      case 'z':
        letter = '2';
        break;
      default: 
      System.out.print(letter);
      System.out.print('-');
      }
      System.out.print(letter);
      if (leet != 0){
      System.out.print(leet);
      }
      if (leet2 != 0){
      System.out.print(leet2);
      }
      if (leet3 != 0){
      System.out.print(leet3);
      }
      if (leet4 != 0){
      System.out.print(leet4);
      }
  }
}