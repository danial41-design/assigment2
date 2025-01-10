public class Employee extends Person {
    String position;
    double salary;

    public Employee(){
        super();
    }
    public Employee(String name, String surname,String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(){
        this.position = position;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee:" + id +" " +name +" "+ surname;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
