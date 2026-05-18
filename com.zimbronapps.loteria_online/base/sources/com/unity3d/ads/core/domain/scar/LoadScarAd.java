package com.unity3d.ads.core.domain.scar;

import Ca.I;
import Ga.e;
import Ha.c;
import com.unity3d.ads.core.data.manager.ScarManager;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadScarAd {
    private final ScarManager scarManager;

    public LoadScarAd(ScarManager scarManager) {
        t.g(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final Object invoke(String str, String str2, String str3, String str4, String str5, int i, e eVar) {
        if (t.c(str, "banner")) {
            return I.a;
        }
        Object loadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i, eVar);
        return loadAd == c.f() ? loadAd : I.a;
    }
}
