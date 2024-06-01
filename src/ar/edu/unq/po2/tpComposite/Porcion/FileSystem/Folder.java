package ar.edu.unq.po2.tpComposite.Porcion.FileSystem;

import java.time.LocalTime;
import java.util.List;

//De un Directorio
//debe poder decirse el nombre, la fecha en que fue creado y su contenido: archivos y
//directorios.
public class Folder extends Storager {

	private List<Storager> storagers;
	
	public Folder(String name, LocalTime date) {
		super(name, date);
		this.storagers = storagers;
	}


	
	@Override
	public double getSizeStorage() {
		return this.storagers.stream().mapToDouble(s -> s.getSizeStorage()).sum();
	}


	@Override
	public double totalSize() {
		// TODO Auto-generated method stub
		return this.getSizeStorage();
	}


	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Storager lastModified() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Storager oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}


}
