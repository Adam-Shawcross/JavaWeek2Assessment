package com.qa.TheInfiniteTessalatingSwamp;

public class Compass{

	public double treasureDistance(int player_X,int player_Y, int treasure_X, int treasure_Y ) 
	{
		
		int x_distance = (player_X - treasure_X);
		int y_distance = (player_Y - treasure_Y);
		int x_squared = (x_distance)*(x_distance);
		int y_squared =(y_distance)*(y_distance);
		
		double distance = Math.sqrt((x_squared) + (y_squared));  
		
		
		return distance;
		
	}
	
	
}
