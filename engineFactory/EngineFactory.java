package engineFactory;

import java.util.HashMap;
import java.util.Map;
import carcomponents.Engine;

public class EngineFactory {
	private final Map<String, EngineCreator> m_creators = new HashMap<String, EngineCreator>();
	
	public Engine create(final String key, final Map<String, String> engineInfo) {
		return m_creators.get(key).create(engineInfo);
	}
	
	public void register (final String key, final EngineCreator engineCreator) {
		m_creators.put(key, engineCreator);
	}

}
