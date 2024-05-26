package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee();

        System.out.println("Name : ");
        employee1.Name = sc.nextLine();
        System.out.println("Gross salary : ");
        employee1.GrossSalary = sc.nextDouble();
        System.out.println("Tax : ");
        employee1.Tax = sc.nextDouble();

        System.out.println("Employee : " + employee1);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee1.IncreaseSalary(percentage);

        System.out.println();
        System.out.println("Update data : " + employee1);

        sc.close();
    }
}
