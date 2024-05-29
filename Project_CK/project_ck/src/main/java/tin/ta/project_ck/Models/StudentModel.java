package tin.ta.project_ck.Models;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "Students")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class StudentModel {	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "student_code")
    private String studentCode;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;
    
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<ScoreModel> grades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<ScoreModel> getGrades() {
        return grades;
    }

    public void setGrades(List<ScoreModel> grades) {
        this.grades = grades;
    }

    // constructors, getters, setters
}