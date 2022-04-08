

public class Cabine {
	private Integer idCabine = 3;
	private String ca1;
	private String ca2;
	
	public Cabine() {
		this.ca1 = "ca1";
		this.ca2 = "ca2";
	}
	
	public Cabine(String ca1, String ca2) {
		this.ca1 = ca1;
		this.ca2 = ca2;
	}

	public Integer getIdCabine() {
		return idCabine;
	}

	public void setIdCabine(Integer idCabine) {
		this.idCabine = idCabine;
	}

	public String getCa1() {
		return ca1;
	}

	public void setCa1(String ca1) {
		this.ca1 = ca1;
	}

	public String getCa2() {
		return ca2;
	}

	public void setCa2(String ca2) {
		this.ca2 = ca2;
	}
}
