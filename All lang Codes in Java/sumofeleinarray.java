class SumOfDigitsArray {
    public static void main(String[] args) {
        int[] arr = {123, 45, 678, 9, 10};

        int sum = sumOfDigits(arr);
        System.out.println("Sum of digits in the array: " + sum);
    }

    public static int sumOfDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }
}
