package hb;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class y {
    private volatile AtomicReferenceArray array;

    public y(int i) {
        this.array = new AtomicReferenceArray(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(Wa.n.e(i + 1, length * 2));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
