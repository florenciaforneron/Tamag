package com.cdainfo.tamag.estados;

import com.cdainfo.tamag.Tamag;

public class Cansado extends Estado{

	@Override
	public void actualizar(Tamag miTamag) {
		System.out.println("Quiero dormir!");
	}


}
