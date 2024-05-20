package tin.ta.project_ck.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tin.ta.project_ck.Models.MonHocModel;
@Repository
public interface MonHocRepo extends JpaRepository<MonHocModel, Integer>  {
}