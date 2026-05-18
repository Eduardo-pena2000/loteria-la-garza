package H3;

import o3.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends o3.h implements g {
    public final int h;
    public final long i;

    public a(long j, long j2, F.a aVar, boolean z) {
        this(j, j2, aVar.f, aVar.c, z);
    }

    public long c(long j) {
        return b(j);
    }

    public long h() {
        return this.i;
    }

    public int k() {
        return this.h;
    }

    public a(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = i;
        this.i = j == -1 ? -1L : j;
    }
}
