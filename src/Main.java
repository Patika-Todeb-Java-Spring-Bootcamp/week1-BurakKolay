import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("score.txt");
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);

        if(!file.exists()){
            file.createNewFile();
        }
        Scanner input = new Scanner(System.in);

        Thread Consumer = new Thread(){
            public void run(){
                String line;
                try {
                    if (((line = bReader.readLine()) != null)){
                        System.out.println(line);
                        bReader.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread Producer = new Thread(){
            public void run(){
                System.out.print("Lütfen 1. Takımın adını yazınız:");
                String team1 = input.next();
                System.out.print("Lütfen 1. Takımın gol sayısını yazınız:");
                int goal1 = input.nextInt();

                System.out.print("Lütfen 2. Takımın adını yazınız:");
                String team2 = input.next();
                System.out.print("Lütfen 2. Takımın gol sayısını yazınız:");
                int goal2 = input.nextInt();

                if(goal1<0||goal2<0){
                    throw new RuntimeException("Hatalı gol sayısı girişi yaptınız");
                }
                try {
                    bWriter.write(team1+" "+goal1+"-"+goal2+" "+team2);
                    bWriter.close();
                    Consumer.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Producer.start();
    }
}