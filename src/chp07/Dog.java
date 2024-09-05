package chp07;

public class Dog {
    private String name;

    private String breed;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void wag(){
        System.out.println(name + " 이(가) 살랑살랑 꼬리를 친다.");;
    }

    public void bark(){
        System.out.println("멍멍!");
    }

    public void bark(int times, String sound){
        System.out.printf("%s 가(이) %d 번 %s 짖는다.\n",name,times,sound);
    }


}
