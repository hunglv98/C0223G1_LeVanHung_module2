package ss1_intro.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String str = "";
        int tram, chuc;
        if (input <= 10 && input > 0) {
            switch (input) {
                case 1:
                    str += "one ";
                    break;
                case 2:
                    str += "two ";
                    break;
                case 3:
                    str += "three ";
                    break;
                case 4:
                    str += "four ";
                    break;
                case 5:
                    str += "five ";
                    break;
                case 6:
                    str += "six ";
                    break;
                case 7:
                    str += "seven ";
                    break;
                case 8:
                    str += "eight ";
                    break;
                case 9:
                    str += "nine ";
                    break;
                case 10:
                    str += "ten";
                default:
                    break;
            }

        } else if (input < 20 && input > 10) {
            switch (input) {
                case 11:
                    str += "eleven ";
                    break;
                case 12:
                    str += "twelve ";
                    break;
                case 13:
                    str += "thirteen ";
                    break;
                case 14:
                    str += "fourteen ";
                    break;
                case 15:
                    str += "fifteen ";
                    break;
                case 16:
                    str += "sixteen ";
                    break;
                case 17:
                    str += "seventeen ";
                    break;
                case 18:
                    str += "eighteen ";
                    break;
                case 19:
                    str += "nineteen";
                    break;
                default:
                    break;
            }
        } else if (input >= 20 && input < 100) {
            chuc = input / 10;
            switch (chuc) {
                case 2:
                    str += "twenty ";
                    break;
                case 3:
                    str += "thirty ";
                    break;
                case 4:
                    str += "fourty ";
                    break;
                case 5:
                    str += "fifty ";
                    break;
                case 6:
                    str += "sixty ";
                    break;
                case 7:
                    str += "seventy ";
                    break;
                case 8:
                    str += "eighty ";
                    break;
                case 9:
                    str += "ninety ";
                    break;
                default:
                    break;
            }
            input = input - chuc * 10;
            switch (input) {
                case 1:
                    str += "one";
                    break;
                case 2:
                    str += "two";
                    break;
                case 3:
                    str += "three";
                    break;
                case 4:
                    str += "four";
                    break;
                case 5:
                    str += "five";
                    break;
                case 6:
                    str += "six";
                    break;
                case 7:
                    str += "seven";
                    break;
                case 8:
                    str += "eight";
                    break;
                case 9:
                    str += "nine";
                    break;
                default:
                    break;
            }

        } else if (input >= 100 && input < 1000) {
            tram = input / 100;
            switch (tram) {
                case 1:
                    str += "one hundred ";
                    break;
                case 2:
                    str += "two hundred ";
                    break;
                case 3:
                    str += "three hundred ";
                    break;
                case 4:
                    str += "four hundred ";
                    break;
                case 5:
                    str += "five hundred ";
                    break;
                case 6:
                    str += "six hundred ";
                    break;
                case 7:
                    str += "seven hundred ";
                    break;
                case 8:
                    str += "eight hundred ";
                    break;
                case 9:
                    str += "nine hundred ";
                    break;
                default:
                    break;
            }
            input = input - tram * 100;
            chuc = input / 10;
           if(chuc != 1) {
               switch (chuc) {
                   case 2:
                       str += "twenty ";
                       break;
                   case 3:
                       str += "thirty ";
                       break;
                   case 4:
                       str += "fourty ";
                       break;
                   case 5:
                       str += "fifty ";
                       break;
                   case 6:
                       str += "sixty ";
                       break;
                   case 7:
                       str += "seventy ";
                       break;
                   case 8:
                       str += "eighty ";
                       break;
                   case 9:
                       str += "ninety ";
                       break;
                   default:
                       str += "and ";
               }
               input = input - chuc * 10;
               switch (input) {
                   case 1:
                       str += "one";
                       break;
                   case 2:
                       str += "two";
                       break;
                   case 3:
                       str += "three";
                       break;
                   case 4:
                       str += "four";
                       break;
                   case 5:
                       str += "five";
                       break;
                   case 6:
                       str += "six";
                       break;
                   case 7:
                       str += "seven";
                       break;
                   case 8:
                       str += "eight";
                       break;
                   case 9:
                       str += "nine";
                       break;
                   default:
                       break;
               }
           }else {
               input = input - chuc * 10;
               switch (input) {
                   case 1:
                       str += "eleven";
                       break;
                   case 2:
                       str += "twelve";
                       break;
                   case 3:
                       str += "thirteen";
                       break;
                   case 4:
                       str += "fourteen";
                       break;
                   case 5:
                       str += "fifteen";
                       break;
                   case 6:
                       str += "sixteen";
                       break;
                   case 7:
                       str += "seventeen";
                       break;
                   case 8:
                       str += "eighteen";
                       break;
                   case 9:
                       str += "ninety";
                       break;
                   default:
                       str += "ten";
                       break;
               }
           }
        }
        System.out.println(str);
    }
}

