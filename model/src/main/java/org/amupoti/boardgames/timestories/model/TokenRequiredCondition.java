package org.amupoti.boardgames.timestories.model;

import lombok.AllArgsConstructor;
import org.amupoti.boardgames.timestories.model.token.TokenColor;
import org.amupoti.boardgames.timestories.model.token.TokenType;

/**
 * Created by amupoti on 20/07/2017.
 */
@AllArgsConstructor
public class TokenRequiredCondition {

    private TokenColor tokenColor;
    private TokenType tokenType;
}
