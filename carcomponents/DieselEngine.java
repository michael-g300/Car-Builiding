package carcomponents;

public class DieselEngine implements Engine {
	private final int m_LPK;
	private final int m_maxRPM;
	private final int m_glowSpeedInSec;
	
	public DieselEngine(final int LPK, final int maxRPM, final int glowSpeedInSec) {
		this.m_glowSpeedInSec = glowSpeedInSec;
		this.m_LPK = LPK;
		this.m_maxRPM = maxRPM;
	}

	@Override
	public String getType() {
		return "Diesel";
	}
	
	@Override
	public String getEngineInfo() {
		return "lpk:" + this.m_LPK + "\n" + "max rpm:" + this.m_maxRPM + "\n" + "glow speed in seconds:" + this.m_glowSpeedInSec;
	}
	
	@Override
	public String engineInfoToDisplay() {
		return "litter per kilometer: " + String.valueOf(this.m_LPK) + ", max RPM: " + String.valueOf(this.m_maxRPM 
				+ ", glow time [sec]: " + this.m_glowSpeedInSec);
	}

}
