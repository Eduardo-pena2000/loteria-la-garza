package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.L;
import xb.M;
import xb.e;
import xb.f;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements L {
    public boolean a;
    public final /* synthetic */ g b;
    public final /* synthetic */ CacheRequest c;
    public final /* synthetic */ f d;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(g gVar, CacheRequest cacheRequest, f fVar) {
        this.b = gVar;
        this.c = cacheRequest;
        this.d = fVar;
    }

    public long F(e sink, long j) {
        t.g(sink, "sink");
        try {
            long F = this.b.F(sink, j);
            if (F != -1) {
                sink.f(this.d.getBuffer(), sink.A() - F, F);
                this.d.emitCompleteSegments();
                return F;
            }
            if (!this.a) {
                this.a = true;
                this.d.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.a) {
                this.a = true;
                this.c.abort();
            }
            throw e;
        }
    }

    public void close() {
        if (!this.a && !Util.s(this, 100, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.c.abort();
        }
        this.b.close();
    }

    public M timeout() {
        return this.b.timeout();
    }
}
