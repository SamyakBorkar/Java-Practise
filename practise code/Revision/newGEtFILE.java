import java.io.File;

class GetFilesList {

    static int filesCount;
    static int foldersCount;
    static int imageFilesCount;
    static int musicFilesCount;

    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "/home/samyak/Desktop/Samyak/JAVA/practise code/Revision";
        // calling the function
        getFilesFolder(directoryPath);
        System.out.println("Total files: " + filesCount);
        System.out.println("Total folders: " + foldersCount);
        System.out.println("Total image files: " + imageFilesCount);
        System.out.println("Total music files: " + musicFilesCount);
    }

    public static void getFilesFolder(String path) {
        // Create a File object with the given path
        File directory = new File(path);
        // Create an array of filesList using .listFiles() method of File object
        File[] filesList = directory.listFiles();

        // Check if list is not null otherwise terminate program
        if (filesList != null) {
            // Iterate through each File object in the array
            for (File file : filesList) {
                if (file.isFile()) {
                    filesCount++;
                    System.out.println("File: " + file.getName());

                    // Check for image files
                    if (file.getName().toLowerCase().matches(".*\\.(jpg|jpeg|png|gif|bmp)$")) {
                        imageFilesCount++;
                    }

                    // Check for music files
                    if (file.getName().toLowerCase().matches(".*\\.(mp3|wav|flac|aac|ogg)$")) {
                        musicFilesCount++;
                    }

                } else if (file.isDirectory()) {
                    foldersCount++;
                    System.out.println("Folder: " + file.getName());

                    // Recursively get the list of files/folders in this folder
                    getFilesFolder(file.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Maybe the path you provided is wrong! Provide the correct path.");
        }
    }
}

