package com.practice.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DecimalFormating {


        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int legnthArr = arr.size();
            double pos = 0;
            double neg = 0;
            double zero = 0;

            for (double num : arr){
                if (num<0){
                    neg++;
                }if (num>0){
                    pos++;
                }if (num==0){
                    zero++;
                }
            }
            System.out.printf("%.6f%n",pos/legnthArr);
            System.out.printf("%.6f%n",neg/legnthArr);
            System.out.printf("%.6f%n",zero/legnthArr);




        }




        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            DecimalFormating.plusMinus(arr);

            bufferedReader.close();
        }
    }


