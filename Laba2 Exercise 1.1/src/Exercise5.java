public class Exercise5 {
    public static void main(String[] args) {
        try{
            System.out.println("0");
            throw new RuntimeException("Помилка");
        } catch (NullPointerException e) {
            System.out.println("1" );
        }
        System.out.println("2");
    }
}
//Виводить помилку, бо не має батьківського класу для перехоплення