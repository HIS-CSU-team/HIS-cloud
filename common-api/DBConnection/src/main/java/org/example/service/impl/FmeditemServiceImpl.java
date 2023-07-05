package org.example.service.impl;

import org.example.entity.Fmeditem;
import org.example.persistence.FmeditemMapper;
import org.example.service.FmeditemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FmeditemService")
public class FmeditemServiceImpl implements FmeditemService {
    @Autowired
    FmeditemMapper fmeditemMapper;

    @Override
    public void addFmeditem(Fmeditem fmeditem) {
        fmeditemMapper.insert(fmeditem);
    }

    @Override
    public void deleteFmeditemById(int id) {
        fmeditemMapper.deleteById(id);
    }

    @Override
    public void updateFmeditem(Fmeditem fmeditem) {
        fmeditemMapper.updateById(fmeditem);
    }

    @Override
    public Fmeditem getFmeditemById(int id) {
        return fmeditemMapper.selectById(id);
    }
}
