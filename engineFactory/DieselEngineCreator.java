package engineFactory;

import java.util.Map;

import carcomponents.DieselEngine;
import carcomponents.Engine;

public class DieselEngineCreator implements EngineCreator {
	private static final String LPK_KEY = "lpk";
	private static final String MAX_RPM_KEY = "max rpm";
	private static final String GLOW_KEY = "glow speed in seconds";

	@Override
	public Engine create(final Map<String, String> engineInfo) {
		return new DieselEngine(Integer.valueOf(engineInfo.get(LPK_KEY)), 
				Integer.valueOf(engineInfo.get(MAX_RPM_KEY)), 
				Integer.valueOf(engineInfo.get(GLOW_KEY)));
	}

}
