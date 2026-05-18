package e5;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends androidx.lifecycle.k {
    public static final g a = new g();
    public static final a b = new a();

    public static final class a implements androidx.lifecycle.r {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g getLifecycle() {
            return g.a;
        }
    }

    public void addObserver(androidx.lifecycle.q qVar) {
        if (!(qVar instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((qVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) qVar;
        a aVar = b;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    public k.b getCurrentState() {
        return k.b.e;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    public void removeObserver(androidx.lifecycle.q qVar) {
    }
}
