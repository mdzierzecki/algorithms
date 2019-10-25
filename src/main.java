import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        File file = new File(args[0]);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char type = 'n';

        int last_num = 0;

        int best_amount = 0;
        int temp_amount = 0;

        int best_sum = 0;
        int temp_sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int next_int = scanner.nextInt();

                // first number
                if (temp_amount==0) {
                    temp_amount++;
                    temp_sum += next_int;
                    last_num = next_int;
                } else {
                    if (next_int > last_num) {
                        if(type!='g') {
                            if (temp_amount>best_amount) {
                                best_amount = temp_amount;
                                best_sum =  temp_sum;
                            }
                            temp_amount = 2;
                            temp_sum = last_num + next_int;
                            type = 'g';
                            last_num = next_int;
                        } else { // zapytac czy else czy else if
                            temp_sum += next_int;
                            temp_amount++;
                            last_num = next_int;
                            if (temp_amount>best_amount) {
                                best_amount = temp_amount;
                                best_sum =  temp_sum;
                            }
                        }

                    } else if(next_int < last_num) {
                        if(type!='d') {
                            if (temp_amount>best_amount) {
                                best_amount = temp_amount;
                                best_sum =  temp_sum;
                            }
                            temp_amount = 2;
                            temp_sum = last_num + next_int;
                            type = 'd';
                            last_num = next_int;
                        } else { // zapytac czy else czy else if
                            temp_sum += next_int;
                            temp_amount++;
                            last_num = next_int;
                            if (temp_amount>best_amount) {
                                best_amount = temp_amount;
                                best_sum =  temp_sum;
                            }
                        }
                    } else {
                        temp_sum += next_int;
                        temp_amount++;
                        last_num = next_int;
                        if (temp_amount>best_amount) {
                            best_amount = temp_amount;
                            best_sum =  temp_sum;
                        }
                    }

                }



            }
            else {
                scanner.next();
            }
        }


        System.out.println(best_amount + " "   + best_sum);

    }
}
