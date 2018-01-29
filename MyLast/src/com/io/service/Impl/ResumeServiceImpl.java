package com.io.service.Impl;

import com.io.dao.ResumeMapper;
import com.io.model.Resume;
import com.io.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeMapper resumeMapper;
    @Override
    public boolean addResume(Resume resume) {
        if (resumeMapper.addResume(resume)){
            return true;
        }
        return false;
    }

    @Override
    public List<Resume> getResume(Resume resume) {
        List<Resume> resumes = resumeMapper.getResume(resume);
        if (resumes!=null){
            return resumes;
        }
        return null;
    }
}
