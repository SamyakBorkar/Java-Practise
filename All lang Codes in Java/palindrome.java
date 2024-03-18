public class palindrome {
    public static int palindrome(int x) {
        int revno = 0;
        while (x != 0) {
            int r = x % 10;
            revno = (revno * 10) + r;
            x = x / 10;
            
        }
        return revno;
    }

    public static void main(String[] args) {
        int num = 121;
        int result = palindrome(num);
        System.out.println(result);

        if (result == num) {
            System.out.println("It is Palindrome");

        } else {
            System.out.println("It is not palindrome");
        }
    }
}
