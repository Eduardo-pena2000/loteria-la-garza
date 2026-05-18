package com.unity3d.ads.core.data.datasource;

import Za.E;
import android.content.Context;
import com.unity3d.services.core.preferences.AndroidPreferences;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidUnityInfoDataSource {
    private final String prefName;

    public AndroidUnityInfoDataSource(Context applicationContext) {
        t.g(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    private final String getPlayerPrefId(String str) {
        String string = AndroidPreferences.getString(this.prefName, str);
        if (string == null) {
            return null;
        }
        if (E.h0(string)) {
            string = null;
        }
        return string;
    }

    public final String getUnityInstallationId() {
        return getPlayerPrefId("unity_connect.installation_id");
    }

    public final String getUnityMegaSessionId() {
        return getPlayerPrefId("unity_connect.mega_session_id");
    }
}
