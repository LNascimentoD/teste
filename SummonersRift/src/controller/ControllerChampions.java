package controller;

import java.util.ArrayList;

import models.Champions;

public class ControllerChampions {
	private ArrayList<Champions> Champions = new ArrayList<Champions>();
	
	public boolean criaChampion(int id, String nome, String funcao) {
		Champions c1 = new Champions(id, nome, funcao);
		Champions.add(c1);
		
		return true;
	}
	
	public boolean editarChampion(int id, String nome, String funcao) {
		for(int i = 0; i < Champions.size(); i++){
			if(Champions.get(i).getId() == id) {
				Champions.get(i).setNome(nome);
				Champions.get(i).setFuncao(funcao);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean deleteChampion(int id) {
		for(int i = 0; i < Champions.size(); i++){
			if(Champions.get(i).getId() == id) {
				Champions.remove(Champions.get(i));
				return true;
			}
		}
		
		return false;
	}
	
	public Champions getChampion(int id) {
		for(int i = 0; i < Champions.size(); i++){
			if(Champions.get(i).getId() == id) {
				return Champions.get(i);
			}
		}
		return null;
	}
}
