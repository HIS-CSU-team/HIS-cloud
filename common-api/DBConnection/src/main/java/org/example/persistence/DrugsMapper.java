package org.example.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.drugs;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface DrugsMapper extends BaseMapper<drugs> {
}
