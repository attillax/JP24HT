public class TestPayIncreasePolyError {
      public static void main(String[] args) {
          Person workers[] = new Person[3];
              workers[0] = new Employee("John");
              workers[1] = new Contractor("Mary");
              workers[2] = new ForeignContractor("Boris");

          for (Person p: workers){
              if (p instanceof Payable) {
                  ((Payable)p).increasePay(30);
              }
          }
    }
}
