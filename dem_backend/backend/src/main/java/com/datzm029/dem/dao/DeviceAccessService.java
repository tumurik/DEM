package com.datzm029.dem.dao;

import com.datzm029.dem.model.IOTDevice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres_device")
public class DeviceAccessService implements Dao<IOTDevice> {
    @Override
    public IOTDevice insert(IOTDevice device) {
        return null;
    }

    @Override
    public List<IOTDevice> selectAll() {
        return null;
    }

    @Override
    public IOTDevice checkIfExist(IOTDevice object) {
        return null;
    }
}
