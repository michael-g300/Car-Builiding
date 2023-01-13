package engineFactory;

import java.util.Map;

import carcomponents.Engine;
import carcomponents.HydrogenEngine;

public class HydrogenEngineCreator implements EngineCreator {
	private static final String DENSITY_KEY = "density";
	private static final String KG_PER_KM_KEY = "kg per km";

	@Override
	public Engine create(final Map<String, String> engineInfo) {
		return new HydrogenEngine(Integer.valueOf(engineInfo.get(DENSITY_KEY)), Integer.valueOf(engineInfo.get(KG_PER_KM_KEY)));
	}

}
