package okhttp3.internal.cache;

import Za.B;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CacheStrategy {
    public static final Companion c = new Companion(null);
    public final Request a;
    public final Response b;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(okhttp3.Response r5, okhttp3.Request r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.t.g(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.t.g(r6, r0)
                int r0 = r5.f()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = okhttp3.Response.o(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.b()
                int r0 = r0.d()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.CacheControl r0 = r5.b()
                boolean r0 = r0.c()
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.b()
                boolean r0 = r0.b()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.CacheControl r5 = r5.b()
                boolean r5 = r5.i()
                if (r5 != 0) goto L7a
                okhttp3.CacheControl r5 = r6.b()
                boolean r5 = r5.i()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.a(okhttp3.Response, okhttp3.Request):boolean");
        }

        private Companion() {
        }
    }

    public static final class Factory {
        public final long a;
        public final Request b;
        public final Response c;
        public Date d;
        public String e;
        public Date f;
        public String g;
        public Date h;
        public long i;
        public long j;
        public String k;
        public int l;

        public Factory(long j, Request request, Response response) {
            t.g(request, "request");
            this.a = j;
            this.b = request;
            this.c = response;
            this.l = -1;
            if (response != null) {
                this.i = response.B();
                this.j = response.z();
                Headers r = response.r();
                int size = r.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    String e = r.e(i);
                    String h = r.h(i);
                    if (B.z(e, "Date", true)) {
                        this.d = DatesKt.a(h);
                        this.e = h;
                    } else if (B.z(e, "Expires", true)) {
                        this.h = DatesKt.a(h);
                    } else if (B.z(e, "Last-Modified", true)) {
                        this.f = DatesKt.a(h);
                        this.g = h;
                    } else if (B.z(e, "ETag", true)) {
                        this.k = h;
                    } else if (B.z(e, "Age", true)) {
                        this.l = Util.Y(h, -1);
                    }
                    i = i2;
                }
            }
        }

        public final long a() {
            Date date = this.d;
            long max = date != null ? Math.max(0L, this.j - date.getTime()) : 0L;
            int i = this.l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.j;
            return max + (j - this.i) + (this.a - j);
        }

        public final CacheStrategy b() {
            CacheStrategy c = c();
            return (c.b() == null || !this.b.b().k()) ? c : new CacheStrategy(null, null);
        }

        public final CacheStrategy c() {
            String str;
            if (this.c == null) {
                return new CacheStrategy(this.b, null);
            }
            if (this.b.g() && this.c.h() == null) {
                return new CacheStrategy(this.b, null);
            }
            if (!CacheStrategy.c.a(this.c, this.b)) {
                return new CacheStrategy(this.b, null);
            }
            CacheControl b = this.b.b();
            if (b.h() || e(this.b)) {
                return new CacheStrategy(this.b, null);
            }
            CacheControl b2 = this.c.b();
            long a = a();
            long d = d();
            if (b.d() != -1) {
                d = Math.min(d, TimeUnit.SECONDS.toMillis(b.d()));
            }
            long j = 0;
            long millis = b.f() != -1 ? TimeUnit.SECONDS.toMillis(b.f()) : 0L;
            if (!b2.g() && b.e() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.e());
            }
            if (!b2.h()) {
                long j2 = millis + a;
                if (j2 < j + d) {
                    Response.Builder v = this.c.v();
                    if (j2 >= d) {
                        v.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && f()) {
                        v.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy(null, v.c());
                }
            }
            String str2 = this.k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f != null) {
                    str2 = this.g;
                } else {
                    if (this.d == null) {
                        return new CacheStrategy(this.b, null);
                    }
                    str2 = this.e;
                }
                str = "If-Modified-Since";
            }
            Headers.Builder f = this.b.f().f();
            t.d(str2);
            f.c(str, str2);
            return new CacheStrategy(this.b.i().g(f.e()).b(), this.c);
        }

        public final long d() {
            Long valueOf;
            Response response = this.c;
            t.d(response);
            if (response.b().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            Date date = this.h;
            if (date != null) {
                Date date2 = this.d;
                valueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (valueOf == null ? this.j : valueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f == null || this.c.A().j().m() != null) {
                return 0L;
            }
            Date date3 = this.d;
            valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long longValue = valueOf == null ? this.i : valueOf.longValue();
            Date date4 = this.f;
            t.d(date4);
            long time2 = longValue - date4.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        public final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        public final boolean f() {
            Response response = this.c;
            t.d(response);
            return response.b().d() == -1 && this.h == null;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.a = request;
        this.b = response;
    }

    public final Response a() {
        return this.b;
    }

    public final Request b() {
        return this.a;
    }
}
