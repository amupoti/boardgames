package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Builder;

/**
 * Created by amupoti on 21/07/2017.
 */
@Builder
public class TwoOptionSubAction extends SubAction {

    private SubAction subAction;
    private SubAction alternateSubAction;
}
