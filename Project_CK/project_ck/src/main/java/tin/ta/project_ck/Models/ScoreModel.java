package tin.ta.project_ck.Models;

import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "Score")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class ScoreModel {		// Tên lớp ta viết hoa chữ cái đầu
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "student_id") 
    private StudentModel student;
    
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private MonHocModel subject;
    
    @Column(name = "score")
    private double score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentModel getStudent() {
        return student;
    }

    public void setStudent(StudentModel student) {
        this.student = student;
    }

    public MonHocModel getSubject() {
        return subject;
    }

    public void setSubject(MonHocModel subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    // constructors, getters, setters
}