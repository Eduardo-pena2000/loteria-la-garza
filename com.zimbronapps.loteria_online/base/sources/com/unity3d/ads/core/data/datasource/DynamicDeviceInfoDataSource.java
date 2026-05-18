package com.unity3d.ads.core.data.datasource;

import fb.e;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List getLocaleList();

    String getOrientation();

    int getRingerMode();

    e getVolumeSettingsChange();

    boolean hasInternet();
}
