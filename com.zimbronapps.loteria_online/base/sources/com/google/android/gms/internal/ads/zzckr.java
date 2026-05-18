package com.google.android.gms.internal.ads;

import S5.e2;
import S5.f1;
import S5.j1;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzckr extends f1 {
    private final zzcge zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private j1 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbma zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzckr(zzcge zzcgeVar, float f, boolean z, boolean z2) {
        this.zza = zzcgeVar;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzw(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcei.zzf.execute(new zzckq(this, hashMap));
    }

    private final void zzx(int i, int i2, boolean z, boolean z2) {
        zzcei.zzf.execute(new zzckp(this, i, i2, z, z2));
    }

    public final void zzc(e2 e2Var) {
        Object obj = this.zzb;
        boolean z = e2Var.b;
        boolean z2 = e2Var.c;
        synchronized (obj) {
            this.zzl = z;
            this.zzm = z2;
        }
        boolean z3 = e2Var.a;
        zzw("initialState", E6.g.c("muteStart", true != z3 ? "0" : "1", "customControlsRequested", true != z ? "0" : "1", "clickToExpandRequested", true != z2 ? "0" : "1"));
    }

    public final void zzd(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zze() {
        zzw("play", null);
    }

    public final void zzf() {
        zzw("pause", null);
    }

    public final void zzg(boolean z) {
        zzw(true != z ? "unmute" : "mute", null);
    }

    public final boolean zzh() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final int zzi() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    public final float zzj() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    public final float zzk() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    public final void zzl(j1 j1Var) {
        synchronized (this.zzb) {
            this.zzf = j1Var;
        }
    }

    public final float zzm() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzb) {
            try {
                z = false;
                if (this.zzc && this.zzl) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final j1 zzo() throws RemoteException {
        j1 j1Var;
        synchronized (this.zzb) {
            j1Var = this.zzf;
        }
        return j1Var;
    }

    public final boolean zzp() {
        boolean z;
        Object obj = this.zzb;
        boolean zzn = zzn();
        synchronized (obj) {
            z = false;
            if (!zzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } finally {
                }
            }
        }
        return z;
    }

    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzx(i, 3, z, z);
    }

    public final void zzs(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            try {
                z2 = true;
                if (f2 == this.zzi && f3 == this.zzk) {
                    z2 = false;
                }
                this.zzi = f2;
                if (!((Boolean) S5.D.c().zzd(zzbhe.zzol)).booleanValue()) {
                    this.zzj = f;
                }
                z3 = this.zzh;
                this.zzh = z;
                i2 = this.zze;
                this.zze = i;
                float f4 = this.zzk;
                this.zzk = f3;
                if (Math.abs(f3 - f4) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            try {
                zzbma zzbmaVar = this.zzn;
                if (zzbmaVar != null) {
                    zzbmaVar.zze();
                }
            } catch (RemoteException e) {
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
        zzx(i2, i, z3, z);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i, int i2, boolean z, boolean z2) {
        int i3;
        boolean z3;
        boolean z4;
        j1 j1Var;
        j1 j1Var2;
        j1 j1Var3;
        synchronized (this.zzb) {
            try {
                boolean z5 = this.zzg;
                if (z5 || i2 != 1) {
                    i3 = i2;
                    z3 = false;
                } else {
                    i2 = 1;
                    i3 = 1;
                    z3 = true;
                }
                boolean z6 = i != i2;
                if (z6 && i3 == 1) {
                    z4 = true;
                    i3 = 1;
                } else {
                    z4 = false;
                }
                boolean z7 = z6 && i3 == 2;
                boolean z8 = z6 && i3 == 3;
                this.zzg = z5 || z3;
                if (z3) {
                    try {
                        j1 j1Var4 = this.zzf;
                        if (j1Var4 != null) {
                            j1Var4.zze();
                        }
                    } catch (RemoteException e) {
                        W5.p.i("#007 Could not call remote method.", e);
                    }
                }
                if (z4 && (j1Var3 = this.zzf) != null) {
                    j1Var3.zzf();
                }
                if (z7 && (j1Var2 = this.zzf) != null) {
                    j1Var2.zzg();
                }
                if (z8) {
                    j1 j1Var5 = this.zzf;
                    if (j1Var5 != null) {
                        j1Var5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z != z2 && (j1Var = this.zzf) != null) {
                    j1Var.K(z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzv(zzbma zzbmaVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmaVar;
        }
    }
}
