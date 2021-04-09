package com.co.grafo;

import java.util.ArrayList;

public class manejadorFormatosExportar {
	private ArrayList<ReglaExportarGrafoFormato> listaExportarFormato = new ArrayList<ReglaExportarGrafoFormato>();

	public manejadorFormatosExportar() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<ReglaExportarGrafoFormato> recogerFormato (String formato){
		
		ReglaExportarGrafoFormato exportarFormatoXML = new ExportarFormatoXML();
		return exportarFormatoXML.buscarFormato(formato, listaExportarFormato);
	}

}
