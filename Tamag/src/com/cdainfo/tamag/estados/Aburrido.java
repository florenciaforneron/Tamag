package com.cdainfo.tamag.estados;

import com.cdainfo.tamag.Tamag;

public class Aburrido extends Estado{
	
	public Aburrido() {
		super();
	}

	@Override
	public void actualizar(Tamag miTamag) {
		System.out.println("Quiero jugar!");
		miTamag.setEstado(new Hambriento());
		
	}


}
