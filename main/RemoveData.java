import java.util.ArrayList;
import java.util.Scanner;


public class  RemoveData {
    private Scanner scan = new Scanner(System.in);

    private AddData addData;

   
    public RemoveData(AddData addData) {
        this.addData = addData;
    }
    public void Remdata() {
        System.out.println("-------------------------------");
        System.out.println("----------REMOVE ADD-----------");
        System.out.println("-------------------------------");


        ArrayList<String> names = addData.getNames();
        ArrayList<Integer> ids = addData.getIds();
        ArrayList<Double> hoursWorked = addData.getHoursWorked();

        System.out.println("ID\tName\tHours Worked");
        System.out.println("-------------------------------");
        for (int i = 0; i < ids.size(); i++) {
            System.out.printf("%d\t%s\t%.2f%n", ids.get(i), names.get(i), hoursWorked.get(i));
        }
        System.out.println("-----------------------------------");
        System.out.println("------------INSTRUCTION------------");
        System.out.println("-To remove a column type the index-");
        System.out.println("-- Note: First index starts at 0 --");
        System.out.println("-- 1 To Remove---------------------");
        System.out.println("-- 2 To Quit-----------------------");
        int pick = scan.nextInt();  
        boolean removing = true;
        while (removing) {

        switch (pick) {
            case 1:
                System.out.println("Input the Index of the Id:");
                int x = scan.nextInt();
                ids.remove(x);
                break;
            case 2:
                System.out.println("Exiting....");
                break;
            default:
                System.out.println("Invalid Choice"); 
                break;
        }
            System.out.println("------------------------------");
            System.out.println("-- 1 To Add Another-----------");
            System.out.println("-- 2 To Quit------------------");
            System.out.println("------------------------------");
            int exitorrem = scan.nextInt();
            if (exitorrem != 1) {
                System.out.println("Exiting...");
                removing = false;
            }
        }
    }
}



