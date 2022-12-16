import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.Writer;

public class Final {
    static int a, t, r;
    static double d;
    static int c;
    static double p = 3.14;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            File filetriangle = new File("C: \\Users\\HP\\Data Ilham\\filetriangle.txt");
            if (filetriangle.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
            File filecircle = new File("C:\\Users\\HP\\Data Ilham\\filecircle.txt");
            if (filecircle.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println("Enter a choice");
        System.out.println("1. Triangles plane");
        System.out.println("2. Circle plane");

        c = sc.nextInt();
        if (c == 1) {
            System.out.println("Enter a and t");
            Segitiga pov = new Segitiga(sc.nextDouble(), sc.nextDouble());
            System.out.println("Triangle's area :" + pov.getLuass());
            // Triangles();
            try {
                Writer trianglesWriter;
                trianglesWriter = new BufferedWriter(new FileWriter("filetriangle.txt", true));
                trianglesWriter.append("Triangle's area :" + pov.getLuass());
                trianglesWriter.close();
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println("An error occured");
                e.printStackTrace();
            }
        }
        if (c == 2) {
            System.out.println("Enter r");
            Lingkaran pov = new Lingkaran(sc.nextDouble());
            System.out.println("Circle's area :" + pov.getLuas());
            // Circle();
            try {
                Writer circleWriter;
                circleWriter = new BufferedWriter(new FileWriter("filecircle.txt", true));
                circleWriter.append("Circle's area :" + pov.getLuas());
                circleWriter.close();
            } catch (IOException e) {
            }

        }

        /*
         * static void Triangles() {
         * System.out.println("Enter a and t");
         * a = sc.nextInt();
         * t = sc.nextInt();
         * d = (a * t) / 2.;
         * System.out.println("Triangle's area is " + d);
         * }
         * 
         * static void Circle() {
         * System.out.println("Enter r");
         * r = sc.nextInt();
         * d = p * r * r;
         * System.out.println("Circle's area is " + d);
         * }
         */

    }
}