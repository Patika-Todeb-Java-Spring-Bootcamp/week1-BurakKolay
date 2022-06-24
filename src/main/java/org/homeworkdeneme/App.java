package org.homeworkdeneme;

import org.homeworkdeneme.Consumer.Consumer;
import org.homeworkdeneme.Producer.Producer;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        Consumer consumer = new Consumer();
        Producer producer = new Producer();
        producer.Write();
        consumer.Read();

    }
}
