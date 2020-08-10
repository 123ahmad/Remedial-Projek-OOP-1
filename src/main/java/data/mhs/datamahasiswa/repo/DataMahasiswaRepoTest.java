package data.mhs.datamahasiswa.repo;
import data.mhs.datamahasiswa.entity.datamahasiswa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class DataMahasiswaRepoTest {
    @Autowired
    private DataMahasiswaRepo repo;

    private final Logger logger = LoggerFactory.getLogger(DataMahasiswaRepoTest.class);

    @org.junit.Test
    public void getListTest() {
        List<datamahasiswa> result = repo.findAll();
        logger.info("jumlah data : " + result.size());
        Assert.notNull(result);
        Assert.notEmpty(result);
    }
}
