package okhttp3.internal.cache;

import Ca.I;
import Ra.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache$snapshots$1 implements Iterator, a {
    public final Iterator a;
    public DiskLruCache.Snapshot b;
    public DiskLruCache.Snapshot c;
    public final /* synthetic */ DiskLruCache d;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.b;
        this.c = snapshot;
        this.b = null;
        t.d(snapshot);
        return snapshot;
    }

    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.d;
        synchronized (diskLruCache) {
            if (diskLruCache.v()) {
                return false;
            }
            while (this.a.hasNext()) {
                DiskLruCache.Entry entry = (DiskLruCache.Entry) this.a.next();
                DiskLruCache.Snapshot r = entry == null ? null : entry.r();
                if (r != null) {
                    this.b = r;
                    return true;
                }
            }
            I i = I.a;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.c;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()");
        }
        try {
            this.d.N(snapshot.c());
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.c = null;
            throw th;
        }
        this.c = null;
    }
}
