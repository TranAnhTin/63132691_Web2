package tin.ta.project_ck.Models;
import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "monhoc")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class MonHocModel {		// Tên lớp ta viết hoa chữ cái đầu
	//----cho cột id-----------------------------------------------------------
    @Id						// đánh dấu trường id là khóa chính.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
                 //xác định cách khóa chính được sinh ra (ở đây là tự động tăng).
    @Column(name = "MonHocID")	// ánh xạ cột id của Bảng và thuộc tính id của Entiy
    private int MonHocID;
    
    @Column(name = "MaMH")  
    private String MaMH;	
    @Column(name = "TenMH")
    private String TenMH;
    @Column(name = "soTC")
    private int soTC;

    // Constructors, getters, and setters
    // Constructors
    public MonHocModel() {}

    public MonHocModel(String TenMH,int soTC) {
        this.TenMH = TenMH;
        this.soTC = soTC;
    }

    // Getters and setters
    public int getMonHocID() {
        return MonHocID;
    }

    public void setMonHocId(int MonHocID) {
        this.MonHocID = MonHocID;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public int getsoTC() {
        return soTC;
    }

    public void setTC(int soTC) {
        this.soTC = soTC;
    }
}
