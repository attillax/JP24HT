public class Contractor extends Person implements Payable {
    public String name;

    public Contractor(String name){
        super(name);
    }
    
    final int INCREASE_CAP = 20;

    public boolean increasePay(int percent) {
        if (percent > INCREASE_CAP) {
            System.out.println("Sorry, can’t increase hourly rate by more than 20%. " + getName());
        } else {
            System.out.println("Increasing salary by " + percent + "%. " + getName());
        }

        return true;
    }
}
