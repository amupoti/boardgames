package org.amupoti.boardgames.timestories.model.location;


import lombok.Builder;
import lombok.Getter;
import org.amupoti.boardgames.timestories.model.AccessCondition;
import org.amupoti.boardgames.timestories.model.Card;
import org.amupoti.boardgames.timestories.model.Letter;
import org.amupoti.boardgames.timestories.model.Precondition;
import org.amupoti.boardgames.timestories.model.action.Action;

/**
 * Created by amupoti on 15/07/2017.
 */
@Getter
@Builder
public class LocationCard implements Card {

    private int locationNumber;
    private int number;
    @Builder.Default
    private Letter letter = Letter.NO_LETTER;
    @Builder.Default
    private Precondition precondition = Precondition.builder().accessCondition(AccessCondition.NONE).build();
    @Builder.Default
    private Action action = Action.EMPTY;


    public String getUniqueId() {
        return getLocationNumber() + getLetter().name();
    }
}
