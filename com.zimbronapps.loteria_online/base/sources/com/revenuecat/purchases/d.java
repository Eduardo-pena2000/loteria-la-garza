package com.revenuecat.purchases;

import com.revenuecat.purchases.ForceServerErrorStrategy;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements ForceServerErrorStrategy {
    public final boolean shouldForceServerError(URL url, Endpoint endpoint) {
        return ForceServerErrorStrategy.Companion.b(url, endpoint);
    }
}
