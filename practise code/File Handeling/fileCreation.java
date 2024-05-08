import java.io.File;
import java.io.IOException;

class FileCreation {
    public static void main(String[] args) {
        File newFile = new File("example.txt");

        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

