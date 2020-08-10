package data.mhs.datamahasiswa.services;

import data.mhs.datamahasiswa.entity.datamahasiswa;
import data.mhs.datamahasiswa.repo.DataMahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataMahasiswaServices {
    @Autowired
    private DataMahasiswaRepo repo;

    public List<datamahasiswa> getAllData() {
        return repo.findAll();
    }
}
