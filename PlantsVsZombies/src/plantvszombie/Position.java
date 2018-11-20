package plantvszombie;

public class Position {
	private double positionX;
	private double positionY;
	
	public Position(double x, double y){
		positionX=x;
		positionY=y;
	}
	
	public double getX(){
		return positionX;
	}
	
	public double getY(){
		return positionY;
	}
	
	public boolean equals(Position p){
		return (this.positionX==p.positionX && this.positionY==p.positionY);
	}

	public void setY(double y) {
		// TODO Auto-generated method stub
		this.positionY = y;
	}

	public void setX(double x) {
		// TODO Auto-generated method stub
		this.positionX = x;
	}
	
	public String toString(){
		return null;
	}
}
