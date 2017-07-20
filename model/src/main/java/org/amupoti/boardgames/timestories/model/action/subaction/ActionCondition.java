package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Builder;

/**
 * Created by amupoti on 20/07/2017.
 */
@Builder
public class ActionCondition {

    private int itemRequired;
    //TODO: model also when round tokens are required, color and quantity
}
