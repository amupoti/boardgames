package org.amupoti.boardgames.timestories.marcycase.graph;

import org.amupoti.boardgames.timestories.model.location.Location;
import org.amupoti.boardgames.timestories.model.location.LocationCard;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 * Created by amupoti on 19/07/2017.
 */
public class GraphHelper extends SingleGraph {

    public GraphHelper(String id) {
        super(id);
        initStyleSheet();
    }

    private void initStyleSheet() {
        System.setProperty("gs.ui.renderer",
                "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

        addAttribute("ui.stylesheet",
                "node {" +
                        "shape: rounded-box;" +
                        "size: 25px, 30px;" +
                        "fill-mode: plain;" +
                        "fill-color: orange;" +
                        "text-size: 14;" +
                        "}");
    }


    public Node addLocation(Location l) {
        return addNodeWithLabel(l.getName());
    }

    public Node addLocationCard(LocationCard c) {
        return addNodeWithLabel(c.getLetter().name());
    }

    private Node addNodeWithLabel(String name) {
        Node node = addNode(name);
        node.setAttribute("ui.label", name);
        return node;
    }

    public void markNodeAsFight(Node n) {
        n.addAttribute("ui.style", "fill-color:red;");
    }

    public void addEdge(Location l, LocationCard c) {
        String name = c.getLetter().name();
        addEdge(l.getName() + name, l.getName(), name);
    }

}
