import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scVal = sc.nextInt();
        triangle(scVal);
    }

    public static void triangle (int scVal) {
        for (int i = 0; i < scVal; i++) {
            for (int j = 0; j <= i; j++) {
                char partOfTriangle = ((i + j) % 2 == 0) ? 'a' : 'b';
                System.out.print(partOfTriangle);
            }
            System.out.println();
        }
    }
}

