package wheelFactory;

import java.util.Map;
import carcomponents.Wheel;

public interface WheelCreator {
	public Wheel create(Map<String, String> wheelInfo);

}
