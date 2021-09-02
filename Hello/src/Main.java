import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables + data types
        // numeric data
        // text
        // data type (int,short, double)
        // variable name
        // value
        int my_age= 29;
        int my_number=8;

        short cat=4;
        //short a=99;

        //byte b = 77;
        byte apple = 85;

        long l=1000;
        long almond= 56;

        float f=15;
        float google=99;
        float geek=88;

        double d = 5;
        double dl=6.6;

        System.out.println(cat);
        System.out.println(my_age);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of the numbers are " + (a+b));

        //class
        String s="String Class";
        String ss="Hey";
        //variables
        int r = 5;
        double c = 9;
        char ch ='L';
        System.out.println(s);
    }
}
/*
byte (numeric 1 byte)
short (number, 2 bytes)
int (number, 4 bytes)
long (number, 8 bytes)
float(float number, 4 bytes)
double(float number, 8 bytes)
char (character, 2 bytes)
boolean ( true/false, 1 byte)
 */