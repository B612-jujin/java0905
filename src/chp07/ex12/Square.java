package chp07.ex12;

public class Square {
    private int length;



    public double getVolume() {
        double result = Math.pow(length, 3);
        return result;
    }

    double getSurfaceArea() {
        return Math.pow(length, 2)*6;
    }

    public void info(){
        System.out.printf("\n정육면체의 한 변의 길이가 %d인\n\t 정육면체의 부피: %.3f\n\t 정육면체의 겉넓이: %.3f", length, getVolume(),getSurfaceArea());

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

