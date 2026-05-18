package okhttp3;

import Ca.I;
import Da.Y;
import Da.v;
import Na.c;
import Za.B;
import Za.E;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import xb.J;
import xb.L;
import xb.e;
import xb.f;
import xb.g;
import xb.h;
import xb.n;
import xb.o;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion g = new Companion(null);
    public final DiskLruCache a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public static final class CacheResponseBody extends ResponseBody {
        public final DiskLruCache.Snapshot b;
        public final String c;
        public final String d;
        public final g e;

        public static final class 1 extends o {
            public final /* synthetic */ L b;
            public final /* synthetic */ CacheResponseBody c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(L l, CacheResponseBody cacheResponseBody) {
                super(l);
                this.b = l;
                this.c = cacheResponseBody;
            }

            public void close() {
                this.c.g().close();
                super.close();
            }
        }

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            t.g(snapshot, "snapshot");
            this.b = snapshot;
            this.c = str;
            this.d = str2;
            this.e = x.d(new 1(snapshot.b(1), this));
        }

        public long b() {
            String str = this.d;
            if (str == null) {
                return -1L;
            }
            return Util.X(str, -1L);
        }

        public MediaType c() {
            String str = this.c;
            if (str == null) {
                return null;
            }
            return MediaType.e.b(str);
        }

        public g d() {
            return this.e;
        }

        public final DiskLruCache.Snapshot g() {
            return this.b;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(Response response) {
            t.g(response, "<this>");
            return d(response.r()).contains("*");
        }

        public final String b(HttpUrl url) {
            t.g(url, "url");
            return h.d.d(url.toString()).v().l();
        }

        public final int c(g source) {
            t.g(source, "source");
            try {
                long readDecimalLong = source.readDecimalLong();
                String readUtf8LineStrict = source.readUtf8LineStrict();
                if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.length() <= 0) {
                    return (int) readDecimalLong;
                }
                throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Set d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (B.z("Vary", headers.e(i), true)) {
                    String h = headers.h(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(B.A(U.a));
                    }
                    Iterator it = E.L0(h, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(E.j1((String) it.next()).toString());
                    }
                }
                i = i2;
            }
            return treeSet == null ? Y.b() : treeSet;
        }

        public final Headers e(Headers headers, Headers headers2) {
            Set d = d(headers2);
            if (d.isEmpty()) {
                return Util.b;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String e = headers.e(i);
                if (d.contains(e)) {
                    builder.a(e, headers.h(i));
                }
                i = i2;
            }
            return builder.e();
        }

        public final Headers f(Response response) {
            t.g(response, "<this>");
            Response u = response.u();
            t.d(u);
            return e(u.A().f(), response.r());
        }

        public final boolean g(Response cachedResponse, Headers cachedRequest, Request newRequest) {
            t.g(cachedResponse, "cachedResponse");
            t.g(cachedRequest, "cachedRequest");
            t.g(newRequest, "newRequest");
            Collection<String> collection = (Iterable) d(cachedResponse.r());
            if ((collection instanceof Collection) && collection.isEmpty()) {
                return true;
            }
            for (String str : collection) {
                if (!t.c(cachedRequest.j(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    public final class RealCacheRequest implements CacheRequest {
        public final DiskLruCache.Editor a;
        public final J b;
        public final J c;
        public boolean d;
        public final /* synthetic */ Cache e;

        public static final class 1 extends n {
            public final /* synthetic */ Cache b;
            public final /* synthetic */ RealCacheRequest c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Cache cache, RealCacheRequest realCacheRequest, J j) {
                super(j);
                this.b = cache;
                this.c = realCacheRequest;
            }

            public void close() {
                Cache cache = this.b;
                RealCacheRequest realCacheRequest = this.c;
                synchronized (cache) {
                    if (realCacheRequest.b()) {
                        return;
                    }
                    realCacheRequest.c(true);
                    cache.k(cache.d() + 1);
                    super.close();
                    RealCacheRequest.a(this.c).b();
                }
            }
        }

        public RealCacheRequest(Cache this$0, DiskLruCache.Editor editor) {
            t.g(this$0, "this$0");
            t.g(editor, "editor");
            this.e = this$0;
            this.a = editor;
            J f = editor.f(1);
            this.b = f;
            this.c = new 1(this$0, this, f);
        }

        public static final /* synthetic */ DiskLruCache.Editor a(RealCacheRequest realCacheRequest) {
            return realCacheRequest.a;
        }

        public void abort() {
            Cache cache = this.e;
            synchronized (cache) {
                if (b()) {
                    return;
                }
                c(true);
                cache.h(cache.c() + 1);
                Util.m(this.b);
                try {
                    this.a.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean b() {
            return this.d;
        }

        public J body() {
            return this.c;
        }

        public final void c(boolean z) {
            this.d = z;
        }
    }

    public final void a(DiskLruCache.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.a();
        } catch (IOException unused) {
        }
    }

    public final Response b(Request request) {
        t.g(request, "request");
        try {
            DiskLruCache.Snapshot u = this.a.u(g.b(request.j()));
            if (u == null) {
                return null;
            }
            try {
                Entry entry = new Entry(u.b(0));
                Response d = entry.d(u);
                if (entry.b(request, d)) {
                    return d;
                }
                ResponseBody a = d.a();
                if (a != null) {
                    Util.m(a);
                }
                return null;
            } catch (IOException unused) {
                Util.m(u);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final int c() {
        return this.c;
    }

    public void close() {
        this.a.close();
    }

    public final int d() {
        return this.b;
    }

    public final CacheRequest f(Response response) {
        DiskLruCache.Editor editor;
        t.g(response, "response");
        String h = response.A().h();
        if (HttpMethod.a.a(response.A().h())) {
            try {
                g(response.A());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!t.c(h, "GET")) {
            return null;
        }
        Companion companion = g;
        if (companion.a(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.t(this.a, companion.b(response.A().j()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.f(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                a(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public void flush() {
        this.a.flush();
    }

    public final void g(Request request) {
        t.g(request, "request");
        this.a.N(g.b(request.j()));
    }

    public final void h(int i) {
        this.c = i;
    }

    public final void k(int i) {
        this.b = i;
    }

    public final synchronized void m() {
        this.e++;
    }

    public final synchronized void o(CacheStrategy cacheStrategy) {
        try {
            t.g(cacheStrategy, "cacheStrategy");
            this.f++;
            if (cacheStrategy.b() != null) {
                this.d++;
            } else if (cacheStrategy.a() != null) {
                this.e++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void r(Response cached, Response network) {
        DiskLruCache.Editor editor;
        t.g(cached, "cached");
        t.g(network, "network");
        Entry entry = new Entry(network);
        ResponseBody a = cached.a();
        if (a == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            editor = ((CacheResponseBody) a).g().a();
            if (editor == null) {
                return;
            }
            try {
                entry.f(editor);
                editor.b();
            } catch (IOException unused) {
                a(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public static final class Entry {
        public static final Companion k = new Companion(null);
        public static final String l;
        public static final String m;
        public final HttpUrl a;
        public final Headers b;
        public final String c;
        public final Protocol d;
        public final int e;
        public final String f;
        public final Headers g;
        public final Handshake h;
        public final long i;
        public final long j;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Platform.Companion companion = Platform.a;
            l = t.o(companion.g().g(), "-Sent-Millis");
            m = t.o(companion.g().g(), "-Received-Millis");
        }

        public Entry(L rawSource) {
            t.g(rawSource, "rawSource");
            try {
                g d = x.d(rawSource);
                String readUtf8LineStrict = d.readUtf8LineStrict();
                HttpUrl f = HttpUrl.k.f(readUtf8LineStrict);
                if (f == null) {
                    Throwable iOException = new IOException(t.o("Cache corruption for ", readUtf8LineStrict));
                    Platform.a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.a = f;
                this.c = d.readUtf8LineStrict();
                Headers.Builder builder = new Headers.Builder();
                int c = Cache.g.c(d);
                int i = 0;
                int i2 = 0;
                while (i2 < c) {
                    i2++;
                    builder.b(d.readUtf8LineStrict());
                }
                this.b = builder.e();
                StatusLine a = StatusLine.d.a(d.readUtf8LineStrict());
                this.d = a.a;
                this.e = a.b;
                this.f = a.c;
                Headers.Builder builder2 = new Headers.Builder();
                int c2 = Cache.g.c(d);
                while (i < c2) {
                    i++;
                    builder2.b(d.readUtf8LineStrict());
                }
                String str = l;
                String f2 = builder2.f(str);
                String str2 = m;
                String f3 = builder2.f(str2);
                builder2.h(str);
                builder2.h(str2);
                long j = 0;
                this.i = f2 == null ? 0L : Long.parseLong(f2);
                if (f3 != null) {
                    j = Long.parseLong(f3);
                }
                this.j = j;
                this.g = builder2.e();
                if (a()) {
                    String readUtf8LineStrict2 = d.readUtf8LineStrict();
                    if (readUtf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + readUtf8LineStrict2 + '\"');
                    }
                    this.h = Handshake.e.b(!d.exhausted() ? TlsVersion.b.a(d.readUtf8LineStrict()) : TlsVersion.g, CipherSuite.b.b(d.readUtf8LineStrict()), c(d), c(d));
                } else {
                    this.h = null;
                }
                I i3 = I.a;
                c.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(rawSource, th);
                    throw th2;
                }
            }
        }

        public final boolean a() {
            return t.c(this.a.p(), "https");
        }

        public final boolean b(Request request, Response response) {
            t.g(request, "request");
            t.g(response, "response");
            return t.c(this.a, request.j()) && t.c(this.c, request.h()) && Cache.g.g(response, this.b, request);
        }

        public final List c(g gVar) {
            int c = Cache.g.c(gVar);
            if (c == -1) {
                return v.n();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c);
                int i = 0;
                while (i < c) {
                    i++;
                    String readUtf8LineStrict = gVar.readUtf8LineStrict();
                    e eVar = new e();
                    h a = h.d.a(readUtf8LineStrict);
                    t.d(a);
                    eVar.m0(a);
                    arrayList.add(certificateFactory.generateCertificate(eVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Response d(DiskLruCache.Snapshot snapshot) {
            t.g(snapshot, "snapshot");
            String a = this.g.a("Content-Type");
            String a2 = this.g.a("Content-Length");
            return new Response.Builder().s(new Request.Builder().q(this.a).h(this.c, null).g(this.b).b()).q(this.d).g(this.e).n(this.f).l(this.g).b(new CacheResponseBody(snapshot, a, a2)).j(this.h).t(this.i).r(this.j).c();
        }

        public final void e(f fVar, List list) {
            try {
                fVar.writeDecimalLong(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = ((Certificate) it.next()).getEncoded();
                    h.a aVar = h.d;
                    t.f(bytes, "bytes");
                    fVar.writeUtf8(h.a.g(aVar, bytes, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final void f(DiskLruCache.Editor editor) {
            t.g(editor, "editor");
            f c = x.c(editor.f(0));
            try {
                c.writeUtf8(this.a.toString()).writeByte(10);
                c.writeUtf8(this.c).writeByte(10);
                c.writeDecimalLong(this.b.size()).writeByte(10);
                int size = this.b.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    c.writeUtf8(this.b.e(i)).writeUtf8(": ").writeUtf8(this.b.h(i)).writeByte(10);
                    i = i2;
                }
                c.writeUtf8(new StatusLine(this.d, this.e, this.f).toString()).writeByte(10);
                c.writeDecimalLong(this.g.size() + 2).writeByte(10);
                int size2 = this.g.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c.writeUtf8(this.g.e(i3)).writeUtf8(": ").writeUtf8(this.g.h(i3)).writeByte(10);
                }
                c.writeUtf8(l).writeUtf8(": ").writeDecimalLong(this.i).writeByte(10);
                c.writeUtf8(m).writeUtf8(": ").writeDecimalLong(this.j).writeByte(10);
                if (a()) {
                    c.writeByte(10);
                    Handshake handshake = this.h;
                    t.d(handshake);
                    c.writeUtf8(handshake.a().c()).writeByte(10);
                    e(c, this.h.d());
                    e(c, this.h.c());
                    c.writeUtf8(this.h.e().b()).writeByte(10);
                }
                I i4 = I.a;
                c.a(c, null);
            } finally {
            }
        }

        public Entry(Response response) {
            t.g(response, "response");
            this.a = response.A().j();
            this.b = Cache.g.f(response);
            this.c = response.A().h();
            this.d = response.y();
            this.e = response.f();
            this.f = response.t();
            this.g = response.r();
            this.h = response.h();
            this.i = response.B();
            this.j = response.z();
        }
    }
}
