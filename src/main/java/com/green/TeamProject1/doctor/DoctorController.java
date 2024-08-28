package com.green.TeamProject1.doctor;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
    @Resource(name = "doctorService")
    private DoctorServiceImpl doctorService;

    @PostMapping("/getOne")
    DoctorVO getOneDoc(@RequestBody DoctorVO doctorVO){
        return doctorService.getOneDoc(doctorVO);
    }

    @GetMapping("/getList")
    List<DoctorVO> getAllDoc(){
        return doctorService.getAllDoc();
    }
}
