class ArrayExample {

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        
        return array;
    }

    public static void main(String[] args) {
        int size = 10;
        int[] myArray = generateArray(size);
        
        System.out.print("Generated array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

