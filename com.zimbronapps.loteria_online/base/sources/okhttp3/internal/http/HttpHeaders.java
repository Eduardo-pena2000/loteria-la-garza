package okhttp3.internal.http;

import Za.B;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import xb.e;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpHeaders {
    public static final h a;
    public static final h b;

    static {
        h.a aVar = h.d;
        a = aVar.d("\"\\");
        b = aVar.d("\t ,=");
    }

    public static final List a(Headers headers, String headerName) {
        t.g(headers, "<this>");
        t.g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (B.z(headerName, headers.e(i), true)) {
                try {
                    c(new e().writeUtf8(headers.h(i)), arrayList);
                } catch (EOFException e) {
                    Platform.a.g().k("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        t.g(response, "<this>");
        if (t.c(response.A().h(), "HEAD")) {
            return false;
        }
        int f = response.f();
        return (((f >= 100 && f < 200) || f == 204 || f == 304) && Util.v(response) == -1 && !B.z("chunked", Response.o(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(xb.e r7, java.util.List r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = Da.S.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.L(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L5c
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.String r4 = "="
            java.lang.String r4 = Za.B.D(r4, r5)
            java.lang.String r3 = kotlin.jvm.internal.t.o(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.t.f(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.L(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = okhttp3.internal.Util.L(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = d(r7)
            goto La0
        L9c:
            java.lang.String r6 = e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.c(xb.e, java.util.List):void");
    }

    public static final String d(e eVar) {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e eVar2 = new e();
        while (true) {
            long r = eVar.r(a);
            if (r == -1) {
                return null;
            }
            if (eVar.k(r) == 34) {
                eVar2.j1(eVar, r);
                eVar.readByte();
                return eVar2.readUtf8();
            }
            if (eVar.A() == r + 1) {
                return null;
            }
            eVar2.j1(eVar, r);
            eVar.readByte();
            eVar2.j1(eVar, 1L);
        }
    }

    public static final String e(e eVar) {
        long r = eVar.r(b);
        if (r == -1) {
            r = eVar.A();
        }
        if (r != 0) {
            return eVar.readUtf8(r);
        }
        return null;
    }

    public static final void f(CookieJar cookieJar, HttpUrl url, Headers headers) {
        t.g(cookieJar, "<this>");
        t.g(url, "url");
        t.g(headers, "headers");
        if (cookieJar == CookieJar.b) {
            return;
        }
        List e = Cookie.j.e(url, headers);
        if (e.isEmpty()) {
            return;
        }
        cookieJar.b(url, e);
    }

    public static final boolean g(e eVar) {
        boolean z = false;
        while (!eVar.exhausted()) {
            byte k = eVar.k(0L);
            if (k == 44) {
                eVar.readByte();
                z = true;
            } else {
                if (k != 32 && k != 9) {
                    break;
                }
                eVar.readByte();
            }
        }
        return z;
    }

    public static final boolean h(e eVar, byte b2) {
        return !eVar.exhausted() && eVar.k(0L) == b2;
    }
}
