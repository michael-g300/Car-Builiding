package engineFactory;

import java.util.Map;

import carcomponents.ElectricEngine;
import carcomponents.Engine;

public class ElectricEngineCreator implements EngineCreator {
	private static final String WPK_KEY = "wpk";

	@Override
	public Engine create(final Map<String, String> engineInfo) {
		return new ElectricEngine(Integer.valueOf(engineInfo.get(WPK_KEY)));
	}

}
