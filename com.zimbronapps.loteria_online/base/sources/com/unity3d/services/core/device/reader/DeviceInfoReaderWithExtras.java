package com.unity3d.services.core.device.reader;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderWithExtras implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final Map _extras;

    public DeviceInfoReaderWithExtras(IDeviceInfoReader iDeviceInfoReader, Map map) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._extras = map;
    }

    public Map getDeviceInfoData() {
        Map map;
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        if (deviceInfoData != null && (map = this._extras) != null) {
            deviceInfoData.putAll(map);
        }
        return deviceInfoData;
    }
}
