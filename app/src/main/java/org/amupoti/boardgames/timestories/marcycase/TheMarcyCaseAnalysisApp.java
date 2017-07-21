package org.amupoti.boardgames.timestories.marcycase;

import lombok.extern.slf4j.Slf4j;
import org.amupoti.boardgames.timestories.marcycase.location.LocationBuilder;
import org.amupoti.boardgames.timestories.model.action.subaction.SubAction;
import org.amupoti.boardgames.timestories.model.action.subaction.TakeItem;
import org.amupoti.boardgames.timestories.model.item.Item;
import org.amupoti.boardgames.timestories.model.location.Location;
import org.amupoti.boardgames.timestories.model.location.LocationCard;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by amupoti on 17/07/2017.
 */
@Slf4j
public class TheMarcyCaseAnalysisApp {

    public static void main(String[] args) {

        TheMarcyCaseAnalysisApp app = new TheMarcyCaseAnalysisApp();

        LocationBuilder lb = new LocationBuilder();
        List<Location> locations = lb.buildLocations();

        List<LocationCard> cardList = locations.stream().flatMap(l -> l.getLocationCardList().stream()).collect(Collectors.toList());

        //find one card which provides the item


        Item.itemMap.values()
                .stream()
                .filter(i -> i.isLocation())
                .forEach(i -> {
                    app.findPathForLocation(i.getLocationId(), cardList);
                });


    }

    private void findPathForLocation(int location, List<LocationCard> cardList) {


        for (LocationCard card : cardList) {
            List<SubAction> subActions = card.getAction().getSubActions();
            for (SubAction sa : subActions) {
                if (sa instanceof TakeItem) {
                    TakeItem takeItem = (TakeItem) sa;
                    Item i = Item.itemMap.get(takeItem.getItemNumber());
                    if (i != null && i.isLocation() && i.getLocationId() == location) {
                        boolean preconditionRequired = card.getPrecondition() != null && card.getPrecondition().getTokenRequiredCondition() != null;
                        log.info("Found location {} in card {} with {} action conditions and token required is {}", location, card.getLocationNumber() + "-" + card.getLetter(), takeItem.getActionConditions().size(), preconditionRequired);
                    }

                }
            }
        }
    }

}
