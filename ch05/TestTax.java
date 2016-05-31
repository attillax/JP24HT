class TestTax{
    public static void main(String[] args){
        //chk validity of input
        if (args.length != 3){
            System.out.println("Sample usage of the program: " + "java TestTax 50000 NJ 2");
            System.exit(0);
        }  

        //input throw program call      
        double grossIncome = Double.parseDouble(args[0]);
        String state = args[1];
        int dependents = Integer.parseInt(args[2]);

        Tax t = new Tax(); //initiating object of class Tax
        double yourTax = t.calcTax(grossIncome); //calculating tax      
        System.out.println("Your tax is " + yourTax);
    }
}
