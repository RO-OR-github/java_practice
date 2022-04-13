package javaweek3practice_3;

class Distance {
	private String name; //이름
	private int dist;    //통학거리
	
	
	public Distance(String name, int dist) {
		this.name = name;
		this.dist = dist;
	}
	
	
	@Override
	public String toString() {
		return "Distance [이름=" + name + ", 통학거리=" + dist + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDist() {
		return dist;
	}


	public void setDist(int dist) {
		this.dist = dist;
	}	
	
}

