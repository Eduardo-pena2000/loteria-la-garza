package S5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g2 extends M {
    public final L5.f a;
    public final Object b;

    public g2(L5.f fVar, Object obj) {
        this.a = fVar;
        this.b = obj;
    }

    public final void zzb() {
        Object obj;
        L5.f fVar = this.a;
        if (fVar == null || (obj = this.b) == null) {
            return;
        }
        fVar.onAdLoaded(obj);
    }

    public final void zzc(c1 c1Var) {
        L5.f fVar = this.a;
        if (fVar != null) {
            fVar.onAdFailedToLoad(c1Var.N1());
        }
    }
}
