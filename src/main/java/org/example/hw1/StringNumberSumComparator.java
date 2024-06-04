package org.example.hw1;

import java.util.Comparator;

public class StringNumberSumComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int sum1 = calculateSumOfNumbers(str1);
        int sum2 = calculateSumOfNumbers(str2);

        return Integer.compare(sum1, sum2);
    }

    private int calculateSumOfNumbers(String str) {
        int sum = 0;
        String[] numbers = str.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        StringNumberSumComparator comparator = new StringNumberSumComparator();

        String str1 = "abc123def456ghi"; // 21
        String str2 = "jkl789mno"; // 24

        System.out.println(comparator.compare(str1, str2));
    }
}