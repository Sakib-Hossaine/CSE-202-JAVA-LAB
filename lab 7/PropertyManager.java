package Uap;

import java.util.ArrayList;

public class PropertyManager {
    private String name;
    private ArrayList<Property> properties;

    public PropertyManager(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public void addProperty(String id, String description, String location, String category, ArrayList<String> facilities, double rent) {
        properties.add(new Property(id, description, location, category, facilities, rent, true));
    }

    public void addFacilities(String id, ArrayList<String> facilities) {
        for (Property property : properties) {
            if (property.getId().equals(id)) {
                for (String facility : facilities) {
                    property.addFacility(facility);
                }
            }
        }
    }

    public void removeFacilities(String id, ArrayList<String> facilities) {
        for (Property property : properties) {
            if (property.getId().equals(id)) {
                for (String facility : facilities) {
                    property.removeFacility(facility);
                }
            }
        }
    }

    public Property findProperty(String id) {
        for (Property property : properties) {
            if (property.getId().equals(id)) {
                return property;
            }
        }
        return null;
    }

    public ArrayList<Property> findProperty(String location, String category) {
        ArrayList<Property> result = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLocation().equals(location) && property.getCategory().equals(category)) {
                result.add(property);
            }
        }
        return result;
    }

    public void viewAll() {
        for (Property property : properties) {
            System.out.println(property);
        }
    }

    public void viewDetails(String id) {
        Property property = findProperty(id);
        if (property != null) {
            System.out.println(property);
        }
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

public void rentProperty(String id, double rent) {
    Property property = findProperty(id);
    if (property != null) {
        property.setExpectedRent(rent);
        property.setAvailable(false);
        System.out.println("Property rented successfully.");
    }
     else 
     {
        System.out.println("Property not found.");
    }
}