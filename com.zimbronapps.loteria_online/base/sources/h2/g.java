package H2;

import Ca.I;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final f a = new f();
    public final Map b = new LinkedHashMap();
    public final Set c = new LinkedHashSet();
    public volatile boolean d;

    public static final /* synthetic */ void a(g gVar, AutoCloseable autoCloseable) {
        gVar.g(autoCloseable);
    }

    public static final /* synthetic */ Set b(g gVar) {
        return gVar.c;
    }

    public static final /* synthetic */ Map c(g gVar) {
        return gVar.b;
    }

    public final void d(AutoCloseable autoCloseable) {
        t.g(autoCloseable, "closeable");
        if (this.d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.a) {
            b(this).add(autoCloseable);
            I i = I.a;
        }
    }

    public final void e(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        t.g(str, "key");
        t.g(autoCloseable, "closeable");
        if (this.d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.a) {
            autoCloseable2 = (AutoCloseable) c(this).put(str, autoCloseable);
        }
        g(autoCloseable2);
    }

    public final void f() {
        if (this.d) {
            return;
        }
        this.d = true;
        synchronized (this.a) {
            try {
                Iterator it = c(this).values().iterator();
                while (it.hasNext()) {
                    a(this, (AutoCloseable) it.next());
                }
                Iterator it2 = b(this).iterator();
                while (it2.hasNext()) {
                    a(this, (AutoCloseable) it2.next());
                }
                b(this).clear();
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final AutoCloseable h(String str) {
        AutoCloseable autoCloseable;
        t.g(str, "key");
        synchronized (this.a) {
            autoCloseable = (AutoCloseable) c(this).get(str);
        }
        return autoCloseable;
    }
}
