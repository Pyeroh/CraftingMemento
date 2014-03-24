package view.event;

import java.util.EventListener;

import model.enums.EItem;

public interface SearchedItemChangeListener extends EventListener {

	void searchedItemChanged(EItem item);

}
