package com.io.service;

import com.io.model.Resume;

import java.util.List;

public interface ResumeService {
    boolean addResume(Resume resume);
    List<Resume> getResume(Resume resume);
}
