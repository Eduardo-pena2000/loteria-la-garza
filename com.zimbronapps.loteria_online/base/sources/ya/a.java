package Ya;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements h {
    public final AtomicReference a;

    public a(h sequence) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        this.a = new AtomicReference(sequence);
    }

    public Iterator iterator() {
        h hVar = (h) this.a.getAndSet((Object) null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
