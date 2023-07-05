package org.example.persistence;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.PrescriptionDetailed;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PrescriptionDetailedMapper extends BaseMapper<PrescriptionDetailed>{
}
