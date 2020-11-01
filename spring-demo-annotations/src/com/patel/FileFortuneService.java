package com.patel;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;



@Component
public class FileFortuneService implements FortuneService{

	private File file = new File("src/com/patel/fortune.txt");
 	private Random random = new Random();
	private List<String> theFortunes;
	
	public FileFortuneService() {
		theFortunes = new ArrayList<>();
		if (file.exists()) {
			try {
				Scanner scanner = new Scanner(file);
				while(scanner.hasNext()) {
					theFortunes.add(scanner.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = random.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}
}
