package wheelFactory;

import java.util.Map;

import carcomponents.OffRoadWheel;
import carcomponents.Wheel;

public class OffRoadWheelCreator implements WheelCreator {

	@Override
	public Wheel create(Map<String, String> wheelInfo) {
		return new OffRoadWheel();
	}

}
