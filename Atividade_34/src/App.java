import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import Atividade_34.Entities.Circle;
import Atividade_34.Entities.Rectangle;
import Atividade_34.color.Enums;
import Atividade_34.Entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Shape> lista = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Shape #" + (i + 1) + " data:");

            System.out.println("Rectangle or Circle (r/c)?");

            char type = sc.next().charAt(0);
            System.out.println("color (BLACK/RED/BLUE):");

            Enums color = Enums.valueOf(sc.next());

            if (type == 'r') {

                System.out.println("Width: ");

                double width = sc.nextDouble();

                System.out.println("Height: ");

                double height = sc.nextDouble();

                lista.add(new Rectangle(color, width, height));
            } else {

                System.out.println("Radius: ");

                double radius = sc.nextDouble();

                lista.add(new Circle(color, radius));

            }

            System.out.println("shape area: ");

            for(Shape shape : lista){

                System.out.println(shape.getEnums() + " area: " + String.format("%.2f", shape.area()));
            }

        }

        }


    }


