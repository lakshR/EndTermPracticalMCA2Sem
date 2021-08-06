package question3;

import java.io.*;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        question3 q = new question3();
        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\saura\\Desktop\\New folder (2)\\question.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("enter name: ");
                String name = sc.next();
                System.out.println("enter section: ");
                char sec = sc.next().charAt(0);
                System.out.println("enter the roll no: ");
                String roll = sc.next();

                q.insert(name, sec, roll);
                q.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void insert(String name, char sec, String roll) throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter("C:\\Users\\saura\\Desktop\\New folder (2)\\question.txt", true);

            writer.write(name);
            writer.write("  ");
            writer.write(sec);
            writer.write("  ");
            writer.write(roll);
            writer.write("  ");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() throws IOException {
        BufferedReader br1 = null;
        try {
            Reader read = new FileReader("C:\\Users\\saura\\Desktop\\New folder (2)\\question.txt");
            br1 = new BufferedReader(read);
            System.out.println();

            String str;
            while ((str = br1.readLine()) != null) {

                String[] word = str.split("\\|");

                for (String a : word)
                    System.out.print(a + "\t\t\t");

                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br1.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
