import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number_of_grades = 0;
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                number_of_grades = input.nextInt();
                break;
            } else {
                continue;
            }
        }


        int counter = 0;
        int sum_of_grades = 0;
        while (counter < number_of_grades) {
            while (!input.hasNextInt()) {
                input.next();
            }
            int sem_number = input.nextInt();
            if (sem_number <= 100 && sem_number >= 0) {
                sum_of_grades = sem_number + sum_of_grades;
                counter = counter + 1;
            }else{
                continue;
            }

        }

        double averages = sum_of_grades / number_of_grades;
        System.out.printf("%.2f\n","The average grade was " + averages);
    }
}
