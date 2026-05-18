package com.applovin.impl.sdk.ad;

import com.applovin.impl.f4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends AppLovinAdImpl {
    private AppLovinAd d;
    private final com.applovin.impl.u e;

    public c(com.applovin.impl.u uVar, com.applovin.impl.sdk.k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.e = uVar;
    }

    private AppLovinAd d() {
        return (AppLovinAd) this.sdk.i().f(this.e);
    }

    private String e() {
        com.applovin.impl.u adZone = getAdZone();
        if (adZone == null || adZone.i()) {
            return null;
        }
        return adZone.e();
    }

    public void a(AppLovinAd appLovinAd) {
        this.d = appLovinAd;
    }

    public AppLovinAd c() {
        AppLovinAd appLovinAd = this.d;
        return appLovinAd != null ? appLovinAd : d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd c = c();
        return c != null ? c.equals(obj) : super.equals(obj);
    }

    public AppLovinAd f() {
        return this.d;
    }

    public f4 getAdEventTracker() {
        return null;
    }

    public long getAdIdNumber() {
        AppLovinAd c = c();
        if (c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) c).getAdIdNumber();
        }
        return 0L;
    }

    public com.applovin.impl.u getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.e;
    }

    public long getCreatedAtMillis() {
        AppLovinAd c = c();
        if (c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) c).getCreatedAtMillis();
        }
        return 0L;
    }

    public String getMediationServeId() {
        AppLovinAd c = c();
        if (c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) c).getMediationServeId();
        }
        return null;
    }

    public String getOpenMeasurementContentUrl() {
        return null;
    }

    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    public JSONObject getOriginalFullResponse() {
        AppLovinAd c = c();
        if (c instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) c).getOriginalFullResponse();
        }
        return null;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    public AppLovinAdType getType() {
        return getAdZone().g();
    }

    public String getZoneId() {
        if (this.e.i()) {
            return null;
        }
        return this.e.e();
    }

    public int hashCode() {
        AppLovinAd c = c();
        return c != null ? c.hashCode() : super.hashCode();
    }

    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) c();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public boolean isVideoAd() {
        AppLovinAd c = c();
        return (c instanceof AppLovinAdImpl) && ((AppLovinAdImpl) c).isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + e() + "'}";
    }
}
