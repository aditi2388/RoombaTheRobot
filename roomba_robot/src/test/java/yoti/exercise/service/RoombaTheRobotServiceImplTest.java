package yoti.exercise.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yoti.exercise.model.Input;
import yoti.exercise.model.Output;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoombaTheRobotServiceImplTest {

	RoombaTheRobotServiceImpl service = new RoombaTheRobotServiceImpl();

	@Test
	public void testInput() {
		Input input = service.readInput();
		System.out.println("Input : " + input);
	}

	@Test
	public void testOutput() {
		Output output = service.generateOutput(service.readInput());
		System.out.println("Output : " + output);
	}

}
