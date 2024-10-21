import java.util.ArrayList;
import java.util.Scanner;


public class  EditData {
    private Scanner scan = new Scanner(System.in);

    private AddData addData;

   
    public EditData(AddData addData) {
        this.addData = addData;
    }
    public void dataEdit() {
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
        System.out.println("- To Edit a column type the index -");
        System.out.println("-- Note: First index starts at 0 --");
        System.out.println("-- 1 To Edit Id -------------------");
        System.out.println("-- 2 To Edit Name -----------------");
        System.out.println("-- 3 To WorkedHours ---------------");
        System.out.println("-- 4 To Quit-----------------------");
        int pick = scan.nextInt();
        boolean editing = true;
        while (editing) {
            switch (pick) {
                case 1:
                System.out.println("Input the Index of the Id:");
                int x = scan.nextInt();
                System.out.println("Input the Change you wanted to make:");
                int y = scan.nextInt();
                ids.set(x,y);
                break;

                case 2:
                System.out.println("Input the Index of the Name:");
                int p = scan.nextInt();
                System.out.println("Input the Change you wanted to make:");
                scan.nextLine();
                String u = scan.nextLine();
                names.set(p,u);
                break;

                case 3:
                System.out.println("Input the Index of the WorkedHours:");
                int z = scan.nextInt();
                System.out.println("Input the Change you wanted to make:");
                double doublee = scan.nextDouble();
                hoursWorked.set(z,doublee);
                break;
                case 4:
                System.out.println("Exiting...");
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
                editing = false;
            }
        }
    }
}


