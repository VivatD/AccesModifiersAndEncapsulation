import date.Date;
import employers.Employee;
import shop.Invoice;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ion",24,"Logistic");
        System.out.println(e1);

        Invoice invoice = new Invoice("Iphone 12 mini", "Properties(color: blue, memory: 128gb)",4,400 );
        invoice.getInvoice();

        Date date = new Date(1994,12,30);
        System.out.println(date);
    }
}
