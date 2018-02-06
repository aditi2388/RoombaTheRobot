package yoti.exercise.service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import com.fasterxml.jackson.databind.ObjectMapper;

import yoti.exercise.model.Input;
import yoti.exercise.model.Output;
import yoti.exercise.util.RoombaConstants;

public class RoombaTheRobotServiceImpl implements RoombaTheRobotService {
	Input input = null;
	Integer[] currentCoords = null;
	int cleanPatchesCount;

	public Output generateOutput(Input userInput) {
		Output output = null;
		if (userInput != null) {
			this.input = userInput;
			cleanPatchesCount = 0;
			output = new Output();
			currentCoords = input.getCoords();
			String instructions = input.getInstructions();
			for (int i = 0; i < instructions.length(); i++) {
				switch (instructions.charAt(i)) {

				case 'N': {
					if(!(currentCoords[1]++ <= 5) && !(currentCoords[1]++ >= 0)) {
						currentCoords[1]--;
					}
					setCleanPatchesCount();
					
					break;
				}

				case 'S': {
					if(!(currentCoords[1]-- <= 5) && !(currentCoords[1]-- >= 0)) {
					currentCoords[1]++;
					}
					setCleanPatchesCount();
					break;

				}
				case 'E': {
					if(!(currentCoords[0]++ <= 5) && !(currentCoords[0]++ >= 0)) {
					currentCoords[0]--;
					}
					setCleanPatchesCount();
					break;
				}

				case 'W': {
					if(!(currentCoords[0]-- <= 5) && !(currentCoords[0]-- >= 0)) {
					currentCoords[0]++;
					}
					setCleanPatchesCount();
					break;
				}

				}
			}

			output.setCoords(currentCoords);
			output.setPatches(cleanPatchesCount);
			System.out.println("Output: " + output);
		} else {
			System.out.println("Please provide correct input!");
		}

		return output;
	}
	
	private void setCleanPatchesCount() {
		Iterator<Integer[]> itr = input.getPatches().iterator();
		while (itr.hasNext()) {
			Integer[] patch = itr.next();
			if (Arrays.equals(currentCoords, patch)) {
				itr.remove();
				cleanPatchesCount++;

			}
		}
	}
	

	public Input readInput() {
		ObjectMapper mapper = new ObjectMapper();
		Input fileInput = null;
		try {
			fileInput = mapper.readValue(new File(RoombaConstants.INPUT_FILE), Input.class);
		} catch (IOException e) {
			System.out.println("Unable to read Input from file");
		}
		System.out.println("fileInput: " + fileInput);
		return fileInput;

	}

}
