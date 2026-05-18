package xb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class y {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final /* synthetic */ Logger a() {
        return a;
    }

    public static final J b(File file) {
        kotlin.jvm.internal.t.g(file, "<this>");
        return x.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        kotlin.jvm.internal.t.g(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? Za.E.T(message, "getsockname failed", false, 2, null) : false;
    }

    public static final J d(File file, boolean z) {
        kotlin.jvm.internal.t.g(file, "<this>");
        return x.g(new FileOutputStream(file, z));
    }

    public static final J e(OutputStream outputStream) {
        kotlin.jvm.internal.t.g(outputStream, "<this>");
        return new B(outputStream, new M());
    }

    public static final J f(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "<this>");
        K k = new K(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.t.f(outputStream, "getOutputStream()");
        return k.A(new B(outputStream, k));
    }

    public static /* synthetic */ J g(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return x.f(file, z);
    }

    public static final L h(File file) {
        kotlin.jvm.internal.t.g(file, "<this>");
        return new s(new FileInputStream(file), M.e);
    }

    public static final L i(InputStream inputStream) {
        kotlin.jvm.internal.t.g(inputStream, "<this>");
        return new s(inputStream, new M());
    }

    public static final L j(Socket socket) {
        kotlin.jvm.internal.t.g(socket, "<this>");
        K k = new K(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.t.f(inputStream, "getInputStream()");
        return k.B(new s(inputStream, k));
    }
}
