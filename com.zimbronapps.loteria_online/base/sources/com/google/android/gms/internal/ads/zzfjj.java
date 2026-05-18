package com.google.android.gms.internal.ads;

import S5.e2;
import S5.l2;
import S5.p0;
import S5.q2;
import S5.t0;
import S5.w2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfjj {
    private l2 zza;
    private q2 zzb;
    private String zzc;
    private e2 zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbkh zzh;
    private w2 zzi;
    private O5.a zzj;
    private O5.g zzk;
    private p0 zzl;
    private zzbqs zzn;
    private zzerp zzr;
    private Bundle zzt;
    private t0 zzw;
    private int zzm = 1;
    private final zzfix zzo = new zzfix();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzfjk zzA() {
        com.google.android.gms.common.internal.t.m(this.zzc, "ad unit must not be null");
        com.google.android.gms.common.internal.t.m(this.zzb, "ad size must not be null");
        com.google.android.gms.common.internal.t.m(this.zza, "ad request must not be null");
        return new zzfjk(this, null);
    }

    public final boolean zzB() {
        return this.zzp;
    }

    public final boolean zzC() {
        return this.zzq;
    }

    public final /* synthetic */ l2 zzD() {
        return this.zza;
    }

    public final /* synthetic */ q2 zzE() {
        return this.zzb;
    }

    public final /* synthetic */ String zzF() {
        return this.zzc;
    }

    public final /* synthetic */ e2 zzG() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzH() {
        return this.zze;
    }

    public final /* synthetic */ ArrayList zzI() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzJ() {
        return this.zzg;
    }

    public final /* synthetic */ zzbkh zzK() {
        return this.zzh;
    }

    public final /* synthetic */ w2 zzL() {
        return this.zzi;
    }

    public final /* synthetic */ O5.a zzM() {
        return this.zzj;
    }

    public final /* synthetic */ O5.g zzN() {
        return this.zzk;
    }

    public final /* synthetic */ p0 zzO() {
        return this.zzl;
    }

    public final /* synthetic */ int zzP() {
        return this.zzm;
    }

    public final /* synthetic */ zzbqs zzQ() {
        return this.zzn;
    }

    public final /* synthetic */ zzfix zzR() {
        return this.zzo;
    }

    public final /* synthetic */ boolean zzS() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzT() {
        return this.zzq;
    }

    public final /* synthetic */ zzerp zzU() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzV() {
        return this.zzs;
    }

    public final /* synthetic */ Bundle zzW() {
        return this.zzt;
    }

    public final /* synthetic */ AtomicLong zzX() {
        return this.zzu;
    }

    public final /* synthetic */ boolean zzY() {
        return this.zzv;
    }

    public final zzfjj zzZ(t0 t0Var) {
        this.zzw = t0Var;
        return this;
    }

    public final zzfjj zza(l2 l2Var) {
        this.zza = l2Var;
        return this;
    }

    public final /* synthetic */ t0 zzaa() {
        return this.zzw;
    }

    public final l2 zzb() {
        return this.zza;
    }

    public final zzfjj zzc(q2 q2Var) {
        this.zzb = q2Var;
        return this;
    }

    public final zzfjj zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfjj zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final q2 zzf() {
        return this.zzb;
    }

    public final zzfjj zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzfjj zzi(e2 e2Var) {
        this.zzd = e2Var;
        return this;
    }

    public final zzfix zzj() {
        return this.zzo;
    }

    public final zzfjj zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfjj zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfjj zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfjj zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfjj zzo(zzbkh zzbkhVar) {
        this.zzh = zzbkhVar;
        return this;
    }

    public final zzfjj zzp(w2 w2Var) {
        this.zzi = w2Var;
        return this;
    }

    public final zzfjj zzq(zzbqs zzbqsVar) {
        this.zzn = zzbqsVar;
        this.zzd = new e2(false, true, false);
        return this;
    }

    public final zzfjj zzr(O5.g gVar) {
        this.zzk = gVar;
        if (gVar != null) {
            this.zze = gVar.zza();
            this.zzl = gVar.M1();
        }
        return this;
    }

    public final zzfjj zzs(O5.a aVar) {
        this.zzj = aVar;
        if (aVar != null) {
            this.zze = aVar.M1();
        }
        return this;
    }

    public final zzfjj zzt(zzerp zzerpVar) {
        this.zzr = zzerpVar;
        return this;
    }

    public final zzfjj zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzfjj zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzfjj zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfjj zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final zzfjj zzz(zzfjk zzfjkVar) {
        this.zzo.zza(zzfjkVar.zzp.zza);
        this.zza = zzfjkVar.zzd;
        this.zzb = zzfjkVar.zzf;
        this.zzw = zzfjkVar.zzw;
        this.zzc = zzfjkVar.zzg;
        this.zzd = zzfjkVar.zza;
        this.zzf = zzfjkVar.zzh;
        this.zzg = zzfjkVar.zzi;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzfjkVar.zzk;
        zzs(zzfjkVar.zzm);
        zzr(zzfjkVar.zzn);
        this.zzp = zzfjkVar.zzq;
        this.zzq = zzfjkVar.zzr;
        this.zzr = zzfjkVar.zzc;
        this.zzs = zzfjkVar.zzs;
        this.zzt = zzfjkVar.zzt;
        this.zzu.set(zzfjkVar.zzu.get());
        this.zzv = zzfjkVar.zzv;
        return this;
    }
}
