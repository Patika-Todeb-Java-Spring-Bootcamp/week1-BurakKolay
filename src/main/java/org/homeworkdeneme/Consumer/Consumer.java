package org.homeworkdeneme.Consumer;

import java.io.*;

public class Consumer {
    public void Read() throws IOException {
        File file = new File("score.txt");
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);

        if(!file.exists()){
            file.createNewFile();
        }
        String line;

        if (((line = bReader.readLine()) != null)){
            System.out.println(line);
            bReader.close();
        }
    }
}
