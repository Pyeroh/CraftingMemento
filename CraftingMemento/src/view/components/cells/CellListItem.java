package view.components.cells;

import model.Item;

public class CellListItem extends CellListEItem {

	private static final long serialVersionUID = 5471797674503281211L;
	private Item item;

	public CellListItem(Item item) {
		super(item.getItem());
		this.item = item;

		lib_desc.setText(this.item.getItem().getGuiName() + (item.getQuantite()!=1 ? " x"+item.getQuantite() : ""));

	}

	public Item getItem() {
		return item;
	}

}