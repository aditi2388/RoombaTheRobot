package yoti.exercise.model;

import java.util.Arrays;
import java.util.List;

public class Input {
	
	private  Integer[] roomSize;
	private Integer[] coords;
	private List<Integer[]> patches;
	String instructions;
	
	public Integer[] getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(Integer[] roomSize) {
		this.roomSize = roomSize;
	}
	public Integer[] getCoords() {
		return coords;
	}
	public void setCoords(Integer[] coords) {
		this.coords = coords;
	}
	public List<Integer[]> getPatches() {
		return patches;
	}
	public void setPatches(List<Integer[]> patches) {
		this.patches = patches;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	@Override
	public String toString() {
		return "Input [roomSize=" + Arrays.toString(roomSize) + ", coords=" + Arrays.toString(coords) + ", patches="
				+ Arrays.deepToString(patches.toArray()) + ", instructions=" + instructions + "]";
	}
	
	
	
	
	
}
