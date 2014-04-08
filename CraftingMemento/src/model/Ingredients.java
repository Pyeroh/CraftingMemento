package model;

import java.util.ArrayList;

import model.enums.EItem;

public class Ingredients extends ArrayList<Item> {

	private static final long serialVersionUID = 8982033548147523728L;

	public boolean containsEItem(EItem e) {
		return indexOf(e) != -1;
	}

	/**
	 * @see Ingredients#indexOf(Object)
	 * @param e
	 * @return
	 */
	public int indexOf(EItem e) {
		int i = 0;
		if (size() == 0) return -1;
		while (get(i).getItem() != e && i < size() - 1) {
			i++;
		}
		if (get(i).getItem() == e) {
			return i;
		}
		else return -1;
	}

	@Override
	public Ingredients clone() {
		Ingredients i = (Ingredients) super.clone();
		
		for (Item item : this) {
			i.add(item);
		}
		
		return i;
	}
	
}
