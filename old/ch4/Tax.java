class Tax{
    //class variables
    double grossIncome;
    String state;
    int dependents;
    static int customerCounter;

    double calcTax(){
	return(grossIncome*0.33 - dependents*100);
    }

    static double convTax(double calculTax){
	return(calculTax*1.25);
    }

    //class constructor
    Tax(double gi, String st, int depen){
	//member value initialization
	grossIncome = gi;
	state = st;
	dependents = depen;

	customerCounter++;
	System.out.println("Preparing the tax data for customer #" + customerCounter);
    }
}
