package Bibliothéque;

import java.util.Arrays;

public class Library {
	private int id;
	private String name;
	private String address ;
	private String numTel ;
	private book [] tab;
	private Rent [] tab1;
	
	
	public Library(int id, String name, String address, String numTel, book[] tab, Rent[] tab1) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.numTel = numTel;
		this.tab = tab;
		this.tab1 = tab1;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public book[] getTab() {
		return tab;
	}


	public void setTab(book[] tab) {
		this.tab = tab;
	}


	public Rent[] getTab1() {
		return tab1;
	}


	public void setTab1(Rent[] tab1) {
		this.tab1 = tab1;
	}


	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", address=" + address + ", numTel=" + numTel + ", tab="
				+ Arrays.toString(tab) + ", tab1=" + Arrays.toString(tab1) + "]";
	}
	
	
	
}
