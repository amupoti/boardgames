package org.amupoti.boardgames.timestories.model.location;


import lombok.Builder;
import org.amupoti.boardgames.timestories.model.AccessCondition;
import org.amupoti.boardgames.timestories.model.Card;
import org.amupoti.boardgames.timestories.model.Letter;
import org.amupoti.boardgames.timestories.model.Precondition;
import org.amupoti.boardgames.timestories.model.action.Action;

/**
 * Created by amupoti on 15/07/2017.
 */
@Builder
public class LocationCard implements Card {

    private int number;
    @Builder.Default
    private Letter letter = Letter.NO_LETTER;
    @Builder.Default
    private Precondition precondition = new Precondition(AccessCondition.NONE);
    @Builder.Default
    private Action action = Action.EMPTY;


}
