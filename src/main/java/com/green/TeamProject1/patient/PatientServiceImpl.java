package com.green.TeamProject1.patient;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements PatientService{
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<PatientVO> getPatListWhereEmail(PatientVO patientVO) {
        return sqlSession.selectList("patientMapper.getPatientList", patientVO);
    }

    @Override
    public PatientVO getPatientOne(int patNum) {
        return sqlSession.selectOne("patientMapper.getPatientOne", patNum);
    }
}