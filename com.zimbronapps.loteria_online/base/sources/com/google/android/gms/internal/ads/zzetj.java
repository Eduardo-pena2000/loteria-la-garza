package com.google.android.gms.internal.ads;

import S5.q2;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetj implements zzfav {
    public final q2 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final int zzi;
    public final boolean zzj;
    public final K1.b zzk;
    public final zzetg zzl;

    public zzetj(q2 q2Var, String str, boolean z, String str2, float f, int i, int i2, String str3, int i3, boolean z2, K1.b bVar, zzetg zzetgVar) {
        com.google.android.gms.common.internal.t.m(q2Var, "the adSize must not be null");
        this.zza = q2Var;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = i3;
        this.zzj = z2;
        this.zzk = bVar;
        this.zzl = zzetgVar;
    }

    private final void zzc(Bundle bundle) {
        q2 q2Var = this.zza;
        int i = q2Var.e;
        zzfjz.zzb(bundle, "smart_w", "full", i == -1);
        int i2 = q2Var.b;
        zzfjz.zzb(bundle, "smart_h", "auto", i2 == -2);
        zzfjz.zzd(bundle, "ene", true, q2Var.j);
        zzfjz.zzb(bundle, "rafmt", "102", q2Var.m);
        zzfjz.zzb(bundle, "rafmt", "103", q2Var.n);
        zzfjz.zzb(bundle, "rafmt", "105", q2Var.o);
        zzfjz.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfjz.zzd(bundle, "interscroller_slot", true, q2Var.o);
        zzfjz.zze(bundle, "format", this.zzb);
        zzfjz.zzb(bundle, "fluid", "height", this.zzc);
        zzfjz.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfjz.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i3 = this.zzi;
        if (i3 != -1) {
            bundle.putInt("u_mso", i3);
        }
        K1.b bVar = this.zzk;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.b);
            bundle.putInt("sam_b", bVar.d);
            bundle.putInt("sam_l", bVar.a);
            bundle.putInt("sam_r", bVar.c);
        }
        zzetg zzetgVar = this.zzl;
        if (zzetgVar != null) {
            bundle.putInt("rc_tl", zzetgVar.zza);
            bundle.putInt("rc_tr", zzetgVar.zzb);
            bundle.putInt("rc_bl", zzetgVar.zzc);
            bundle.putInt("rc_br", zzetgVar.zzd);
        }
        ArrayList arrayList = new ArrayList();
        q2[] q2VarArr = q2Var.g;
        if (q2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i2);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", q2Var.i);
            arrayList.add(bundle2);
        } else {
            for (q2 q2Var2 : q2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", q2Var2.i);
                bundle3.putInt("height", q2Var2.b);
                bundle3.putInt("width", q2Var2.e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzdah) obj).zza);
    }

    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzdah) obj).zzb);
    }
}
