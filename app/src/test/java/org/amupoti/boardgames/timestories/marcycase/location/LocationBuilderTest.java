package org.amupoti.boardgames.timestories.marcycase.location;

import org.amupoti.boardgames.timestories.model.location.Location;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by amupoti on 18/07/2017.
 */
public class LocationBuilderTest {

    @Test
    public void buildLocations() throws Exception {
        LocationBuilder lb = new LocationBuilder();
        List<Location> locations = lb.buildLocation1();
        Assert.assertTrue(locations.size() > 0);
    }

}