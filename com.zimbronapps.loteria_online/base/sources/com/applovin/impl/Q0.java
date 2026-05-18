package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class q0 {
    private static final List e = Arrays.asList(new String[]{"5.0/i", "4.0/ad", "1.0/mediate"});
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final b4 c;
    private d d;

    public static class b {
        private long a;
        private long b;

        public static /* synthetic */ void a(b bVar, long j) {
            bVar.a(j);
        }

        public static /* synthetic */ void b(b bVar, long j) {
            bVar.b(j);
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        private void a(long j) {
            this.a = j;
        }

        private void b(long j) {
            this.b = j;
        }
    }

    public class c implements S1.b {
        private final String a;
        private final com.applovin.impl.sdk.network.a b;
        private final String c;
        private final Object d;
        private final boolean e;
        private final b f;
        private final e g;

        public /* synthetic */ c(q0 q0Var, String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar, a aVar2) {
            this(str, aVar, str2, obj, z, bVar, eVar);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            int i;
            int c;
            long e = dVar.e();
            Object obj = null;
            try {
                try {
                    c = dVar.c();
                } catch (MalformedURLException e2) {
                    e = e2;
                    i = 0;
                }
                try {
                    if (c <= 0) {
                        q0.a(q0.this, this.c, this.a, c, e, null);
                        this.g.a(this.a, c, null, null);
                        return;
                    }
                    if (c < 200 || c >= 400) {
                        this.g.a(this.a, c, null, null);
                        return;
                    }
                    b bVar = this.f;
                    if (bVar != null) {
                        b.a(bVar, e);
                    }
                    q0.a(q0.this, this.c, this.a, c, e);
                    byte[] d = dVar.d();
                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.e || u4.b(d) != u4.a.d)) {
                        q0.a(q0.this).t().a(d != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.a, this.b.b() != null ? this.b.b().toString() : "");
                    }
                    if (d == null) {
                        this.g.a(this.a, this.d, c);
                        return;
                    }
                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                    b bVar2 = this.f;
                    if (bVar2 != null) {
                        b.b(bVar2, d.length);
                        if (this.b.r()) {
                            q0.a(q0.this, new d(this.b.f(), d.length, e));
                        }
                    }
                    if (this.e) {
                        String b = u4.b(d, q0.a(q0.this).i0(), q0.a(q0.this));
                        if (b == null) {
                            Map hashMap = new HashMap(2);
                            hashMap.put("request", StringUtils.getHostAndPath(this.a));
                            hashMap.put("response", str);
                            q0.a(q0.this).F().trackEvent("rdf", hashMap);
                        }
                        str = b;
                    }
                    try {
                        this.g.a(this.a, q0.a(q0.this, str, this.d), c);
                    } catch (Throwable th) {
                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                        q0.b(q0.this);
                        if (com.applovin.impl.sdk.o.a()) {
                            q0.b(q0.this).a("ConnectionManager", str2, th);
                        }
                        q0.a(q0.this).D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.a)));
                        this.g.a(this.a, -800, str2, null);
                    }
                } catch (MalformedURLException e3) {
                    e = e3;
                    i = c;
                    if (this.d != null) {
                        q0.a(q0.this, this.c, this.a, i, e, e);
                        this.g.a(this.a, -901, e.getMessage(), null);
                    } else {
                        q0.a(q0.this, this.c, this.a, i, e);
                        this.g.a(this.a, this.d, -901);
                    }
                }
            } catch (Throwable th2) {
                int b2 = dVar.b();
                try {
                    byte[] f = dVar.f();
                    String str3 = new String(f);
                    if (f != null) {
                        if (this.e) {
                            str3 = u4.b(f, q0.a(q0.this).i0(), q0.a(q0.this));
                        }
                        obj = q0.a(q0.this, str3, this.d);
                    }
                } catch (Throwable unused) {
                }
                q0.a(q0.this, this.c, this.a, b2, e, th2);
                this.g.a(this.a, b2, th2.getMessage(), obj);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
            this.d = obj;
            this.e = z;
            this.f = bVar;
            this.g = eVar;
        }
    }

    public static class d {
        private final long a = System.currentTimeMillis();
        private final String b;
        private final long c;
        private final long d;

        public d(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.c;
        }

        public long c() {
            return this.a;
        }

        public String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String d = d();
            String d2 = dVar.d();
            return d != null ? d.equals(d2) : d2 == null;
        }

        public int hashCode() {
            long c = c();
            long b = b();
            int i = ((((int) (c ^ (c >>> 32))) + 59) * 59) + ((int) (b ^ (b >>> 32)));
            long a = a();
            String d = d();
            return (((i * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (d == null ? 43 : d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.d;
        }
    }

    public interface e {
        void a(String str, int i, String str2, Object obj);

        void a(String str, Object obj, int i);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.c = b4Var;
        b4Var.a();
    }

    public static /* synthetic */ void a(q0 q0Var, String str, String str2, int i, long j) {
        q0Var.a(str, str2, i, j);
    }

    public static /* synthetic */ com.applovin.impl.sdk.o b(q0 q0Var) {
        return q0Var.b;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(q0 q0Var) {
        return q0Var.a;
    }

    public static /* synthetic */ d a(q0 q0Var, d dVar) {
        q0Var.d = dVar;
        return dVar;
    }

    public static /* synthetic */ Object a(q0 q0Var, String str, Object obj) {
        return q0Var.a(str, obj);
    }

    public static /* synthetic */ void a(q0 q0Var, String str, String str2, int i, long j, Throwable th) {
        q0Var.a(str, str2, i, j, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:34:0x00f9, B:36:0x0109, B:39:0x0135, B:40:0x0131, B:41:0x014a, B:44:0x016f, B:46:0x018b, B:50:0x01ad, B:53:0x0205, B:56:0x0214, B:58:0x021f, B:59:0x01b1, B:62:0x01b9, B:69:0x01d1, B:71:0x01d7, B:72:0x01f1, B:73:0x019a, B:74:0x0222, B:76:0x0228, B:77:0x023c, B:65:0x01ca), top: B:33:0x00f9, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.sdk.network.a r24, com.applovin.impl.q0.b r25, com.applovin.impl.q0.e r26) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.d;
    }

    private Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    private void a(String str, String str2, int i, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + r0.g(this.a) + " to " + a(str2));
        }
    }

    private void a(String str, String str2, int i, long j, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + r0.g(this.a) + " to " + a(str2), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
