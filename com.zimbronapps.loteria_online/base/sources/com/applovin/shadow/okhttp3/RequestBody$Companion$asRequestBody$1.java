package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Source;
import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ File $this_asRequestBody;

    public RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.$contentType = mediaType;
        this.$this_asRequestBody = file;
    }

    public long contentLength() {
        return this.$this_asRequestBody.length();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(BufferedSink bufferedSink) {
        t.g(bufferedSink, "sink");
        Source source = Okio.source(this.$this_asRequestBody);
        try {
            bufferedSink.writeAll(source);
            Na.c.a(source, (Throwable) null);
        } finally {
        }
    }
}
