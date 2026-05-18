package androidx.window.layout.adapter.extensions;

import A4.k;
import C4.f;
import Ca.I;
import S1.b;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class MulticastConsumer implements b, Consumer {
    public final Context a;
    public final ReentrantLock b;
    public k c;
    public final Set d;

    public MulticastConsumer(Context context) {
        t.g(context, "context");
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    public final void a(b bVar) {
        t.g(bVar, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            k kVar = this.c;
            if (kVar != null) {
                bVar.accept(kVar);
            }
            this.d.add(bVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b() {
        return this.d.isEmpty();
    }

    public final void c(b bVar) {
        t.g(bVar, "listener");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(bVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void accept(WindowLayoutInfo windowLayoutInfo) {
        t.g(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            k c = f.a.c(this.a, windowLayoutInfo);
            this.c = c;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((b) it.next()).accept(c);
            }
            I i = I.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
