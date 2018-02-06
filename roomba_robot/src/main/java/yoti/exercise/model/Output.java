package yoti.exercise.model;

import java.util.Arrays;

public class Output {
	
	private Integer[] coords;
	private int patches;
	
	public Integer[] getCoords() {
		return coords;
	}
	public void setCoords(Integer[] coords) {
		this.coords = coords;
	}
	public int getPatches() {
		return patches;
	}
	public void setPatches(int patches) {
		this.patches = patches;
	}
	
	@Override
	public String toString() {
		return "Output [coords=" + Arrays.toString(coords) + ", patches=" + patches + "]";
	}
	
	

}
