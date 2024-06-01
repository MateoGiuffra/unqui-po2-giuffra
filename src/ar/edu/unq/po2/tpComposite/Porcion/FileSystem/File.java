package ar.edu.unq.po2.tpComposite.Porcion.FileSystem;

import java.time.LocalTime;

//Un archive debe ser capaz de responder al nombre, la cantidad
//de espacio en disco que ocupa y la fecha de la ultima modificación.
public class File extends Storager {

	public File(String name, LocalTime date) {
		super(name, date);
	}


	private double storage;
	
	
	@Override
	public double getSizeStorage() {
		// TODO Auto-generated method stub
		return this.storage;
	}


	@Override
	public double totalSize() {
		// TODO Auto-generated method stub
		return this.storage;
	}


	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Storager lastModified() {
		// TODO Auto-generated method stub
		return this;
	}


	@Override
	public Storager oldestElement() {
		// TODO Auto-generated method stub
		return this;
	} 

	

	
	
}
