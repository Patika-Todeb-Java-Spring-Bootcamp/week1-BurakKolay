package org.homeworkdeneme.Producer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer {
    public void Write() throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File("score.txt");
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        if(!file.exists()){
            file.createNewFile();
        }
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

        bWriter.write(team1+" "+goal1+"-"+goal2+" "+team2);
        bWriter.close();
    }
}
