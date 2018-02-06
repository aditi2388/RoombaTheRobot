package yoti.exercise.service;

import yoti.exercise.model.Input;
import yoti.exercise.model.Output;

public interface RoombaTheRobotService {

	/** This method is called by webservice where input is taken from the User
	 * @param input
	 * @return
	 */
	public Output generateOutput(Input input) ;
	
	/** This method read input from a json file
	 * @return
	 */
	public Input readInput();
	
}
