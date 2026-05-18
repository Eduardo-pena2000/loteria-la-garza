package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MobileAdsBridge extends MobileAdsBridgeBase {
    public static final int CODE_21 = 21;
    public static final String versionMethodName = "getVersion";
    private ConfigurationReader _configurationReader;

    public class 1 extends HashMap {
        public 1() throws RuntimeException, Error {
            try {
                put("initialize", new Class[]{Context.class, OnInitializationCompleteListener.class});
            } catch (ClassNotFoundException e) {
                DeviceLog.debug("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
            }
            put("getInitializationStatus", new Class[0]);
            put("getVersion", new Class[0]);
        }
    }

    public MobileAdsBridge() {
        super(new 1());
        this._configurationReader = new ConfigurationReader();
    }

    public ScarAdapterVersion getAdapterVersion(int i) {
        return i == -1 ? ScarAdapterVersion.NA : i < 23 ? ScarAdapterVersion.V21 : ScarAdapterVersion.V23;
    }

    public int getVersionCodeIndex() {
        return 0;
    }

    public String getVersionMethodName() {
        return "getVersion";
    }

    public boolean hasSCARBiddingSupport() {
        return true;
    }

    public boolean shouldInitialize() {
        return this._configurationReader.getCurrentConfiguration().getExperiments().isScarInitEnabled();
    }
}
