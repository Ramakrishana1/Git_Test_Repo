package com.org.lockedme;

public class LockedMeMain {
	
public static void main(String[] args) {
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LOCKEDME", "RAMAKRISHNA");
		
		HandleOptions.handleWelcomeScreenInput();
	}


}
