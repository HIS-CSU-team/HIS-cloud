package org.example.service;

import org.example.entity.HerbalDetailed;

public interface HerbalDetailedService {
    void addHerbalDetailed(HerbalDetailed herbalDetailed);
    void deleteHerbalDetailedById(int id);
    void updateHerbalDetailed(HerbalDetailed herbalDetailed);
    HerbalDetailed getHerbalDetailedById(int id);
}