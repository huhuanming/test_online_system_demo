package com.thoughtworks.gaia.system.service;

import com.exmertec.yaz.query.EmptyQuery;
import com.thoughtworks.gaia.system.dao.SystemDao;
import com.thoughtworks.gaia.system.model.SystemConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hwwei on 16/11/4.
 */
@Component
@Transactional
public class SystemService {

    @Autowired
    private SystemDao systemDao;

    public boolean getOpenStatus() {
        SystemConfig systemConfig = systemDao.where(new EmptyQuery()).queryFirst();
        if (systemConfig == null) {
            return false;
        }
        return systemConfig.isOpenStatus();
    }

    public void updateOpenStatus(boolean status) {
        SystemConfig systemConfig = systemDao.where(new EmptyQuery()).queryFirst();
        if (systemConfig == null) {
            systemConfig = new SystemConfig(status);
            systemDao.save(systemConfig);
        } else {
            systemConfig.setOpenStatus(status);
        }
    }
}
