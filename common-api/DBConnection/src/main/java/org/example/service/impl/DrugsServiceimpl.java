package org.example.service.impl;

import org.example.entity.drugs;
import org.example.persistence.DrugsMapper;
import org.example.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DrugsService")
public class DrugsServiceimpl implements DrugsService {
    @Autowired
    DrugsMapper drugsMapper;
    @Override
    public void addDrug(drugs drugs) {
    drugsMapper.insert(drugs);
    }
}
