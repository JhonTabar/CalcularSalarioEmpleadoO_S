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
        System.out.println("Ingrese el valor de la hora: ");
        ValorHoras = sc.nextDouble();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        HorasTrabajadas = sc.nextDouble();

        SalarioBruto = HorasTrabajadas * ValorHoras; 
        if (SalarioBruto <= ValorSalarioMinimo*2) {
            /* >= No recibe auxilio  <= Si recibe auxilio*/
            AuxilioTransporte = 200000;
            BonificacionEmpleado = SalarioBruto * 0.1;
        } else {
            AuxilioTransporte = 0;
            BonificacionEmpleado = 0;
        }
        DeduccionPension = SalarioBruto * 0.04;
        /* Remember ur math */
        DeduccionSalud = SalarioBruto * 0.04;
        if (HorasTrabajadas > 96) {
            CantidadHorasExtras = HorasTrabajadas - 96;
            ValorHoraExtra = ValorHoras * 1.25;
            TotalValorHorasExtras = CantidadHorasExtras * ValorHoraExtra;
        }
        if (HorasTrabajadas < 24) {
            System.out.println("Se requiere mas horas para necesitar tu pago.");
        } else {
            SalarioNeto = SalarioBruto - DeduccionSalud - DeduccionPension + AuxilioTransporte + BonificacionEmpleado + TotalValorHorasExtras;
            System.out.println("El nombre del empleado es: " + NombreEmpleado + " Su documento de identidad es: " + DocumentoEmpleado);
            System.out.println("Su dia de descanso es " + DiaDescanso);
            System.out.println("El valor de la horas de trabajo es: " + ValorHoras);
            System.out.println("Trabaja " + HorasTrabajadas + " horas.");
            System.out.println("Trabaja " + CantidadHorasExtras + " horas extras. Cada hora extra vale " + ValorHoraExtra);
            System.out.println("Recibe un auxilio de transporte de " + AuxilioTransporte);
            System.out.println("Recibe una bonificacion de " + BonificacionEmpleado);
            System.out.println("Su deduccion de pension es " + DeduccionPension + " Y su deduccion de salud es " + DeduccionSalud);
            System.out.println("El salario del empleado es: " + SalarioNeto);
        }


    }
}