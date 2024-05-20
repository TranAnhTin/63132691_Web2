package tin.ta.project_ck.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import tin.ta.project_ck.Models.StudentModel;
import tin.ta.project_ck.Repo.SinhVienRepo;

@Service
public class StudentServiceImpl {

    @Autowired
    private SinhVienRepo studentRepository;

    public void saveStudent(StudentModel student) {
        studentRepository.save(student);
    }
    public List<StudentModel> getAllStudents() {
        return studentRepository.findAll();
    }
}
