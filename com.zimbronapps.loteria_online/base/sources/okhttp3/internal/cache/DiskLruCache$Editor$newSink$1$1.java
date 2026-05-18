package okhttp3.internal.cache;

import Ca.I;
import Qa.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends u implements l {
    public final /* synthetic */ DiskLruCache a;
    public final /* synthetic */ DiskLruCache.Editor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.a = diskLruCache;
        this.b = editor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return I.a;
    }

    public final void invoke(IOException it) {
        t.g(it, "it");
        DiskLruCache diskLruCache = this.a;
        DiskLruCache.Editor editor = this.b;
        synchronized (diskLruCache) {
            editor.c();
            I i = I.a;
        }
    }
}
