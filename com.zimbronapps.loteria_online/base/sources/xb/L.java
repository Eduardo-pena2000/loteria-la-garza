package xb;

import java.util.List;
import xb.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class l {
    public static final a a = new a(null);
    public static final l b;
    public static final C c;
    public static final l d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    static {
        l uVar;
        try {
            Class.forName("java.nio.file.Files");
            uVar = new w();
        } catch (ClassNotFoundException unused) {
            uVar = new u();
        }
        b = uVar;
        C.a aVar = C.b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.t.f(property, "getProperty(\"java.io.tmpdir\")");
        c = C.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = yb.h.class.getClassLoader();
        kotlin.jvm.internal.t.f(classLoader, "ResourceFileSystem::class.java.classLoader");
        d = new yb.h(classLoader, false);
    }

    public final J a(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return b(file, false);
    }

    public abstract J b(C c2, boolean z);

    public abstract void c(C c2, C c3);

    public final void d(C dir) {
        kotlin.jvm.internal.t.g(dir, "dir");
        e(dir, false);
    }

    public final void e(C dir, boolean z) {
        kotlin.jvm.internal.t.g(dir, "dir");
        yb.c.a(this, dir, z);
    }

    public final void f(C dir) {
        kotlin.jvm.internal.t.g(dir, "dir");
        g(dir, false);
    }

    public abstract void g(C c2, boolean z);

    public final void h(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        i(path, false);
    }

    public abstract void i(C c2, boolean z);

    public final boolean j(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        return yb.c.b(this, path);
    }

    public abstract List k(C c2);

    public final k l(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        return yb.c.c(this, path);
    }

    public abstract k m(C c2);

    public abstract j n(C c2);

    public final J o(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return p(file, false);
    }

    public abstract J p(C c2, boolean z);

    public abstract L q(C c2);
}
