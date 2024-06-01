package ar.edu.unq.po2.tpComposite.Porcion.FileSystem;

public interface FileSystem {
	/**
	 * Retorna el total ocupado en disco del receptor. Expresado en cantidad de
	 * bytes.
	 */
	public double totalSize();

	/**
	 * Imprime en consola el contenido indicando el nombre del elemento e
	 * indentandolo con tantos espacios como profundidad en la estructura.
	 */
	public void printStructure();

	/**
	 * Elemento mas nuevo
	 */
	public Storager lastModified();

	/**
	 * Elemento mas antiguo
	 */
	public Storager oldestElement();

}