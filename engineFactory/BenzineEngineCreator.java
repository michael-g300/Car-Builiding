package engineFactory;

import java.util.Map;

import carcomponents.BenzineEngine;

public class BenzineEngineCreator implements EngineCreator {
	private static final String LPK_KEY = "lpk";
	private static final String MAX_RPM_KEY = "max rpm";
	
	public BenzineEngine create(final Map<String, String> engineInfo) {
		return new BenzineEngine(Integer.valueOf(engineInfo.get(LPK_KEY)), Integer.valueOf(engineInfo.get(MAX_RPM_KEY)));
	}

}
