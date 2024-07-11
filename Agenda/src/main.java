
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        agenda1.setLunes("Futbol");
        agenda1.setMartes("Ajedrez");
        agenda1.setMiercoles("Padel");
        agenda1.setJueves("Tenis");
        agenda1.setViernes("Baloncesto");

        Agenda agenda2 = new Agenda("Futbol", "Ajedrez","Padel","Tenis","Baloncesto" );

        Agenda agenda3 = new Agenda(agenda1);

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de día (1-5): ");
        int dia = scanner.nextInt();

        agenda1.mostrarDia(dia);

        agenda2.mostrarDia(dia);

        agenda3.mostrarDia(dia);

    }
}
