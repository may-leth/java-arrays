import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {

        
        /* ¡Nos mudamos de piso! vamos a crear un pequeño programa que nos ayude a saber en que caja pusimos las siguientes cosas:

        Caja 0. Libros
        Caja 1. Utensilios de cocina
        Caja 2. Artículos de baño
        Caja 3. Bolsos
        Caja 4. Zapatos
        Caja 5. Cosas de verano
        Caja 6. Cosas de invierno
        */

        //Crea un array con las cosas que contienen las cajas
        String[] boxes = {
                "Libros",
                "Artículos de baño",
                "Bolsos",
                "Zapatos",
                "Cosas de verano",
                "Cosas de invierno"
        };

        //Pregunta al usuario lo siguiente: Hola, soy tu asistente de la organización ¿Qué deseas buscar? (la respuesta deberá aparecer en la terminal en la misma línea)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, soy tu asistente de la organización");
        System.out.print("¿Qué deseas buscar?");
        String searchedItem = scanner.nextLine();

        //Crea un programa que te devuelva lo siguiente: <cosas> están en la caja <índice> en el caso de no existir que devuelva: <cosas> no las empacaste, oops!
        boolean found = false;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].equalsIgnoreCase(searchedItem)) {
                System.out.println(searchedItem + " están en la caja " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchedItem + " no las empacaste, oops!");
        }

        scanner.close();
    }
}
