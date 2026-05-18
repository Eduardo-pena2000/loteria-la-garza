package G;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u implements I.y {
    public final m a;
    public final I.v b;
    public final long c;

    public /* synthetic */ u(long j, boolean z, m mVar, I.v vVar, kotlin.jvm.internal.k kVar) {
        this(j, z, mVar, vVar);
    }

    public static /* synthetic */ t e(u uVar, int i, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i2 & 2) != 0) {
            j = uVar.c;
        }
        return uVar.d(i, j);
    }

    public abstract t b(int i, Object obj, Object obj2, List list, long j);

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t a(int i, int i2, int i3, long j) {
        return d(i, j);
    }

    public final t d(int i, long j) {
        return b(i, this.a.d(i), this.a.e(i), this.b.a0(i, j), j);
    }

    public final long f() {
        return this.c;
    }

    public final androidx.compose.foundation.lazy.layout.b g() {
        return this.a.a();
    }

    public u(long j, boolean z, m mVar, I.v vVar) {
        this.a = mVar;
        this.b = vVar;
        this.c = n1.c.b(0, z ? n1.b.l(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : n1.b.k(j), 5, null);
    }
}
