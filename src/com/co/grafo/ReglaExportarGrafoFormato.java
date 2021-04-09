package com.co.grafo;

import java.util.ArrayList;

public abstract class ReglaExportarGrafoFormato {

	public ReglaExportarGrafoFormato() {
		// TODO Auto-generated constructor stub
	}

	public abstract void exportar(String grafo);

	public abstract ArrayList<ReglaExportarGrafoFormato> buscarFormato(String formato,
			ArrayList<ReglaExportarGrafoFormato> listaFormatos);

}
