
public class Main {
    public static void n(String[] args) {//GFHFXH

        Generic<Integer, String, Boolean> example = new Generic<>(10, "Hello", true);
        System.out.println(example.getParameter1());
        System.out.println(example.getParameter2());
        System.out.println(example.getParameter3());
    }
}