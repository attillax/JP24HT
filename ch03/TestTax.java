class TestTax{
    public static void main(String[] args){
        NJTax t = new NJTax(); //creating and instance
        
        //assigning the values
        t.grossIncome = 50000;
        t.dependents = 2;
        t.state = "NJ";
        
        double yourTax = t.calcTax(); //calculating tax
        
        System.out.println("Your tax is " + yourTax);
    }
}
