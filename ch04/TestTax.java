class TestTax{
    public static void main(String[] args){        
        double grossIncome;
        String state;
        int dependents;

        //assigning the values
        grossIncome = 50000;
        dependents = 2;
        state = "NJ";

        Tax t = new Tax(grossIncome, state, dependents); //initiating object of class Tax
        double yourTax = t.calcTax(); //calculating tax      
        System.out.println("Your tax is " + yourTax);
        t.convTax(yourTax);

        Tax t2 = new Tax(65000, "TX", 4);//initiating object t2 and assigning its values
        double hisTax = t2.calcTax();     
        System.out.println("His tax is " + hisTax);
        t2.convTax(hisTax);
    }
}
