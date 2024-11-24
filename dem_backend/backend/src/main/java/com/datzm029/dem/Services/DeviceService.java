package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import com.datzm029.dem.model.IOTDevice;
import org.springframework.stereotype.Service;

@Service

public class DeviceService {

    private final Dao dao;

    public DeviceService(Dao dao) {
        this.dao = dao;
    }

    public IOTDevice addDevice(IOTDevice deviced){
        return (IOTDevice) dao.insert(deviced);
    }
}
