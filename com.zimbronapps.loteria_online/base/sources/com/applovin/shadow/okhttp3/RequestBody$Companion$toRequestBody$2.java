package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.BufferedSink;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    final /* synthetic */ int $byteCount;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ int $offset;
    final /* synthetic */ byte[] $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, int i, byte[] bArr, int i2) {
        this.$contentType = mediaType;
        this.$byteCount = i;
        this.$this_toRequestBody = bArr;
        this.$offset = i2;
    }

    public long contentLength() {
        return this.$byteCount;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(BufferedSink bufferedSink) {
        t.g(bufferedSink, "sink");
        bufferedSink.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
    }
}
