package tin.ta.project_ck.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import tin.ta.project_ck.Models.MonHocModel;
import tin.ta.project_ck.Repo.MonHocRepo;

@Service
public class MonHocServiceImpl {

    @Autowired
    private MonHocRepo monHocRepo;

    public MonHocModel saveMonHoc(MonHocModel monhoc) {
        return monHocRepo.save(monhoc);
    }
    public List<MonHocModel> getAllMonHoc() {
        return monHocRepo.findAll();
    }
    public MonHocModel getStudentById(Long id) {
        return monHocRepo.findById(id).orElse(null);
    }

    public void deleteStudent(Long id) {
        monHocRepo.deleteById(id);
    }
}
