package org.example.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.HerbalTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface HerbalTemplateMapper extends BaseMapper<HerbalTemplate>{
}
