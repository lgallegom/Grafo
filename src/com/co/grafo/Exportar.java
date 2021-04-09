package com.co.grafo;

import java.util.ArrayList;

public class Exportar {
	private Grafo gf = new Grafo();
	private String grafo;
	private ArrayList<ReglaExportarGrafoFormato> listaExportarFormato = new ArrayList<ReglaExportarGrafoFormato>();
	private manejadorFormatosExportar mfe = new manejadorFormatosExportar();

	public Exportar() {
		// TODO Auto-generated constructor stub
	}
	
	public void exportarFormato(String formato) {
		
		listaExportarFormato = mfe.recogerFormato(formato);
		grafo = gf.getGrafo();
		int i =0;
		while (i < listaExportarFormato.size() ) {
			
			listaExportarFormato.get(i).exportar(grafo);
			i++;
		}
		
	}

}
