package com.io.service.Impl;

import com.io.dao.DeparAndResumeMapper;
import com.io.model.DeparAndResume;
import com.io.service.DeparAndResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deparandresumeService")
public class DeparAndResumeServiceImpl implements DeparAndResumeService {
    @Resource
    private DeparAndResumeMapper deparAndResumeMapper;

    @Override
    public List<DeparAndResume> getDandR() {
        List<DeparAndResume> deparAndResumes = deparAndResumeMapper.getDandR();
        if (deparAndResumes!=null){
            return deparAndResumes;
        }
        return null;
    }

    @Override
    public boolean addDeparAndRes(DeparAndResume deparAndResume) {
        if (deparAndResumeMapper.addDeparAndRes(deparAndResume)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDandR(DeparAndResume deparAndResume) {
        return deparAndResumeMapper.updateDandR(deparAndResume);
    }
}
