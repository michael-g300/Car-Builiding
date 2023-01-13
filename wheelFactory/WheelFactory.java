package wheelFactory;

import java.util.HashMap;
import java.util.Map;
import carcomponents.Wheel;

public class WheelFactory {
private final Map<String, WheelCreator> m_creators = new HashMap<String, WheelCreator>();
	
	public Wheel create(final String key, final Map<String, String> wheelInfo) {
		return m_creators.get(key).create(wheelInfo);
	}
	
	public void register (final String key, final WheelCreator wheelCreator) {
		m_creators.put(key, wheelCreator);
	}

}
