import java.util.ArrayList;
import java.util.Scanner;


public class Calculatepay {
    private Scanner scan = new Scanner(System.in);

    private AddData addData;

    public Calculatepay(AddData addData) {
        this.addData = addData;
        
    }
    public void CalculatePAY() {
        final int minimumwage = 260;

        ArrayList<String> names = addData.getNames();
        ArrayList<Integer> ids = addData.getIds();
        ArrayList<Double> hoursWorked = addData.getHoursWorked();

        System.out.println("-------------------------------");
        System.out.println("---------CALCULATE PAY---------");
        System.out.println("-------------------------------");

        System.out.println("ID\tName\tHours Worked");
        System.out.println("-------------------------------");
        for (int i = 0; i < ids.size(); i++) {
            System.out.printf("%d\t%s\t%.2f%n", ids.get(i), names.get(i), hoursWorked.get(i));
        }
        System.out.println("-------------------------------");
        System.out.println("-- 1 To Calculate--------------");
        System.out.println("-- 1 To Exit-------------------");
        System.out.println("-------------------------------");
        int pick = scan.nextInt();  
        boolean calculating = true;
        while (calculating) {
            switch (pick) {
                case 1:
                    System.out.println("Input the Index of the Id:");
                    int o = scan.nextInt();
                    double pay = hoursWorked.get(o);
                    double wage = pay * minimumwage;
                    System.out.println("------------------------------");
                    System.out.println("---------TOTAL PAY------------");
                    System.out.println("------------"+wage+"--------------");
                    System.out.println("------------------------------");

                    break;
                case 2:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice"); 
                    break;
            }
                System.out.println("------------------------------");
                System.out.println("-- 1 To calculate again ------");
                System.out.println("-- 2 To Quit------------------");
                System.out.println("------------------------------");
                int exitorrem = scan.nextInt();
                if (exitorrem != 1) {
                    System.out.println("Exiting...");
                    calculating = false;
                }
            }
        }
    }
