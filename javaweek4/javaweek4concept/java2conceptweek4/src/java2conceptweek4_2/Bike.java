package java2conceptweek4_2;

public class Bike {
	private int gear;
	public int speed;
	
	public Bike(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
}
	
class MountainBike extends Bike {
	public int seatHeight;

	public MountainBike(int g, int sp, int seatHeight) {
		super(g, sp);
		this.seatHeight = seatHeight;
	}


}
