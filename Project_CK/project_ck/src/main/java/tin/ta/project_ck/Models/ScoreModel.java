package tin.ta.project_ck.Models;

import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "diem")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class ScoreModel {		// Tên lớp ta viết hoa chữ cái đầu
	//----cho cột id-----------------------------------------------------------
    @Id						// đánh dấu trường id là khóa chính.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
                 //xác định cách khóa chính được sinh ra (ở đây là tự động tăng).
    @Column(name = "ScoreID")	// ánh xạ cột id của Bảng và thuộc tính id của Entiy
    private int ScoreID;
    @Column(name = "Score")
    private String Score;
    @Column(name = "Date")
    private String Date;
    @ManyToOne
    @JoinColumn(name = "MSSV")
    private StudentModel students;
    
    @ManyToOne
    @JoinColumn(name = "MonHocID")
    private MonHocModel monhoc;
    // Constructors, getters, and setters
    // Constructors
    public ScoreModel() {}

    public ScoreModel(StudentModel students, MonHocModel monhoc, String Score, String Date) {
        this.students = students;
        this.monhoc = monhoc;
        this.Score = Score;
        this.Date = Date;
    }

    // Getters and setters
    public int getScoreID() {
        return ScoreID;
    }

    public void setScoreID(int ScoreID) {
        this.ScoreID = ScoreID;
    }

    public StudentModel getStudent() {
        return students;
    }

    public void setStudent(StudentModel students) {
        this.students = students;
    }

    public MonHocModel getMonHoc() {
        return monhoc;
    }

    public void setMonHoc(MonHocModel monhoc) {
        this.monhoc = monhoc;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        this.Score = score;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }
}