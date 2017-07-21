package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Builder;
import org.amupoti.boardgames.timestories.model.token.RoundTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenType;

/**
 * Created by amupoti on 20/07/2017.
 */
@Builder
public class ActionCondition {

    private int itemRequired;
    //TODO: model also when round tokens are required, color and quantity
    private SquareTokenColor squareTokenColor;
    private SquareTokenType squareTokenType;
    private RoundTokenColor roundTokenColor;
    private int roundTokensRequired;
    @Builder.Default
    private boolean passCustomTest = false;
    private int spendTimeUnits;
}
