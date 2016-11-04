package com.thoughtworks.gaia.system.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by hwwei on 16/11/4.
 */
@Entity
@Table(name = "system_cnf")
public class SystemConfig extends IdBaseModel {

    @Column(name = "open_status")
    private boolean openStatus;

    public SystemConfig() {
    }

    public SystemConfig(boolean status) {
        this.openStatus = status;
    }

    public boolean isOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(boolean openStatus) {
        this.openStatus = openStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemConfig that = (SystemConfig) o;

        return openStatus == that.openStatus;

    }

    @Override
    public int hashCode() {
        return (openStatus ? 1 : 0);
    }
}
