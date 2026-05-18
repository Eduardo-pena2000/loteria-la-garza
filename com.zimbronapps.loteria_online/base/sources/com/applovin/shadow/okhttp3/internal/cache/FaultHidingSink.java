package com.applovin.shadow.okhttp3.internal.cache;

import Qa.l;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSink;
import com.applovin.shadow.okio.Sink;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    private final l onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(Sink sink, l lVar) {
        super(sink);
        t.g(sink, "delegate");
        t.g(lVar, "onException");
        this.onException = lVar;
    }

    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final l getOnException() {
        return this.onException;
    }

    public void write(Buffer buffer, long j) {
        t.g(buffer, "source");
        if (this.hasErrors) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
