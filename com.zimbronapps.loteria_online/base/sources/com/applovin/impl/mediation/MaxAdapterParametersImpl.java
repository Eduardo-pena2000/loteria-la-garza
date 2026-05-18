package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {
    private String a;
    private Map b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private long k;
    private MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl a = a((k3) y2Var);
        a.i = y2Var.R();
        a.j = y2Var.D();
        a.k = y2Var.C();
        return a;
    }

    public MaxAdFormat getAdFormat() {
        return this.l;
    }

    public String getAdUnitId() {
        return this.a;
    }

    public long getBidExpirationMillis() {
        return this.k;
    }

    public String getBidResponse() {
        return this.j;
    }

    public String getConsentString() {
        return this.g;
    }

    public Bundle getCustomParameters() {
        return this.d;
    }

    public Map getLocalExtraParameters() {
        return this.b;
    }

    public Bundle getServerParameters() {
        return this.c;
    }

    public String getThirdPartyAdPlacementId() {
        return this.i;
    }

    public Boolean hasUserConsent() {
        return this.e;
    }

    public Boolean isAgeRestrictedUser() {
        return null;
    }

    public Boolean isDoNotSell() {
        return this.f;
    }

    public boolean isTesting() {
        return this.h;
    }

    public static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(d5Var);
        a.a = str;
        a.l = maxAdFormat;
        return a;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.e = k3Var.n();
        maxAdapterParametersImpl.f = k3Var.o();
        maxAdapterParametersImpl.g = k3Var.d();
        maxAdapterParametersImpl.b = k3Var.i();
        maxAdapterParametersImpl.c = k3Var.l();
        maxAdapterParametersImpl.d = k3Var.f();
        maxAdapterParametersImpl.h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
