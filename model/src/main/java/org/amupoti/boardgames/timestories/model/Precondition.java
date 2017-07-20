package org.amupoti.boardgames.timestories.model;

import lombok.Builder;

/**
 * Created by amupoti on 17/07/2017.
 */
@Builder
public class Precondition {

    private AccessCondition accessCondition;
    private TokenRequiredCondition tokenRequiredCondition;
}
