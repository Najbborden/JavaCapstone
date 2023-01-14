import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Internship{
  public static void main(String[] args) {
	  String currentDirectory = System.getProperty("user.dir");
      System.out.println("Working Directory " + currentDirectory);
      String getProperty = System.getProperty("user.name");
      System.out.println("Programmer: " + getProperty);
      Date date = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      System.out.println("Lab 18.1: " + formatter.format(date)+ "\n");
     
	
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your class grade: ");
    int classGrade = scanner.nextInt();

    System.out.print("Enter your contract points: ");
    int contractPoints = scanner.nextInt();

    qualify(name, classGrade, contractPoints);
  }

  public static void qualify(String name, int classGrade, int contractPoints) {
    boolean classGradePass = classGrade >= 70;
    boolean contractPointsPass = contractPoints >= 350;

    if (classGradePass && contractPointsPass) {
      System.out.println(name + ", you qualify for the internship.");
    } else {
      System.out.println(name + ", you do not qualify for the internship.");
    }
  }
}


