package org.amupoti.boardgames.timestories.marcycase.location;

import org.amupoti.boardgames.timestories.model.Precondition;
import org.amupoti.boardgames.timestories.model.action.Action;
import org.amupoti.boardgames.timestories.model.action.EscapeCondition;
import org.amupoti.boardgames.timestories.model.action.subaction.*;
import org.amupoti.boardgames.timestories.model.location.Location;
import org.amupoti.boardgames.timestories.model.location.LocationCard;

import java.util.ArrayList;
import java.util.List;

import static org.amupoti.boardgames.timestories.model.AccessCondition.FIRST_MOVE_REQUIRED;
import static org.amupoti.boardgames.timestories.model.Letter.*;
import static org.amupoti.boardgames.timestories.model.token.TokenColor.YELLOW;
import static org.amupoti.boardgames.timestories.model.token.TokenType.TWO;

/**
 * Created by amupoti on 18/07/2017.
 */
public class LocationBuilder {

    public List<Location> buildLocation1() {
        List<LocationCard> cardList = new ArrayList<>();
        //Card A
        cardList.add(LocationCard.builder().number(60).letter(A).build());

        //Card B
        cardList.add(LocationCard.builder()
                .number(61)
                .letter(B)
                .precondition(new Precondition(FIRST_MOVE_REQUIRED))
                .action(Action.builder()
                        .canEscape(EscapeCondition.CANNOT_ESCAPE)
                        .subAction(new Fight())
                        .build())
                .build());
        // Card C
        cardList.add(LocationCard.builder()
                .number(62)
                .letter(C)
                .action(Action.builder()
                        .canEscape(EscapeCondition.CANNOT_ESCAPE)
                        .subAction(new Fight())
                        .subAction(new TakeItem(3))
                        .build())
                .build());
        // Card D
        cardList.add(LocationCard.builder()
                .number(63)
                .letter(D)
                .action(Action.builder()
                        .subAction(new RollingDiceTest())
                        .subAction(new TakeItem(16)) //Flare
                        .subAction(new TakeItem(27)) //Bat
                        .build())
                .build());
        //Card E
        cardList.add(LocationCard.builder()
                .number(64)
                .letter(E)
                .precondition(new Precondition(FIRST_MOVE_REQUIRED))
                .action(Action.builder()
                        .subAction(new Fight())
                        .subAction(new TakeToken(YELLOW, TWO))
                        .build())
                .build());
        //Card F
        cardList.add(LocationCard.builder()
                .number(65)
                .letter(F)
                .action(Action.builder()
                        //TODO: model conditions when taking objects
                        //we need Item number 3 here to get it
                        .subAction(new TakeItem(5)) //Prisoner
                        .build())
                .build());
        //Card F
        cardList.add(LocationCard.builder()
                .number(66)
                .letter(G)
                .action(Action.builder()
                        .subAction(new TakeItem(2)) //Gunshot
                        .build())
                .build());

        Location loc1 = Location.builder()
                .name("Entrada de la ciudad")
                .number(1)
                .locationCardList(cardList)
                .build();
        List<Location> locationList = new ArrayList<>();
        locationList.add(loc1);
        return locationList;
    }

    private List<SubAction> createFightSubAction() {
        List<SubAction> subActionList = new ArrayList<>();
        subActionList.add(new Fight());
        return subActionList;
    }
}
