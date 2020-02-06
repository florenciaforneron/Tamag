package com.cdainfo.tamag.estados;

import com.cdainfo.tamag.Tamag;

public class Estado {
	
	protected Tamag miTamag;
	
	public Estado() {
		miTamag.setEstado(new Aburrido());
		this.miTamag = miTamag;
		
	}

	public void actualizar(Tamag miTamag) {
		miTamag.getEstado();
	}
/*	public void jugar();
	public void comer();
	public void dormir();
*/	
	
}
