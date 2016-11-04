package com.thoughtworks.gaia.system.dao;

import com.thoughtworks.gaia.common.jpa.BaseDaoWrapper;
import com.thoughtworks.gaia.system.model.SystemConfig;
import org.springframework.stereotype.Component;

/**
 * Created by hwwei on 16/11/4.
 */
@Component
public class SystemDao extends BaseDaoWrapper<SystemConfig> {
    protected SystemDao() {
        super(SystemConfig.class);
    }
}
