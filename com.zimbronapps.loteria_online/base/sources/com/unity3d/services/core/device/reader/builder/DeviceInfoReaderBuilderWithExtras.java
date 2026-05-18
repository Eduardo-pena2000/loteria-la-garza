package com.unity3d.services.core.device.reader.builder;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.DeviceInfoReaderWithExtras;
import com.unity3d.services.core.device.reader.IDeviceInfoReader;
import com.unity3d.services.core.device.reader.IGameSessionIdReader;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DeviceInfoReaderBuilderWithExtras extends DeviceInfoReaderBuilder {
    private Map _extras;

    public DeviceInfoReaderBuilderWithExtras(ConfigurationReader configurationReader, PrivacyConfigStorage privacyConfigStorage, IGameSessionIdReader iGameSessionIdReader) {
        super(configurationReader, privacyConfigStorage, iGameSessionIdReader);
    }

    public IDeviceInfoReader build() {
        return this._extras == null ? super.build() : new DeviceInfoReaderWithExtras(super.build(), this._extras);
    }

    public void setExtras(Map map) {
        this._extras = map;
    }
}
