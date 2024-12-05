public class Task4 {
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        //a1 == i1 и b1 == i1: истинно, потому что при сравнении Integer с int происходит неявное преобразование - 
        //Integer распаковывается (unboxing) в int.
        System.out.println("a1==i1 " + (a1 == i1));             // true
        System.out.println("b1==i1 " + (b1 == i1));             // true
        //a1 == b1: ложно, так как a1 и b1 указывают на разные объектные адреса в памяти.
        System.out.println("a1==b1 " + (a1 == b1));             // false
        //a1.equals(i1), b1.equals(i1), a1.equals(b1): истинно, так как метод equals() сравнивает значения, а не ссылки.
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));// true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));// true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));// true

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        //Во всех случаях результаты истинны, так как a2 и b2 ссылаются на один объект, и значения при сравнении равны.
        System.out.println("a2==i2 " + (a2 == i2));             // true
        System.out.println("b2==i2 " + (b2 == i2));             // true
        System.out.println("a2==b2 " + (a2 == b2));             // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));// true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));// true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));// true
    }
}
