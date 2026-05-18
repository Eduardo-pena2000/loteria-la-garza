package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f extends e2 {
    public f(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.AD);
    }

    public void a(d2 d2Var, com.applovin.impl.sdk.ad.b bVar) {
        a(d2Var, bVar, (Map) new HashMap());
    }

    public void a(d2 d2Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(d2Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(d2 d2Var, u uVar, AppLovinError appLovinError) {
        a(d2Var, uVar, null, appLovinError, new HashMap());
    }

    private void a(d2 d2Var, u uVar, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.a.a(x4.J)).booleanValue() && this.a.G0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
        } else if (uVar != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", uVar.e(), map);
            MaxAdFormat d = uVar.d();
            if (d != null) {
                CollectionUtils.putStringIfValid("ad_format", d.getLabel(), map);
            }
        }
        AppLovinAdSize a = a(uVar, bVar);
        if (a != null) {
            CollectionUtils.putStringIfValid("ad_size", a.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(d2Var, map);
    }

    private AppLovinAdSize a(u uVar, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize f = uVar != null ? uVar.f() : null;
        if (f != null) {
            return f;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
