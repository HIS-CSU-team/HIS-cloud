package org.example.service;

import org.example.entity.Rule;

public interface RuleService {

    void addRule(Rule rule);

    void deleteRuleById(int id);

    void updateRule(Rule rule);

    Rule getRuleById(int id);
}