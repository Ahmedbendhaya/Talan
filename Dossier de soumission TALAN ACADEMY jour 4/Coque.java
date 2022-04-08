

public class Coque {
	private Integer idCoque = 2;
	private String co1;
	private String co2;
	
	public Coque() {
		this.co1 = "co1";
		this.co2 = "co2";
	}
	
	public Coque(String co1, String co2) {
		this.co1 = co1;
		this.co2 = co2;
	}

	public Integer getIdCoque() {
		return idCoque;
	}

	public void setIdCoque(Integer idCoque) {
		this.idCoque = idCoque;
	}

	public String getCo1() {
		return co1;
	}

	public void setCo1(String co1) {
		this.co1 = co1;
	}

	public String getCo2() {
		return co2;
	}

	public void setCo2(String co2) {
		this.co2 = co2;
	}
}
