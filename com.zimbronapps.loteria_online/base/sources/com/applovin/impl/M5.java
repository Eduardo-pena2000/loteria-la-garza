package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m5 extends l5 {
    private final com.applovin.impl.sdk.ad.a q;
    private boolean r;
    private boolean s;

    public class a implements e0.a {
        public a() {
        }

        public void a(Uri uri) {
            if (uri != null) {
                m5.a(m5.this).m1();
                m5.a(m5.this).c(uri);
            }
        }
    }

    public class b implements l5.e {
        public b() {
        }

        public void a(String str) {
            m5.a(m5.this).d(m5.a(m5.this, str));
            m5.a(m5.this).b(true);
            com.applovin.impl.sdk.o oVar = m5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.c.a(m5Var.b, "Finish caching non-video resources for ad #" + m5.a(m5.this).getAdIdNumber());
            }
            m5 m5Var2 = m5.this;
            m5Var2.c.f(m5Var2.b, "Ad updated with cachedHTML = " + m5.a(m5.this).g1());
        }
    }

    public m5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.q = aVar;
    }

    public static /* synthetic */ com.applovin.impl.sdk.ad.a a(m5 m5Var) {
        return m5Var.q;
    }

    private String d(String str) {
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            str = n7.c(str);
        }
        if (!this.q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.a.e0().a(str, f2.a((AppLovinAdImpl) this.g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching non-optional HTML resources...");
        }
        this.q.d(d(a(this.q.g1(), this.q.S(), this.q)));
        this.q.b(true);
        a(this.q);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finish caching non-optional HTML resources for ad #" + this.q.getAdIdNumber());
        }
        this.c.f(this.b, "Ad HTML updated to reference locally cached non-optional resources = " + this.q.g1());
    }

    private void n() {
        Uri c;
        if (l() || (c = c(this.q.k1())) == null) {
            return;
        }
        this.q.m1();
        this.q.c(c);
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching HTML resources...");
        }
        return a(this.q.g1(), this.q.S(), new b());
    }

    private e0 p() {
        return b(this.q.k1(), new a());
    }

    private void q() {
        List<String> H = this.q.H();
        if (CollectionUtils.isEmpty((Collection) H)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching optional HTML resources...");
        }
        String g1 = this.q.g1();
        for (String str : H) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Caching optional resource: " + str);
            }
            int a2 = this.a.G().a(str, this.g);
            Map a3 = f2.a((AppLovinAdImpl) this.g);
            String a4 = this.a.G().a(com.applovin.impl.sdk.k.o(), str, this.q.getCachePrefix(), this.q.S(), true, true, a2, this.i, a3);
            if (StringUtils.isValidString(a4)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Updating HTML with cached optional resource: " + a4);
                }
                this.q.a(a4, str);
                g1 = g1.replace(str, a4);
                this.q.d(g1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", a3);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finish caching optional HTML resources for ad #" + this.q.getAdIdNumber());
        }
    }

    public void b(boolean z) {
        this.s = z;
    }

    public void c(boolean z) {
        this.r = z;
    }

    public void run() {
        super.run();
        boolean C0 = this.q.C0();
        boolean z = this.s;
        if (C0 || z) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Begin caching for streaming ad #" + this.q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!C0) {
                    f();
                    d0 o = o();
                    if (o != null) {
                        arrayList.add(o);
                    }
                } else if (this.r) {
                    f();
                    d0 o2 = o();
                    if (o2 != null) {
                        arrayList.add(o2);
                    }
                    e0 p = p();
                    if (p != null) {
                        arrayList.add(p);
                    }
                } else {
                    d0 o3 = o();
                    if (o3 != null) {
                        a(Arrays.asList(new c0[]{o3}));
                    }
                    f();
                    e0 p2 = p();
                    if (p2 != null) {
                        arrayList.add(p2);
                    }
                }
                a((List) arrayList);
                f();
            } else {
                j();
                if (C0) {
                    if (this.r) {
                        f();
                    }
                    m();
                    if (!this.r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Begin processing for non-streaming ad #" + this.q.getAdIdNumber() + "...");
            }
            if (((Boolean) this.a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!o0.d()) {
                    arrayList2.addAll(e());
                }
                d0 o4 = o();
                if (o4 != null) {
                    arrayList2.add(o4);
                }
                e0 p3 = p();
                if (p3 != null) {
                    arrayList2.add(p3);
                }
                a((List) arrayList2);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        }
        k();
    }

    public static /* synthetic */ String a(m5 m5Var, String str) {
        return m5Var.d(str);
    }
}
