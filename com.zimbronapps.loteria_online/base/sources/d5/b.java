package d5;

import Za.B;
import j5.j;
import j5.u;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final a c = new a(null);
    public final Request a;
    public final d5.a b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String e = headers.e(i);
                String h = headers.h(i);
                if ((!B.z("Warning", e, true) || !B.N(h, "1", false, 2, (Object) null)) && (d(e) || !e(e) || headers2.a(e) == null)) {
                    builder.a(e, h);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String e2 = headers2.e(i2);
                if (!d(e2) && e(e2)) {
                    builder.a(e2, headers2.h(i2));
                }
            }
            return builder.e();
        }

        public final boolean b(Request request, d5.a aVar) {
            return (request.b().i() || aVar.a().i() || t.c(aVar.d().a("Vary"), "*")) ? false : true;
        }

        public final boolean c(Request request, Response response) {
            return (request.b().i() || response.b().i() || t.c(response.r().a("Vary"), "*")) ? false : true;
        }

        public final boolean d(String str) {
            return B.z("Content-Length", str, true) || B.z("Content-Encoding", str, true) || B.z("Content-Type", str, true);
        }

        public final boolean e(String str) {
            return (B.z("Connection", str, true) || B.z("Keep-Alive", str, true) || B.z("Proxy-Authenticate", str, true) || B.z("Proxy-Authorization", str, true) || B.z("TE", str, true) || B.z("Trailers", str, true) || B.z("Transfer-Encoding", str, true) || B.z("Upgrade", str, true)) ? false : true;
        }

        public a() {
        }
    }

    public static final class b {
        public final Request a;
        public final d5.a b;
        public Date c;
        public String d;
        public Date e;
        public String f;
        public Date g;
        public long h;
        public long i;
        public String j;
        public int k;

        public b(Request request, d5.a aVar) {
            this.a = request;
            this.b = aVar;
            this.k = -1;
            if (aVar != null) {
                this.h = aVar.e();
                this.i = aVar.c();
                Headers d = aVar.d();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    String e = d.e(i);
                    if (B.z(e, "Date", true)) {
                        this.c = d.b("Date");
                        this.d = d.h(i);
                    } else if (B.z(e, "Expires", true)) {
                        this.g = d.b("Expires");
                    } else if (B.z(e, "Last-Modified", true)) {
                        this.e = d.b("Last-Modified");
                        this.f = d.h(i);
                    } else if (B.z(e, "ETag", true)) {
                        this.j = d.h(i);
                    } else if (B.z(e, "Age", true)) {
                        this.k = j.y(d.h(i), -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.c;
            long max = date != null ? Math.max(0L, this.i - date.getTime()) : 0L;
            int i = this.k;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            return max + (this.i - this.h) + (u.a.a() - this.i);
        }

        public final b b() {
            String str;
            if (this.b == null) {
                return new b(this.a, null, null);
            }
            if (this.a.g() && !this.b.f()) {
                return new b(this.a, null, null);
            }
            CacheControl a = this.b.a();
            if (!b.c.b(this.a, this.b)) {
                return new b(this.a, null, null);
            }
            CacheControl b = this.a.b();
            if (b.h() || d(this.a)) {
                return new b(this.a, null, null);
            }
            long a2 = a();
            long c = c();
            if (b.d() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis(b.d()));
            }
            long j = 0;
            long millis = b.f() != -1 ? TimeUnit.SECONDS.toMillis(b.f()) : 0L;
            if (!a.g() && b.e() != -1) {
                j = TimeUnit.SECONDS.toMillis(b.e());
            }
            if (!a.h() && a2 + millis < c + j) {
                return new b(null, this.b, null);
            }
            String str2 = this.j;
            if (str2 != null) {
                t.d(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.e != null) {
                    str2 = this.f;
                    t.d(str2);
                } else {
                    if (this.c == null) {
                        return new b(this.a, null, null);
                    }
                    str2 = this.d;
                    t.d(str2);
                }
            }
            return new b(this.a.i().a(str, str2).b(), this.b, null);
        }

        public final long c() {
            d5.a aVar = this.b;
            t.d(aVar);
            if (aVar.a().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            Date date = this.g;
            if (date != null) {
                Date date2 = this.c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.e == null || this.a.j().m() != null) {
                return 0L;
            }
            Date date3 = this.c;
            long time2 = date3 != null ? date3.getTime() : this.h;
            Date date4 = this.e;
            t.d(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / 10;
            }
            return 0L;
        }

        public final boolean d(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }
    }

    public /* synthetic */ b(Request request, d5.a aVar, k kVar) {
        this(request, aVar);
    }

    public final d5.a a() {
        return this.b;
    }

    public final Request b() {
        return this.a;
    }

    public b(Request request, d5.a aVar) {
        this.a = request;
        this.b = aVar;
    }
}
