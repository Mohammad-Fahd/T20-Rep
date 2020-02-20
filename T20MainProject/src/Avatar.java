
public class Avatar {
	private String name = "DEF";
	private int health = 1;
	private int score = 0;
	private int xCoord;
	private int yCoord;
	
	public Avatar(int xCoord, int yCoord, String name) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.name = name;
	}
	
	public Avatar(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	//REQUIREMENT : char direction must be capitalized.
	private void move(char direction) {
		int movement = direction;
		try {
			switch(movement) {
			//Direction = 'U'
			case 85:
				//x,y
				yCoord -= 1;
				break;
			//Direction = 'D'
			case 68:
				//x,y
				yCoord += 1;
				break;
			//Direction = 'R'
			case 76:
				xCoord -= 1;
				break;
			//Direction = 'L'
			case 82:
				xCoord += 1;
				break;
			}
		} catch (Exception e) {
			// No Changes
		}
	}
	
	//getLocation() --> X and Y
	private int getXCoord() {
		return(xCoord);
	}
	
	private int getYCoord() {
		return(yCoord);
	}
	
	//Update Score: 'change' will have to be positive
	//when moving forwards, and negative when moving back.
	private void updateScore(int change) {
		score += change;
	}
	
	//Update Health: Based off of the other class, if the frog
	//touches something lethal, 'change' should be negative.
	private void updateHealth(int change) {
		health += change;
	}
	
	private int getHealth() {
		return(health);
	}
	
}
