package com.arin3.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/coordinates")
public class StaticCoordinateController {

    @GetMapping
    public List<Map<String, Object>> getAllCoordinates() {
        List<Map<String, Object>> coordinates = new ArrayList<>();
        
        // Add all coordinates as Map objects
        coordinates.add(createCoordinate(0.18844, -1.081, -1.4116, "Admin Entrance", "Starting point at Admin Entrance", "START"));
        coordinates.add(createCoordinate(0.64347, -2.1809, -1.4116, "Waypoint 1", "Navigation point 1", "WAYPOINT"));
        coordinates.add(createCoordinate(1.0844, -3.5544, -1.4116, "Waypoint 2", "Navigation point 2", "WAYPOINT"));
        coordinates.add(createCoordinate(1.4741, -4.7743, -1.4116, "Waypoint 3", "Navigation point 3", "WAYPOINT"));
        coordinates.add(createCoordinate(1.9628, -6.6293, -1.4116, "Waypoint 4", "Navigation point 4", "WAYPOINT"));
        coordinates.add(createCoordinate(2.4148, -8.0416, -1.4116, "Waypoint 5", "Navigation point 5", "WAYPOINT"));
        coordinates.add(createCoordinate(2.8363, -10.118, -1.4116, "Waypoint 6", "Navigation point 6", "WAYPOINT"));
        coordinates.add(createCoordinate(3.2908, -11.886, -1.4116, "Waypoint 7", "Navigation point 7", "WAYPOINT"));
        coordinates.add(createCoordinate(3.6405, -13.038, -1.4116, "Waypoint 8", "Navigation point 8", "WAYPOINT"));
        coordinates.add(createCoordinate(3.9757, -14.164, -1.4116, "Waypoint 9", "Navigation point 9", "WAYPOINT"));
        coordinates.add(createCoordinate(4.3366, -15.421, -1.4116, "Waypoint 10", "Navigation point 10", "WAYPOINT"));
        coordinates.add(createCoordinate(4.8435, -16.692, -1.4116, "Destination", "Final destination point", "DESTINATION"));
        
        return coordinates;
    }

    private Map<String, Object> createCoordinate(double x, double y, double z, String name, String description, String type) {
        Map<String, Object> coordinate = new HashMap<>();
        coordinate.put("x", x);
        coordinate.put("y", y);
        coordinate.put("z", z);
        coordinate.put("locationName", name);
        coordinate.put("description", description);
        coordinate.put("markerType", type);
        return coordinate;
    }
}
