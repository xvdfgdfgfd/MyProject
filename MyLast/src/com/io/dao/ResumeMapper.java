package com.io.dao;

import com.io.model.Resume;

import java.util.List;

public interface ResumeMapper {
    List<Resume> getResume(Resume resume);
    boolean addResume(Resume resume);
}
