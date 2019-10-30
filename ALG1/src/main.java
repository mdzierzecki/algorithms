import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        File file = new File("/home/dzierzen/MEGA/Nauka/Studia/3SEM/ASD/algorithms/ALG/src/file.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        char type = 'n';

        int lastNum = 0;

        int bestAmount = 0;
        int tempAmount = 0;

        int bestSum = 0;
        int tempSum = 0;

        int nAmount = 0;
        int nSum = 0;


        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int next_int = scanner.nextInt();

                // first number
                if (tempAmount==0) {
                    tempAmount++;
                    tempSum += next_int;
                    lastNum = next_int;
                    bestAmount = 1;
                    bestSum = next_int;
                } else {
                    if (next_int > lastNum) {
                        if(type!='g') {
                            if (tempAmount>bestAmount) {
                                bestAmount = tempAmount;
                                bestSum =  tempSum;
                            }
                            if (nAmount>0) {
                                tempSum = nSum;
                                tempAmount = nAmount;
                                tempSum += next_int;
                                tempAmount++;
                            } else {
                                tempAmount = 2;
                                tempSum = lastNum + next_int;
                            }

                            type = 'g';
                            lastNum = next_int;

                        } else { // zapytac czy else czy else if
                            tempAmount++;
                            tempSum += next_int;
                            lastNum = next_int;
                            if (tempAmount>bestAmount) {
                                bestAmount = tempAmount;
                                bestSum =  tempSum;
                            }
                        }
                        nSum=0;
                        nAmount=0;

                    } else if(next_int < lastNum) {
                        if(type!='d') {

                            if (tempAmount>bestAmount) {
                                bestAmount = tempAmount;
                                bestSum =  tempSum;
                            }
                            if (nAmount>0) {
                                tempSum = nSum;
                                tempAmount = nAmount;
                                tempSum += next_int;
                                tempAmount++;
                            } else {
                                tempAmount = 2;
                                tempSum = lastNum + next_int;
                            }
                            type = 'd';
                            lastNum = next_int;

                        } else { // zapytac czy else czy else if
                            tempSum += next_int;
                            tempAmount++;
                            lastNum = next_int;
                            if (tempAmount>bestAmount) {
                                bestAmount = tempAmount;
                                bestSum =  tempSum;
                            }

                        }
                        nSum=0;
                        nAmount=0;
                    } else {
                        if (next_int==lastNum) {
                            if(nAmount==0) {
                                nSum = 2*next_int;
                                nAmount = 2;
                            } else {
                                nAmount++;
                                nSum +=next_int;
                            }

                        }
                        tempSum += next_int;
                        tempAmount++;
                        lastNum = next_int;
                        if (tempAmount>bestAmount) {
                            bestAmount = tempAmount;
                            bestSum =  tempSum;
                        }
                    }

                }

            }
            else {
                scanner.next();
            }
        }

        System.out.println(bestAmount + " "   + bestSum);

    }
}
