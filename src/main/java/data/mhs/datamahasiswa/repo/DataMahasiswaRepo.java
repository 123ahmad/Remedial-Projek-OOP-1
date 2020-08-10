package data.mhs.datamahasiswa.repo;
import data.mhs.datamahasiswa.entity.datamahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMahasiswaRepo extends JpaRepository<datamahasiswa, String> {
}
