package org.example.service;

import org.example.entity.HerbalTempDetailed;

public interface HerbalTempDetailedService {
    void addHerbalTempDetailed(HerbalTempDetailed herbalTempDetailed);
    void deleteHerbalTempDetailedById(int id);
    void updateHerbalTempDetailed(HerbalTempDetailed herbalTempDetailed);
    HerbalTempDetailed getHerbalTempDetailedById(int id);
}