import java.util.Scanner;
public class StringLab {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter first string: ");
            String firstword = input.nextLine();

            System.out.println("Enter another string: ");
            String secondword = input.nextLine();

            int lenOfFirstWord = firstword.length();
            int lenOfSecondWord = secondword.length();
        
            if(lenOfFirstWord < lenOfSecondWord) {
                System.out.println(secondword + " is longer");
            }
            else if(lenOfFirstWord > lenOfSecondWord) {
                System.out.println(firstword + " is longer");
            }
            else {
                System.out.println("Both strings have the same name");
            }

            int halfOfFirstWord = lenOfFirstWord / 2;
            int halfOfSecondWord = lenOfSecondWord / 2;

            System.out.println("First half: " + firstword.substring(0, halfOfFirstWord));
            System.out.println("Second half: " + firstword.substring(halfOfFirstWord));
            System.out.println("First half: " + secondword.substring(0, halfOfSecondWord));
            System.out.println("Second half: " + secondword.substring(halfOfSecondWord));
            
            int index = firstword.indexOf(secondword);

            if(index >= 0) {
                System.out.println(secondword + " is found in " + firstword + "at index " + index);
            }
                else {
                        System.out.println(secondword + " is NOT found in " + firstword);
                }
            
            input.close();
        }
}