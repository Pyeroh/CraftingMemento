package model;

import model.enums.EItem;

public class Item {
	
	private EItem item;
	private int quantite;
	
	public Item(EItem item, int quantite) {
		this.item = item;
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public EItem getItem() {
		return item;
	}
	
}
