package classproject;

public class P14_EmployeeSalary {
 public static void main(String[] args) {
    double baseSalary = 12500;

    for (int i = 1; i <= 10; i++) {
      double grossSalary = 0;
      double bonus = 0;
      double loan = 0;
      
      if (i % 2 == 0) {
        if(i == 2 || i == 4){
          bonus = baseSalary * .10;
          grossSalary = (baseSalary + bonus) + 3000;
          System.out.println("ID " + i + " will get " + grossSalary + " taka");
        }else{
          bonus = baseSalary * .10;
          grossSalary = (baseSalary + bonus);
          System.out.println("ID " + i + " will get " + grossSalary + " taka");
        }
        
      } else {
        if(i == 3 || i == 7 || i == 9){
          if(i == 7){
            bonus = baseSalary * .05;
            loan = baseSalary * .12;
            grossSalary = (baseSalary + bonus + 3000) - loan;
            System.out.println("ID " + i + " will get " + grossSalary + " taka");
          }else{
            bonus = baseSalary * .05;
            loan = baseSalary * .12;
            grossSalary = (baseSalary + bonus) - loan;
            System.out.println("ID " + i + " will get " + grossSalary + " taka");
          }
        }else{
          bonus = baseSalary * .05;
          grossSalary = (baseSalary + bonus);
          System.out.println("ID " + i + " will get " + grossSalary + " taka");
        }
        
      }
    }
  }
}
