package w;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class z {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final x.b lock;
    private final x.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public z(int i) {
        this.maxSize = i;
        if (!(i > 0)) {
            x.d.a("maxSize <= 0");
        }
        this.map = new x.c(0, 0.75f);
        this.lock = new x.b();
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (!(sizeOf >= 0)) {
            x.d.b("Negative size: " + obj + '=' + obj2);
        }
        return sizeOf;
    }

    public Object create(Object obj) {
        kotlin.jvm.internal.t.g(obj, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        kotlin.jvm.internal.t.g(obj, "key");
        kotlin.jvm.internal.t.g(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object obj) {
        Object d;
        kotlin.jvm.internal.t.g(obj, "key");
        synchronized (this.lock) {
            Object a = this.map.a(obj);
            if (a != null) {
                this.hitCount++;
                return a;
            }
            this.missCount++;
            Object create = create(obj);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    d = this.map.d(obj, create);
                    if (d != null) {
                        this.map.d(obj, d);
                    } else {
                        this.size += a(obj, create);
                        Ca.I i = Ca.I.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d != null) {
                entryRemoved(false, obj, create, d);
                return d;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        Object d;
        kotlin.jvm.internal.t.g(obj, "key");
        kotlin.jvm.internal.t.g(obj2, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += a(obj, obj2);
                d = this.map.d(obj, obj2);
                if (d != null) {
                    this.size -= a(obj, d);
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d != null) {
            entryRemoved(false, obj, d, obj2);
        }
        trimToSize(this.maxSize);
        return d;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object obj) {
        Object e;
        kotlin.jvm.internal.t.g(obj, "key");
        synchronized (this.lock) {
            try {
                e = this.map.e(obj);
                if (e != null) {
                    this.size -= a(obj, e);
                }
                Ca.I i = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e != null) {
            entryRemoved(false, obj, e, null);
        }
        return e;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            x.d.a("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i;
            Ca.I i2 = Ca.I.a;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(Object obj, Object obj2) {
        kotlin.jvm.internal.t.g(obj, "key");
        kotlin.jvm.internal.t.g(obj2, "value");
        return 1;
    }

    public final Map snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.b().size());
            for (Map.Entry entry : this.map.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            x.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            x.c r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            x.d.b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            x.c r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            x.c r1 = r6.map     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = Da.D.g0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            x.c r4 = r6.map     // Catch: java.lang.Throwable -> L15
            r4.e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.size     // Catch: java.lang.Throwable -> L15
            int r5 = r6.a(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w.z.trimToSize(int):void");
    }
}
