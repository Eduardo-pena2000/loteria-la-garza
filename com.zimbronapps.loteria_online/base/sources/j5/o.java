package j5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final V4.l e;

    public o(boolean z, boolean z2, boolean z3, int i, V4.l lVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = lVar;
    }

    public final boolean a() {
        return this.a;
    }

    public final V4.l b() {
        return this.e;
    }

    public final int c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public /* synthetic */ o(boolean z, boolean z2, boolean z3, int i, V4.l lVar, int i2, kotlin.jvm.internal.k kVar) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) == 0 ? z3 : true, (i2 & 8) != 0 ? 4 : i, (i2 & 16) != 0 ? V4.l.b : lVar);
    }
}
