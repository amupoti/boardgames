package org.amupoti.boardgames.timestories.model.location;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Created by amupoti on 15/07/2017.
 */
@Getter
@Builder
public class Location {

    private int number;
    private String name;
    private List<LocationCard> locationCardList;
}
