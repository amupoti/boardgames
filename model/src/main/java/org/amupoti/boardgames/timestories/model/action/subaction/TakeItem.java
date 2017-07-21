package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

/**
 * Created by amupoti on 18/07/2017.
 */
@Builder
@Getter
public class TakeItem extends SubAction {

    private int itemNumber;
    @Singular
    private List<ActionCondition> actionConditions;

}
