import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input


//        System.out.print("Enter first number: ");
//        int num1 = scan.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scan.nextInt();
//
//        System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
//        System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
//        System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
//        System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
//        System.out.printf("%d mod %d = %d\n",num1,num2,num1%num2);
//

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

//        System.out.print("Input a number: ");
//        int num = scan.nextInt();
//        for(int i = 1; i<=10 ; i++){
//            System.out.printf("%d x %d = %d\n",num,i,num*i);
//        }


        //3. Write a Java program to print the area and perimeter of a circle.

//        System.out.print("Radius = ");
//
//        double rad = scan.nextDouble();
//
//        System.out.printf("Perimeter is = %f \n Area is = %f",(2*Math.PI)*rad,Math.PI*(rad*rad));

            //4. Java program to find out the average of a set of integers

//        System.out.print("Enter the count of numbers: ");
//        int count = scan.nextInt();
//        double sum = 0.0;
//        for(int i = 1; i <=5 ; i++){
//            System.out.print("Enter an integer: ");
//            int num = scan.nextInt();
//            sum+=num;
//        }
//        System.out.println("The average is: "+(sum/count));

        //5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        System.out.print("Enter the first number: ");
//        int num1 = scan.nextInt();
//        System.out.print("Enter the second number: ");
//        int num2 = scan.nextInt();
//        System.out.print("Enter the third number: ");
//        int num3 = scan.nextInt();
//
//        System.out.println("The result is: "+((num2+num1)==num3));


        // 6. Write a Java program to reverse a word.

//        System.out.print("Enter a word: ");
//        String str = scan.next();
//        String reverse = "";
//        for(int i = str.length()-1; i>=0 ; i--) reverse+= str.charAt(i);
//        System.out.println("Reverse word: "+reverse);


        //7 - Java program to check whether the given number is even or odd

//        System.out.println("Enter a number: ");
//        int num = scan.nextInt();
//        if(num%2 == 0) System.out.println("The number is Even");
//        else System.out.println("The number is Odd");

        // 8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        System.out.println("Enter temperature in Centigrade:");
//        int temp = scan.nextInt();
//        double temp2 = (1.8*temp)+32;
//        System.out.println("Temperature in Fahrenheit is: "+temp2);

        // 9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.

//        System.out.print("Enter a string: ");
//        String str = scan.nextLine();
//        System.out.print("Enter a number: ");
//        int num = scan.nextInt();
//
//        System.out.println(str.charAt(num));

        //10. Write a Java program to print the area and perimeter of a rectangle

//        System.out.println("Width = ");
//        double width = scan.nextDouble();
//        System.out.println("Height = ");
//        double height = scan.nextDouble();
//        double area = height * width;
//        double perimeter = 2*(width+height);
//        System.out.println("Area is "+width+" * "+height+" = "+area);
//        System.out.println("Perimeter is 2 * ("+width+"+"+height+") = "+ perimeter);


        // 11. Write a Java program to compare two numbers.


//        System.out.print("Enter first integer:");
//        int num1 = scan.nextInt();
//        System.out.print("Enter second integer: ");
//        int num2 = scan.nextInt();
//        System.out.println(num1 != num2);
//        System.out.println(num1 < num2);
//        System.out.println(num1 <= num2);

        //12. Write a Java program to convert seconds to hours, minutes and seconds.
//
//        System.out.println("Enter seconds: ");
//        int secInput = scan.nextInt();
//        int min = secInput / 60;
//        int hr = min / 60;
//
//        int hrs = hr *120;
//        secInput-=hrs;
//        int secN = secInput/60;
//        int minNew = secInput%60;
//
//        secInput-=secN*60;
//
//        System.out.println(hr+":"+minNew+":"+secInput);

        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.

//        System.out.println("Enter first number: ");
//        int num1 = scan.nextInt();
//        System.out.println("Enter second number: ");
//        int num2 = scan.nextInt();
//        System.out.println("Enter third number: ");
//        int num3 = scan.nextInt();
//        System.out.println("Enter fourth number: ");
//        int num4 = scan.nextInt();
//
//        if(num1 == num2 && num1 == num3 && num1 == num4) System.out.println("Numbers are equal");
//        else System.out.println("Numbers are not equals!");
//

        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

//        System.out.println("Enter a number: ");
//        int num = scan.nextInt();
//        if(num>0) System.out.println("Number is positive");
//        else if(num<0) System.out.println("Number is negative");
//        else System.out.println("Zero");

            //15.Write a program to enter the numbers till the user wants and at the end it should
        //display the count of positive, negative and zeros entered
        //(End loop use -1 , Don’t count -1).

//        int num ;
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int ZeroCount = 0;
//        do{
//            System.out.print("-> ");
//            num = scan.nextInt();
//            if(num<0 && num!=-1)negativeCount++;
//            else if(num>0) positiveCount++;
//            else if(num!=-1) ZeroCount++;
//
//        }while(num != -1);
//        System.out.println(positiveCount+" positives\n"+ZeroCount+" zero\n"+negativeCount+" negatives");
//

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

//        System.out.println("Enter a number: ");
//        int num = scan.nextInt();
//        String str  = new String(String.valueOf(num));
//        String rev ="";
//        for(int i = str.length()-1; i>=0;i--) rev += str.charAt(i);
//        System.out.println("revers "+rev);

        //17 - Write a program to enter the numbers till the user wants and at the end the program
        //should display the largest and smallest numbers entered.

//        int max =0;
//        int min = Integer.MAX_VALUE;
//        String s;
//        do{
//            System.out.print("Enter the number:");
//            int num = scan.nextInt();
//            if(num>max) max =num;
//            else if(min > num) min = num;
//            System.out.println("Enter stop if you want to stop or anything to continue");
//            s = scan.next();
//        }while (!(s.equals("stop")));
//
//        System.out.printf("the large number : %d \nthe small number: %d",max,min);

        // 18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

//        System.out.println("Enter string: ");
//        String str = scan.nextLine();
//        int count =0;
//        for(int i = 0 ; i<str.length();i++) {
//            if(str.charAt(i)=='a') count++;
//        }
//        System.out.println("Number of a's: "+count);

        }
    }
