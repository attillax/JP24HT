class TestTax extends NJTax{
    public static void main(String[] args){
        NJTax t= new NJTax(); // creating an instanceProgram Comments  

        t.grossIncome= 50000; // assigning the values
        t.dependents= 2;
        t.state= "NJ";
        
        double yourTax = t.calcTax();
        double totalTax = t. adjustForStudents (yourTax);

        // Printing the result
        System.out.println("Your tax is " + yourTax);
    }
}
