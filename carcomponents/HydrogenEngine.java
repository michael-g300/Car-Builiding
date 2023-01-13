package carcomponents;

public class HydrogenEngine implements Engine {
	private final int m_density;
	private final int m_kgPerKm;
	
	public HydrogenEngine(final int density, final int kgPerKm) {
		this.m_density = density;
		this.m_kgPerKm = kgPerKm;
	}

	@Override
	public String getType() {
		return "Hydrogen";
	}
	
	public int getDensity() {
		return this.m_density;
	}
	
	public int getKgPerKm() {
		return this.m_kgPerKm;
	}
	
	@Override
	public String getEngineInfo() {
		return this.m_density + "," + this.m_kgPerKm;
	}
	
	@Override
	public String engineInfoToDisplay() {
		return "density: " + String.valueOf(this.m_density) + ", kilograms per kilometer: " + String.valueOf(this.m_kgPerKm);
	}

}
