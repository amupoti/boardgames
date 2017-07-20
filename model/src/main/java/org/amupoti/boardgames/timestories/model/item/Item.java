package org.amupoti.boardgames.timestories.model.item;

import lombok.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amupoti on 20/07/2017.
 */
@Builder
public class Item {

    private int number;
    @Builder.Default
    private boolean isLocation = false;
    private int locationId;

    public static Map<Integer, Item> itemMap = new HashMap<>();

    public static final int LABORATORY = 7;

    static {
        itemMap.put(4, Item.builder().number(4).isLocation(true).number(LABORATORY).build()); //Lab
    }
}
