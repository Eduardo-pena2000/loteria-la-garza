package W4;

import Qa.l;
import java.io.IOException;
import xb.J;
import xb.e;
import xb.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends n {
    public final l b;
    public boolean c;

    public c(J j, l lVar) {
        super(j);
        this.b = lVar;
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    public void j1(e eVar, long j) {
        if (this.c) {
            eVar.skip(j);
            return;
        }
        try {
            super.j1(eVar, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
