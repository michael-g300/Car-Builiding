package car;

import carcomponents.Engine;
import carcomponents.Wheel;

public class BuiltCar {
	private final int m_serialNum;
	private final Engine m_engine;
	private final Wheel m_wheels;
	
	public BuiltCar(final CarBuilder builder) {
		this.m_serialNum = builder.m_serialNum;
		this.m_engine = builder.m_engine;
		this.m_wheels = builder.m_wheels;
	}
	
	public int getSerialNum() {
		return this.m_serialNum;
	}
	
	public Engine getEngine() {
		return this.m_engine;
	}
	
	public Wheel getWheels() {
		return this.m_wheels;
	}
	
	@Override
	public String toString() {
		return ("Serial number: " + this.m_serialNum + (this.m_engine != null ? "\n" 
				+ "Engine type: " + this.m_engine.getType() + "\n" 
				+ "Engine technical information: " + this.m_engine.engineInfoToDisplay() : "") + (this.m_wheels != null ? "\n" 
						+ "Wheel type: " + this.m_wheels.getType() : ""));
	}
	
	public static class CarBuilder {
		private final int m_serialNum;
		private Engine m_engine;
		private Wheel m_wheels;
		
		public CarBuilder(final int serialNum) {
			this.m_serialNum = serialNum;
		}
		
		public CarBuilder engine(final Engine engine) {
			this.m_engine = engine;
			return this;
		}
		
		public CarBuilder wheels(final Wheel wheels) {
			this.m_wheels = wheels;
			return this;
		}
		
		public BuiltCar build() {
			BuiltCar car = new BuiltCar(this);
			return car;
		}
	}
}
