package homework;

import javax.xml.crypto.Data;

public class MainApp extends Database {

    public static void main(String[] args) {


        Database<Audio> audioDatabase = new Database<>();
        audioDatabase.add(new Audio("aaa", 3));
        audioDatabase.add(new Audio("bbb", 3));
        audioDatabase.add(new Audio("ccc", 3));
        audioDatabase.add(new Audio("ddd", 3));
        audioDatabase.add(new Audio("eee", 3));
        audioDatabase.print();

        Database<Video> videoDatabase = new Database<>();
        videoDatabase.add(new Video("1111", 6));
        videoDatabase.add(new Video("2222", 7));
        videoDatabase.add(new Video("3333", 8));
        videoDatabase.add(new Video("4444", 9));
        videoDatabase.add(new Video("5555", 5));
        videoDatabase.print();

    }


}







