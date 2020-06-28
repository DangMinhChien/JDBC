package com.laptrinhjavaweb.main;

public class Main {
	public static void main(String[] args) {
		String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
            int choise = Menu.menu();
            switch (choise) {
            case 1:
                GetAll.getAll();
                break;
              case 2:
                Save.save();
                break;
              case 3:
                Update.update();
                break;
              case 4:
                Delete.delete();
                break;
              case 5:
                System.exit(0);
                break;
        }
                  
            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
        Console.displayLine("Bye!");
	}
}
