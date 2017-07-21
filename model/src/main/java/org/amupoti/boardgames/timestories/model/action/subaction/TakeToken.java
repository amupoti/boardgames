package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Builder;
import lombok.Singular;
import org.amupoti.boardgames.timestories.model.token.SquareTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenType;

import java.util.List;

/**
 * Created by amupoti on 18/07/2017.
 */
@Builder
public class TakeToken extends SubAction {

    @Singular
    private List<ActionCondition> actionConditions;
    private SquareTokenColor squareTokenColor;
    private SquareTokenType squareTokenType;
}
