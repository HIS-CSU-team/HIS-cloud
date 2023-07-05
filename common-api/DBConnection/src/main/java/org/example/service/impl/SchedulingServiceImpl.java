package org.example.service.impl;

import org.example.entity.Scheduling;
import org.example.persistence.SchedulingMapper;
import org.example.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SchedulingService")
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    SchedulingMapper schedulingMapper;

    @Override
    public void addScheduling(Scheduling scheduling) {
        schedulingMapper.insert(scheduling);
    }

    @Override
    public void deleteSchedulingById(int id) {
        schedulingMapper.deleteById(id);
    }

    @Override
    public void updateScheduling(Scheduling scheduling) {
        schedulingMapper.updateById(scheduling);
    }

    @Override
    public Scheduling getSchedulingById(int id) {
        return schedulingMapper.selectById(id);
    }
}
