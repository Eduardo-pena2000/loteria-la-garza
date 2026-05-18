package com.revenuecat.purchases.galaxy.attribution;

import Da.S;
import Qa.l;
import android.app.Application;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GalaxyDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    public void getDeviceIdentifiers(Application application, l lVar) {
        t.g(application, "applicationContext");
        t.g(lVar, "completion");
        lVar.invoke(S.h());
    }
}
