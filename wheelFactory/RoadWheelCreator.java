package wheelFactory;

import java.util.Map;

import carcomponents.RoadWheel;
import carcomponents.Wheel;

public class RoadWheelCreator implements WheelCreator {

	@Override
	public Wheel create(Map<String, String> wheelInfo) {
		return new RoadWheel();
	}

}
