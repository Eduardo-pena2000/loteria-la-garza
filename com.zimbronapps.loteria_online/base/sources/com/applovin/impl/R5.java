package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class r5 extends i5 {
    protected final u g;
    private final String h;

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.g = uVar;
        this.h = kVar.b();
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.g.e());
        if (this.g.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.g.g().getLabel());
        }
        return hashMap;
    }

    public abstract i5 a(JSONObject jSONObject);

    public void a(int i, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Unable to fetch " + this.g + " ad: server returned " + i);
        }
        this.a.g().a(d2.z, this.g, new AppLovinError(i, str));
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.a);
        r0.b(jSONObject, this.a);
        r0.a(jSONObject, this.a);
        u.a(jSONObject);
        this.a.q0().a(a(jSONObject));
    }

    public abstract String e();

    public abstract String f();

    public Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.g.e());
        if (this.g.f() != null) {
            hashMap.put("size", this.g.f().getLabel());
        }
        if (this.g.g() != null) {
            hashMap.put("require", this.g.g().getLabel());
        }
        return hashMap;
    }

    public void run() {
        u4.a aVar;
        HashMap hashMap;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Fetching next ad of zone: " + this.g);
        }
        if (((Boolean) this.a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "User is connected to a VPN");
        }
        n7.a(this.a, this.b);
        this.a.g().a(d2.x, this.g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.a.a(x4.h3)).booleanValue()) {
                aVar = u4.a.a(((Integer) this.a.a(x4.s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.a.A().a(h(), false, true));
                hashMap = new HashMap();
                if (!((Boolean) this.a.a(x4.D5)).booleanValue() && !((Boolean) this.a.a(x4.z5)).booleanValue()) {
                    hashMap.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
                    hashMap.put("sdk_key", this.a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                u4.a a2 = u4.a.a(((Integer) this.a.a(x4.t5)).intValue());
                HashMap a3 = n7.a(this.a.A().a(h(), false, false));
                if (!((Boolean) this.a.a(x4.M6)).booleanValue()) {
                    a3.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVar = a2;
                hashMap = a3;
            }
            if (n7.h(a()) || n7.j(a())) {
                hashMap.putAll(this.a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.h)) {
                hashMap.put("sts", this.h);
            }
            a.a f = com.applovin.impl.sdk.network.a.a(this.a).b(f()).a(e()).b((Map) hashMap).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.a.a(x4.W2)).intValue()).c(((Boolean) this.a.a(x4.X2)).booleanValue()).d(((Boolean) this.a.a(x4.Y2)).booleanValue()).c(((Integer) this.a.a(x4.V2)).intValue()).a(aVar).f(true);
            if (andResetCustomPostBody != null) {
                f.a(andResetCustomPostBody);
                f.b(((Boolean) this.a.a(x4.N5)).booleanValue());
            }
            a aVar2 = new a(f.a(), this.a);
            aVar2.c(x4.l0);
            aVar2.b(x4.m0);
            this.a.q0().a(aVar2);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to fetch ad for zone id: " + this.g, th);
            }
            a(0, th.getMessage());
        }
    }

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, JSONObject jSONObject, int i) {
            if (i == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.l.b());
                Map hashMap = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), hashMap);
                CollectionUtils.putStringIfValid("code", String.valueOf(i), hashMap);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.g.e(), hashMap);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.l.a()), hashMap);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.l.b()), hashMap);
                this.a.g().d(d2.y, hashMap);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            r5.this.a(i, str2);
            this.a.D().a("fetchAd", str, i, str2);
        }
    }
}
