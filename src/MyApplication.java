import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();

        people.add(new Employee("Mukhtar","Auezov","president of Shymkent's TEH university",1000000));
        people.add(new Employee("Bekzat","Sattarhanov","phisical culture teacher",700000));
        people.add(new Employee("Qanysh","Satbayev","calaculus teachaer",800000));
        people.add(new Student("Mardan","Saparbayev",3.99));
        people.add(new Student("Qozha","Alayaq",1.88));

        Collections.sort(people);
        printData(people);
    }
    public static void printData(List<Payable> people) {
        people.forEach((payable) -> System.out.println(payable + " earns " + payable.getPaymentAmount() + " tenge."));
    }
}
