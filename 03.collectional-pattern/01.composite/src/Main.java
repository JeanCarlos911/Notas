import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // folder a
        Folder a = new Folder();

        File file1 = new File(200);
        a.addDirectory(file1);

        File file2 = new File(10000);
        a.addDirectory(file2);

        //folder b
        Folder b = new Folder();
        b.addDirectory(a);
        
        File file3 = new File(5000);
        b.addDirectory(file3);

        // b size
        System.out.println(b.getSize());
    }
}

abstract class Directory {
    public abstract double getSize();
}

class File extends Directory{
    private double size;

    public File(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}

class Folder extends Directory {
    private ArrayList<Directory> directories = new ArrayList<>();

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public double getSize() {
        double size = 0;
        for(Directory dir: directories) {
            size += dir.getSize();
        }
        return size;
    }
}