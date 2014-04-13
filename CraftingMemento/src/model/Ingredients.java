package model;

import java.util.*;

import model.enums.EItem;

public class Ingredients extends LinkedHashSet<Item> {

	private static final long serialVersionUID = 8982033548147523728L;

	@Override
	public Ingredients clone() {
		Ingredients i = (Ingredients) super.clone();
		i.clear();
		for (Item item : this) {
			i.add(item.clone());
		}

		return i;
	}

	public Item get(EItem eitem) {

		Iterator<Item> it = this.iterator();

		if (!it.hasNext())
			return null;

		Item item = it.next();

		while (it.hasNext() && item.getItem() != eitem) {
			item = it.next();
		}

		if (item.getItem() == eitem)
			return item;

		else
			return null;

	}

	/**
	 * Ajoute � la liste l'item sp�cifi� en param�tre, ou ajoute � l'item d�j�
	 * pr�sent la quantit� du param�tre
	 *
	 * @param item l'item � ajouter
	 * @param ajout ajouter la quantit� ?
	 */
	public void add(Item item, boolean ajout) {
		add(item);
		if (ajout) {
			Item current = get(item.getItem());
			current.setQuantite(current.getQuantite() + item.getQuantite());
		}

	}

}
