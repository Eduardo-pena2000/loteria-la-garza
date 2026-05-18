package okhttp3.internal;

import Ca.I;
import Da.D;
import Da.M;
import Da.S;
import Da.r;
import Da.v;
import Da.w;
import Na.c;
import Wa.i;
import Wa.n;
import Za.B;
import Za.E;
import Za.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import wb.a;
import wb.b;
import xb.A;
import xb.J;
import xb.L;
import xb.e;
import xb.f;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Util {
    public static final byte[] a;
    public static final Headers b = Headers.b.g(new String[0]);
    public static final ResponseBody c;
    public static final RequestBody d;
    public static final A e;
    public static final TimeZone f;
    public static final o g;
    public static final boolean h;
    public static final String i;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        c = ResponseBody.Companion.c(ResponseBody.a, bArr, null, 1, null);
        d = RequestBody.Companion.g(RequestBody.a, bArr, null, 0, 0, 7, null);
        A.a aVar = A.c;
        h.a aVar2 = h.d;
        e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        t.d(timeZone);
        f = timeZone;
        g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = false;
        String name = OkHttpClient.class.getName();
        t.f(name, "OkHttpClient::class.java.name");
        i = E.C0(E.B0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return z(str, i2, i3);
    }

    public static final int B(String str, int i2, int i3) {
        t.g(str, "<this>");
        int i4 = i3 - 1;
        if (i2 <= i4) {
            while (true) {
                int i5 = i4 - 1;
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4 = i5;
            }
        }
        return i2;
    }

    public static /* synthetic */ int C(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return B(str, i2, i3);
    }

    public static final int D(String str, int i2) {
        t.g(str, "<this>");
        int length = str.length();
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\t') {
                return i2;
            }
            i2 = i3;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(other, "other");
        t.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            i2++;
            int length2 = other.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    String str2 = other[i3];
                    i3++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean F(FileSystem fileSystem, File file) {
        t.g(fileSystem, "<this>");
        t.g(file, "file");
        J sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                c.a(sink, null);
                return true;
            } catch (IOException unused) {
                I i2 = I.a;
                c.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean G(Socket socket, g source) {
        t.g(socket, "<this>");
        t.g(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !source.exhausted();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        t.g(name, "name");
        return B.z(name, "Authorization", true) || B.z(name, "Cookie", true) || B.z(name, "Proxy-Authorization", true) || B.z(name, "Set-Cookie", true);
    }

    public static final int I(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset J(g gVar, Charset charset) {
        t.g(gVar, "<this>");
        t.g(charset, "default");
        int C0 = gVar.C0(e);
        if (C0 == -1) {
            return charset;
        }
        if (C0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            t.f(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (C0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            t.f(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (C0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            t.f(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (C0 == 3) {
            return Za.c.a.a();
        }
        if (C0 == 4) {
            return Za.c.a.b();
        }
        throw new AssertionError();
    }

    public static final int K(g gVar) {
        t.g(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int L(e eVar, byte b2) {
        t.g(eVar, "<this>");
        int i2 = 0;
        while (!eVar.exhausted() && eVar.k(0L) == b2) {
            i2++;
            eVar.readByte();
        }
        return i2;
    }

    public static final boolean M(L l, int i2, TimeUnit timeUnit) {
        t.g(l, "<this>");
        t.g(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c2 = l.timeout().e() ? l.timeout().c() - nanoTime : Long.MAX_VALUE;
        l.timeout().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            e eVar = new e();
            while (l.F(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (c2 == Long.MAX_VALUE) {
                l.timeout().a();
            } else {
                l.timeout().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == Long.MAX_VALUE) {
                l.timeout().a();
            } else {
                l.timeout().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == Long.MAX_VALUE) {
                l.timeout().a();
            } else {
                l.timeout().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(String name, boolean z) {
        t.g(name, "name");
        return new b(name, z);
    }

    public static final Thread O(String name, boolean z, Runnable runnable) {
        t.g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z);
        return thread;
    }

    public static final List P(Headers headers) {
        t.g(headers, "<this>");
        i w = n.w(0, headers.size());
        ArrayList arrayList = new ArrayList(w.y(w, 10));
        Iterator it = w.iterator();
        while (it.hasNext()) {
            int a2 = ((M) it).a();
            arrayList.add(new Header(headers.e(a2), headers.h(a2)));
        }
        return arrayList;
    }

    public static final Headers Q(List list) {
        t.g(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.a().H(), header.b().H());
        }
        return builder.e();
    }

    public static final String R(int i2) {
        String hexString = Integer.toHexString(i2);
        t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(long j) {
        String hexString = Long.toHexString(j);
        t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String T(HttpUrl httpUrl, boolean z) {
        String h2;
        t.g(httpUrl, "<this>");
        if (E.T(httpUrl.h(), ":", false, 2, null)) {
            h2 = '[' + httpUrl.h() + ']';
        } else {
            h2 = httpUrl.h();
        }
        if (!z && httpUrl.l() == HttpUrl.k.c(httpUrl.p())) {
            return h2;
        }
        return h2 + ':' + httpUrl.l();
    }

    public static /* synthetic */ String U(HttpUrl httpUrl, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return T(httpUrl, z);
    }

    public static final List V(List list) {
        t.g(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(D.O0(list));
        t.f(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map W(Map map) {
        t.g(map, "<this>");
        if (map.isEmpty()) {
            return S.h();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        t.f(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long X(String str, long j) {
        t.g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int Y(String str, int i2) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        if (valueOf == null) {
            return i2;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String Z(String str, int i2, int i3) {
        t.g(str, "<this>");
        int z = z(str, i2, i3);
        String substring = str.substring(z, B(str, z, i3));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        return O(str, z, runnable);
    }

    public static /* synthetic */ String a0(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return Z(str, i2, i3);
    }

    public static /* synthetic */ EventListener b(EventListener eventListener, Call call) {
        return h(eventListener, call);
    }

    public static final Throwable b0(Exception exc, List suppressed) {
        t.g(exc, "<this>");
        t.g(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            Ca.g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void c(List list, Object obj) {
        t.g(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final void c0(f fVar, int i2) {
        t.g(fVar, "<this>");
        fVar.writeByte((i2 >>> 16) & 255);
        fVar.writeByte((i2 >>> 8) & 255);
        fVar.writeByte(i2 & 255);
    }

    public static final int d(byte b2, int i2) {
        return b2 & i2;
    }

    public static final int e(short s, int i2) {
        return s & i2;
    }

    public static final long f(int i2, long j) {
        return i2 & j;
    }

    public static final EventListener.Factory g(EventListener eventListener) {
        t.g(eventListener, "<this>");
        return new a(eventListener);
    }

    public static final EventListener h(EventListener this_asFactory, Call it) {
        t.g(this_asFactory, "$this_asFactory");
        t.g(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        t.g(str, "<this>");
        return g.h(str);
    }

    public static final boolean j(HttpUrl httpUrl, HttpUrl other) {
        t.g(httpUrl, "<this>");
        t.g(other, "other");
        return t.c(httpUrl.h(), other.h()) && httpUrl.l() == other.l() && t.c(httpUrl.p(), other.p());
    }

    public static final int k(String name, long j, TimeUnit timeUnit) {
        t.g(name, "name");
        if (j < 0) {
            throw new IllegalStateException(t.o(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(t.o(name, " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(t.o(name, " too small.").toString());
    }

    public static final void l(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        t.g(closeable, "<this>");
        try {
            closeable.close();
        } catch (Exception unused) {
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public static final void n(Socket socket) {
        t.g(socket, "<this>");
        try {
            socket.close();
        } catch (RuntimeException e2) {
            if (!t.c(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (AssertionError e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        t.g(strArr, "<this>");
        t.g(value, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        t.f(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[r.a0(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c2, int i2, int i3) {
        t.g(str, "<this>");
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static final int q(String str, String delimiters, int i2, int i3) {
        t.g(str, "<this>");
        t.g(delimiters, "delimiters");
        while (i2 < i3) {
            int i4 = i2 + 1;
            if (E.S(delimiters, str.charAt(i2), false, 2, null)) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    public static /* synthetic */ int r(String str, char c2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return p(str, c2, i2, i3);
    }

    public static final boolean s(L l, int i2, TimeUnit timeUnit) {
        t.g(l, "<this>");
        t.g(timeUnit, "timeUnit");
        try {
            return M(l, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        t.g(format, "format");
        t.g(args, "args");
        U u = U.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        t.f(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr[i2];
                i2++;
                Iterator a2 = kotlin.jvm.internal.c.a(strArr2);
                while (a2.hasNext()) {
                    if (comparator.compare(str, (String) a2.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long v(Response response) {
        t.g(response, "<this>");
        String a2 = response.r().a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        return X(a2, -1L);
    }

    public static final List w(Object... elements) {
        t.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(v.q(Arrays.copyOf(objArr, objArr.length)));
        t.f(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(value, "value");
        t.g(comparator, "comparator");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], value) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        t.g(str, "<this>");
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (t.h(charAt, 31) <= 0 || t.h(charAt, 127) >= 0) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public static final int z(String str, int i2, int i3) {
        t.g(str, "<this>");
        while (i2 < i3) {
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }
}
