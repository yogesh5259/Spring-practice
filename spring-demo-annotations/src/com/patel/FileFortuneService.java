package com.patel;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;



@Component
public class FileFortuneService implements FortuneService{

	private File file = new File("src/com/patel/fortune.txt");
 	private Random random = new Random();
	private List<String> theFortunes;
	
	public FileFortuneService() {
		System.out.println("Inside default constructor of FileFortuneService()");
	}
	
	@PostConstruct
	public void loadFile() {
		System.out.println("Loading Fortune From the File...");
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
		System.out.println("Loading from file is completed...");
	}
	
	@PreDestroy
	public void closeFile() {
		System.out.println("End of FileFortuneService instance!");
	}
	
	
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = random.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}
}
