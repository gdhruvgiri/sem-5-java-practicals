import java.io.*;

public class pr30 {
    public static void main(String[] cf) {
        try {
            // Creating new Text file
            File cg = new File("./pr30.txt");

            if (!cg.exists()) {
                cg.createNewFile();
                System.out.println("File created Successfully.");
            }
            FileOutputStream ch = new FileOutputStream("./pr30.txt");
            // Writing to new Text file
            String s = "Dhruvgiri is great.";
            byte b[] = s.getBytes();
            ch.write(b);
            ch.close();
            System.out.println("Writing Complete!");
            FileInputStream fin = new FileInputStream("./pr30.txt");

            // Reading from Text file
            int ci;
            while ((ci = fin.read()) != -1) {
                System.out.print((char) ci);
            }
            fin.close();
            ch = new FileOutputStream("./pr30.txt");
            // Modifying Text file
            s = "I'm Dhruvgiri";
            b = s.getBytes();
            ch.write(b);
            ch.close();
            System.out.println("\n Modification Complete!");
            fin = new FileInputStream("./pr30.txt");
            // Reading from Text file
            while ((ci = fin.read()) != -1) {
                System.out.print((char) ci);
            }
            fin.close();
        }

        catch (IOException e) {
            System.out.println("I/O Exception occurred.");
        }
    }
}