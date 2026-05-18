package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ ByteString $this_toRequestBody;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.$contentType = mediaType;
        this.$this_toRequestBody = byteString;
    }

    public long contentLength() {
        return this.$this_toRequestBody.size();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(BufferedSink bufferedSink) {
        t.g(bufferedSink, "sink");
        bufferedSink.write(this.$this_toRequestBody);
    }
}
