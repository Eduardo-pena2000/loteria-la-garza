package lb;

import hb.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class m extends A {
    public final /* synthetic */ AtomicReferenceArray e;

    public m(long j, m mVar, int i) {
        super(j, mVar, i);
        this.e = new AtomicReferenceArray(l.h());
    }

    public int r() {
        return l.h();
    }

    public void s(int i, Throwable th, Ga.i iVar) {
        v().set(i, l.e());
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.e;
    }
}
