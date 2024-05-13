package tin.ta.project_ck.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tin.ta.project_ck.Models.StudentModel;
@Repository
public interface SinhVienRepo extends JpaRepository<StudentModel, Integer>  {
}