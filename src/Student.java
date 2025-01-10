public class Student extends Person implements Payable {
    double gpa;

    public Student() {
        super();
    }
    public Student(String name,String surname,double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(){
        this.gpa=gpa;
    }
    @Override
    public String toString() {
        return "Student:" + id +" " +name +" "+ surname;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa>2.67){
            return 36600;
        }
        return 0;
    }

    @Override
    public String getPosition() {
        return "Student";
    }
}
