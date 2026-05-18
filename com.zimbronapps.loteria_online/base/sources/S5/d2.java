package S5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d2 extends J {
    public final L5.e a;

    public d2(L5.e eVar) {
        this.a = eVar;
    }

    public final L5.e q1() {
        return this.a;
    }

    public final void zzb() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdClosed();
        }
    }

    public final void zzd(c1 c1Var) {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdFailedToLoad(c1Var.N1());
        }
    }

    public final void zzf() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdLoaded();
        }
    }

    public final void zzg() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdOpened();
        }
    }

    public final void zzh() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdClicked();
        }
    }

    public final void zzi() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdSwipeGestureClicked();
        }
    }

    public final void zzj() {
        L5.e eVar = this.a;
        if (eVar != null) {
            eVar.onAdImpression();
        }
    }

    public final void zze() {
    }

    public final void zzc(int i) {
    }
}
