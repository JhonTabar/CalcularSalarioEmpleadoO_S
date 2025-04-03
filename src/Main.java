import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NombreEmpleado, DocumentoEmpleado, DiaDescanso= "";
        double SalarioBruto = 0;
        double SalarioNeto = 0;
        double DeduccionPension = 0;
        double DeduccionSalud = 0;
        double HorasTrabajadas = 0;
        double ValorHoras = 0;
        double BonificacionEmpleado = 0;
        double ValorSalarioMinimo = 1423500;
        double AuxilioTransporte = 200000;
        double CantidadHorasExtras = 0;
        double ValorHoraExtra = 0;
        double TotalValorHorasExtras = 0;

        System.out.println("Ingrese el nombre del empleado: ");
        NombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        DocumentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el día de descanso: (Lunes-Viernes)");
        DiaDescanso = sc.nextLine();

    }
}