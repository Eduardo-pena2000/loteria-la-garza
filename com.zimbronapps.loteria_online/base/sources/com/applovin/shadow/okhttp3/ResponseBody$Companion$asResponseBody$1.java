package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.BufferedSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ BufferedSource $this_asResponseBody;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, BufferedSource bufferedSource) {
        this.$contentType = mediaType;
        this.$contentLength = j;
        this.$this_asResponseBody = bufferedSource;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public BufferedSource source() {
        return this.$this_asResponseBody;
    }
}
