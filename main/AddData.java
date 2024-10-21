import java.util.ArrayList;
import java.util.Scanner;

public class AddData {
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<Integer> ids = new ArrayList<>();
    private ArrayList<Double> hoursWorked = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    // Method to add data
    public void dataAdd() {
        boolean adding = true;

        while (adding) {
            System.out.println("------------------------------");
            System.out.println("-----------DATA ADD-----------");
            System.out.println("------------------------------");
            System.out.print("Input ID: ");
            int id = scan.nextInt();
            ids.add(id);
            scan.nextLine(); 

            System.out.print("Input Employee Name: ");
            String name = scan.nextLine();
            names.add(name);

            System.out.print("Input Hours Worked: ");
            double hours = scan.nextDouble();
            hoursWorked.add(hours);
            scan.nextLine();  

            System.out.println("------------------------------");
            System.out.println("-- 1 To Add Another-----------");
            System.out.println("-- 2 To Quit------------------");
            System.out.println("------------------------------");

            System.out.print("Choose an option: ");
            int addOrQuit = scan.nextInt();
            scan.nextLine();

            if (addOrQuit != 1) {
                adding = false;
                System.out.println("Exiting data addition.");
            }
        }
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<Integer> getIds() {
        return ids;
    }

    public ArrayList<Double> getHoursWorked() {
        return hoursWorked;
    }
}
