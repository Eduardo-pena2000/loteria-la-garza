package Y4;

import V4.p;
import V4.q;
import W4.a;
import Y4.i;
import Za.B;
import Za.E;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements i {
    public static final a f = new a(null);
    public static final CacheControl g = new CacheControl.Builder().d().e().a();
    public static final CacheControl h = new CacheControl.Builder().d().f().a();
    public final String a;
    public final e5.m b;
    public final Ca.l c;
    public final Ca.l d;
    public final boolean e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements i.a {
        public final Ca.l a;
        public final Ca.l b;
        public final boolean c;

        public b(Ca.l lVar, Ca.l lVar2, boolean z) {
            this.a = lVar;
            this.b = lVar2;
            this.c = z;
        }

        private final boolean c(Uri uri) {
            return t.c(uri.getScheme(), "http") || t.c(uri.getScheme(), "https");
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, e5.m mVar, T4.d dVar) {
            if (c(uri)) {
                return new k(uri.toString(), mVar, this.a, this.b, this.c);
            }
            return null;
        }
    }

    public static final class c extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return k.b(k.this, null, this);
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(String str, e5.m mVar, Ca.l lVar, Ca.l lVar2, boolean z) {
        this.a = str;
        this.b = mVar;
        this.c = lVar;
        this.d = lVar2;
        this.e = z;
    }

    public static final /* synthetic */ Object b(k kVar, Request request, Ga.e eVar) {
        return kVar.c(request, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:14:0x0188, B:36:0x011e, B:38:0x012c, B:40:0x013a, B:41:0x0143, B:43:0x014d, B:45:0x0155, B:47:0x016d), top: B:35:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:14:0x0188, B:36:0x011e, B:38:0x012c, B:40:0x013a, B:41:0x0143, B:43:0x014d, B:45:0x0155, B:47:0x016d), top: B:35:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Ga.e r13) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.k.a(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(okhttp3.Request r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Y4.k.c
            if (r0 == 0) goto L13
            r0 = r6
            Y4.k$c r0 = (Y4.k.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Y4.k$c r0 = new Y4.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            boolean r6 = j5.j.q()
            if (r6 == 0) goto L5d
            e5.m r6 = r4.b
            e5.b r6 = r6.k()
            boolean r6 = r6.b()
            if (r6 != 0) goto L57
            Ca.l r6 = r4.c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.a(r5)
            okhttp3.Response r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            Ca.l r6 = r4.c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.a(r5)
            r0.c = r3
            java.lang.Object r6 = j5.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.s()
            if (r6 != 0) goto L92
            int r6 = r5.f()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.a()
            if (r6 == 0) goto L8c
            j5.j.d(r6)
        L8c:
            d5.d r6 = new d5.d
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.k.c(okhttp3.Request, Ga.e):java.lang.Object");
    }

    public final String d() {
        String h2 = this.b.h();
        return h2 == null ? this.a : h2;
    }

    public final xb.l e() {
        Object value = this.d.getValue();
        t.d(value);
        return ((W4.a) value).c();
    }

    public final String f(String str, MediaType mediaType) {
        String j;
        String mediaType2 = mediaType != null ? mediaType.toString() : null;
        if ((mediaType2 == null || B.N(mediaType2, "text/plain", false, 2, (Object) null)) && (j = j5.j.j(MimeTypeMap.getSingleton(), str)) != null) {
            return j;
        }
        if (mediaType2 != null) {
            return E.c1(mediaType2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    public final boolean g(Request request, Response response) {
        return this.b.i().c() && (!this.e || d5.b.c.c(request, response));
    }

    public final Request h() {
        Request.Builder g2 = new Request.Builder().p(this.a).g(this.b.j());
        for (Map.Entry entry : this.b.o().a().entrySet()) {
            Object key = entry.getKey();
            t.e(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            g2.o((Class) key, entry.getValue());
        }
        boolean b2 = this.b.i().b();
        boolean b3 = this.b.k().b();
        if (!b3 && b2) {
            g2.c(CacheControl.p);
        } else if (!b3 || b2) {
            if (!b3 && !b2) {
                g2.c(h);
            }
        } else if (this.b.i().c()) {
            g2.c(CacheControl.o);
        } else {
            g2.c(g);
        }
        return g2.b();
    }

    public final a.c i() {
        W4.a aVar;
        if (!this.b.i().b() || (aVar = (W4.a) this.d.getValue()) == null) {
            return null;
        }
        return aVar.b(d());
    }

    public final d5.a j(a.c cVar) {
        Throwable th;
        d5.a aVar;
        try {
            xb.g d2 = x.d(e().q(cVar.e()));
            try {
                aVar = new d5.a(d2);
                if (d2 != null) {
                    try {
                        d2.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (d2 != null) {
                    try {
                        d2.close();
                    } catch (Throwable th4) {
                        Ca.g.a(th3, th4);
                    }
                }
                th = th3;
                aVar = null;
            }
            if (th != null) {
                throw th;
            }
            t.d(aVar);
            return aVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final V4.f k(Response response) {
        return response.u() != null ? V4.f.d : V4.f.c;
    }

    public final p l(a.c cVar) {
        return q.c(cVar.getData(), e(), d(), cVar);
    }

    public final p m(ResponseBody responseBody) {
        return q.a(responseBody.d(), this.b.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2 A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:13:0x002b, B:16:0x0036, B:21:0x0089, B:22:0x0103, B:25:0x008e, B:38:0x007a, B:39:0x008f, B:45:0x00c2, B:50:0x0100, B:51:0x010b, B:64:0x00f8, B:65:0x010c, B:78:0x00bb), top: B:12:0x002b, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[Catch: all -> 0x007e, Exception -> 0x0081, TRY_LEAVE, TryCatch #10 {Exception -> 0x0081, blocks: (B:13:0x002b, B:16:0x0036, B:21:0x0089, B:22:0x0103, B:25:0x008e, B:38:0x007a, B:39:0x008f, B:45:0x00c2, B:50:0x0100, B:51:0x010b, B:64:0x00f8, B:65:0x010c, B:78:0x00bb), top: B:12:0x002b, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final W4.a.c n(W4.a.c r6, okhttp3.Request r7, okhttp3.Response r8, d5.a r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.k.n(W4.a$c, okhttp3.Request, okhttp3.Response, d5.a):W4.a$c");
    }
}
