public class Main {
    public static void main(String[] args) {
        //task 1
        int[] inputArray1 = new int[5];
        inputArray1[0] = 1200;
        inputArray1[1] = 1500;
        inputArray1[2] = 1100;
        inputArray1[3] = 1800;
        inputArray1[4] = 1000;
        double[] outputArray1 = new double[4];
        double sum = 0;
        double max = -1;
        double min = 1_000_000;
        for (double salary : inputArray1) {
            sum += salary;
            if (salary > max) {
                max = salary;
            }
            if (salary < min) {
                min = salary;
            }
        }
        double average = sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;
        for (int salary : inputArray1) {
            System.out.print(salary);
            if (salary != inputArray1[inputArray1.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (double salary : outputArray1) {
            System.out.print(salary);
            if (salary != outputArray1[outputArray1.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 2
        int[] inputArray2 = new int[5];
        inputArray2[0] = 1200;
        inputArray2[1] = 1500;
        inputArray2[2] = 1100;
        inputArray2[3] = 1800;
        inputArray2[4] = 1000;
        float[] outputArray2 = new float[5];
        for (int i = 0; i < inputArray2.length; i++) {
            float tax = (float)(inputArray2[i] * 0.13);
            outputArray2[i] = tax;
        }
        for (int salary : inputArray2) {
            System.out.print(salary);
            if (salary != inputArray2[inputArray2.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (float salary : outputArray2) {
            System.out.print(salary);
            if (salary != outputArray2[outputArray2.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 3
        int[] inputArray3 = new int[5];
        inputArray3[0] = 1200;
        inputArray3[1] = 5100;
        inputArray3[2] = 7020;
        inputArray3[3] = 1800;
        inputArray3[4] = 4900;
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++){
            if (inputArray3[i] > 5000){
                outputArray3[i] = true;
            }
            else{
                outputArray3[i] = false;
            }
        }
        boolean isFirst = true;
        for (int salary : inputArray3) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(salary);
            isFirst = false;
        }
        isFirst = true;
        System.out.println();
        for (boolean bonus : outputArray3) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(bonus);
            isFirst = false;
        }
        System.out.println();

        //task 4
        int[] inputArray4 = new int[5];
        inputArray4[0] = 1200;
        inputArray4[1] = 5100;
        inputArray4[2] = -120;
        inputArray4[3] = -1800;
        inputArray4[4] = 4900;
        boolean[] outputArray4 = new boolean[5];
        for (int i = 0; i < inputArray3.length; i++){
            if (inputArray4[i] < 0){
                outputArray4[i] = false;
                break;
            }
            else{
                outputArray4[i] = true;
            }
        }
        isFirst = true;
        for (int balance : inputArray4) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(balance);
            isFirst = false;
        }
        isFirst = true;
        System.out.println();
        for (boolean balance : outputArray4) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(balance);
            isFirst = false;
        }
        System.out.println();

        //task 5
        int[] inputArray5 = new int[5];
        inputArray5[0] = 1200;
        inputArray5[1] = 5100;
        inputArray5[2] = -120;
        inputArray5[3] = -1800;
        inputArray5[4] = 4900;
        int profitableMonth = 0;
        for (int balance : inputArray5) {
            if (balance > 0){
                profitableMonth++;
            }
        }
        isFirst = true;
        for (int balance : inputArray5) {
            if (!isFirst) {
                System.out.print(", ");
            }
            System.out.print(balance);
            isFirst = false;
        }
        System.out.println();
        System.out.println(profitableMonth);
    }
}