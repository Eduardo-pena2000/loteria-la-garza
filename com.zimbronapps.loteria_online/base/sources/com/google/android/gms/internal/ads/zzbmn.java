package com.google.android.gms.internal.ads;

import S5.K0;
import S5.L0;
import S5.M0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmn extends O5.h {
    private final zzbmm zza;
    private final zzbkt zzc;
    private final List zzb = new ArrayList();
    private final L5.B zzd = new L5.B();
    private final List zze = new ArrayList();

    public zzbmn(zzbmm zzbmmVar) {
        zzbks zzbksVar;
        IBinder iBinder;
        this.zza = zzbmmVar;
        zzbkt zzbktVar = null;
        try {
            List zzf = zzbmmVar.zzf();
            if (zzf != null) {
                for (Object obj : zzf) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbksVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbksVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(iBinder);
                    }
                    if (zzbksVar != null) {
                        this.zzb.add(new zzbkt(zzbksVar));
                    }
                }
            }
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        try {
            List zzz = this.zza.zzz();
            if (zzz != null) {
                for (Object obj2 : zzz) {
                    L0 q1 = obj2 instanceof IBinder ? K0.q1((IBinder) obj2) : null;
                    if (q1 != null) {
                        this.zze.add(new M0(q1));
                    }
                }
            }
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
        try {
            zzbks zzh = this.zza.zzh();
            if (zzh != null) {
                zzbktVar = new zzbkt(zzh);
            }
        } catch (RemoteException e3) {
            W5.p.d("", e3);
        }
        this.zzc = zzbktVar;
        try {
            if (this.zza.zzq() != null) {
                new zzbkm(this.zza.zzq());
            }
        } catch (RemoteException e4) {
            W5.p.d("", e4);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzs(bundle);
        } catch (RemoteException e) {
            W5.p.d("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzt(bundle);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final String zza() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final List zzb() {
        return this.zzb;
    }

    public final String zzc() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final O5.d zzd() {
        return this.zzc;
    }

    public final String zze() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String zzf() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final Double zzg() {
        try {
            double zzk = this.zza.zzk();
            if (zzk == -1.0d) {
                return null;
            }
            return Double.valueOf(zzk);
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String zzh() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String zzi() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final L5.B zzj() {
        try {
            zzbmm zzbmmVar = this.zza;
            if (zzbmmVar.zzn() != null) {
                this.zzd.b(zzbmmVar.zzn());
            }
        } catch (RemoteException e) {
            W5.p.d("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    public final Object zzk() {
        try {
            N6.a zzv = this.zza.zzv();
            if (zzv != null) {
                return N6.b.r1(zzv);
            }
            return null;
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }
}
