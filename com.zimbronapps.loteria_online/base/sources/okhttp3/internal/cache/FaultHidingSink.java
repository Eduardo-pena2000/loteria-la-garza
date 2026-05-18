package okhttp3.internal.cache;

import Qa.l;
import java.io.IOException;
import kotlin.jvm.internal.t;
import xb.J;
import xb.e;
import xb.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FaultHidingSink extends n {
    public final l b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(J delegate, l onException) {
        super(delegate);
        t.g(delegate, "delegate");
        t.g(onException, "onException");
        this.b = onException;
    }

    public void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    public void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    public void j1(e source, long j) {
        t.g(source, "source");
        if (this.c) {
            source.skip(j);
            return;
        }
        try {
            super.j1(source, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
