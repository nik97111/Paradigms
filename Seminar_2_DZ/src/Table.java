import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число (n): ");
        int n = sc.nextInt();
        sc.close();

        if (n < 1)
            return;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                System.out.println((i) + " * " + (j) + " = " + (i * j));
    }
}