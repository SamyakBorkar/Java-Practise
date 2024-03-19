class Check{
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 40, 15, 10, 3, 7}; 

        int max = numbers[0]; 
        int min = numbers[0]; 

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
