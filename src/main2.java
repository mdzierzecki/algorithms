//import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//public class main {
//    public static void main(String[] args) {
//
//        File file = new File("//home/dzierzen/MEGA/Komputer/Java/Algorytmy/algorithms/src/file.txt");
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        char type = 'n';
//
//        int k = -99;
//        int best_amount = 0;
//        int temp_amount = 0;
//        int best_sum = 0;
//        int temp_sum = 0;
//
//        while (scanner.hasNext()) {
//
//            if (scanner.hasNextInt()) {
//
//
//
//
//
//
//
//
//                int next_int = scanner.nextInt();
//                if (k==-99) {
//                    temp_amount = 1;
//                    k = next_int;
//                    temp_sum = next_int;
//                } else {
//
//                    if (next_int>k) {
//                        if(type!='g') {
//                            best_amount = temp_amount;
//                            best_sum = temp_sum;
//                            temp_amount += 1;
//                            temp_sum += next_int;
//                            type = 'g';
//                        }
//                        temp_amount += 1;
//                        temp_sum += next_int;
//                        k = next_int;
//
//
//                    } else if (next_int<k) {
//                        if(type!='d') {
//                            best_amount = temp_amount;
//                            best_sum = temp_sum;
//                            temp_amount = 1;
//                            temp_sum = next_int;
//                            type = 'd';
//                        }
//                        temp_amount += 1;
//                        temp_sum += next_int;
//                        k = next_int;
//                    } else {
//                        temp_amount += 1;
//                        temp_sum += next_int;
//                        k = next_int;
//                    }
//                }
//
//
//
//            }
//            else {
//                scanner.next();
//            }
//        }
//
//
//        System.out.println(best_amount + " "   + best_sum);
//
//    }
//}
