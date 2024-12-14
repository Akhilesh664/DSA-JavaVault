package Part1;

import java.util.Scanner;

public class IncrementCalculation 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

        System.out.println("Enter the salary:");
        double salary = s.nextDouble();
        
        System.out.println("Enter performance appraisal rating : ");
        double appraisalRating = s.nextDouble();

        double incrementedSalary = CalculateIncrementedSalary(salary, appraisalRating);
        
        if(incrementedSalary == -1) {
    		System.out.println("Invalid Input");
        }else {
        	System.out.printf("%.0f\n",incrementedSalary);
        }
            
        s.close();
	}

	private static double CalculateIncrementedSalary(double salary, double appraisalRating) 
	{
		if(salary <= 0 || appraisalRating < 1 || appraisalRating > 5) {
			return -1;
		}
		
		double incrementPercentage = 0;
		
		if (appraisalRating >= 1 && appraisalRating <= 3) {
            incrementPercentage = 0.10;
        } else if (appraisalRating > 3 && appraisalRating <= 4) {
            incrementPercentage = 0.25;
        } else if (appraisalRating > 4 && appraisalRating <= 5) {
            incrementPercentage = 0.30;
        }
		
		return salary + (salary *incrementPercentage);
	}

}
