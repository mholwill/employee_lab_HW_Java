package staff;

public class Employee {

    private String name;
    private String niNumber;
    protected Double salary;

    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double amount){
        if (amount >= 0) {
            this.salary += amount;
        }
    }

    public Double payBonus(){
        Double bonus = this.salary * 0.01;
        return bonus;
    }
}
