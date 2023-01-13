package wheelFactory;

import java.util.Map;

import carcomponents.SnowWheel;
import carcomponents.Wheel;

public class SnowWheelCreator implements WheelCreator {

	@Override
	public Wheel create(Map<String, String> wheelInfo) {
		return new SnowWheel();
	}

}
