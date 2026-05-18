package okhttp3.internal.cache;

import Ca.I;
import okhttp3.internal.cache.DiskLruCache;
import xb.L;
import xb.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache$Entry$newSource$1 extends o {
    public boolean b;
    public final /* synthetic */ L c;
    public final /* synthetic */ DiskLruCache d;
    public final /* synthetic */ DiskLruCache.Entry e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(L l, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(l);
        this.c = l;
        this.d = diskLruCache;
        this.e = entry;
    }

    public void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        DiskLruCache diskLruCache = this.d;
        DiskLruCache.Entry entry = this.e;
        synchronized (diskLruCache) {
            try {
                entry.n(entry.f() - 1);
                if (entry.f() == 0 && entry.i()) {
                    diskLruCache.O(entry);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
