package com.applovin.shadow.okhttp3.internal.cache;

import Ca.I;
import com.applovin.shadow.okhttp3.internal.cache.DiskLruCache;
import com.applovin.shadow.okio.ForwardingSource;
import com.applovin.shadow.okio.Source;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {
    private boolean closed;
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Entry this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(Source source, DiskLruCache diskLruCache, DiskLruCache.Entry entry) {
        super(source);
        this.this$0 = diskLruCache;
        this.this$1 = entry;
    }

    public void close() {
        super.close();
        if (this.closed) {
            return;
        }
        this.closed = true;
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Entry entry = this.this$1;
        synchronized (diskLruCache) {
            try {
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                    diskLruCache.removeEntry$okhttp(entry);
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
