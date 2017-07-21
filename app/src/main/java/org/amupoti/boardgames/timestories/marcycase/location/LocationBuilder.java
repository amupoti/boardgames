package org.amupoti.boardgames.timestories.marcycase.location;

import org.amupoti.boardgames.timestories.model.Precondition;
import org.amupoti.boardgames.timestories.model.TokenRequiredCondition;
import org.amupoti.boardgames.timestories.model.action.Action;
import org.amupoti.boardgames.timestories.model.action.EscapeCondition;
import org.amupoti.boardgames.timestories.model.action.subaction.*;
import org.amupoti.boardgames.timestories.model.location.Location;
import org.amupoti.boardgames.timestories.model.location.LocationCard;
import org.amupoti.boardgames.timestories.model.token.RoundTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenColor;
import org.amupoti.boardgames.timestories.model.token.SquareTokenType;

import java.util.ArrayList;
import java.util.List;

import static org.amupoti.boardgames.timestories.model.AccessCondition.FIRST_MOVE_REQUIRED;
import static org.amupoti.boardgames.timestories.model.Letter.*;
import static org.amupoti.boardgames.timestories.model.token.SquareTokenColor.*;
import static org.amupoti.boardgames.timestories.model.token.SquareTokenType.*;

/**
 * Created by amupoti on 18/07/2017.
 */
public class LocationBuilder {

    public List<Location> buildLocations() {

        List<Location> locationList = new ArrayList<>();
        locationList.add(buildLocation1());
        locationList.add(buildLocation2());
        locationList.add(buildLocation3());
        return locationList;
    }

    private Location buildLocation3() {

        List<LocationCard> cardList = new ArrayList<>();
        //Card A
        int locNumber = 3;
        cardList.add(LocationCard.builder()
                .number(74)
                .locationNumber(locNumber)
                .letter(A)
                .build());

        //Card B
        cardList.add(LocationCard.builder()
                .number(75)
                .locationNumber(locNumber)
                .letter(B)
                .build());

        //Card C
        cardList.add(LocationCard.builder()
                .number(76)
                .locationNumber(locNumber)
                .letter(C)
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(25)
                                .actionCondition(ActionCondition.builder()
                                        .roundTokenColor(RoundTokenColor.GREEN)
                                        .roundTokensRequired(2)
                                        .build())
                                .build())
                        .build())
                .build());

        //Card D
        cardList.add(LocationCard.builder()
                .number(77)
                .locationNumber(locNumber)
                .letter(D)
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(17)
                                .actionCondition(ActionCondition.builder()
                                        .roundTokenColor(RoundTokenColor.GREEN)
                                        .roundTokensRequired(2)
                                        .build())
                                .build())
                        .build())
                .build());

        //Card E
        cardList.add(LocationCard.builder()
                .number(78)
                .locationNumber(locNumber)
                .letter(E)
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(7)
                                .actionCondition(ActionCondition.builder()
                                        .passCustomTest(true)
                                        .build())
                                .build())
                        .build())
                .build());

        //Card F
        cardList.add(LocationCard.builder()
                .number(79)
                .locationNumber(locNumber)
                .letter(F)
                .action(Action.builder()
                        .subAction(TwoOptionSubAction.builder()
                                .subAction(TakeToken.builder()
                                        .squareTokenColor(GREEN)
                                        .squareTokenType(THREE)
                                        .actionCondition(ActionCondition.builder()
                                                .spendTimeUnits(3)
                                                .build())
                                        .build())
                                .alternateSubAction(TakeToken.builder()
                                        .squareTokenColor(GRAY)
                                        .squareTokenType(TWO)
                                        .build())
                                .build())
                        .build())
                .build());

        //Card G
        cardList.add(LocationCard.builder()
                .number(80)
                .locationNumber(locNumber)
                .letter(G)
                .precondition(Precondition.builder()
                        .tokenRequiredCondition(new TokenRequiredCondition(SquareTokenColor.GREEN, SquareTokenType.THREE))
                        .build())
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(18)
                                .build())
                        .build())
                .build());

        //Card H
        cardList.add(LocationCard.builder()
                .number(81)
                .locationNumber(locNumber)
                .letter(H)
                .precondition(Precondition.builder()
                        .tokenRequiredCondition(new TokenRequiredCondition(SquareTokenColor.GRAY, SquareTokenType.TWO))
                        .build())
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(18)
                                .build())
                        .build())
                .build());


        //Build location
        Location loc = Location.builder()
                .name("Instituto")
                .number(3)
                .locationCardList(cardList)
                .build();
        return loc;
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
                        //TODO there is a condition to get the token (3 green tokens). Add logic to model this?
                        .subAction(TakeToken.builder()
                                .squareTokenColor(BLACK)
                                .squareTokenType(ONE)
                                .build())
                        .build())
                .build());

        //Card C
        cardList.add(LocationCard.builder()
                .number(69)
                .locationNumber(locNumber)
                .letter(C)
                .action(Action.EMPTY)
                //There is some clue in the text, not sure if we should model this
                .build());

        //Card D
        cardList.add(LocationCard.builder()
                .number(70)
                .locationNumber(locNumber)
                .letter(D)
                .action(Action.builder()
                        .subAction(TakeToken.builder()
                                .squareTokenColor(BLUE)
                                .squareTokenType(TWO)
                                .actionCondition(ActionCondition.builder().itemRequired(23)
                                        .build())
                                .build())
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
                .precondition(Precondition.builder()
                        .tokenRequiredCondition(new TokenRequiredCondition(SquareTokenColor.BLACK, SquareTokenType.ONE))
                        .build())
                .action(Action.builder()
                        .subAction(new Fight())
                        .build())
                .build());

        //Card G
        cardList.add(LocationCard.builder()
                .number(73)
                .locationNumber(locNumber)
                .letter(G)
                .precondition(Precondition.builder()
                        .tokenRequiredCondition(new TokenRequiredCondition(SquareTokenColor.BLUE, SquareTokenType.TWO))
                        .build())
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(4)
                                .build())
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
                .precondition(Precondition.builder()
                        .accessCondition(FIRST_MOVE_REQUIRED)
                        .build())
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
                        .subAction(TakeItem.builder()
                                .itemNumber(3)
                                .build())
                        .build())
                .build());
        // Card D
        cardList.add(LocationCard.builder()
                .number(63)
                .locationNumber(locNumber)
                .letter(D)
                .action(Action.builder()
                        .subAction(new RollingDiceTest())
                        .subAction(TakeItem.builder()
                                .itemNumber(16)
                                .build()) //Flare
                        .subAction(TakeItem.builder()
                                .itemNumber(27)
                                .build()) //Bat
                        .build())
                .build());
        //Card E
        cardList.add(LocationCard.builder()
                .number(64)
                .locationNumber(locNumber)
                .letter(E)
                .precondition(Precondition.builder()
                        .accessCondition(FIRST_MOVE_REQUIRED)
                        .build())
                .action(Action.builder()
                        .subAction(new Fight())
                        .subAction(TakeToken.builder()
                                .squareTokenColor(YELLOW)
                                .squareTokenType(TWO)
                                .build())
                        .build())
                .build());
        //Card F
        cardList.add(LocationCard.builder()
                .number(65)
                .locationNumber(locNumber)
                .letter(F)
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(5)
                                .actionCondition(ActionCondition.builder()
                                        .itemRequired(3)
                                        .build())
                                .build()) //Prisoner
                        .build())
                .build());
        //Card F
        cardList.add(LocationCard.builder()
                .number(66)
                .locationNumber(locNumber)
                .letter(G)
                .action(Action.builder()
                        .subAction(TakeItem.builder()
                                .itemNumber(2)
                                .build()) //Gunshot
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
