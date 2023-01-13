package engineFactory;

import java.util.Map;
import carcomponents.Engine;

public interface EngineCreator {
	public Engine create(Map<String, String> engineInfo);

}
