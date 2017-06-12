package com.abhishek;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.Test;

public class JUnitTesting {

	@Test
	public void test() {
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
