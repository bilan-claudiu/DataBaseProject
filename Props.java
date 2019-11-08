package homework;

public abstract class Props implements File {
    private String name;
    private int length;

    Props(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    protected abstract String searchByName(String name);

    @Override
    public void play() {
        System.out.println("Play " + getName() + " for " + getLength());
    }
}

