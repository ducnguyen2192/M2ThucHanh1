import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        ArrayList<TamGiac> triangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Create new Triangles");
            System.out.println("2. Show sides of the biggest Triangle");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    TamGiac t1 = new TamGiac();
                    System.out.println("please input id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input side values");
                    int sideA = Integer.parseInt(scanner.nextLine());
                    int sideB = Integer.parseInt(scanner.nextLine());
                    int sideC = Integer.parseInt(scanner.nextLine());
                    if (t1.isTriangle(sideA, sideB, sideC)) {
                        t1.setSide(sideA, sideB, sideC);
                        t1.setId(id);
                        triangles.add(t1);
                        for (TamGiac triangle : triangles) {
                            System.out.println(triangle.toString());
                        }
                    } else {
                        System.out.println("not a triangle");
                    }
                    break;
                case 2:
                    Collections.sort(triangles);
                    System.out.println(triangles.get(triangles.size()-1));
                    break;
            }
        }while(true);

    }
}
