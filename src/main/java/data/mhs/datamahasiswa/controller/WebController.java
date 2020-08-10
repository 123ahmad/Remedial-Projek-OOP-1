package data.mhs.datamahasiswa.controller;


import data.mhs.datamahasiswa.entity.datamahasiswa;
import data.mhs.datamahasiswa.model.DataMahasiswaModel;
import data.mhs.datamahasiswa.services.DataMahasiswaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired
    private DataMahasiswaServices service;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("data", service.getAllData());
        return "index";
    }

    @GetMapping("/tambah")
    public String tampilkanTambahForm(Model model) {
        model.addAttribute("data", new DataMahasiswaModel());
        return "tambah-data";
    }

    @PostMapping("/simpan")
    public String simpan(datamahasiswa data) {
        service.save(service.convertToEntity(data));
        return "redirect:/";
    }

    @GetMapping("/ubah/{nim}")
    public String ubah(@PathVariable("nim") String nim, Model model) {
        Optional<datamahasiswaZ> result = service.findById(nim);
        if(result.isPresent()) {
            DataMhs data1 = result.get();
            model.addAttribute("data", data1);
            return "edit-data";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/hapus/{nim}")
    public String hapus(@PathVariable("nim") String nim) {
        service.removeById(nim);
        return "redirect:/";
    }

}
