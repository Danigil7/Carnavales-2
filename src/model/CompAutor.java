package model;

import java.util.Comparator;

public class CompAutor implements Comparator<Agrupaciones> {

	@Override
	public int compare(Agrupaciones o1, Agrupaciones o2) {

		int comp = 0;
		if( o1 != null && o2 != null) 
		comp = o1.getAutor().compareTo(o2.getAutor());

		return comp;
	}

}
