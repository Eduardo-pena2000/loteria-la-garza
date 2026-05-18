package okhttp3.internal.cache;

import Ca.I;
import Qa.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends u implements l {
    public final /* synthetic */ DiskLruCache a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.a = diskLruCache;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return I.a;
    }

    public final void invoke(IOException it) {
        t.g(it, "it");
        DiskLruCache diskLruCache = this.a;
        if (!Util.h || Thread.holdsLock(diskLruCache)) {
            DiskLruCache.d(this.a, true);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }
}
