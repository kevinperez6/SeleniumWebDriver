package ExercisesHackerRank;
/**
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
 *
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
 *
 * Given two strings of lowercase English letters,  and , perform the following operations:
 *
 * Sum the lengths of  and .
 * Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * Input Format
 *
 * The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
 *
 * Output Format
 *
 * There are three lines of output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 *
 * Sample Input 0
 *
 * hello
 * java
 * Sample Output 0
 *
 * 9
 * No
 * Hello Java
 * Explanation 0
 *
 * String  is "hello" and  is "java".
 *
 *  has a length of , and  has a length of ; the sum of their lengths is .
 * When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
 *
 * When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
 * **/
import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();
        System.out.println("Seleccione la operación a realizar (suma(+), resta(-), multiplicación(*), división(/)):");
        String operacion = sc.next();
        double resultado = 0;
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación inválida");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}


