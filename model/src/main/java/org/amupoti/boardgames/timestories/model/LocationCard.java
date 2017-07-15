package org.amupoti.boardgames.timestories.model;


import lombok.Getter;

/**
 * Created by Marcel on 15/07/2017.
 */
@Getter
public class LocationCard extends Card {

    private final Letter letter;
    private final AccessCondition accessCondition;

    public LocationCard(int number, Letter letter, AccessCondition accessCondition) {
        super(number);
        this.letter = letter;
        this.accessCondition = accessCondition;
    }
}
