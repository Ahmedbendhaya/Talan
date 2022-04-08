

public class Pont {
	private Integer idPont = 4;
	private String p1;
	private String p2;
        Voile voile;
	
	public Pont() {
		this.p1 = "TestPont1";
		this.p2 = "TestPont2";
	}
	
	public Pont(String p1, String p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	public Integer getIdPont() {
		return idPont;
	}
	public void setIdPont(Integer idPont) {
		this.idPont = idPont;
	}
	public String getP1() {
		return p1;
	}
	public void setP1(String p1) {
		this.p1 = p1;
	}
	public String getP2() {
		return p2;
	}
	public void setP2(String p2) {
		this.p2 = p2;
	}
	public Voile getVoile() {
		return voile;
	}
	public void setVoile(Voile voile) {
		this.voile = voile;
	}
	
}
