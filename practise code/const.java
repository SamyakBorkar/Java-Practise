class constructor {
    private int id;
    private String name;

    public constructor() {
        id = 7;
        name = "Samyak";
    }

    public static void main(String[] args) {

        constructor obj = new constructor();
        System.out.println(obj.id);
        System.out.println(obj.name);

    }
}
