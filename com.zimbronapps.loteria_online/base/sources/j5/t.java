package j5;

import Ca.I;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import d5.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements ComponentCallbacks2, e.a {
    public static final a f = new a(null);
    public final Context a;
    public final WeakReference b;
    public final d5.e c;
    public volatile boolean d;
    public final AtomicBoolean e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public t(T4.e eVar, Context context, boolean z) {
        d5.e cVar;
        this.a = context;
        this.b = new WeakReference(eVar);
        if (z) {
            eVar.h();
            cVar = d5.f.a(context, this, null);
        } else {
            cVar = new d5.c();
        }
        this.c = cVar;
        this.d = cVar.a();
        this.e = new AtomicBoolean(false);
    }

    public void a(boolean z) {
        I i;
        T4.e eVar = (T4.e) this.b.get();
        if (eVar != null) {
            eVar.h();
            this.d = z;
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            d();
        }
    }

    public final boolean b() {
        return this.d;
    }

    public final void c() {
        this.a.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.unregisterComponentCallbacks(this);
        this.c.shutdown();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (((T4.e) this.b.get()) == null) {
            d();
            I i = I.a;
        }
    }

    public void onLowMemory() {
        onTrimMemory(80);
    }

    public void onTrimMemory(int i) {
        I i2;
        T4.e eVar = (T4.e) this.b.get();
        if (eVar != null) {
            eVar.h();
            eVar.l(i);
            i2 = I.a;
        } else {
            i2 = null;
        }
        if (i2 == null) {
            d();
        }
    }
}
