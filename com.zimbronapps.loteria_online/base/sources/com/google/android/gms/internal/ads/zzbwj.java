package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwj implements U5.E {
    final /* synthetic */ zzbwl zza;

    public zzbwj(zzbwl zzbwlVar) {
        Objects.requireNonNull(zzbwlVar);
        this.zza = zzbwlVar;
    }

    public final void zzdS() {
        W5.p.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzdT(int i) {
        W5.p.a("AdMobCustomTabsAdapter overlay is closed.");
        zzbwl zzbwlVar = this.zza;
        zzbwlVar.zzb().onAdClosed(zzbwlVar);
    }

    public final void zzdo() {
        W5.p.a("AdMobCustomTabsAdapter overlay is created.");
    }

    public final void zzdp() {
        W5.p.a("AdMobCustomTabsAdapter overlay is started.");
    }

    public final void zzdq() {
        W5.p.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    public final void zzdv() {
    }

    public final void zzdw() {
        W5.p.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zzdx() {
        W5.p.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzdy() {
        W5.p.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    public final void zzdz() {
        W5.p.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    public final void zzh() {
        W5.p.a("Opening AdMobCustomTabsAdapter overlay.");
        zzbwl zzbwlVar = this.zza;
        zzbwlVar.zzb().onAdOpened(zzbwlVar);
    }
}
