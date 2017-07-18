package org.amupoti.boardgames.timestories.model.action.subaction;

import lombok.Data;
import org.amupoti.boardgames.timestories.model.token.TokenColor;
import org.amupoti.boardgames.timestories.model.token.TokenType;

/**
 * Created by amupoti on 18/07/2017.
 */
@Data
public class TakeToken extends SubAction {
    private final TokenColor tokenColor;
    private final TokenType tokenType;
}
