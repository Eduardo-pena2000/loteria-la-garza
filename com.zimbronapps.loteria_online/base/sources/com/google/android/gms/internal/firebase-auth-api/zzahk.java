package com.google.android.gms.internal.firebase-auth-api;

import J7.A0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahk {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzaia zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private A0 zzk;
    private List zzl;
    private zzah zzm;

    public zzahk() {
        this.zzf = new zzaia();
        this.zzm = zzah.zzg();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzah zzd() {
        return this.zzm;
    }

    public final A0 zze() {
        return this.zzk;
    }

    public final zzaia zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzl;
    }

    public final List zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzahk zza(A0 a0) {
        this.zzk = a0;
        return this;
    }

    public final zzahk zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahk zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahk zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzahk(String str, String str2, boolean z, String str3, String str4, zzaia zzaiaVar, String str5, String str6, long j, long j2, boolean z2, A0 a0, List list, zzah zzahVar) {
        zzaia zzaiaVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzaiaVar == null) {
            zzaiaVar2 = new zzaia();
        } else {
            List zza = zzaiaVar.zza();
            zzaia zzaiaVar3 = new zzaia();
            if (zza != null) {
                zzaiaVar3.zza().addAll(zza);
            }
            zzaiaVar2 = zzaiaVar3;
        }
        this.zzf = zzaiaVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList() : list;
        this.zzm = zzahVar;
    }

    public final zzahk zza(boolean z) {
        this.zzj = z;
        return this;
    }

    public final zzahk zza(zzah zzahVar) {
        t.l(zzahVar);
        this.zzm = zzahVar;
        return this;
    }

    public final zzahk zza(List list) {
        t.l(list);
        zzaia zzaiaVar = new zzaia();
        this.zzf = zzaiaVar;
        zzaiaVar.zza().addAll(list);
        return this;
    }
}
