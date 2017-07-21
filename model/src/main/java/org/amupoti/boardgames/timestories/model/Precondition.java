package org.amupoti.boardgames.timestories.model;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by amupoti on 17/07/2017.
 */
@Builder
@Getter
public class Precondition {

    private AccessCondition accessCondition;
    private TokenRequiredCondition tokenRequiredCondition;
}
