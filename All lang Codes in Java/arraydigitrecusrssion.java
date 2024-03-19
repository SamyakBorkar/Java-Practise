class ArraySumRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = sumOfArray(arr, arr.length - 1);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int sumOfArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumOfArray(arr, index - 1);
    }
}
