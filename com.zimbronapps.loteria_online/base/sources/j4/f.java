package j4;

import android.os.Bundle;
import j4.b;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public final l4.b a;
    public b.b b;

    public interface a {
        void a(i iVar);
    }

    public interface b {
        Bundle a();
    }

    public f(l4.b bVar) {
        t.g(bVar, "impl");
        this.a = bVar;
    }

    public final Bundle a(String str) {
        t.g(str, "key");
        return this.a.c(str);
    }

    public final b b(String str) {
        t.g(str, "key");
        return this.a.d(str);
    }

    public final void c(String str, b bVar) {
        t.g(str, "key");
        t.g(bVar, "provider");
        this.a.j(str, bVar);
    }

    public final void d(Class cls) {
        t.g(cls, "clazz");
        if (!this.a.e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b.b bVar = this.b;
        if (bVar == null) {
            bVar = new b.b(this);
        }
        this.b = bVar;
        try {
            cls.getDeclaredConstructor((Class[]) null);
            b.b bVar2 = this.b;
            if (bVar2 != null) {
                String name = cls.getName();
                t.f(name, "getName(...)");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void e(String str) {
        t.g(str, "key");
        this.a.k(str);
    }
}
