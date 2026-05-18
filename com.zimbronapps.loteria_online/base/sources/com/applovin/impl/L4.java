package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class l4 extends f4 {
    static final /* synthetic */ boolean p = true;
    private final o7 h;
    private final AtomicBoolean i;
    private MediaEvents j;
    private final VastProperties k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;

    public l4(o7 o7Var) {
        super(o7Var);
        this.i = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.h = o7Var;
        float m1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.k = VastProperties.createVastPropertiesForSkippableMedia(m1, true, Position.STANDALONE);
        }
    }

    public static /* synthetic */ void i(l4 l4Var) {
        l4Var.m();
    }

    public static /* synthetic */ void j(l4 l4Var) {
        l4Var.o();
    }

    public static /* synthetic */ void k(l4 l4Var, boolean z) {
        l4Var.a(z);
    }

    public static /* synthetic */ void l(l4 l4Var) {
        l4Var.u();
    }

    public static /* synthetic */ void m(l4 l4Var) {
        l4Var.p();
    }

    public static /* synthetic */ void n(l4 l4Var) {
        l4Var.s();
    }

    public static /* synthetic */ void o(l4 l4Var) {
        l4Var.k();
    }

    public static /* synthetic */ void p(l4 l4Var) {
        l4Var.q();
    }

    public static /* synthetic */ void q(l4 l4Var) {
        l4Var.n();
    }

    public static /* synthetic */ void r(l4 l4Var) {
        l4Var.r();
    }

    public static /* synthetic */ void s(l4 l4Var) {
        l4Var.l();
    }

    public static /* synthetic */ void t(l4 l4Var) {
        l4Var.t();
    }

    public static /* synthetic */ void u(l4 l4Var, float f, boolean z) {
        l4Var.a(f, z);
    }

    public void A() {
        b("track resumed", new I2(this));
    }

    public void B() {
        b("track skipped", new M2(this));
    }

    public void C() {
        if (this.o.compareAndSet(false, true)) {
            b("track third quartile", new G2(this));
        }
    }

    public AdSessionContext a(WebView webView) {
        if (!p && this.h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.h.e1().b()) {
            List<v7> c = p7Var.c();
            if (c.isEmpty()) {
                a8.a(p7Var.b(), t7.e, this.b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : c) {
                    if ("omid".equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.d, this.b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((v7) it.next()).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.c.a(this.d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.e, this.b);
                    } else {
                        String e = p7Var.e();
                        String d = p7Var.d();
                        if (!StringUtils.isValidString(e) || StringUtils.isValidString(d)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(e) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(d, url, e) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.e, this.b);
                        }
                    }
                }
            }
        }
        String a = this.b.e0().a();
        if (TextUtils.isEmpty(a)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.b.e0().b(), a, arrayList, this.h.getOpenMeasurementContentUrl(), this.h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.c.a(this.d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(float f, boolean z) {
        if (this.l.compareAndSet(false, true)) {
            b("track started", new D2(this, f, z));
        }
    }

    public void h() {
        b("track loaded", new J2(this));
    }

    public void v() {
        b("track clicked", new O2(this));
    }

    public void w() {
        b("track completed", new F2(this));
    }

    public void x() {
        if (this.m.compareAndSet(false, true)) {
            b("track first quartile", new H2(this));
        }
    }

    public void y() {
        if (this.n.compareAndSet(false, true)) {
            b("track midpoint", new N2(this));
        }
    }

    public void z() {
        b("track paused", new K2(this));
    }

    private /* synthetic */ void k() {
        this.j.bufferFinish();
    }

    private /* synthetic */ void l() {
        this.j.bufferStart();
    }

    private /* synthetic */ void m() {
        this.j.adUserInteraction(InteractionType.CLICK);
    }

    private /* synthetic */ void n() {
        this.j.complete();
    }

    private /* synthetic */ void o() {
        this.j.firstQuartile();
    }

    private /* synthetic */ void p() {
        this.g.loaded(this.k);
    }

    private /* synthetic */ void q() {
        this.j.midpoint();
    }

    private /* synthetic */ void r() {
        this.j.pause();
    }

    private /* synthetic */ void s() {
        this.j.resume();
    }

    private /* synthetic */ void t() {
        this.j.skipped();
    }

    private /* synthetic */ void u() {
        this.j.thirdQuartile();
    }

    public void i() {
        if (this.i.compareAndSet(true, false)) {
            b("buffer finished", new C2(this));
        }
    }

    public void j() {
        if (this.i.compareAndSet(false, true)) {
            b("buffer started", new L2(this));
        }
    }

    public void b(boolean z) {
        b("track volume changed", new E2(this, z));
    }

    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    public void a(AdSession adSession) {
        try {
            this.j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.d, "Failed to create media events", th);
            }
        }
    }

    private /* synthetic */ void a(float f, boolean z) {
        this.j.start(f, z ? 0.0f : 1.0f);
    }

    private /* synthetic */ void a(boolean z) {
        this.j.volumeChange(z ? 0.0f : 1.0f);
    }
}
