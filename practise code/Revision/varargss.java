class varargs {
    public void Exm(int n, int... arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sum is: " + (sum + n)); // Corrected this line
    }

    public void Exm2(int... arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("Sumauhfia is: " + sum); // Corrected this line
    }
    public static void main(String[] args) {
        varargs obj = new varargs();
        obj.Exm(2, 2, 3, 4, 5, 6);
        obj.Exm2(1);
    }
}

