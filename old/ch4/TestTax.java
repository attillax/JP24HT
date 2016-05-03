class TestTax{
    public static void main(String[] args){
	//local variables
	double grossIncome;
	String state;
	int dependents;

	//variables asigning
	grossIncome = 50000;
	dependents = 2;
	state = "NJ";

	//constructor of object #1
	Tax t = new Tax(grossIncome, state, dependents);
	double yourTax = t.calcTax();
	System.out.println("Your tax is " + yourTax);
	double yourConvTax = t.convTax(yourTax);
	System.out.println("Converted tax is " + yourConvTax);
       
	//constructor of object #2
	Tax t2 = new Tax(65000, "TX", 4);
	double hisTax = t2.calcTax();
	System.out.println("His tax is " + hisTax);
	double hisConvTax = t.convTax(yourTax);
	System.out.println("Converted tax is " + hisConvTax);
    }
}
