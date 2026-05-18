package R2;

import P2.K;
import R2.f;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import t7.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class l extends R2.b implements f {
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final t j;
    public final t k;
    public final s7.n l;
    public final boolean m;
    public j n;
    public HttpURLConnection o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;

    public static final class b implements f.a {
        public x b;
        public s7.n c;
        public String d;
        public boolean g;
        public boolean h;
        public boolean i;
        public final t a = new t();
        public int e = 8000;
        public int f = 8000;

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a() {
            l lVar = new l(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i, null);
            x xVar = this.b;
            if (xVar != null) {
                lVar.l(xVar);
            }
            return lVar;
        }

        public b c(boolean z) {
            this.g = z;
            return this;
        }

        public b d(Map map) {
            this.a.a(map);
            return this;
        }

        public b e(String str) {
            this.d = str;
            return this;
        }
    }

    public static class c extends t7.m {
        public final Map a;

        public c(Map map) {
            this.a = map;
        }

        public static /* synthetic */ boolean h(Map.Entry entry) {
            return m(entry);
        }

        public static /* synthetic */ boolean j(String str) {
            return n(str);
        }

        public static /* synthetic */ boolean m(Map.Entry entry) {
            return entry.getKey() != null;
        }

        public static /* synthetic */ boolean n(String str) {
            return str != null;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a() {
            return this.a;
        }

        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return super.e(obj);
        }

        public Set entrySet() {
            return P.b(super.entrySet(), new m());
        }

        public boolean equals(Object obj) {
            return obj != null && super.f(obj);
        }

        public int hashCode() {
            return super.g();
        }

        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey((Object) null);
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public List get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public Set keySet() {
            return P.b(super.keySet(), new n());
        }

        public int size() {
            return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    public /* synthetic */ l(String str, int i, int i2, boolean z, boolean z2, t tVar, s7.n nVar, boolean z3, a aVar) {
        this(str, i, i2, z, z2, tVar, nVar, z3);
    }

    public static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void z(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || K.a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) P2.a.e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", (Class[]) null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, (Object[]) null);
            }
        } catch (Exception unused) {
        }
    }

    public HttpURLConnection A(URL url) {
        return url.openConnection();
    }

    public final int B(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s;
        if (j != -1) {
            long j2 = j - this.t;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) K.i(this.p)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.t += read;
        q(read);
        return read;
    }

    public final void C(long j, j jVar) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) K.i(this.p)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new q((IOException) new InterruptedIOException(), jVar, 2000, 1);
            }
            if (read == -1) {
                throw new q(jVar, 2008, 1);
            }
            j -= read;
            q(read);
        }
    }

    public void close() {
        try {
            InputStream inputStream = this.p;
            if (inputStream != null) {
                long j = this.s;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.t;
                }
                z(this.o, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new q(e, (j) K.i(this.n), 2000, 3);
                }
            }
        } finally {
            this.p = null;
            u();
            if (this.q) {
                this.q = false;
                r();
            }
        }
    }

    public Map e() {
        HttpURLConnection httpURLConnection = this.o;
        return httpURLConnection == null ? t7.s.o() : new c(httpURLConnection.getHeaderFields());
    }

    public long g(j jVar) {
        byte[] bArr;
        this.n = jVar;
        long j = 0;
        this.t = 0L;
        this.s = 0L;
        s(jVar);
        try {
            HttpURLConnection x = x(jVar);
            this.o = x;
            this.r = x.getResponseCode();
            String responseMessage = x.getResponseMessage();
            int i = this.r;
            if (i < 200 || i > 299) {
                Map headerFields = x.getHeaderFields();
                if (this.r == 416) {
                    if (jVar.g == u.c(x.getHeaderField("Content-Range"))) {
                        this.q = true;
                        t(jVar);
                        long j2 = jVar.h;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = x.getErrorStream();
                try {
                    bArr = errorStream != null ? u7.a.b(errorStream) : K.f;
                } catch (IOException unused) {
                    bArr = K.f;
                }
                byte[] bArr2 = bArr;
                u();
                throw new s(this.r, responseMessage, this.r == 416 ? new g(2008) : null, headerFields, jVar, bArr2);
            }
            String contentType = x.getContentType();
            s7.n nVar = this.l;
            if (nVar != null && !nVar.apply(contentType)) {
                u();
                throw new r(contentType, jVar);
            }
            if (this.r == 200) {
                long j3 = jVar.g;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean w = w(x);
            if (w) {
                this.s = jVar.h;
            } else {
                long j4 = jVar.h;
                if (j4 != -1) {
                    this.s = j4;
                } else {
                    long b2 = u.b(x.getHeaderField("Content-Length"), x.getHeaderField("Content-Range"));
                    this.s = b2 != -1 ? b2 - j : -1L;
                }
            }
            try {
                this.p = x.getInputStream();
                if (w) {
                    this.p = new GZIPInputStream(this.p);
                }
                this.q = true;
                t(jVar);
                try {
                    C(j, jVar);
                    return this.s;
                } catch (IOException e) {
                    u();
                    if (e instanceof q) {
                        throw ((q) e);
                    }
                    throw new q(e, jVar, 2000, 1);
                }
            } catch (IOException e2) {
                u();
                throw new q(e2, jVar, 2000, 1);
            }
        } catch (IOException e3) {
            u();
            throw q.c(e3, jVar, 1);
        }
    }

    public Uri o() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return B(bArr, i, i2);
        } catch (IOException e) {
            throw q.c(e, (j) K.i(this.n), 2);
        }
    }

    public final void u() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                P2.o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.o = null;
        }
    }

    public final URL v(URL url, String str, j jVar) {
        if (str == null) {
            throw new q("Null location redirect", jVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new q("Unsupported protocol redirect: " + protocol, jVar, 2001, 1);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new q((IOException) e, jVar, 2001, 1);
                }
            }
            throw new q("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", jVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new q((IOException) e2, jVar, 2001, 1);
        }
    }

    public final HttpURLConnection x(j jVar) {
        HttpURLConnection y;
        URL url = new URL(jVar.a.toString());
        int i = jVar.c;
        byte[] bArr = jVar.d;
        long j = jVar.g;
        long j2 = jVar.h;
        boolean d = jVar.d(1);
        if (!this.e && !this.f && !this.m) {
            return y(url, i, bArr, j, j2, d, true, jVar.e);
        }
        int i2 = 0;
        URL url2 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 > 20) {
                throw new q((IOException) new NoRouteToHostException("Too many redirects: " + i4), jVar, 2001, 1);
            }
            long j3 = j;
            long j4 = j;
            int i5 = i3;
            URL url3 = url2;
            long j5 = j2;
            y = y(url2, i3, bArr2, j3, j2, d, false, jVar.e);
            int responseCode = y.getResponseCode();
            String headerField = y.getHeaderField("Location");
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                y.disconnect();
                url2 = v(url3, headerField, jVar);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                y.disconnect();
                if (this.m && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                url2 = v(url3, headerField, jVar);
            }
            i2 = i4;
            j = j4;
            j2 = j5;
        }
        return y;
    }

    public final HttpURLConnection y(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection A = A(url);
        A.setConnectTimeout(this.g);
        A.setReadTimeout(this.h);
        HashMap hashMap = new HashMap();
        t tVar = this.j;
        if (tVar != null) {
            hashMap.putAll(tVar.b());
        }
        hashMap.putAll(this.k.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String a2 = u.a(j, j2);
        if (a2 != null) {
            A.setRequestProperty("Range", a2);
        }
        String str = this.i;
        if (str != null) {
            A.setRequestProperty("User-Agent", str);
        }
        A.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        A.setInstanceFollowRedirects(z2);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(j.c(i));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    public l(String str, int i, int i2, boolean z, boolean z2, t tVar, s7.n nVar, boolean z3) {
        super(true);
        this.i = str;
        this.g = i;
        this.h = i2;
        this.e = z;
        this.f = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.j = tVar;
        this.l = nVar;
        this.k = new t();
        this.m = z3;
    }
}
