import java.io.File;

class GetFilesList {

    static int filesCount;
    static int foldersCount;
    static int imageCount;
    static int mp3Count;
    static int cCount;
    static int cppCount;
    static int javaCount;

    public static void main(String[] args) {
        String sourceDirectory = "/home/samyak/Desktop/Samyak";
        getFilesFolder(sourceDirectory);
        System.out.println("Total files: " + filesCount);
        System.out.println("Total folders: " + foldersCount);
        System.out.println("Total images: " + imageCount);
        System.out.println("Total mp3 files: " + mp3Count);
        System.out.println("Total C files: " + cCount);
        System.out.println("Total C++ files: " + cppCount);
        System.out.println("Total Java files: " + javaCount);
    }

    public static void getFilesFolder(String path) {
        File directory = new File(path);
        File[] filesList = directory.listFiles();

        if (filesList != null) {
            for (File file : filesList) {
                if (file.isFile()) {
                    filesCount++;
                    System.out.println("File: " + file.getAbsolutePath());

                    String fileName = file.getName().toLowerCase();
                    if (fileName.endsWith(".png") || fileName.endsWith(".jpeg")) {
                        imageCount++;
                    } else if (fileName.endsWith(".mp3")) {
                        mp3Count++;
                    } else if (fileName.endsWith(".c")) {
                        cCount++;
                    } else if (fileName.endsWith(".cpp")) {
                        cppCount++;
                    } else if (fileName.endsWith(".java")) {
                        javaCount++;
                    }
                } else if (file.isDirectory()) {
                    foldersCount++;
                    System.out.println("Folder: " + file.getAbsolutePath());
                    getFilesFolder(file.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Maybe the path you provided is wrong! Provide the correct path.");
        }
    }
}

