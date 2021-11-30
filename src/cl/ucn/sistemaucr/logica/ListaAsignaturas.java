package cl.ucn.sistemaucr.logica;

import cl.ucn.sistemaucr.dominio.Asignatura;

public class ListaAsignaturas {
	private Asignatura[] lista;
	private int cantElem;
	private int max;
	
	public ListaAsignaturas(int max) {
		lista = new Asignatura[max];
		cantElem = 0;
		this.max = max;
	}
	
	public int getCantAsignaturas() {
		return cantElem;
	}
	
	public boolean ingresarAsignatura(Asignatura obj) {
		if (cantElem < max) {
			lista[cantElem] = obj;
			cantElem++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int indexOf(String codigo) {
		for (int i = 0; i < cantElem; i++) {
			if (lista[i].getCodigo().equals(codigo)) {
				return i;
			}
		}
		return -1;
	}
	
	public Asignatura getAsignaturaAt(int i) {
		if (i >= 0 && i < cantElem) {
			return lista[i];
		}
		else {
			return null;
		}
	}
	public Asignatura buscarAsignatura(String codigo) {
		for (int i = 0; i < cantElem; i++) {
			if (lista[i].getCodigo().equals(codigo)) {
				return lista[i];
			}
		}
		return null;
	}
}
