package model;

import java.util.Comparator;

public class CompAuMu implements Comparator <Agrupaciones>{

	

	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {
		int comp = 0;
		if( o1 != null && o2 != null) 
		comp = o1.getAutorMusica().compareTo(o2.getAutorMusica());
		return comp;
	}
	
	
}
