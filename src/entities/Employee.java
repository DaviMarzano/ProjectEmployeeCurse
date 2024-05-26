package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double NetSalary() {
        return this.GrossSalary - this.Tax;
    }
    public void IncreaseSalary(double percentage) {
        this.GrossSalary += this.GrossSalary * percentage / 100;
    }
    public String toString() {
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
