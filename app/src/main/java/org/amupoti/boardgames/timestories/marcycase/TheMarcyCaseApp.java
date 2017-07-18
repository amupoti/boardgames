package org.amupoti.boardgames.timestories.marcycase;

import org.amupoti.boardgames.timestories.marcycase.location.LocationBuilder;
import org.amupoti.boardgames.timestories.model.location.Location;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

import java.util.List;

/**
 * Created by amupoti on 17/07/2017.
 */
public class TheMarcyCaseApp {

    public static void main(String[] args) {


        Graph graph = new SingleGraph("The Marcy Case");

        LocationBuilder lb = new LocationBuilder();
        List<Location> locations = lb.buildLocation1();
        locations.stream().forEach(
                l -> {
                    Node root = graph.addNode(l.getName());
                    root.setAttribute("ui.label", l.getName());
                    root.setAttribute("layout.weight", 100);
                    l.getLocationCardList().forEach(
                            c -> {
                                Node n = graph.addNode(c.getLetter().name());
                                n.setAttribute("ui.label", c.getLetter().name());
                                graph.addEdge(l.getName() + c.getLetter().name(), l.getName(), c.getLetter().name());
                            });
                });

        Viewer display = graph.display();

    }

}
