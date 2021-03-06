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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Item))
			return false;
		Item other = (Item) obj;
		if (!item.equals(other.item))
			return false;
		return true;
	}

	public int hashCode_wQuantite() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + quantite;
		return result;
	}

	public boolean equals_wQuantite(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Item))
			return false;
		Item other = (Item) obj;
		if (item != other.item)
			return false;
		if (quantite != other.quantite)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return quantite + " " + item.getGuiName();
	}

	@Override
	public Item clone() {
		return new Item(item, quantite);
	}

}
