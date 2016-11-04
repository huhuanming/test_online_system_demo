package com.thoughtworks.gaia.system;

import org.springframework.stereotype.Component;

/**
 * Created by hwwei on 16/11/4.
 */
@Component
public class SystemService {

    private boolean status;

    public boolean getOpenStatus() {
        return status;
    }

    public void updateOpenStatus(boolean status) {
        this.status = status;
    }
}
