package com.unity3d.ads.core.data.datasource;

import Ga.e;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List list, e eVar);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(e eVar);

    Object getIdfi(e eVar);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();

    Object getUnityBuildGuid(e eVar);
}
