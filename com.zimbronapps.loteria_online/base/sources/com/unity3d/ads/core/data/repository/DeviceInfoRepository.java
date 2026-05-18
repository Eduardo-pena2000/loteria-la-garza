package com.unity3d.ads.core.data.repository;

import Ga.e;
import fb.z;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    z getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(e eVar);

    Object getAuidString(e eVar);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(e eVar);

    List getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    Object getUnityBuildGuid(e eVar);

    fb.e getVolumeSettingsChange();

    Object staticDeviceInfo(e eVar);
}
