package org.example.service.impl;

import org.example.entity.Rule;
import org.example.persistence.RuleMapper;
import org.example.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RuleService")
public class RuleServiceImpl implements RuleService {
    @Autowired
    RuleMapper ruleMapper;

    @Override
    public void addRule(Rule rule) {
        ruleMapper.insert(rule);
    }

    @Override
    public void deleteRuleById(int id) {
        ruleMapper.deleteById(id);
    }

    @Override
    public void updateRule(Rule rule) {
        ruleMapper.updateById(rule);
    }

    @Override
    public Rule getRuleById(int id) {
        return ruleMapper.selectById(id);
    }
}
