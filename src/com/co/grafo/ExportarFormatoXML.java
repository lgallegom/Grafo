package com.co.grafo;

import java.util.ArrayList;

public class ExportarFormatoXML extends ReglaExportarGrafoFormato {

	

	@Override
	public void exportar(String grafo) {
		
		System.out.println("Se exporta Grafo en Formato XML"+" --"+grafo);

	}

	@Override
	public ArrayList<ReglaExportarGrafoFormato> buscarFormato(String formato,
			ArrayList<ReglaExportarGrafoFormato> listaFormatos) {

		if (formato.equals("XML")) {
			ExportarFormatoXML efxml = new ExportarFormatoXML();
			listaFormatos.add(efxml);

		} else {

		}
		
		return listaFormatos;
	}

}
