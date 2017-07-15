package org.amupoti.boardgames.timestories.model;

/**
 * Created by Marcel on 15/07/2017.
 */
public class Item extends Card {
    private final int itemNumber;

    public Item(int cardNumber, int itemNumber) {
        super(cardNumber);
        this.itemNumber = itemNumber;
    }
}
