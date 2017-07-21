package org.amupoti.boardgames.timestories.model.item;

import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amupoti on 20/07/2017.
 */
@Builder
@Getter
public class Item {

    private int number;
    @Builder.Default
    private boolean isLocation = false;
    private int locationId;

    public static Map<Integer, Item> itemMap = new HashMap<>();

    public static final int LABORATORY = 7;
    public static final int BUNKER = 10; //not sure

    static {
        itemMap.put(4, Item.builder().number(4).isLocation(true).locationId(LABORATORY).build()); //Lab
        itemMap.put(18, Item.builder().number(18).isLocation(true).locationId(BUNKER).build()); //Bunker
    }
}
