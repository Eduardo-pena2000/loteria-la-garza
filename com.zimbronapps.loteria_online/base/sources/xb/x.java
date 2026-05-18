package xb;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class x {
    public static final J a(File file) {
        return y.b(file);
    }

    public static final J b() {
        return z.a();
    }

    public static final f c(J j) {
        return z.b(j);
    }

    public static final g d(L l) {
        return z.c(l);
    }

    public static final boolean e(AssertionError assertionError) {
        return y.c(assertionError);
    }

    public static final J f(File file, boolean z) {
        return y.d(file, z);
    }

    public static final J g(OutputStream outputStream) {
        return y.e(outputStream);
    }

    public static final J h(Socket socket) {
        return y.f(socket);
    }

    public static /* synthetic */ J i(File file, boolean z, int i, Object obj) {
        return y.g(file, z, i, obj);
    }

    public static final L j(File file) {
        return y.h(file);
    }

    public static final L k(InputStream inputStream) {
        return y.i(inputStream);
    }

    public static final L l(Socket socket) {
        return y.j(socket);
    }
}
