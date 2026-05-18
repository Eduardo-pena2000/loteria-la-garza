package com.google.android.gms.internal.ads;

import S5.g1;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdst extends zzbll {
    private final Context zza;
    private final zzdoh zzb;
    private zzdpg zzc;
    private zzdoc zzd;

    public zzdst(Context context, zzdoh zzdohVar, zzdpg zzdpgVar, zzdoc zzdocVar) {
        this.zza = context;
        this.zzb = zzdohVar;
        this.zzc = zzdpgVar;
        this.zzd = zzdocVar;
    }

    public final /* synthetic */ zzdoc zzc() {
        return this.zzd;
    }

    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    public final zzbks zzf(String str) {
        return (zzbks) this.zzb.zzaa().get(str);
    }

    public final List zzg() {
        try {
            zzdoh zzdohVar = this.zzb;
            i0 zzaa = zzdohVar.zzaa();
            i0 zzad = zzdohVar.zzad();
            String[] strArr = new String[zzaa.size() + zzad.size()];
            int i = 0;
            for (int i2 = 0; i2 < zzaa.size(); i2++) {
                strArr[i] = (String) zzaa.h(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzad.size(); i3++) {
                strArr[i] = (String) zzad.h(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    public final String zzh() {
        return this.zzb.zzS();
    }

    public final void zzi(String str) {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zza(str);
        }
    }

    public final void zzj() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzb();
        }
    }

    public final g1 zzk() {
        return this.zzb.zzy();
    }

    public final void zzl() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null) {
            zzdocVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    public final N6.a zzm() {
        return N6.b.s1(this.zza);
    }

    public final boolean zzn(N6.a aVar) {
        zzdpg zzdpgVar;
        Object r1 = N6.b.r1(aVar);
        if (!(r1 instanceof ViewGroup) || (zzdpgVar = this.zzc) == null || !zzdpgVar.zzd((ViewGroup) r1)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdss(this, "_videoMediaView"));
        return true;
    }

    public final boolean zzo() {
        zzdoc zzdocVar = this.zzd;
        if (zzdocVar != null && !zzdocVar.zzM()) {
            return false;
        }
        zzdoh zzdohVar = this.zzb;
        return zzdohVar.zzW() != null && zzdohVar.zzT() == null;
    }

    public final boolean zzp() {
        zzdoh zzdohVar = this.zzb;
        zzekb zzZ = zzdohVar.zzZ();
        if (zzZ == null) {
            int i = o0.b;
            W5.p.f("Trying to start OMID session before creation.");
            return false;
        }
        R5.t.y().zze(zzZ.zza());
        if (zzdohVar.zzW() == null) {
            return true;
        }
        zzdohVar.zzW().zze("onSdkLoaded", new w.a());
        return true;
    }

    public final void zzq(N6.a aVar) {
        zzdoc zzdocVar;
        Object r1 = N6.b.r1(aVar);
        if (!(r1 instanceof View) || this.zzb.zzZ() == null || (zzdocVar = this.zzd) == null) {
            return;
        }
        zzdocVar.zzN((View) r1);
    }

    public final void zzr() {
        try {
            String zzac = this.zzb.zzac();
            if (Objects.equals(zzac, "Google")) {
                int i = o0.b;
                W5.p.f("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzac)) {
                int i2 = o0.b;
                W5.p.f("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdoc zzdocVar = this.zzd;
                if (zzdocVar != null) {
                    zzdocVar.zzL(zzac, false);
                }
            }
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    public final zzbkp zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            R5.t.l().zzg(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    public final boolean zzt(N6.a aVar) {
        zzdpg zzdpgVar;
        Object r1 = N6.b.r1(aVar);
        if (!(r1 instanceof ViewGroup) || (zzdpgVar = this.zzc) == null || !zzdpgVar.zze((ViewGroup) r1)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdss(this, "_videoMediaView"));
        return true;
    }
}
