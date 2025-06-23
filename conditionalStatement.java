import java.util.Scanner;

class conditionalStatement {
    public static void main(String[] arr) {

        int x = 25;
        String y = "hero";
        if (x > 20) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}

// Write a program that takes a year as input and checks whether it is a leap
// year.

class leapYear {
    public static void main(String[] args) {
        Scanner sv = new Scanner(System.in);
        System.out.print("year:");
        int year = sv.nextInt();

        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }

    }
}

// Else if statements

class conditionalStatement1 {
    public static void main(String args[]) {
        int a = 5;
        int b = 1;
        int c = 2;

        if (a > b && a > c) {
            System.out.print("a is > than b and a is > c ");
        } else if (b > c) {
            System.out.print("b is > than a and b is > than c ");
        } else {
            System.out.print("c is > than a and c is > than b ");
        }

    }
}

// Ternary Operator

// Write a Java program to check if a number is even or odd using the ternary
// ,operator.Also, if the number is even, print the number divided by 2;and if
// it's odd, print the number multiplied by 3.

class conditionalStatement2 {
    public static void main(String[] args) {
        int num = 7;
        String type = num % 2 == 0 ? "even" : "odd";
        int result = type == "odd" ? num * 3 : num;
        System.out.println("Result :" + result);
    }
}

// Nested ternary operator

// Q) Write a Java program that takes a student's marks (0 to 100) as input and
// prints the grade using nested ternary operators:
// Marks Grade
// 90–100 A
// 75–89 B
// 60–74 C
// 40–59 D
// Below 40 F

class conditionalStatement3 {
    public static void main(String[] args) {
        int marks = 99;

        String grade = (marks >= 90 && marks <= 100) ? "A"
                : (marks >= 75 && marks <= 89) ? "B"
                        : (marks >= 60 && marks <= 74) ? "C" : (marks >= 40 && marks <= 59) ? "D" : "F";

        System.out.println("your grade is : " + grade);
    }
}

// Q) Write a Java program using nested ternary operator to check if a number
// is:
// Even & Positive → Print "Even and Positive"
// Even & Negative → Print "Even and Negative"
// Odd & Positive → Print "Odd and Positive"
// Odd & Negative → Print "Odd and Negative"
// Zero → Print "Zero"

class conditionalStatement4 {
    public static void main(String[] args) {

        int num = -57;

        String result = (num % 2 == 0 && num >= 0) ? "even and positive"
                : (num % 2 == 0 && num <= 0) ? "even and negative"
                        : (num % 2 == 1 && num >= 0) ? "even and positive"
                                : (num % 2 == 1 && num <= 0) ? "even and negative" : "zero";

        System.out.println("the number is " + result);

    }
}

// Switch Statement

// Q1) Write a program to print the day name when given a number (1–7).
// Input: 3
// Output: Wednesday

class week {
    public static void main(String[] args) {
        System.out.print("Enter day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

// Q2) Write a program to perform a basic calculator using switch-case.
// Input: a = 10, b = 5, op = '+'
// Output: 15

class calculator {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
         int a = sc.nextInt();
        System.out.print("Enter a another number :");
         int b = sc.nextInt();
        System.out.print("Enter a Operation :");
         String op = sc.next();

        switch (op) {
            case ("+"):
                System.out.print(a+b);
            case ("-"):
                System.out.print(a-b);
            case ("*"):
                System.out.print(a*b);
            case ("/"):
                if (b != 0)
                    System.out.println(a/b);
                else if(a == 0){
                    System.out.println("zero cannot be divided");
                }
                else
                    System.out.println("Cannot divide by zero");
                break;
        }
    }
}





//Q3. Write a program to return the number of days in a given month number (1–12). Handle February with "28 or 29 days"


class months {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int monthnumber = sc.nextInt();

        switch(monthnumber){
            case 1 : case 3 : case 5 : case 7 : case 8: case 10 : case 12 : System.out.print("31 days"); break;
            
             case 4: case 6: case 9: case 11: System.out.print("30 days "); break;

             case 2: System.out.print("28 or 29 days"); break;

             default: System.out.print("Invalid month number");
        }

    }
}





// new switch sytax 



class newswitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day that u want to check alarm time - ");
        String day = sc.nextLine();

        String result = switch(day){
            case "sunday" , "saturday" -> "8am";
            case "monday" , "tuesday" , "wednesday" , "Thrusday" , "friday"-> "7am" ;
            default -> "Enter valid day";
        };
        System.out.println("Alarm is set at "+ result );
    }
}

