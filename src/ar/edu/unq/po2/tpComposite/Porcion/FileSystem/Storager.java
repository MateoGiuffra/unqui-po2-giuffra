package ar.edu.unq.po2.tpComposite.Porcion.FileSystem;

import java.time.LocalTime;

public abstract class Storager implements FileSystem{
	private String name;
	private LocalTime date;
	
	public Storager(String name, LocalTime date) {
		super();
		this.setDate(date);
		this.setName(name);
	}
	public abstract double getSizeStorage();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getDate() {
		return date;
	}
	public void setDate(LocalTime date) {
		this.date = date;
	}
	
	
}
