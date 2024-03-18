class regno {
    static String s = "2024bit045";

    public static void main(String[] args) {
        String ans = s.substring(4, 7);
        System.out.println(ans);
        if (ans.equals("bit")) {
            System.out.println("Valid");

        } else {
            System.out.println("invalid");
        }
    }
}
