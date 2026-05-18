package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzary implements Comparable {
    private final zzasj zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzasc zzf;
    private Integer zzg;
    private zzasb zzh;
    private boolean zzi;
    private zzarh zzj;
    private zzarx zzk;
    private final zzarm zzl;

    public zzary(int i, String str, zzasc zzascVar) {
        Uri parse;
        String host;
        this.zza = zzasj.zza ? new zzasj() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzascVar;
        this.zzl = new zzarm();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzary) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(length + 5 + concat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzasj.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzd(String str) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzc(this);
        }
        if (zzasj.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzarw(this, str, id));
                return;
            }
            zzasj zzasjVar = this.zza;
            zzasjVar.zza(str, id);
            zzasjVar.zzb(toString());
        }
    }

    public final void zze(int i) {
        zzasb zzasbVar = this.zzh;
        if (zzasbVar != null) {
            zzasbVar.zzd(this, i);
        }
    }

    public final zzary zzf(zzasb zzasbVar) {
        this.zzh = zzasbVar;
        return this;
    }

    public final zzary zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final zzary zzj(zzarh zzarhVar) {
        this.zzj = zzarhVar;
        return this;
    }

    public final zzarh zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzarg {
        return Collections.emptyMap();
    }

    public byte[] zzn() throws zzarg {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public abstract zzase zzr(zzaru zzaruVar);

    public abstract void zzs(Object obj);

    public final void zzt(zzash zzashVar) {
        zzasc zzascVar;
        synchronized (this.zze) {
            zzascVar = this.zzf;
        }
        zzascVar.zza(zzashVar);
    }

    public final void zzu(zzarx zzarxVar) {
        synchronized (this.zze) {
            this.zzk = zzarxVar;
        }
    }

    public final void zzv(zzase zzaseVar) {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zza(this, zzaseVar);
        }
    }

    public final void zzw() {
        zzarx zzarxVar;
        synchronized (this.zze) {
            zzarxVar = this.zzk;
        }
        if (zzarxVar != null) {
            zzarxVar.zzb(this);
        }
    }

    public final /* synthetic */ zzasj zzx() {
        return this.zza;
    }

    public final zzarm zzy() {
        return this.zzl;
    }
}
