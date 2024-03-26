package thiGK.ntu63132691.models;

public class SinhVien {
	private String maSoSV;
	private String hoVaTen;
	private String diemTL;
	public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getDiemTL() {
		return diemTL;
	}
	public void setDiemTL(String diemTL) {
		this.diemTL = diemTL;
	}
	public SinhVien() {
		super();
	}
	public SinhVien(String maSoSV, String hoVaTen, String diemTL) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.diemTL = diemTL;
	}
	// Các getter, setter
}