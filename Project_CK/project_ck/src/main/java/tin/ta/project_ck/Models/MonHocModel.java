package tin.ta.project_ck.Models;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
@Entity						// đánh dấu rằng đây là một entity
@Table(name = "MonHoc")	// chỉ định tên của bảng trong cơ sở dữ liệu.		// Tên lớp ta viết hoa chữ cái đầu
public class MonHocModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name") 
    private String name;
    
    @Column(name = "credit")
    private int credit;

    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
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

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<ScoreModel> getGrades() {
        return grades;
    }

    public void setGrades(List<ScoreModel> grades) {
        this.grades = grades;
    }
    
    // constructors, getters, setters
}
