package org.example.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.drugs;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugsMapper extends BaseMapper<drugs> {
}
