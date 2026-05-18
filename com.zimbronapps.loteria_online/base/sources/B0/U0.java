package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u0 implements Qa.l {
    public final /* synthetic */ Qa.l a;

    public u0(Qa.l lVar) {
        this.a = lVar;
    }

    public final Object a(long j) {
        return this.a.invoke(Long.valueOf(j / 1000000));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
