package com.applovin.shadow.okhttp3.internal;

import Ca.I;
import Ca.g;
import Da.D;
import Da.M;
import Da.S;
import Da.r;
import Da.v;
import Da.w;
import Qa.a;
import Qa.l;
import Wa.i;
import Wa.n;
import Za.B;
import Za.E;
import Za.o;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.applovin.shadow.okhttp3.internal.io.FileSystem;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
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
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.t;
import p5.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final o VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        t.d(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        t.f(name, "OkHttpClient::class.java.name");
        okHttpName = E.C0(E.B0(name, "com.applovin.shadow.okhttp3."), "Client");
    }

    public static /* synthetic */ EventListener a(EventListener eventListener, Call call) {
        return asFactory$lambda$8(eventListener, call);
    }

    public static final void addIfAbsent(List list, Object obj) {
        t.g(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        t.g(eventListener, "<this>");
        return new b(eventListener);
    }

    private static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        t.g(eventListener, "$this_asFactory");
        t.g(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        t.g(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        t.g(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static /* synthetic */ Thread b(String str, boolean z, Runnable runnable) {
        return threadFactory$lambda$1(str, z, runnable);
    }

    public static final boolean canParseAsIpAddress(String str) {
        t.g(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.h(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        t.g(httpUrl, "<this>");
        t.g(httpUrl2, "other");
        return t.c(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && t.c(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        t.g(str, "name");
        if (j < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        t.g(closeable, "<this>");
        try {
            closeable.close();
        } catch (Exception unused) {
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        t.g(strArr, "<this>");
        t.g(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        t.f(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[r.a0(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        t.g(str, "<this>");
        t.g(str2, "delimiters");
        while (i < i2) {
            if (E.S(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(Source source, int i, TimeUnit timeUnit) {
        t.g(source, "<this>");
        t.g(timeUnit, "timeUnit");
        try {
            return skipAll(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final List filterList(Iterable iterable, l lVar) {
        t.g(iterable, "<this>");
        t.g(lVar, "predicate");
        ArrayList n = v.n();
        for (Object obj : iterable) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (n.isEmpty()) {
                    n = new ArrayList();
                }
                t.e(n, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                V.c(n).add(obj);
            }
        }
        return n;
    }

    public static final String format(String str, Object... objArr) {
        t.g(str, "format");
        t.g(objArr, "args");
        U u = U.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        t.f(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a = c.a(strArr2);
                while (a.hasNext()) {
                    if (comparator.compare(str, (String) a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        t.g(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(a aVar) {
        t.g(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final List immutableListOf(Object... objArr) {
        t.g(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(v.q(Arrays.copyOf(objArr2, objArr2.length)));
        t.f(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(str, "value");
        t.g(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        t.g(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (t.h(charAt, 31) <= 0 || t.h(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        t.g(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        t.g(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        t.g(str, "<this>");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator comparator) {
        t.g(strArr, "<this>");
        t.g(strArr2, "other");
        t.g(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        t.g(fileSystem, "<this>");
        t.g(file, "file");
        Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                Na.c.a(sink, (Throwable) null);
                return true;
            } catch (IOException unused) {
                I i = I.a;
                Na.c.a(sink, (Throwable) null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(Socket socket, BufferedSource bufferedSource) {
        t.g(socket, "<this>");
        t.g(bufferedSource, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !bufferedSource.exhausted();
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

    public static final boolean isSensitiveHeader(String str) {
        t.g(str, "name");
        return B.z(str, "Authorization", true) || B.z(str, "Cookie", true) || B.z(str, "Proxy-Authorization", true) || B.z(str, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        t.g(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        t.g(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final String peerName(Socket socket) {
        t.g(socket, "<this>");
        InetSocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = remoteSocketAddress.getHostName();
        t.f(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
        t.g(bufferedSource, "<this>");
        t.g(charset, "default");
        int select = bufferedSource.select(UNICODE_BOMS);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            t.f(charset2, "UTF_8");
            return charset2;
        }
        if (select == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            t.f(charset3, "UTF_16BE");
            return charset3;
        }
        if (select == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            t.f(charset4, "UTF_16LE");
            return charset4;
        }
        if (select == 3) {
            return Za.c.a.a();
        }
        if (select == 4) {
            return Za.c.a.b();
        }
        throw new AssertionError();
    }

    public static final Object readFieldOrNull(Object obj, Class cls, String str) {
        Object obj2;
        Object readFieldOrNull;
        t.g(obj, "instance");
        t.g(cls, "fieldType");
        t.g(str, "fieldName");
        Class cls2 = obj.getClass();
        while (true) {
            obj2 = null;
            if (t.c(cls2, Object.class)) {
                if (t.c(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return readFieldOrNull(readFieldOrNull, cls, str);
            }
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj);
                if (!cls.isInstance(obj3)) {
                    break;
                }
                obj2 = cls.cast(obj3);
                break;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
                t.f(cls2, "c.superclass");
            }
        }
        return obj2;
    }

    public static final int readMedium(BufferedSource bufferedSource) throws IOException {
        t.g(bufferedSource, "<this>");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final boolean skipAll(Source source, int i, TimeUnit timeUnit) throws IOException {
        t.g(source, "<this>");
        t.g(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        t.g(str, "name");
        return new p5.a(str, z);
    }

    private static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        t.g(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, a aVar) {
        t.g(str, "name");
        t.g(aVar, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.r.b(1);
            currentThread.setName(name);
            kotlin.jvm.internal.r.a(1);
        }
    }

    public static final List toHeaderList(Headers headers) {
        t.g(headers, "<this>");
        i w = n.w(0, headers.size());
        ArrayList arrayList = new ArrayList(w.y(w, 10));
        M it = w.iterator();
        while (it.hasNext()) {
            int a = it.a();
            arrayList.add(new Header(headers.name(a), headers.value(a)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List list) {
        t.g(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        t.g(httpUrl, "<this>");
        if (E.T(httpUrl.host(), ":", false, 2, (Object) null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final List toImmutableList(List list) {
        t.g(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(D.O0(list));
        t.f(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map toImmutableMap(Map map) {
        t.g(map, "<this>");
        if (map.isEmpty()) {
            return S.h();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        t.f(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        t.g(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        t.g(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        t.g(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List list) {
        t.g(exc, "<this>");
        t.g(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
        t.g(bufferedSink, "<this>");
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        t.g(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        t.f(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final void closeQuietly(Socket socket) {
        t.g(socket, "<this>");
        try {
            socket.close();
        } catch (RuntimeException e) {
            if (!t.c(e.getMessage(), "bio == null")) {
                throw e;
            }
        } catch (AssertionError e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        t.g(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (Exception unused) {
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public static final int skipAll(Buffer buffer, byte b) {
        t.g(buffer, "<this>");
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }
}
