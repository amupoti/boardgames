package org.amupoti.boardgames.timestories.marcycase;

import org.amupoti.boardgames.timestories.marcycase.graph.GraphHelper;
import org.amupoti.boardgames.timestories.marcycase.location.LocationBuilder;
import org.amupoti.boardgames.timestories.model.location.Location;
import org.graphstream.graph.Node;
import org.graphstream.ui.view.Viewer;

import java.util.List;

/**
 * Created by amupoti on 17/07/2017.
 */
public class TheMarcyCaseGraphApp {

    public static void main(String[] args) {


        GraphHelper g = new GraphHelper("The Marcy Case");

        LocationBuilder lb = new LocationBuilder();
        List<Location> locations = lb.buildLocations();


        locations.stream().forEach(
                loc -> {
                    g.addLocation(loc);
                    loc.getLocationCardList().forEach(
                            card -> {
                                Node n = g.addLocationCard(card);
                                if (card.getAction().containsFight())
                                    g.markNodeAsFight(n);
                                g.addEdge(loc, card);
                            });
                });

        Viewer display = g.display();


    }

}
