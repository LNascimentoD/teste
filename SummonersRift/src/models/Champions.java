package models;

import java.util.ArrayList;

public class Champions {
	private int id;
	private String nome;
	private String funcao;
	private ArrayList<String> skills;
	
	public Champions(int id, String nome, String funcao) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.skills = new ArrayList<String>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
}
