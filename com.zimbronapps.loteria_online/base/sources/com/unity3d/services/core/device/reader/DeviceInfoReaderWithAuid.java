package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(IDeviceInfoReader _deviceInfoReader) {
        t.g(_deviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = _deviceInfoReader;
    }

    public Map getDeviceInfoData() {
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        t.f(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        String auid = Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
