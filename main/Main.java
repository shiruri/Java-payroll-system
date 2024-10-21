import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        AddData add = new AddData();
        CheckData check = new CheckData(add);
        RemoveData remove = new RemoveData(add);
        EditData edit = new EditData(add);
        Calculatepay calc = new Calculatepay(add);



        Scanner scan = new Scanner(System.in);

        boolean exit = true;
        do {
            System.out.println("-------------------------------");
            System.out.println("---- PAYMENT ROLL SYSTEM ------");
            System.out.println("- 1 Check Data ----------------");
            System.out.println("- 2 Add Data ------------------");
            System.out.println("- 3 Edit Data -----------------");
            System.out.println("- 4 Remove Data ---------------");
            System.out.println("- 5 Calculate Pay -------------");
            System.out.println("- 6 Exit ----------------------");
            System.out.println("-------------------------------");
            int input = scan.nextInt();
            scan.nextLine(); 

            switch (input) {
                case 1: 
                    System.out.println("Loading...");
                    check.displayData();
                    break;
                case 2: 
                    System.out.println("Loading...");
                    add.dataAdd();
                    break;
                case 3: 
                    System.out.println("Loading...");
                    edit.dataEdit();
                    break;     
                case 4: 
                    System.out.println("Loading...");
                    remove.Remdata();
                    break;
                case 5:
                    System.out.println("Loading..."); 
                    calc.CalculatePAY();
                    break;
                case 6:
                    exit = false;
                    break;  
                default: 
                    System.out.println("Invalid Option");
                    break;
            }
        } while (exit != false); // infinite loop until user enters 4
    }
}
    