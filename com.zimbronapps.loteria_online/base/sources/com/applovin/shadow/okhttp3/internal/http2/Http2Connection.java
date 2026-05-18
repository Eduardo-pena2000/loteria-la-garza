package com.applovin.shadow.okhttp3.internal.http2;

import Ca.I;
import Qa.a;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue;
import com.applovin.shadow.okhttp3.internal.concurrent.TaskRunner;
import com.applovin.shadow.okhttp3.internal.http2.Http2Reader;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection implements Closeable {
    public static final int AWAIT_PING = 3;
    public static final Companion Companion = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final Socket socket;
    private final Map streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
            t.g(taskRunner, "taskRunner");
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.peerName(socket);
            }
            if ((i & 4) != 0) {
                bufferedSource = Okio.buffer(Okio.source(socket));
            }
            if ((i & 8) != 0) {
                bufferedSink = Okio.buffer(Okio.sink(socket));
            }
            return builder.socket(socket, str, bufferedSource, bufferedSink);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            t.v("connectionName");
            return null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink = this.sink;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            t.v("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            t.v("socket");
            return null;
        }

        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            t.v("source");
            return null;
        }

        public final TaskRunner getTaskRunner$okhttp() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            t.g(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            t.g(pushObserver, "pushObserver");
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            t.g(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener) {
            t.g(listener, "<set-?>");
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            t.g(pushObserver, "<set-?>");
            this.pushObserver = pushObserver;
        }

        public final void setSink$okhttp(BufferedSink bufferedSink) {
            t.g(bufferedSink, "<set-?>");
            this.sink = bufferedSink;
        }

        public final void setSocket$okhttp(Socket socket) {
            t.g(socket, "<set-?>");
            this.socket = socket;
        }

        public final void setSource$okhttp(BufferedSource bufferedSource) {
            t.g(bufferedSource, "<set-?>");
            this.source = bufferedSource;
        }

        public final Builder socket(Socket socket) throws IOException {
            t.g(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final Builder socket(Socket socket, String str) throws IOException {
            t.g(socket, "socket");
            t.g(str, "peerName");
            return socket$default(this, socket, str, null, null, 12, null);
        }

        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource) throws IOException {
            t.g(socket, "socket");
            t.g(str, "peerName");
            t.g(bufferedSource, "source");
            return socket$default(this, socket, str, bufferedSource, null, 8, null);
        }

        public final Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) throws IOException {
            String str2;
            t.g(socket, "socket");
            t.g(str, "peerName");
            t.g(bufferedSource, "source");
            t.g(bufferedSink, "sink");
            setSocket$okhttp(socket);
            if (this.client) {
                str2 = Util.okHttpName + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            setConnectionName$okhttp(str2);
            setSource$okhttp(bufferedSource);
            setSink$okhttp(bufferedSink);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.access$getDEFAULT_SETTINGS$cp();
        }

        private Companion() {
        }
    }

    public static abstract class Listener {
        public static final Companion Companion = new Companion(null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private Companion() {
            }
        }

        public void onSettings(Http2Connection http2Connection, Settings settings) {
            t.g(http2Connection, "connection");
            t.g(settings, "settings");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            t.g(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        public void ackSettings() {
        }

        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
            t.g(str, "origin");
            t.g(byteString, "protocol");
            t.g(str2, "host");
        }

        public final void applyAndAckSettings(boolean z, Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            t.g(settings, "settings");
            O o = new O();
            Http2Writer writer = this.this$0.getWriter();
            Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!z) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        o.a = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        http2StreamArr = (initialWindowSize == 0 || http2Connection.getStreams$okhttp().isEmpty()) ? null : (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                        http2Connection.setPeerSettings((Settings) o.a);
                        Http2Connection.access$getSettingsListenerQueue$p(http2Connection).schedule(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1(http2Connection.getConnectionName$okhttp() + " onSettings", true, http2Connection, o), 0L);
                        I i2 = I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) o.a);
                } catch (IOException e) {
                    Http2Connection.access$failConnection(http2Connection, e);
                }
                I i3 = I.a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                        I i4 = I.a;
                    }
                }
            }
        }

        public void data(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            t.g(bufferedSource, "source");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, bufferedSource, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                bufferedSource.skip(j);
                return;
            }
            stream.receiveData(bufferedSource, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            int i2;
            Object[] array;
            t.g(errorCode, "errorCode");
            t.g(byteString, "debugData");
            byteString.size();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                Http2Connection.access$setShutdown$p(http2Connection, true);
                I i3 = I.a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        public void headers(boolean z, int i, int i2, List list) {
            t.g(list, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushHeadersLater$okhttp(i, list, z);
                return;
            }
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(i);
                if (stream != null) {
                    I i3 = I.a;
                    stream.receiveHeaders(Util.toHeaders(list), z);
                    return;
                }
                if (Http2Connection.access$isShutdown$p(http2Connection)) {
                    return;
                }
                if (i <= http2Connection.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i % 2 == http2Connection.getNextStreamId$okhttp() % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.toHeaders(list));
                http2Connection.setLastGoodStreamId$okhttp(i);
                http2Connection.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                Http2Connection.access$getTaskRunner$p(http2Connection).newQueue().schedule(new Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1(http2Connection.getConnectionName$okhttp() + '[' + i + "] onStream", true, http2Connection, http2Stream), 0L);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public void ping(boolean z, int i, int i2) {
            if (!z) {
                Http2Connection.access$getWriterQueue$p(this.this$0).schedule(new Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(this.this$0.getConnectionName$okhttp() + " ping", true, this.this$0, i, i2), 0L);
                return;
            }
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        Http2Connection.access$setIntervalPongsReceived$p(http2Connection, Http2Connection.access$getIntervalPongsReceived$p(http2Connection) + 1);
                    } else if (i != 2) {
                        if (i == 3) {
                            Http2Connection.access$setAwaitPongsReceived$p(http2Connection, Http2Connection.access$getAwaitPongsReceived$p(http2Connection) + 1);
                            t.e(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection.notifyAll();
                        }
                        I i3 = I.a;
                    } else {
                        Http2Connection.access$setDegradedPongsReceived$p(http2Connection, Http2Connection.access$getDegradedPongsReceived$p(http2Connection) + 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        public void pushPromise(int i, int i2, List list) {
            t.g(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        public void rstStream(int i, ErrorCode errorCode) {
            t.g(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        public void settings(boolean z, Settings settings) {
            t.g(settings, "settings");
            Http2Connection.access$getWriterQueue$p(this.this$0).schedule(new Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(this.this$0.getConnectionName$okhttp() + " applyAndAckSettings", true, this, z, settings), 0L);
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = this.this$0;
                synchronized (http2Connection) {
                    Http2Connection.access$setWriteBytesMaximum$p(http2Connection, http2Connection.getWriteBytesMaximum() + j);
                    t.e(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    I i2 = I.a;
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    I i3 = I.a;
                }
            }
        }

        public void invoke() {
            Closeable closeable;
            Closeable closeable2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    while (this.reader.nextFrame(false, this)) {
                    }
                    Closeable closeable3 = ErrorCode.NO_ERROR;
                    try {
                        this.this$0.close$okhttp(closeable3, ErrorCode.CANCEL, null);
                        closeable = closeable3;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode, errorCode, e);
                        closeable = http2Connection;
                        closeable2 = this.reader;
                        Util.closeQuietly(closeable2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(closeable, closeable2, e);
                    Util.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                closeable = closeable2;
                this.this$0.close$okhttp(closeable, closeable2, e);
                Util.closeQuietly(this.reader);
                throw th;
            }
            closeable2 = this.reader;
            Util.closeQuietly(closeable2);
        }
    }

    static {
        Settings settings = new Settings();
        settings.set(7, 65535);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        t.g(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.client = client$okhttp;
        this.listener = builder.getListener$okhttp();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.taskRunner = taskRunner$okhttp;
        TaskQueue newQueue = taskRunner$okhttp.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner$okhttp.newQueue();
        this.settingsListenerQueue = taskRunner$okhttp.newQueue();
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, 16777216);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.writeBytesMaximum = r2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), client$okhttp);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), client$okhttp));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            newQueue.schedule(new Http2Connection$special$$inlined$schedule$1(connectionName$okhttp + " ping", this, nanos), nanos);
        }
    }

    public static final /* synthetic */ void access$failConnection(Http2Connection http2Connection, IOException iOException) {
        http2Connection.failConnection(iOException);
    }

    public static final /* synthetic */ long access$getAwaitPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.awaitPongsReceived;
    }

    public static final /* synthetic */ Set access$getCurrentPushRequests$p(Http2Connection http2Connection) {
        return http2Connection.currentPushRequests;
    }

    public static final /* synthetic */ Settings access$getDEFAULT_SETTINGS$cp() {
        return DEFAULT_SETTINGS;
    }

    public static final /* synthetic */ long access$getDegradedPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.degradedPongsReceived;
    }

    public static final /* synthetic */ long access$getIntervalPingsSent$p(Http2Connection http2Connection) {
        return http2Connection.intervalPingsSent;
    }

    public static final /* synthetic */ long access$getIntervalPongsReceived$p(Http2Connection http2Connection) {
        return http2Connection.intervalPongsReceived;
    }

    public static final /* synthetic */ PushObserver access$getPushObserver$p(Http2Connection http2Connection) {
        return http2Connection.pushObserver;
    }

    public static final /* synthetic */ TaskQueue access$getSettingsListenerQueue$p(Http2Connection http2Connection) {
        return http2Connection.settingsListenerQueue;
    }

    public static final /* synthetic */ TaskRunner access$getTaskRunner$p(Http2Connection http2Connection) {
        return http2Connection.taskRunner;
    }

    public static final /* synthetic */ TaskQueue access$getWriterQueue$p(Http2Connection http2Connection) {
        return http2Connection.writerQueue;
    }

    public static final /* synthetic */ boolean access$isShutdown$p(Http2Connection http2Connection) {
        return http2Connection.isShutdown;
    }

    public static final /* synthetic */ void access$setAwaitPongsReceived$p(Http2Connection http2Connection, long j) {
        http2Connection.awaitPongsReceived = j;
    }

    public static final /* synthetic */ void access$setDegradedPongsReceived$p(Http2Connection http2Connection, long j) {
        http2Connection.degradedPongsReceived = j;
    }

    public static final /* synthetic */ void access$setIntervalPingsSent$p(Http2Connection http2Connection, long j) {
        http2Connection.intervalPingsSent = j;
    }

    public static final /* synthetic */ void access$setIntervalPongsReceived$p(Http2Connection http2Connection, long j) {
        http2Connection.intervalPongsReceived = j;
    }

    public static final /* synthetic */ void access$setShutdown$p(Http2Connection http2Connection, boolean z) {
        http2Connection.isShutdown = z;
    }

    public static final /* synthetic */ void access$setWriteBytesMaximum$p(Http2Connection http2Connection, long j) {
        http2Connection.writeBytesMaximum = j;
    }

    private final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.INSTANCE;
        }
        http2Connection.start(z, taskRunner);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            t.e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i;
        Object[] objArr;
        t.g(errorCode, "connectionCode");
        t.g(errorCode2, "streamCode");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            shutdown(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.streams.values().toArray(new Http2Stream[0]);
                    this.streams.clear();
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return (Http2Stream) this.streams.get(Integer.valueOf(i));
    }

    public final Map getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isHealthy(long j) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (j >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream newStream(List list, boolean z) throws IOException {
        t.g(list, "requestHeaders");
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        t.g(bufferedSource, "source");
        Buffer buffer = new Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        this.pushQueue.schedule(new Http2Connection$pushDataLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] onData", true, this, i, buffer, i2, z), 0L);
    }

    public final void pushHeadersLater$okhttp(int i, List list, boolean z) {
        t.g(list, "requestHeaders");
        this.pushQueue.schedule(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] onHeaders", true, this, i, list, z), 0L);
    }

    public final void pushRequestLater$okhttp(int i, List list) {
        t.g(list, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            this.pushQueue.schedule(new Http2Connection$pushRequestLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] onRequest", true, this, i, list), 0L);
        }
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        this.pushQueue.schedule(new Http2Connection$pushResetLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] onReset", true, this, i, errorCode), 0L);
    }

    public final Http2Stream pushStream(int i, List list, boolean z) throws IOException {
        t.g(list, "requestHeaders");
        if (this.client) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return newStream(i, list, z);
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.streams.remove(Integer.valueOf(i));
        t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            I i = I.a;
            this.writerQueue.schedule(new Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(this.connectionName + " ping", true, this), 0L);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        t.g(settings, "<set-?>");
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) throws IOException {
        t.g(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    throw new ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
                I i = I.a;
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        t.g(errorCode, "statusCode");
        synchronized (this.writer) {
            M m = new M();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i = this.lastGoodStreamId;
                m.a = i;
                I i2 = I.a;
                this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, null, 3, null);
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.maxDataLength());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = Ca.I.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeData(int r9, boolean r10, com.applovin.shadow.okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r12 = r8.writer
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.t.e(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            Ca.I r4 = Ca.I.a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            com.applovin.shadow.okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http2.Http2Connection.writeData(int, boolean, com.applovin.shadow.okio.Buffer, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List list) throws IOException {
        t.g(list, "alternating");
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
        t.g(errorCode, "statusCode");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        this.writerQueue.schedule(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] writeSynReset", true, this, i, errorCode), 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        this.writerQueue.schedule(new Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(this.connectionName + '[' + i + "] windowUpdate", true, this, i, j), 0L);
    }

    private final Http2Stream newStream(int i, List list, boolean z) throws IOException {
        int i2;
        Http2Stream http2Stream;
        boolean z2 = true;
        boolean z3 = !z;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (this.nextStreamId > 1073741823) {
                            shutdown(ErrorCode.REFUSED_STREAM);
                        }
                        if (this.isShutdown) {
                            throw new ConnectionShutdownException();
                        }
                        i2 = this.nextStreamId;
                        this.nextStreamId = i2 + 2;
                        http2Stream = new Http2Stream(i2, this, z3, false, null);
                        if (z && this.writeBytesTotal < this.writeBytesMaximum && http2Stream.getWriteBytesTotal() < http2Stream.getWriteBytesMaximum()) {
                            z2 = false;
                        }
                        if (http2Stream.isOpen()) {
                            this.streams.put(Integer.valueOf(i2), http2Stream);
                        }
                        I i3 = I.a;
                    } finally {
                    }
                }
                if (i == 0) {
                    this.writer.headers(z3, i2, list);
                } else {
                    if (this.client) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.writer.pushPromise(i, i2, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.writer.flush();
        }
        return http2Stream;
    }

    public final void start(boolean z) throws IOException {
        start$default(this, z, null, 2, null);
    }

    public final void start(boolean z, TaskRunner taskRunner) throws IOException {
        t.g(taskRunner, "taskRunner");
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r5 - 65535);
            }
        }
        taskRunner.newQueue().schedule(new TaskQueue.1(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }
}
