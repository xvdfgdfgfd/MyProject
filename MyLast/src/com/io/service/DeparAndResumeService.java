package com.io.service;

import com.io.dao.DeparAndResumeMapper;
import com.io.model.DeparAndResume;

import java.util.List;

public interface DeparAndResumeService {
    List<DeparAndResume> getDandR();
    boolean addDeparAndRes(DeparAndResume deparAndResume);
    boolean updateDandR(DeparAndResume deparAndResume);
}
