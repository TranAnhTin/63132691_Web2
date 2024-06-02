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

    public StudentModel getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(Long id, StudentModel updatedStudent) {
        // Lấy sinh viên cần cập nhật từ cơ sở dữ liệu
        StudentModel existingStudent = studentRepository.findById(id).orElse(null);
        
        // Kiểm tra xem sinh viên có tồn tại không
        if (existingStudent != null) {
            // Cập nhật thông tin sinh viên với dữ liệu từ updatedStudent
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setStudentCode(updatedStudent.getStudentCode());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setGrades(updatedStudent.getGrades()); // Cập nhật điểm số
            // Lưu sinh viên đã cập nhật vào cơ sở dữ liệu
            studentRepository.save(existingStudent);
        }
    }
}
