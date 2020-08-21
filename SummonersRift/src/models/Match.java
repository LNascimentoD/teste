package models;

import java.util.ArrayList;

public class Match {
	private int id;
	private ArrayList<Champions> blueTeam;
	private ArrayList<Champions> redTeam;
	private String time;
	
	public Match(int id, ArrayList<Champions> blueTeam, ArrayList<Champions> redTeam) {
		this.id = id;
		this.blueTeam = blueTeam;
		this.redTeam = redTeam;
		this.time = "";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Champions> getBlueTeam() {
		return blueTeam;
	}
	public void setBlueTeam(ArrayList<Champions> blueTeam) {
		this.blueTeam = blueTeam;
	}
	public ArrayList<Champions> getRedTeam() {
		return redTeam;
	}
	public void setRedTeam(ArrayList<Champions> redTeam) {
		this.redTeam = redTeam;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
