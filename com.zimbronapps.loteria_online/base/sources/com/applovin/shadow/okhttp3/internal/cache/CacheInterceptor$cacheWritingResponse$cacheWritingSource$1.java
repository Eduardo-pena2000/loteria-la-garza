package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements Source {
    final /* synthetic */ BufferedSink $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ BufferedSource $source;
    private boolean cacheRequestClosed;

    public CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(BufferedSource bufferedSource, CacheRequest cacheRequest, BufferedSink bufferedSink) {
        this.$source = bufferedSource;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = bufferedSink;
    }

    public void close() throws IOException {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public long read(Buffer buffer, long j) throws IOException {
        t.g(buffer, "sink");
        try {
            long read = this.$source.read(buffer, j);
            if (read != -1) {
                buffer.copyTo(this.$cacheBody.getBuffer(), buffer.size() - read, read);
                this.$cacheBody.emitCompleteSegments();
                return read;
            }
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheBody.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public Timeout timeout() {
        return this.$source.timeout();
    }
}
