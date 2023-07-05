package org.example.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.entity.SettleCategory;
import org.springframework.stereotype.Repository;


@Repository
public interface SettleCategoryMapper extends BaseMapper<SettleCategory> {
}
