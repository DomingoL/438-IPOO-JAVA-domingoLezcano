package com.domingolezcano.ipoo.repuestos.datos.cliente;
//inicio de la clase
//visibilidad, nombre de la clase
public class Cliente {
private int id;
private String nroDoc;
private String tipoDoc;
private String nobmre;
private String direccion;
private String telefono;
private String password;

//constructor1
public Cliente(){
	
}


//constructor2
public Cliente(int id, String nroDoc, String tipoDoc, String nobmre, String direccion, String telefono,
		String password) {
	super();
	this.id = id;
	this.nroDoc = nroDoc;
	this.tipoDoc = tipoDoc;
	this.nobmre = nobmre;
	this.direccion = direccion;
	this.telefono = telefono;
	this.password = password;
}

//metodos
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNroDoc() {
	return nroDoc;
}


public void setNroDoc(String nroDoc) {
	this.nroDoc = nroDoc;
}


public String getTipoDoc() {
	return tipoDoc;
}


public void setTipoDoc(String tipoDoc) {
	this.tipoDoc = tipoDoc;
}


public String getNobmre() {
	return nobmre;
}


public void setNobmre(String nobmre) {
	this.nobmre = nobmre;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}




}

//fin de la clase