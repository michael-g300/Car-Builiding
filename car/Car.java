package car;

import carcomponents.Engine;
import carcomponents.Wheel;

public class Car {
	private final int m_serialNum;
	private final Engine m_engine;
	private final Wheel m_wheels;
	
	public Car(final int serialNum, final Engine engine, final Wheel wheels) {
		this.m_serialNum = serialNum;
		this.m_engine = engine;
		this.m_wheels = wheels;
	}
	
	public int getSerialNum() {
		return this.m_serialNum;
	}
	
	public String getEngineType() {
		return this.m_engine.getType();
	}
	
	public String getEngineInfo() {
		return this.m_engine.getEngineInfo();
	}
	
	public String getEngineInfoForDisplay() {
		return this.m_engine.engineInfoToDisplay();
	}
	
	public String getWheelType() {
		return this.m_wheels.getType();
	}
	
	@Override
	public String toString() {
		return ("Serial number: " + this.m_serialNum + "\n" 
				+ "Engine type: " + this.getEngineType() + "\n" 
				+ "Engine technical information: " + this.getEngineInfoForDisplay() + "\n" 
				+ "Wheel type: " + this.getWheelType());
	}

}
