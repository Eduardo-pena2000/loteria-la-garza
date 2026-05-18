package com.google.android.gms.internal.ads;

import O5.e;
import S5.e2;
import S5.l2;
import S5.p0;
import S5.q2;
import S5.t0;
import S5.w2;
import V5.F0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfjk {
    public final e2 zza;
    public final zzbqs zzb;
    public final zzerp zzc;
    public final l2 zzd;
    public final Bundle zze;
    public final q2 zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbkh zzj;
    public final w2 zzk;
    public final int zzl;
    public final O5.a zzm;
    public final O5.g zzn;
    public final p0 zzo;
    public final zzfiy zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final t0 zzw;

    public /* synthetic */ zzfjk(zzfjj zzfjjVar, byte[] bArr) {
        this.zzf = zzfjjVar.zzE();
        this.zzg = zzfjjVar.zzF();
        this.zzw = zzfjjVar.zzaa();
        this.zze = zzfjjVar.zzD().B;
        l2 zzD = zzfjjVar.zzD();
        l2 zzD2 = zzfjjVar.zzD();
        l2 zzD3 = zzfjjVar.zzD();
        l2 zzD4 = zzfjjVar.zzD();
        l2 zzD5 = zzfjjVar.zzD();
        l2 zzD6 = zzfjjVar.zzD();
        l2 l2Var = new l2(zzfjjVar.zzD().a, zzfjjVar.zzD().b, zzD6.c, zzD5.d, zzD4.e, zzD3.f, zzD2.g, zzD.h || zzfjjVar.zzH(), zzfjjVar.zzD().i, zzfjjVar.zzD().j, zzfjjVar.zzD().k, zzfjjVar.zzD().l, zzfjjVar.zzD().m, zzfjjVar.zzD().n, zzfjjVar.zzD().o, zzfjjVar.zzD().p, zzfjjVar.zzD().q, zzfjjVar.zzD().r, zzfjjVar.zzD().s, zzfjjVar.zzD().t, zzfjjVar.zzD().u, zzfjjVar.zzD().v, F0.A(zzfjjVar.zzD().w), zzfjjVar.zzD().x, zzfjjVar.zzD().y, zzfjjVar.zzD().z, zzfjjVar.zzD().A);
        this.zzd = l2Var;
        this.zza = zzfjjVar.zzG() != null ? zzfjjVar.zzG() : zzfjjVar.zzK() != null ? zzfjjVar.zzK().zzf : null;
        this.zzh = zzfjjVar.zzI();
        this.zzi = zzfjjVar.zzJ();
        this.zzj = zzfjjVar.zzI() == null ? null : zzfjjVar.zzK() == null ? new zzbkh(new e.a().a()) : zzfjjVar.zzK();
        this.zzk = zzfjjVar.zzL();
        this.zzl = zzfjjVar.zzP();
        this.zzm = zzfjjVar.zzM();
        this.zzn = zzfjjVar.zzN();
        this.zzo = zzfjjVar.zzO();
        this.zzb = zzfjjVar.zzQ();
        this.zzp = new zzfiy(zzfjjVar.zzR(), null);
        this.zzq = zzfjjVar.zzS();
        this.zzr = zzfjjVar.zzT();
        this.zzc = zzfjjVar.zzU();
        this.zzs = zzfjjVar.zzV();
        this.zzt = zzfjjVar.zzW();
        if (l2Var.A != 0) {
            this.zzu = new AtomicLong(l2Var.A);
        } else {
            this.zzu = zzfjjVar.zzX();
        }
        this.zzv = zzfjjVar.zzY();
    }

    public final boolean zza() {
        return this.zzg.matches((String) S5.D.c().zzd(zzbhe.zzea));
    }
}
