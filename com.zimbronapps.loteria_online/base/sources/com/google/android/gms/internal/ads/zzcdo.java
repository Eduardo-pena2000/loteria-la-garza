package com.google.android.gms.internal.ads;

import S5.l2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdo {
    private final E6.f zza;
    private final zzcdz zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzcdo(E6.f fVar, zzcdz zzcdzVar, String str, String str2) {
        this.zza = fVar;
        this.zzb = zzcdzVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(l2 l2Var) {
        synchronized (this.zzd) {
            long b = this.zza.b();
            this.zzj = b;
            this.zzb.zzf(l2Var, b);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j) {
        synchronized (this.zzd) {
            try {
                this.zzk = j;
                if (j != -1) {
                    this.zzb.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    this.zzg = this.zza.b();
                    this.zzb.zzb(this);
                }
                this.zzb.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzcdn zzcdnVar = new zzcdn(this);
                    zzcdnVar.zzc();
                    this.zzc.add(zzcdnVar);
                    this.zzi++;
                    zzcdz zzcdzVar = this.zzb;
                    zzcdzVar.zzd();
                    zzcdzVar.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    LinkedList linkedList = this.zzc;
                    if (!linkedList.isEmpty()) {
                        zzcdn zzcdnVar = (zzcdn) linkedList.getLast();
                        if (zzcdnVar.zza() == -1) {
                            zzcdnVar.zzb();
                            this.zzb.zzb(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    this.zzh = this.zza.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle zzi() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList arrayList = new ArrayList();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzcdn) it.next()).zzd());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzj() {
        return this.zze;
    }

    public final /* synthetic */ E6.f zzk() {
        return this.zza;
    }
}
