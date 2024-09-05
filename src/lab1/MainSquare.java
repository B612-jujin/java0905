package lab1;

public class MainSquare {
    public static void main(String[] args) {
        Square MySquare = new Square();
        MySquare.setLength(20);
        int result1 = MySquare.area();

        Square s2 = new Square();
        s2.setLength(15);
        int result = s2.area();

        MySquare.info();
        s2.info();




    }
}
