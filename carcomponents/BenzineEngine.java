package carcomponents;

public class BenzineEngine implements Engine {
	private final int m_LPK;
	private final int m_maxRPM;
	
	public BenzineEngine(final int LPK, final int maxRPM) {
		this.m_LPK = LPK;
		this.m_maxRPM = maxRPM;
	}

	@Override
	public String getType() {
		return "Benzine";
	}
	
	public int getMaxRpm() {
		return this.m_maxRPM;
	}
	
	public int getLPK() {
		return this.m_LPK;
	}

	@Override
	public String getEngineInfo() {
		return "lpk:" + this.m_LPK + "\n" + "max rpm:" + this.m_maxRPM;
	}
	
	@Override
	public String engineInfoToDisplay() {
		return "litter per kilometer: " + String.valueOf(this.m_LPK) + ", max RPM: " + String.valueOf(this.m_maxRPM);
	}

}
