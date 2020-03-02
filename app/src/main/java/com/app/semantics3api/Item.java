package com.app.semantics3api;

public class Item
{
    private int eventId;
    private int id;
    private int profileId;
    private String name;
    private double cost;
    private String store;
    private String encodedImage;
    private boolean purchased;
    public Item()
    {

    }
    public Item(String name, double cost, String location, String encodedImage, int profileId, int eventId, int id, boolean purchased)
    {
        this.name = name;
        this.cost = cost;
        this.store = location;
        this.encodedImage = encodedImage;
        this.profileId = profileId;
        this.eventId = eventId;
        this.id = id;
        this.purchased = purchased;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getStore() {
        return store;
    }

    public String getEncodedImage() {
        return encodedImage;
    }

    public int getId() {
        return id;
    }

    public int getEventId() {
        return eventId;
    }

    public int getProfileId() {
        return profileId;
    }

    public boolean isPurchased() {
        return purchased;
    }


}
