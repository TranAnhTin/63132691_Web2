package tin.ta.project_ck.Models;

import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "scores")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class ScoreModel {		// Tên lớp ta viết hoa chữ cái đầu
	//----cho cột id-----------------------------------------------------------
    @Id						// đánh dấu trường id là khóa chính.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
                 //xác định cách khóa chính được sinh ra (ở đây là tự động tăng).
    @Column(name = "ScoreID")	// ánh xạ cột id của Bảng và thuộc tính id của Entiy
    private int ScoreID;
    
    @Column(name = "MSSV")  
    private String MSSV;	
    @Column(name = "Subject")
    private String Subject;
    @Column(name = "Score")
    private String Score;
    @Column(name = "Date")
    private String Date;
    @Column(name = "DTB")
    private String DTB;

    // Constructors, getters, and setters
    // Constructors
    public ScoreModel() {}

    public ScoreModel(String MSSV, String Subject,String Score,String Date,String DTB) {
        this.MSSV = MSSV;
        this.Subject = Subject;
        this.Score = Score;
        this.Date = Date;
        this.DTB = DTB;
    }

    // Getters and setters
    public int getScoreID() {
        return ScoreID;
    }

    public void setScoreId(int ScoreID) {
        this.ScoreID = ScoreID;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getDTB() {
        return DTB;
    }

    public void setDTB(String DTB) {
        this.DTB = DTB;
    }
}
    