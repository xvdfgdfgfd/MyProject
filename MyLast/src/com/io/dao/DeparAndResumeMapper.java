package com.io.dao;

import com.io.model.DeparAndResume;

import java.util.List;

public interface DeparAndResumeMapper {
    List<DeparAndResume> getDandR();
    boolean addDeparAndRes(DeparAndResume deparAndResume);
    boolean updateDandR(DeparAndResume deparAndResume);
}
