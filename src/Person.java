public class Person implements Payable{
    static int id_gen=1;
    String name;
    String surname;
    int id;

    public Person(){
        id_gen++;
        id=id_gen;
    }
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
    public int getId(){
        return id;
    }
    public String getPosition(){
        Class check = this.getClass();
        if(check == Student.class){
            return "Student";
        }
        else {
            return "Employee";
        }
    }

    @Override
    public String toString() {
        return id +" " +name +" "+ surname;
    }

    @Override
    public double getPaymentAmount(){
        return 0;
    }
    @Override
    public int compareTo(Payable o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }

}
