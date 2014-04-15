package model;

import java.util.*;

import model.enums.EItem;

public class Ingredients extends LinkedHashSet<Item> {

	private static final long serialVersionUID = 8982033548147523728L;

	 public Ingredients() {
	 super();
	 }

	 public Ingredients(Collection<? extends Item> c) {
	 super(c);
	 }

	@Override
	public Ingredients clone() {
		Ingredients i = (Ingredients) super.clone();
		/*
		 * i.clear(); for (Item item : this) { i.add(item.clone()); }
		 */

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

	public Item get(int index) {

		ArrayList<Item> i = new ArrayList<>(this);
		return i.get(index);

	}

	/**
	 * Ajoute � la liste l'item sp�cifi� en param�tre, ou ajoute � l'item d�j�
	 * pr�sent la quantit� du param�tre
	 *
	 * @param item
	 *            l'item � ajouter
	 * @param ajout
	 *            ajouter la quantit� ?
	 */
	public void add(Item item, boolean ajout) {
		boolean supAjout = super.add(item);
		if (ajout && !supAjout) {
			Item current = get(item.getItem());
			current.setQuantite(current.getQuantite() + item.getQuantite());
		}
	}

	/**
	 * Soustrait chaque item de la liste des �l�ments "restants" � la liste
	 * actuelle
	 *
	 * @param restant
	 */
	public void substract(Ingredients restant) {

		for (Iterator<Item> it = this.iterator(); it.hasNext();) {
			Item item = it.next();
			if (restant.contains(item)) {
				Item rest = restant.get(item.getItem());
				int min = Math.min(rest.getQuantite(), item.getQuantite());
				item.setQuantite(item.getQuantite() - min);
				rest.setQuantite(rest.getQuantite() - min);
			}
		}

	}

	public void addAll(Ingredients i, boolean ajout) {
		for (Iterator<Item> it = i.iterator(); it.hasNext();) {
			Item item = it.next();
			add(item, ajout);
		}
	}

	public void nettoyage() {
		for (Iterator<Item> it = this.clone().iterator(); it.hasNext();) {
			Item item = it.next();
			if (item.getQuantite() == 0) {
				this.remove(item);
			}
		}
	}

}
