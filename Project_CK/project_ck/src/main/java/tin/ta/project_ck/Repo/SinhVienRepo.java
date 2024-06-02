package tin.ta.project_ck.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tin.ta.project_ck.Models.StudentModel;

@Repository
public interface SinhVienRepo extends JpaRepository<StudentModel, Long> {
    // Các phương thức truy vấn tùy chỉnh có thể thêm vào đây nếu cần
}
