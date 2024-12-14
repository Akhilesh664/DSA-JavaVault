package Part1;

import java.util.Scanner;

public class MonthToSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        
        String season;
        switch (month) {
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Autumn";
                break;
            case 12: case 1: case 2:
                season = "Winter";
                break;
            default:
                season = "Invalid month";
                break;
        }
        
        if (season.equals("Invalid month")) {
            System.out.println(season);
        } else {
            System.out.println("Season: " + season);
        }
        
        scanner.close();
    }
}
