package homework;

public class Video extends Props implements File {
    public Video(String name, int length) {
        super(name, length);
    }

    protected String searchByName(String name) {
        return name;

    }
    public void print2() {
        System.out.println(Video.super.getName() + " " + Video.super.getLength());
    }

}


