package Wa;

import Da.N;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k extends N {
    public final long a;
    public final long b;
    public boolean c;
    public long d;

    public k(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    public long a() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.a + j;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return j;
    }

    public boolean hasNext() {
        return this.c;
    }
}
