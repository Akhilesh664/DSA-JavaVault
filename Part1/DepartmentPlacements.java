package Part1;

import java.util.Scanner;

public class DepartmentPlacements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students placed in CSE: ");
        int csePlacements = scanner.nextInt();

        System.out.print("Enter the number of students placed in ECE: ");
        int ecePlacements = scanner.nextInt();

        System.out.print("Enter the number of students placed in MECH: ");
        int mechPlacements = scanner.nextInt();

        // Check for invalid input
        if (csePlacements < 0 || ecePlacements < 0 || mechPlacements < 0) {
            System.out.println("Input is Invalid");
            return;
        }

        // Determine the maximum number of placements
        int maxPlacements = Math.max(csePlacements, Math.max(ecePlacements, mechPlacements));

        // Check if all departments have zero placements
        if (csePlacements == 0 && ecePlacements == 0 && mechPlacements == 0) {
            System.out.println("None of the department has got the highest placement");
            return;
        }

        // Check for the department(s) with the highest placements
        boolean cseMax = csePlacements == maxPlacements;
        boolean eceMax = ecePlacements == maxPlacements;
        boolean mechMax = mechPlacements == maxPlacements;

        if ((cseMax && eceMax && mechMax) || (cseMax && eceMax) || (eceMax && mechMax) || (cseMax && mechMax)) {
            System.out.println("Highest placement");
            if (cseMax) {
                System.out.println("CSE");
            }
            if (eceMax) {
                System.out.println("ECE");
            }
            if (mechMax) {
                System.out.println("MECH");
            }
        } else if (cseMax) {
            System.out.println("Highest placement");
            System.out.println("CSE");
        } else if (eceMax) {
            System.out.println("Highest placement");
            System.out.println("ECE");
        } else if (mechMax) {
            System.out.println("Highest placement");
            System.out.println("MECH");
        } else {
            System.out.println("None of the department has got the highest placement");
        }

        scanner.close();
    }
}

