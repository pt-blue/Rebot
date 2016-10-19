package bot.hackathon.entity;

import java.util.Date;

public class Reservation {

	private String origin;
	private String destination;
	private Date deptdate;
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDeptdate() {
		return deptdate;
	}
	public void setDeptdate(Date deptdate) {
		this.deptdate = deptdate;
	}
	
	
}
