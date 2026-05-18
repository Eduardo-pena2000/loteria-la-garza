package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidTcfDataSource implements TcfDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", "IABTCF_TCString");
    }
}
