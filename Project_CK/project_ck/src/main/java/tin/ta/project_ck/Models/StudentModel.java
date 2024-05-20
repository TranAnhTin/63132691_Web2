package tin.ta.project_ck.Models;
import java.util.Set;
import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "students")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class StudentModel {		// Tên lớp ta viết hoa chữ cái đầu
	//----cho cột id-----------------------------------------------------------
    @Id						// đánh dấu trường id là khóa chính.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
                 //xác định cách khóa chính được sinh ra (ở đây là tự động tăng).
    @Column(name = "MSSV")	// ánh xạ cột id của Bảng và thuộc tính id của Entiy
    private int MSSV;
    @OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
    private Set<ScoreModel> scores;

    @ManyToOne
    @JoinColumn(name = "MonHocID")
    private MonHocModel monHoc;
    @Column(name = "HoTen")  
    private String HoTen;	
    @Column(name = "NgaySinh")
    private String NgaySinh;
    @Column(name = "Lop")
    private String Lop;
    @Column(name = "Khoa")
    private String Khoa;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Sđth")
    private String Sđth;


    // Constructors, getters, and setters
    // Constructors
    public StudentModel() {}

    public StudentModel(String HoTen, String NgaySinh,String Lop,String Khoa,String Email,String Sđth) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.Lop = Lop;
        this.Khoa = Khoa;
        this.Email = Email;
        this.Sđth = Sđth;
    }

    // Getters and setters
    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getSđth() {
        return Sđth;
    }

    public void setSđth(String Sđth) {
        this.Sđth = Sđth;
    }
    
}