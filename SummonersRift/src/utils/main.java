package utils;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import controller.ControllerMatch;
import models.Champions;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CriaChampions c = new CriaChampions();
		
		ArrayList<Champions> blueTeam = c.getBlueTeam();
		ArrayList<Champions> redTeam = c.getRedTeam();
		
		ControllerMatch controll = new ControllerMatch();
		
		System.out.println(controll.getMatch(1));
		System.out.println(controll.criaMatch(1, blueTeam, redTeam));
		System.out.println(controll.getMatch(1));
		System.out.println(controll.criaMatch(2, blueTeam, redTeam));
		System.out.println(controll.getMatch(2));
	}

}
