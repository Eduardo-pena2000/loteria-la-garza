package L7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class x implements l8.b {
    public volatile Set b = null;
    public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection collection) {
        this.a.addAll(collection);
    }

    public static x b(Collection collection) {
        return new x((Set) collection);
    }

    public synchronized void a(l8.b bVar) {
        try {
            if (this.b == null) {
                this.a.add(bVar);
            } else {
                this.b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((l8.b) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
