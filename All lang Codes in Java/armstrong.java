public class armstrong {
    public static int totalNumbers(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static boolean palindromeCheck(int num) {
        int originalNum = num;
        int res = 0;
        int y = totalNumbers(num);
        while (num != 0) {
            int x = num % 10;
            res += (int)Math.pow(x, y);
            num = num / 10;
        }
        return res == originalNum;
    }

    public static void main(String[] args) {
        int number = 153; 
        boolean isArmstrong = palindromeCheck(number);
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
