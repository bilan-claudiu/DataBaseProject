package homework;

public class Audio extends Props implements  File {
    public Audio(String name, int length) {
        super(name, length);
    }


    public String searchByName(String name) {
        return name;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void print2() {
        System.out.println(Audio.super.getName() + " " + Audio.super.getLength());
    }


}

