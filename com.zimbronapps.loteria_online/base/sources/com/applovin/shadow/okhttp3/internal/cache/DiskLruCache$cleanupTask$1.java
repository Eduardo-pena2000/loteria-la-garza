package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okhttp3.internal.concurrent.Task;
import com.applovin.shadow.okio.Okio;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$cleanupTask$1(DiskLruCache diskLruCache, String str) {
        super(str, false, 2, null);
        this.this$0 = diskLruCache;
    }

    public long runOnce() {
        DiskLruCache diskLruCache = this.this$0;
        synchronized (diskLruCache) {
            if (!DiskLruCache.access$getInitialized$p(diskLruCache) || diskLruCache.getClosed$okhttp()) {
                return -1L;
            }
            try {
                diskLruCache.trimToSize();
            } catch (IOException unused) {
                DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache, true);
            }
            try {
                if (DiskLruCache.access$journalRebuildRequired(diskLruCache)) {
                    diskLruCache.rebuildJournal$okhttp();
                    DiskLruCache.access$setRedundantOpCount$p(diskLruCache, 0);
                }
            } catch (IOException unused2) {
                DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache, true);
                DiskLruCache.access$setJournalWriter$p(diskLruCache, Okio.buffer(Okio.blackhole()));
            }
            return -1L;
        }
    }
}
