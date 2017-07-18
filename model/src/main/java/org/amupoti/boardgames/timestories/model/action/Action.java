package org.amupoti.boardgames.timestories.model.action;

import lombok.Builder;
import lombok.Singular;
import org.amupoti.boardgames.timestories.model.action.subaction.SubAction;

import java.util.List;

/**
 * Created by amupoti on 17/07/2017.
 */
@Builder
public class Action {

    public static final Action EMPTY = Action.builder().canEscape(EscapeCondition.CAN_ESCAPE).build();
    private EscapeCondition canEscape;
    @Singular
    private List<SubAction> subActions;

}
