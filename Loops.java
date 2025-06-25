
import java.util.Scanner;

// while loop 

// ------SYNTAX---------

// while (condition) {
//     // code block to be executed
// }

//Simple while loop

class looops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("this is while loop " + i);
            i++;
        }
        System.out.println("bye " + i);
    }
}

class looops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of loops u want");
        int Loop = sc.nextInt();
        int i = 1;

        while (i <= Loop) {
            System.out.println("loop " + i);
            i++;
        }
        System.out.println("Bye");
    }
}

// Nested while loop

class looops2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.print("Hello :");
            int j = 1;
            while (j <= 3) {
                System.out.print("Hi ");
                j++;
            }
            i++;

        }
    }
}

// Q) * * * *
// * * * *
// * * * *
// * * * *

// Square Pattern of Stars

class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int i = 0;
        while (i < a) {
            int j = 0;
            while (j < a) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // move to next line after inner loop
            i++;
        }
    }
}

// Right-Angled Triangle Pattern

// *
// * *
// * * *
// * * * *
// * * * * *

class patterns2 {
    public static void main(String[] args) {

        int a = 4;
        int i = 1;
        while (i <= a) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

// Q3. Multiplication Tables from 2 to 5

class patterns3 {
    public static void main(String[] args) {
        int a = 2;
        while (a <= 5) {
            int j = 1;
            while (j <= 10) {
                int b = a * j;
                System.out.println(a + " * " + j + " = " + b);
                j++;
            }
            System.out.println();
            a++;
        }
    }
}

// Print Number Pattern

// 1
// 1 2
// 1 2 3
// 1 2 3 4

class patterns4 {
    public static void main(String[] args){
        int i =1;
        while(i<=4){
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}



