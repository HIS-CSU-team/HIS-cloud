package org.example.service;

import org.example.entity.Fmeditem;

public interface FmeditemService {
    void addFmeditem(Fmeditem fmeditem);
    void deleteFmeditemById(int id);
    void updateFmeditem(Fmeditem fmeditem);
    Fmeditem getFmeditemById(int id);
}