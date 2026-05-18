package okhttp3.internal.cache;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {
    public final /* synthetic */ DiskLruCache e;

    public long f() {
        DiskLruCache diskLruCache = this.e;
        synchronized (diskLruCache) {
            if (!DiskLruCache.b(diskLruCache) || diskLruCache.v()) {
                return -1L;
            }
            try {
                diskLruCache.R();
            } catch (IOException unused) {
                DiskLruCache.h(diskLruCache, true);
            }
            try {
                if (DiskLruCache.c(diskLruCache)) {
                    diskLruCache.M();
                    DiskLruCache.k(diskLruCache, 0);
                }
            } catch (IOException unused2) {
                DiskLruCache.g(diskLruCache, true);
                DiskLruCache.f(diskLruCache, x.c(x.b()));
            }
            return -1L;
        }
    }
}
