package data.mhs.datamahasiswa.entity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "aplikasiweb")
@Data
public class datamahasiswa {
    @Id @Column(name = "NIM")
    private String NIM;
    @Column(name = "nama")
    private Date nama;
    @Column(name = "jurusan")
    private String jurusan;
    @Column(name = "alamat")
    private String alamat;
}
