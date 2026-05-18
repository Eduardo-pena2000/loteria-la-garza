package com.google.android.gms.ads.internal;

import N6.a;
import N6.b;
import R5.s;
import S5.D0;
import S5.U;
import S5.Y;
import S5.Y0;
import S5.l0;
import S5.q2;
import S5.r0;
import U5.I;
import U5.J;
import U5.d;
import U5.h;
import U5.j;
import U5.k;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdpa;
import com.google.android.gms.internal.ads.zzdpc;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzeqr;
import com.google.android.gms.internal.ads.zzfdu;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzfgx;
import com.google.android.gms.internal.ads.zzfik;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ClientApi extends r0 {
    public final l0 B(a aVar, zzbtt zzbttVar, int i) {
        return zzcma.zza((Context) b.r1(aVar), zzbttVar, i).zzf();
    }

    public final Y C0(a aVar, q2 q2Var, String str, int i) {
        return new s((Context) b.r1(aVar), q2Var, str, new W5.a(254715000, i, true, false));
    }

    public final Y E0(a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        zzfdu zzl = zzcma.zza(context, zzbttVar, i).zzl();
        zzl.zzb(str);
        zzl.zzc(context);
        return zzl.zza().zza();
    }

    public final zzbkw G(a aVar, a aVar2) {
        return new zzdpc((FrameLayout) b.r1(aVar), (FrameLayout) b.r1(aVar2), 254715000);
    }

    public final Y0 G0(a aVar, zzbtt zzbttVar, int i) {
        return zzcma.zza((Context) b.r1(aVar), zzbttVar, i).zzC();
    }

    public final zzcaj R(a aVar, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        zzfik zzq = zzcma.zza(context, zzbttVar, i).zzq();
        zzq.zzc(context);
        return zzq.zza().zza();
    }

    public final zzblc V(a aVar, a aVar2, a aVar3) {
        return new zzdpa((View) b.r1(aVar), (HashMap) b.r1(aVar2), (HashMap) b.r1(aVar3));
    }

    public final Y W(a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        zzffh zzj = zzcma.zza(context, zzbttVar, i).zzj();
        zzj.zzd(context);
        zzj.zzb(q2Var);
        zzj.zzc(str);
        return zzj.zza().zza();
    }

    public final zzbxl a1(a aVar, zzbtt zzbttVar, int i) {
        return zzcma.zza((Context) b.r1(aVar), zzbttVar, i).zzu();
    }

    public final zzcdd f1(a aVar, zzbtt zzbttVar, int i) {
        return zzcma.zza((Context) b.r1(aVar), zzbttVar, i).zzs();
    }

    public final U l0(a aVar, String str, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        return new zzeqr(zzcma.zza(context, zzbttVar, i), context, str);
    }

    public final D0 m(a aVar, int i) {
        return zzcma.zza((Context) b.r1(aVar), null, i).zze();
    }

    public final zzcaz q(a aVar, String str, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        zzfik zzq = zzcma.zza(context, zzbttVar, i).zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        return zzq.zza().zzb();
    }

    public final Y r(a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Context context = (Context) b.r1(aVar);
        zzfgx zzn = zzcma.zza(context, zzbttVar, i).zzn();
        zzn.zzd(context);
        zzn.zzb(q2Var);
        zzn.zzc(str);
        return zzn.zza().zza();
    }

    public final zzbpk y(a aVar, zzbtt zzbttVar, int i, zzbph zzbphVar) {
        Context context = (Context) b.r1(aVar);
        zzdzq zzA = zzcma.zza(context, zzbttVar, i).zzA();
        zzA.zzc(context);
        zzA.zzb(zzbphVar);
        return zzA.zza().zzb();
    }

    public final zzbxs zzg(a aVar) {
        Activity activity = (Activity) b.r1(aVar);
        AdOverlayInfoParcel M1 = AdOverlayInfoParcel.M1(activity.getIntent());
        if (M1 == null) {
            return new J(activity);
        }
        int i = M1.k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new J(activity) : new h(activity) : new d(activity, M1) : new k(activity) : new j(activity) : new I(activity);
    }
}
