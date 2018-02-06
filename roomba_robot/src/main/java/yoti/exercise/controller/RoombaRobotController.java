package yoti.exercise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yoti.exercise.model.Input;
import yoti.exercise.model.Output;
import yoti.exercise.service.RoombaTheRobotService;
import yoti.exercise.service.RoombaTheRobotServiceImpl;


/**
 * @author Aditi Sinhal
 *
 */
@RestController
public class RoombaRobotController {
	
	private static final Logger LOG = LoggerFactory.getLogger(RoombaRobotController.class);
	
	RoombaTheRobotService service = new RoombaTheRobotServiceImpl();

	@PostMapping(value = "/driverobot", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Output getOutput(@RequestBody Input input) {
		try {
		Output output = service.generateOutput(input);
		return output;
		}
		catch(Exception e) {
			LOG.error("Error Occured, Unable to generate output!");
			return null;
		}
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Output getOutput() {
		Input input = service.readInput();
		Output output = service.generateOutput(input);
		return output;
	}
}
