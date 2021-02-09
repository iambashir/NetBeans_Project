package classproject;

public class StudentsFee {
public static void main(String[] args) {
    int lab = 2000;
    int semester = 25200;
    int medicle = 700;
    int library = 1500;
    int leave = 250;
    int mustPay = lab + semester + medicle + library ;
    
    for(int i = 1; i <=3; i++){
      if(i == 1){
        int newLab = lab * 3; 
        double total =  mustPay + newLab + 15700;
        System.out.println("student ID " + i + " have to pay " + total);
      }else if(i == 2){
        double newSemester = (double) (semester * .60);
        int newLeave = leave * 4;
        double total = (double) (mustPay + newSemester + newLeave);
        System.out.println("student ID " + i + " have to pay " + total);
      }else{
        int newLeave = leave * 7;
        double weaver = mustPay * .05;
        double newTotal = (mustPay - weaver) + newLeave;
        System.out.println("student ID " + i + " have to pay " + newTotal);
      }
    }
  }
}


