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

		return i;
	}

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = size();

		result = prime * result;

		for (Iterator<Item> it = this.iterator(); it.hasNext();) {
			Item type = it.next();
			result += type.hashCode();
		}

		return result;*/
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	public Item get(EItem eitem) {

		nettoyage();

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

		nettoyage();

		ArrayList<Item> i = new ArrayList<>(this);
		return i.get(index);

	}

	/**
	 * Ajoute à la liste l'item spécifié en paramètre, ou ajoute à l'item déjà
	 * présent la quantité du paramètre
	 *
	 * @param item
	 *            l'item à ajouter
	 * @param ajout
	 *            ajouter la quantité ?
	 */
	public void add(Item item, boolean ajout) {

		nettoyage();

		boolean supAjout = super.add(item);
		if (ajout && !supAjout) {
			Item current = get(item.getItem());
			current.setQuantite(current.getQuantite() + item.getQuantite());
		}
	}

	/**
	 * Soustrait chaque item de la liste des éléments "restants" à la liste
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

		nettoyage();

	}

	public void addAll(Ingredients i, boolean ajout) {
		if (this.isEmpty()) {
			addAll(i);
			return;
		}

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
