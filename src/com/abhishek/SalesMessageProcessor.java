package com.abhishek;

import java.io.BufferedReader;
import java.io.FileReader;


public class SalesMessageProcessor {

	public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            String line;
            @SuppressWarnings("resource")
			BufferedReader inputFile = new BufferedReader(new FileReader("InputFiles/input.txt"));
            
            while((line = inputFile.readLine()) != null) {
                sale.processNotification(line);
                sale.log.report();
            }
            
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
