package carcomponents;

public class ElectricEngine implements Engine {
	private final int m_wattsPerKm;
	
	public ElectricEngine(final int wattsPerKm) {
		this.m_wattsPerKm = wattsPerKm;
	}

	@Override
	public String getType() {
		return "Electric";
	}
	
	@Override
	public String getEngineInfo() {
		return String.valueOf(this.m_wattsPerKm);
	}
	
	@Override
	public String engineInfoToDisplay() {
		return "watts per kilometer: " + String.valueOf(this.m_wattsPerKm);
	}

}
