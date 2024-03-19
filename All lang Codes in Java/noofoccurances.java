class Occurrences {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 2, 9, 2, 5, 2}; 
        int x = 2; 

        int count = countOccurrences(numbers, x);
        System.out.println("Number of occurrences of " + x + ": " + count);
    }

    public static int countOccurrences(int[] numbers, int target) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        return count;
    }
}
