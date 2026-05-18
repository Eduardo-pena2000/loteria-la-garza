package okhttp3.internal.ws;

import Ca.I;
import Da.u;
import Wa.i;
import Za.B;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.WebSocketReader;
import xb.f;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final Companion y = new Companion(null);
    public static final List z = u.e(Protocol.HTTP_1_1);
    public final WebSocketListener a;
    public final Random b;
    public final long c;
    public WebSocketExtensions d;
    public long e;
    public final String f;
    public Call g;
    public Task h;
    public WebSocketReader i;
    public WebSocketWriter j;
    public TaskQueue k;
    public String l;
    public Streams m;
    public final ArrayDeque n;
    public final ArrayDeque o;
    public long p;
    public boolean q;
    public int r;
    public String s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;

    public static final class Close {
        public final int a;
        public final h b;
        public final long c;

        public Close(int i, h hVar, long j) {
            this.a = i;
            this.b = hVar;
            this.c = j;
        }

        public final long a() {
            return this.c;
        }

        public final int b() {
            return this.a;
        }

        public final h c() {
            return this.b;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Message {
        public final int a;
        public final h b;

        public final h a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean a;
        public final g b;
        public final f c;

        public Streams(boolean z, g source, f sink) {
            t.g(source, "source");
            t.g(sink, "sink");
            this.a = z;
            this.b = source;
            this.c = sink;
        }

        public final boolean a() {
            return this.a;
        }

        public final f b() {
            return this.c;
        }

        public final g c() {
            return this.b;
        }
    }

    public final class WriterTask extends Task {
        public final /* synthetic */ RealWebSocket e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriterTask(RealWebSocket this$0) {
            super(t.o(RealWebSocket.e(this$0), " writer"), false, 2, null);
            t.g(this$0, "this$0");
            this.e = this$0;
        }

        public long f() {
            try {
                return this.e.r() ? 0L : -1L;
            } catch (IOException e) {
                this.e.l(e, null);
                return -1L;
            }
        }
    }

    public static final /* synthetic */ ArrayDeque d(RealWebSocket realWebSocket) {
        return realWebSocket.o;
    }

    public static final /* synthetic */ String e(RealWebSocket realWebSocket) {
        return realWebSocket.l;
    }

    public static final /* synthetic */ boolean f(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        return realWebSocket.o(webSocketExtensions);
    }

    public static final /* synthetic */ void g(RealWebSocket realWebSocket, WebSocketExtensions webSocketExtensions) {
        realWebSocket.d = webSocketExtensions;
    }

    public synchronized void a(h payload) {
        try {
            t.g(payload, "payload");
            if (!this.t && (!this.q || !this.o.isEmpty())) {
                this.n.add(payload);
                q();
                this.v++;
            }
        } finally {
        }
    }

    public void b(h bytes) {
        t.g(bytes, "bytes");
        this.a.e(this, bytes);
    }

    public synchronized void c(h payload) {
        t.g(payload, "payload");
        this.w++;
        this.x = false;
    }

    public void h() {
        Call call = this.g;
        t.d(call);
        call.cancel();
    }

    public final void i(Response response, Exchange exchange) {
        t.g(response, "response");
        if (response.f() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.f() + ' ' + response.t() + '\'');
        }
        String o = Response.o(response, "Connection", null, 2, null);
        if (!B.z("Upgrade", o, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + o + '\'');
        }
        String o2 = Response.o(response, "Upgrade", null, 2, null);
        if (!B.z("websocket", o2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + o2 + '\'');
        }
        String o3 = Response.o(response, "Sec-WebSocket-Accept", null, 2, null);
        String a = h.d.d(t.o(this.f, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).B().a();
        if (t.c(a, o3)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + o3 + '\'');
    }

    public boolean j(int i, String str) {
        return k(i, str, 60000L);
    }

    public final synchronized boolean k(int i, String str, long j) {
        h hVar;
        try {
            WebSocketProtocol.a.c(i);
            if (str != null) {
                hVar = h.d.d(str);
                if (hVar.size() > 123) {
                    throw new IllegalArgumentException(t.o("reason.size() > 123: ", str).toString());
                }
            } else {
                hVar = null;
            }
            if (!this.t && !this.q) {
                this.q = true;
                this.o.add(new Close(i, hVar, j));
                q();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void l(Exception e, Response response) {
        t.g(e, "e");
        synchronized (this) {
            if (this.t) {
                return;
            }
            this.t = true;
            Streams streams = this.m;
            this.m = null;
            WebSocketReader webSocketReader = this.i;
            this.i = null;
            WebSocketWriter webSocketWriter = this.j;
            this.j = null;
            this.k.o();
            I i = I.a;
            try {
                this.a.c(this, e, response);
            } finally {
                if (streams != null) {
                    Util.m(streams);
                }
                if (webSocketReader != null) {
                    Util.m(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.m(webSocketWriter);
                }
            }
        }
    }

    public final WebSocketListener m() {
        return this.a;
    }

    public final void n(String name, Streams streams) {
        t.g(name, "name");
        t.g(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.d;
        t.d(webSocketExtensions);
        synchronized (this) {
            try {
                this.l = name;
                this.m = streams;
                this.j = new WebSocketWriter(streams.a(), streams.b(), this.b, webSocketExtensions.a, webSocketExtensions.a(streams.a()), this.e);
                this.h = new WriterTask(this);
                long j = this.c;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.k.i(new RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1(t.o(name, " ping"), this, nanos), nanos);
                }
                if (!this.o.isEmpty()) {
                    q();
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = new WebSocketReader(streams.a(), streams.c(), this, webSocketExtensions.a, webSocketExtensions.a(!streams.a()));
    }

    public final boolean o(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.f && webSocketExtensions.b == null) {
            return webSocketExtensions.d == null || new i(8, 15).m(webSocketExtensions.d.intValue());
        }
        return false;
    }

    public void onReadClose(int i, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        t.g(reason, "reason");
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.r != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.r = i;
                this.s = reason;
                streams = null;
                if (this.q && this.o.isEmpty()) {
                    Streams streams2 = this.m;
                    this.m = null;
                    webSocketReader = this.i;
                    this.i = null;
                    webSocketWriter = this.j;
                    this.j = null;
                    this.k.o();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.a.b(this, i, reason);
            if (streams != null) {
                this.a.a(this, i, reason);
            }
        } finally {
            if (streams != null) {
                Util.m(streams);
            }
            if (webSocketReader != null) {
                Util.m(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.m(webSocketWriter);
            }
        }
    }

    public void onReadMessage(String text) {
        t.g(text, "text");
        this.a.d(this, text);
    }

    public final void p() {
        while (this.r == -1) {
            WebSocketReader webSocketReader = this.i;
            t.d(webSocketReader);
            webSocketReader.a();
        }
    }

    public final void q() {
        if (!Util.h || Thread.holdsLock(this)) {
            Task task = this.h;
            if (task != null) {
                TaskQueue.j(this.k, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final boolean r() {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i;
        Streams streams;
        synchronized (this) {
            try {
                if (this.t) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.j;
                Object poll = this.n.poll();
                Object obj = null;
                if (poll == null) {
                    Object poll2 = this.o.poll();
                    if (poll2 instanceof Close) {
                        i = this.r;
                        str = this.s;
                        if (i != -1) {
                            streams = this.m;
                            this.m = null;
                            webSocketReader = this.i;
                            this.i = null;
                            webSocketWriter = this.j;
                            this.j = null;
                            this.k.o();
                        } else {
                            long a = ((Close) poll2).a();
                            this.k.i(new RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1(t.o(this.l, " cancel"), true, this), TimeUnit.MILLISECONDS.toNanos(a));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i = -1;
                        streams = null;
                    }
                    obj = poll2;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i = -1;
                    streams = null;
                }
                I i2 = I.a;
                try {
                    if (poll != null) {
                        t.d(webSocketWriter2);
                        webSocketWriter2.f((h) poll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        t.d(webSocketWriter2);
                        webSocketWriter2.c(message.b(), message.a());
                        synchronized (this) {
                            this.p -= message.a().size();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        t.d(webSocketWriter2);
                        webSocketWriter2.a(close.b(), close.c());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.a;
                            t.d(str);
                            webSocketListener.a(this, i, str);
                        }
                    }
                    return true;
                } finally {
                    if (streams != null) {
                        Util.m(streams);
                    }
                    if (webSocketReader != null) {
                        Util.m(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.m(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this) {
            try {
                if (this.t) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.j;
                if (webSocketWriter == null) {
                    return;
                }
                int i = this.x ? this.u : -1;
                this.u++;
                this.x = true;
                I i2 = I.a;
                if (i == -1) {
                    try {
                        webSocketWriter.d(h.e);
                        return;
                    } catch (IOException e) {
                        l(e, null);
                        return;
                    }
                }
                l(new SocketTimeoutException("sent ping but didn't receive pong within " + this.c + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
