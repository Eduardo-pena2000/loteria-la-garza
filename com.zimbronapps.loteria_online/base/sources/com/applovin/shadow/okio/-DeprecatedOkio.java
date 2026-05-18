package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -DeprecatedOkio {
    public static final -DeprecatedOkio INSTANCE = new -DeprecatedOkio();

    private -DeprecatedOkio() {
    }

    @Ca.e
    public final Sink appendingSink(File file) {
        kotlin.jvm.internal.t.g(file, "file");
        return Okio.appendingSink(file);
    }

    @Ca.e
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @Ca.e
    public final BufferedSink buffer(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        return Okio.buffer(sink);
    }

    @Ca.e
    public final Sink sink(File file) {
        kotlin.jvm.internal.t.g(file, "file");
        return Okio.sink$default(file, false, 1, null);
    }

    @Ca.e
    public final Source source(File file) {
        kotlin.jvm.internal.t.g(file, "file");
        return Okio.source(file);
    }

    @Ca.e
    public final BufferedSource buffer(Source source) {
        kotlin.jvm.internal.t.g(source, "source");
        return Okio.buffer(source);
    }

    @Ca.e
    public final Sink sink(OutputStream outputStream) {
        kotlin.jvm.internal.t.g(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    @Ca.e
    public final Source source(InputStream inputStream) {
        kotlin.jvm.internal.t.g(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    @Ca.e
    public final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(openOptionArr, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @Ca.e
    public final Source source(java.nio.file.Path path, OpenOption... openOptionArr) {
        kotlin.jvm.internal.t.g(path, "path");
        kotlin.jvm.internal.t.g(openOptionArr, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @Ca.e
    public final Sink sink(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "socket");
        return Okio.sink(socket);
    }

    @Ca.e
    public final Source source(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "socket");
        return Okio.source(socket);
    }
}
