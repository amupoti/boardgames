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
import static org.amupoti.boardgames.timestories.model.AccessCondition.TOKEN_REQUIRED;
import static org.amupoti.boardgames.timestories.model.Letter.*;
import static org.amupoti.boardgames.timestories.model.token.TokenColor.*;
import static org.amupoti.boardgames.timestories.model.token.TokenType.ONE;
import static org.amupoti.boardgames.timestories.model.token.TokenType.TWO;

/**
 * Created by amupoti on 18/07/2017.
 */
public class LocationBuilder {

    public List<Location> buildLocations() {

        List<Location> locationList = new ArrayList<>();
        locationList.add(buildLocation1());
        locationList.add(buildLocation2());
        return locationList;
    }

    private Location buildLocation2() {

        List<LocationCard> cardList = new ArrayList<>();
        //Card A
        int locNumber = 2;
        cardList.add(LocationCard.builder()
                .number(67)
                .locationNumber(locNumber)
                .letter(A)
                .build());

        //Card B
        cardList.add(LocationCard.builder()
                .number(68)
                .locationNumber(locNumber)
                .letter(B)
                .action(Action.builder()
                        //TODO there is a condition to get the token (3 green tokens). Add logic to model this
                        .subAction(new TakeToken(BLACK, ONE))
                        .build())
                .build());

        //Card C
        cardList.add(LocationCard.builder()
                .number(69)
                .locationNumber(locNumber)
                .letter(C)
                .action(Action.EMPTY)
                //TODO: There is some clue in the text, not sure if we should model this
                .build());

        //Card D
        cardList.add(LocationCard.builder()
                .number(70)
                .locationNumber(locNumber)
                .letter(D)
                .action(Action.builder()
                        //TODO there is a condition to get the token (item 23). Add logic to model this
                        .subAction(new TakeToken(BLUE, TWO))
                        .build())
                .build());

        //Card E
        cardList.add(LocationCard.builder()
                .number(71)
                .locationNumber(locNumber)
                .letter(E)
                .action(Action.EMPTY)
                //TODO: There is change to recover health using time units. Model this?
                .build());


        //Card F
        cardList.add(LocationCard.builder()
                .number(72)
                .locationNumber(locNumber)
                .letter(F)
                //TODO: we need to indicate that we need the token black one token
                .precondition(new Precondition(TOKEN_REQUIRED))
                .action(Action.builder()
                        .subAction(new Fight())
                        .build())
                .build());

        //Card G
        cardList.add(LocationCard.builder()
                .number(73)
                .locationNumber(locNumber)
                .letter(G)
                //TODO: we need to indicate that we need the token blue two
                .precondition(new Precondition(TOKEN_REQUIRED))
                .action(Action.builder()
                        .subAction(new TakeItem(4)) //This is location 7, the lab
                        //TODO: add logic so we can indicate this is a new location
                        .build())
                .build());


        //Build location
        Location loc = Location.builder()
                .name("Iglesia")
                .number(2)
                .locationCardList(cardList)
                .build();
        return loc;
    }

    private Location buildLocation1() {
        List<LocationCard> cardList = new ArrayList<>();
        //Card A
        cardList.add(LocationCard.builder().number(60).letter(A).build());

        //Card B
        int locNumber = 1;
        cardList.add(LocationCard.builder()
                .number(61)
                .locationNumber(locNumber)
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
                .locationNumber(locNumber)
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
                .locationNumber(locNumber)
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
                .locationNumber(locNumber)
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
                .locationNumber(locNumber)
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
                .locationNumber(locNumber)
                .letter(G)
                .action(Action.builder()
                        .subAction(new TakeItem(2)) //Gunshot
                        .build())
                .build());

        Location loc = Location.builder()
                .name("Entrada de la ciudad")
                .number(1)
                .locationCardList(cardList)
                .build();
        return loc;
    }

    private List<SubAction> createFightSubAction() {
        List<SubAction> subActionList = new ArrayList<>();
        subActionList.add(new Fight());
        return subActionList;
    }
}
