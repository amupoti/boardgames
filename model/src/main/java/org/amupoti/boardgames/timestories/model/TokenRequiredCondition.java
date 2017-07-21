package org.amupoti.boardgames.timestories.model;

import lombok.AllArgsConstructor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenType;

/**
 * Created by amupoti on 20/07/2017.
 */
@AllArgsConstructor
public class TokenRequiredCondition {

    private SquareTokenColor squareTokenColor;
    private SquareTokenType squareTokenType;
}
