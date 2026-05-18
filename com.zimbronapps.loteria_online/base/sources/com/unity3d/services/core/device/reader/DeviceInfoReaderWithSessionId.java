package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.properties.Session;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderWithSessionId implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Session _session;

    public DeviceInfoReaderWithSessionId(IDeviceInfoReader iDeviceInfoReader, Session session) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._session = session;
    }

    public Map getDeviceInfoData() {
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("sessionId", this._session.getId());
        return deviceInfoData;
    }
}
