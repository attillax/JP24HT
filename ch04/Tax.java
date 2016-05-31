class Tax{
    double grossIncome;
    String state;
    int dependents;
    static int customerCounter;

    //constructor
    Tax (double gi, String st, int depen){
        grossIncome = gi;
        state = st;
        dependents = depen;
        customerCounter++;
        
        System.out.println("Preparing the tax data for customer #" + customerCounter);
    }
    
    public double calcTax(){
        
        return (grossIncome * 0.33 - dependents * 100);
    }
    
    static void convTax(double dollarTax){
        System.out.println("Tax in euros is " + dollarTax * 1.25);
    }
}
