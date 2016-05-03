class TestTax{
    public static void main(String[] args){
	//local variables, input when programm called
	double grossIncome = Double.parseDouble(args[0]);
	String state = args[1];
	int dependents = Integer.parseInt(args[2]);

	//chk all 3 input args exists
	if (args.length != 3){
	    System.out.println("Sample usage of the program:" + " java TestTax 50000 NJ 2");
	    System.exit(0);
	}

	//constructor of object
	Tax t = new Tax(grossIncome, state, dependents);
	double yourTax = t.calcTax();
	System.out.println("Your tax is " + yourTax);
    }
}
