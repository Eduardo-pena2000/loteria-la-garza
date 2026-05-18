package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.applovin.shadow.okio.internal.ZipFilesKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("com.applovin.shadow.okio.Okio");

    public static final /* synthetic */ Logger access$getLogger$p() {
        return logger;
    }

    public static final Sink appendingSink(File file) throws FileNotFoundException {
        kotlin.jvm.internal.t.g(file, "<this>");
        return Okio.sink((OutputStream) new FileOutputStream(file, true));
    }

    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        kotlin.jvm.internal.t.g(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        kotlin.jvm.internal.t.g(sink, "<this>");
        kotlin.jvm.internal.t.g(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        kotlin.jvm.internal.t.g(source, "<this>");
        kotlin.jvm.internal.t.g(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        kotlin.jvm.internal.t.g(sink, "<this>");
        kotlin.jvm.internal.t.g(mac, "mac");
        return new HashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        kotlin.jvm.internal.t.g(source, "<this>");
        kotlin.jvm.internal.t.g(mac, "mac");
        return new HashingSource(source, mac);
    }

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        kotlin.jvm.internal.t.g(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? Za.E.T(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final FileSystem openZip(FileSystem fileSystem, Path path) throws IOException {
        kotlin.jvm.internal.t.g(fileSystem, "<this>");
        kotlin.jvm.internal.t.g(path, "zipPath");
        return ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
    }

    public static final Sink sink(File file) throws FileNotFoundException {
        kotlin.jvm.internal.t.g(file, "<this>");
        return Okio.sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return Okio.sink(file, z);
    }

    public static final Source source(InputStream inputStream) {
        kotlin.jvm.internal.t.g(inputStream, "<this>");
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
        kotlin.jvm.internal.t.g(sink, "<this>");
        kotlin.jvm.internal.t.g(messageDigest, "digest");
        return new HashingSink(sink, messageDigest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
        kotlin.jvm.internal.t.g(source, "<this>");
        kotlin.jvm.internal.t.g(messageDigest, "digest");
        return new HashingSource(source, messageDigest);
    }

    public static final Sink sink(OutputStream outputStream) {
        kotlin.jvm.internal.t.g(outputStream, "<this>");
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(Socket socket) throws IOException {
        kotlin.jvm.internal.t.g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.t.f(inputStream, "getInputStream(...)");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final Sink sink(Socket socket) throws IOException {
        kotlin.jvm.internal.t.g(socket, "<this>");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.t.f(outputStream, "getOutputStream(...)");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    public static final Source source(File file) throws FileNotFoundException {
        kotlin.jvm.internal.t.g(file, "<this>");
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(File file, boolean z) throws FileNotFoundException {
        kotlin.jvm.internal.t.g(file, "<this>");
        return Okio.sink((OutputStream) new FileOutputStream(file, z));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.t.g(path, "<this>");
        kotlin.jvm.internal.t.g(openOptionArr, "options");
        InputStream a = q.a(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.t.f(a, "newInputStream(...)");
        return Okio.source(a);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        kotlin.jvm.internal.t.g(path, "<this>");
        kotlin.jvm.internal.t.g(openOptionArr, "options");
        OutputStream a = p.a(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.t.f(a, "newOutputStream(...)");
        return Okio.sink(a);
    }
}
