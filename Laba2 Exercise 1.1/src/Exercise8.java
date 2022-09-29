public class Exercise8 {
      public static int m () {
        try{
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
      }
        public static void main(String[] args){ System.out.println(m());
        }
}
//Виводить помилку, бо не має батьківського класу для перехоплення, а finally у будь-якому випадку віконується