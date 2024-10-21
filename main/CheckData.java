import java.util.ArrayList;

public class CheckData {
    private AddData addData;

   
    public CheckData(AddData addData) {
        this.addData = addData;
    }

    // Method to display the data
    public void displayData() {
        ArrayList<String> names = addData.getNames();
        ArrayList<Integer> ids = addData.getIds();
        ArrayList<Double> hoursWorked = addData.getHoursWorked();

        System.out.println("ID\tName\tHours Worked");
        System.out.println("-------------------------------");
        for (int i = 0; i < ids.size(); i++) {
            System.out.printf("%d\t%s\t%.2f%n", ids.get(i), names.get(i), hoursWorked.get(i));
        }
    }
}
