package com.qa.TheInfiniteTessalatingSwamp;

import java.util.Scanner;

public class App {

	int a=0;
	
	public static void main(String[] args) {

		// Board gameboard = new Board();
		// Treasure chest = new Treasure();
		Compass pointer = new Compass();
//		Player player = new Player(location);
		App app = new App();

		System.out.println("Enter board size:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();

		// gameboard.boardSize(size);
		// chest.startingPosition(size);
		// player.startingPosition(size);

		int player_X = 0;
		int player_Y = 1;
		int treasure_X = 2;
		int treasure_Y = 4;

		// while(player_X <= size+1 && player_X>=1) {
		// player_X = (int) Math.random();
		// }
		// while(player_Y <= size+1 && player_Y>=1) {
		// player_Y = (int) Math.random();
		// }
		// while(treasure_X <= size+1 && treasure_X>=1) {
		// treasure_X = (int) Math.random();
		// }
		// while(player_X <= size+1 && player_X>=1) {
		// player_X = (int) Math.random();
		// }

		while (pointer.treasureDistance(player_X, player_Y, treasure_X, treasure_Y) != 0) {
			System.out.println("Input move:");
			String direction = sc.nextLine();

			switch (direction) {
			case "N":
				player_Y++;
				System.out.println("You head north");
				app.wrapAround(player_X, player_Y, size);
				break;
			case "S":
				player_Y--;
				System.out.println("You head south");
				app.wrapAround(player_X, player_Y, size);
				break;
			case "E":
				player_X++;
				System.out.println("You head east");
				app.wrapAround(player_X, player_Y, size);
				break;

			case "W":
				player_X--;
				app.wrapAround(player_X, player_Y, size);
				System.out.println("You head west");

				break;
			default:
				System.out.println("Please enter N, E, W or S");
				System.out.println(player_X + "," + player_Y);
			}
			System.out.println(pointer.treasureDistance(player_X, player_Y, treasure_X, treasure_Y));
			System.out.println(player_X + "," + player_Y);
		}
		System.out.println("You WIN!!!");
		sc.close();

		// compass working
		// random funciton for positions not
//		wrap around functin not working
	}

	// board size works kind of
	
	// i know it doesnt mean much but id tried to separate each location into their own class,
//	and try to inherit from a class so i could override the method for player position and treasure postion
//	it failed so i got rid of it for this sorry

	public int wrapAround(int player_X, int player_Y, int size) {
		if (player_X >= size) {
			return player_X = 0;

		} else if (player_X < 0) {
			return player_X = size - 1;
		} else if (player_Y >= size) {
			return player_Y = 0;

		} else if (player_Y < 0) {
			return player_Y = size - 1;
		}else {
			return a=0;
		}
		
	}
}
