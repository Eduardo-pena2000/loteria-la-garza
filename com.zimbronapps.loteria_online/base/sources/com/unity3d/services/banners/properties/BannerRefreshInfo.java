package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BannerRefreshInfo {
    private static BannerRefreshInfo instance;
    private HashMap _refreshRateMap = new HashMap();

    public static BannerRefreshInfo getInstance() {
        if (instance == null) {
            instance = new BannerRefreshInfo();
        }
        return instance;
    }

    public synchronized Integer getRefreshRate(String str) {
        return (Integer) this._refreshRateMap.get(str);
    }

    public synchronized void setRefreshRate(String str, Integer num) {
        this._refreshRateMap.put(str, num);
    }
}
