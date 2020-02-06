package com.cdainfo.tamag.estados;

import com.cdainfo.tamag.Tamag;

public class Hambriento extends Estado{

	@Override
	public void actualizar(Tamag miTamag) {
		System.out.println("Quiero comer!");
		miTamag.setEstado(new Cansado());
	}

	

}
