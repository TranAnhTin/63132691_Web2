package tin.ta.demo.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tin.ta.demo.Models.Customer;;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>  {
}