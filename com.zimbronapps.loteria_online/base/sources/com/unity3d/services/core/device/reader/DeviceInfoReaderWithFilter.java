package com.unity3d.services.core.device.reader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderWithFilter implements IDeviceInfoReader {
    IDeviceInfoReader _deviceInfoReader;
    List _keysToExclude;

    public DeviceInfoReaderWithFilter(IDeviceInfoReader iDeviceInfoReader, List list) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._keysToExclude = list;
    }

    public Map getDeviceInfoData() {
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        List list = this._keysToExclude;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                deviceInfoData.remove((String) it.next());
            }
        }
        return deviceInfoData;
    }
}
