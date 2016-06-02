public class Employee extends Person implements Payable {
    public String name;

    public Employee(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());

        return true;
    }
}
