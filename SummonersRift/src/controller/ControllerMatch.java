package controller;

import java.util.ArrayList;

import models.Champions;
import models.Match;

public class ControllerMatch {
	// Armazenei as matches aqui pq estava com preguiça de fazer um singleton
	private ArrayList<Match> Matches = new ArrayList<Match>(); 

	public boolean criaMatch(int id, ArrayList<Champions> blueTeam, ArrayList<Champions> redTeam) {
		Match match = new Match(id, blueTeam, redTeam);
		Matches.add(match);
		return true;
	}
	
	public Match getMatch(int id) {
		for(int i = 0; i < Matches.size(); i++){
			if(Matches.get(i).getId() == id) {
				return Matches.get(i);
			}
		}
		return null;
	}

	public boolean deleteMatch(int id) {
		for(int i = 0; i < Matches.size(); i++){
			if(Matches.get(i).getId() == id) {
				Matches.remove(Matches.get(i));
				return true;
			}
		}
		
		return false;
	}
}
