import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left,\n" +
                    "top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                for (int i = 1; i <=5 ; i++) {
                    for (int j = 0; j <10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }   break;
                case 2:
                    for (int i = 1; i <=5 ; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } break;
                case 3:
                    for (int i = 7 ; i >= 1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }break;
            }
        }while (true);
    }
}