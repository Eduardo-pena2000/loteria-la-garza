package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class n5 extends l5 {
    private final o7 q;

    public class a implements e0.a {
        final /* synthetic */ w7 a;

        public a(w7 w7Var) {
            this.a = w7Var;
        }

        public void a(Uri uri) {
            if (uri != null) {
                this.a.a(uri);
                n5.a(n5.this).b(true);
                return;
            }
            com.applovin.impl.sdk.o oVar = n5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var = n5.this;
                n5Var.c.b(n5Var.b, "Failed to cache static companion ad");
            }
        }
    }

    public class b implements l5.e {
        final /* synthetic */ w7 a;

        public b(w7 w7Var) {
            this.a = w7Var;
        }

        public void a(String str) {
            this.a.a(str);
            n5.a(n5.this).b(true);
        }
    }

    public class c implements l5.e {
        final /* synthetic */ w7 a;

        public c(w7 w7Var) {
            this.a = w7Var;
        }

        public void a(String str) {
            this.a.a(str);
            n5.a(n5.this).b(true);
        }
    }

    public class d implements e0.a {
        final /* synthetic */ c8 a;

        public d(c8 c8Var) {
            this.a = c8Var;
        }

        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.o oVar = n5.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    n5 n5Var = n5.this;
                    n5Var.c.a(n5Var.b, "Video file successfully cached into: " + uri);
                }
                this.a.a(uri);
                return;
            }
            com.applovin.impl.sdk.o oVar2 = n5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var2 = n5.this;
                n5Var2.c.b(n5Var2.b, "Failed to cache video file: " + this.a);
            }
        }
    }

    public class e implements l5.e {
        public e() {
        }

        public void a(String str) {
            if (n5.a(n5.this).isOpenMeasurementEnabled()) {
                str = n5.this.a.e0().a(str, f2.a((AppLovinAdImpl) n5.this.g));
            }
            n5.a(n5.this).d(str);
            com.applovin.impl.sdk.o oVar = n5.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                n5 n5Var = n5.this;
                n5Var.c.a(n5Var.b, "Finish caching HTML template " + n5.a(n5.this).i1() + " for ad #" + n5.a(n5.this).getAdIdNumber());
            }
        }
    }

    public n5(o7 o7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", o7Var, kVar, appLovinAdLoadListener);
        this.q = o7Var;
    }

    public static /* synthetic */ o7 a(n5 n5Var) {
        return n5Var.q;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(x4.h5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri a2 = a(str2, Collections.emptyList(), false);
                if (a2 != null) {
                    str = str.replace(str2, a2.toString());
                    this.g.a(a2.toString(), str2);
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void m() {
        if (l()) {
            return;
        }
        if (!this.q.u1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        r7 g1 = this.q.g1();
        if (g1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        w7 e2 = g1.e();
        if (e2 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri c2 = e2.c();
        String uri = c2 != null ? c2.toString() : "";
        String b2 = e2.b();
        if (!URLUtil.isValidUrl(uri) && !StringUtils.isValidString(b2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (e2.d() == w7.a.b) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Caching static companion ad at " + uri + "...");
            }
            Uri a2 = a(uri, Collections.emptyList(), false);
            if (a2 != null) {
                e2.a(a2);
                this.q.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (e2.d() != w7.a.d) {
            if (e2.d() == w7.a.c && com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(uri)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + b2);
            }
            if (((Boolean) this.a.a(x4.g5)).booleanValue()) {
                b2 = d(b2);
            }
            e2.a(a(b2, Collections.emptyList(), this.q));
            this.q.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
        }
        String c3 = c(uri, null, false);
        if (StringUtils.isValidString(c3)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "HTML fetched. Caching HTML now...");
            }
            e2.a(a(c3, Collections.emptyList(), this.q));
            this.q.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Unable to load companion ad resources from " + uri);
        }
    }

    private void n() {
        if (l() || !a8.a(this.q)) {
            return;
        }
        String i1 = this.q.i1();
        if (!StringUtils.isValidString(i1)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String a2 = a(i1, this.q.S(), this.g);
        if (this.q.isOpenMeasurementEnabled()) {
            a2 = this.a.e0().a(a2, f2.a((AppLovinAdImpl) this.g));
        }
        this.q.d(a2);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finish caching HTML template " + this.q.i1() + " for ad #" + this.q.getAdIdNumber());
        }
    }

    private void o() {
        c8 q1;
        Uri e2;
        if (l()) {
            return;
        }
        if (!this.q.v1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.q.p1() == null || (q1 = this.q.q1()) == null || (e2 = q1.e()) == null) {
            return;
        }
        Uri b2 = b(e2.toString(), Collections.emptyList(), false);
        if (b2 != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Video file successfully cached into: " + b2);
            }
            q1.a(b2);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "Failed to cache video file: " + q1);
        }
    }

    private c0 p() {
        if (!this.q.u1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        r7 g1 = this.q.g1();
        if (g1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        w7 e2 = g1.e();
        if (e2 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri c2 = e2.c();
        String uri = c2 != null ? c2.toString() : "";
        String b2 = e2.b();
        if (URLUtil.isValidUrl(uri) || StringUtils.isValidString(b2)) {
            if (e2.d() == w7.a.b) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Caching static companion ad at " + uri + "...");
                }
                return new e0(uri, this.q, Collections.emptyList(), false, this.i, this.a, new a(e2));
            }
            if (e2.d() == w7.a.d) {
                if (!StringUtils.isValidString(uri)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Caching provided HTML for companion ad. No fetch required. HTML: " + b2);
                    }
                    return a(b2, Collections.emptyList(), new c(e2));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Begin caching HTML companion ad. Fetching from " + uri + "...");
                }
                String c3 = c(uri, null, false);
                if (StringUtils.isValidString(c3)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "HTML fetched. Caching HTML now...");
                    }
                    return a(c3, Collections.emptyList(), new b(e2));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.b(this.b, "Unable to load companion ad resources from " + uri);
                }
            } else if (e2.d() == w7.a.c && com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.c.k(this.b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    public void f() {
        this.q.getAdEventTracker().h();
        super.f();
    }

    public d0 q() {
        if (!TextUtils.isEmpty(this.q.i1())) {
            return a(this.q.i1(), this.q.S(), new e());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return null;
        }
        this.c.a(this.b, "Unable to load HTML template");
        return null;
    }

    public e0 r() {
        c8 q1;
        Uri e2;
        if (!this.q.v1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.q.p1() == null || (q1 = this.q.q1()) == null || (e2 = q1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Caching video file " + q1 + " creative...");
        }
        return a(e2.toString(), Collections.emptyList(), false, new d(q1));
    }

    public void run() {
        super.run();
        boolean C0 = this.q.C0();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.c;
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("Begin caching for VAST ");
            sb.append(C0 ? "streaming " : "");
            sb.append("ad #");
            sb.append(this.g.getAdIdNumber());
            sb.append("...");
            oVar.a(str, sb.toString());
        }
        if (C0) {
            if (((Boolean) this.a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                if (this.q.s1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    c0 p = p();
                    if (p != null) {
                        arrayList.add(p);
                    }
                    d0 q = q();
                    if (q != null) {
                        arrayList.add(q);
                    }
                    e0 r = r();
                    if (r != null) {
                        arrayList.add(r);
                    }
                    a((List) arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.q.j1() == o7.c.a) {
                        c0 p2 = p();
                        if (p2 != null) {
                            arrayList2.add(p2);
                        }
                        d0 q2 = q();
                        if (q2 != null) {
                            arrayList2.add(q2);
                        }
                        a((List) arrayList2);
                        f();
                        e0 r2 = r();
                        if (r2 != null) {
                            arrayList3.add(r2);
                        }
                        a((List) arrayList3);
                    } else {
                        e0 r3 = r();
                        if (r3 != null) {
                            arrayList2.add(r3);
                        }
                        a((List) arrayList2);
                        f();
                        c0 p3 = p();
                        if (p3 != null) {
                            arrayList3.add(p3);
                        }
                        d0 q3 = q();
                        if (q3 != null) {
                            arrayList3.add(q3);
                        }
                        a((List) arrayList3);
                    }
                }
            } else {
                j();
                if (this.q.s1()) {
                    f();
                }
                o7.c j1 = this.q.j1();
                o7.c cVar = o7.c.a;
                if (j1 == cVar) {
                    m();
                    n();
                    a(this.q);
                } else {
                    o();
                }
                if (!this.q.s1()) {
                    f();
                }
                if (this.q.j1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.q);
                }
            }
        } else if (((Boolean) this.a.a(x4.I0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!o0.d()) {
                arrayList4.addAll(e());
            }
            c0 p4 = p();
            if (p4 != null) {
                arrayList4.add(p4);
            }
            e0 r4 = r();
            if (r4 != null) {
                arrayList4.add(r4);
            }
            d0 q4 = q();
            if (q4 != null) {
                arrayList4.add(q4);
            }
            a((List) arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.q);
            f();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Finished caching VAST ad #" + this.q.getAdIdNumber());
        }
        this.q.t1();
        k();
    }

    public void a(int i) {
        this.q.getAdEventTracker().f();
        super.a(i);
    }
}
