package com.company.ex1;

class MinMaxExample {

public static void main (String args[]) {
    int array[] = new int[]{10, 1, 88, 2, 12, 500};
    int max = getMax(array);
    System.out.println("Максимальное значение:" + max);
    int min = getMin(array);
        System.out.println("Минимальное значение:" + min);
}
    public static int getMax (int[] inputArray) {
        int maxValue = inputArray[0];
        for(int i=1; i<inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
            }
        public static int getMin(int[] inputArray) {
    int minValue = inputArray[0];
    for (int i=1; i<inputArray.length; i++)
    {
        if(inputArray[i]<minValue) {
            minValue = inputArray[i];
        }
        }
    return minValue;
}
}
