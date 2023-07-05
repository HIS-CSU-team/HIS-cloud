package org.example.service;

import org.example.entity.Scheduling;

public interface SchedulingService {

    void addScheduling(Scheduling scheduling);

    void deleteSchedulingById(int id);

    void updateScheduling(Scheduling scheduling);

    Scheduling getSchedulingById(int id);
}