package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import com.unity3d.services.core.misc.JsonStorageAggregator;
import com.unity3d.services.core.misc.Utilities;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderWithStorageInfo implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;
    private final JsonFlattenerRules _jsonFlattenerRules;
    private final List _storageReaders;

    public DeviceInfoReaderWithStorageInfo(IDeviceInfoReader iDeviceInfoReader, JsonFlattenerRules jsonFlattenerRules, IJsonStorageReader... iJsonStorageReaderArr) {
        this._deviceInfoReader = iDeviceInfoReader;
        this._jsonFlattenerRules = jsonFlattenerRules;
        this._storageReaders = Arrays.asList(iJsonStorageReaderArr);
    }

    public Map getDeviceInfoData() {
        Map deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        return deviceInfoData != null ? Utilities.combineJsonIntoMap(deviceInfoData, new JsonFlattener(new JsonStorageAggregator(this._storageReaders).getData()).flattenJson(".", this._jsonFlattenerRules)) : deviceInfoData;
    }
}
