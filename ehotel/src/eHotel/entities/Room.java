package eHotel.entities;

import java.util.ArrayList;

public class Room {
	
	private int room_id; // Primary Key
	private int hotel_id;
	private float price; // TODO: Change to float
	private int capacity;
	private boolean is_sea_view;
	private boolean is_mountain_view;
	private boolean is_extendible;
	// Amenities stored in separate table
	private ArrayList<Integer> amenities;
	private String room_name;
	
	public Room() {
		
	}
	
	public Room(int room_id, int hotel_id, float price, int capacity, boolean is_sea_view, boolean is_mountain_view, boolean is_extendible, String room_name) {
		this.room_id = room_id;
		this.hotel_id = hotel_id;
		this.price = price;
		this.capacity = capacity;
		this.is_sea_view = is_sea_view;
		this.is_mountain_view = is_mountain_view;
		this.is_extendible = is_extendible;
		this.amenities = new ArrayList<Integer>();
		this.room_name = room_name;
	}

	public int getRoomID() {
		return room_id;
	}

	public void setRoomID(int room_id) {
		this.room_id = room_id;
	}
	
	public int getHotelID() {
		return hotel_id;
	}

	public void setHotelID(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean getIsSeaView() {
		return is_sea_view;
	}

	public void setIsSeaView(boolean is_sea_view) {
		this.is_sea_view = is_sea_view;
	}
	
	public boolean getIsMountainView() {
		return is_mountain_view;
	}

	public void setIsMountainView(boolean is_mountain_view) {
		this.is_mountain_view = is_mountain_view;
	}
	
	public boolean getIsExtendible() {
		return is_extendible;
	}

	public void setIsExtendible(boolean is_extendible) {
		this.is_extendible = is_extendible;
	}
	
	public ArrayList<Integer> getAmenities() {
		return amenities;
	}

	public void addAmenity(int new_amenity) {
		this.amenities.add(new_amenity);
	}
	
	public void addAmenities(ArrayList<Integer> new_amenities) {
		this.amenities.addAll(new_amenities);
	}

	public String getRoomName() {
		return room_name;
	}

	public void setRoomName(String room_name) {
		this.room_name = room_name;
	}
}
