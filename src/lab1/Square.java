package lab1;

public class Square {
    private int length;



    public int area() {
        int result = (int)Math.pow(length, 2);
        System.out.println();
        return result;
    }

    public void info(){
        System.out.println("\n정사각형의 한 변의 길이:"+length);
        System.out.println("\n정사각형의 면적:"+ Math.pow(length, 2)+"㎠");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
