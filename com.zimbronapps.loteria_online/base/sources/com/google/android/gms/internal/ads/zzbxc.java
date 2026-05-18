package com.google.android.gms.internal.ads;

import S5.I0;
import S5.I1;
import S5.K0;
import S5.L0;
import S5.M0;
import S5.V1;
import S5.d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxc extends NativeAd {
    private final zzbmm zza;
    private final zzbxb zzc;
    private final NativeAd.a zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    public zzbxc(zzbmm zzbmmVar) {
        zzbks zzh;
        this.zza = zzbmmVar;
        zzbwz zzbwzVar = null;
        try {
            List zzf = zzbmmVar.zzf();
            if (zzf != null) {
                for (Object obj : zzf) {
                    zzbks zzh2 = obj instanceof IBinder ? zzbkr.zzh((IBinder) obj) : null;
                    if (zzh2 != null) {
                        this.zzb.add(new zzbxb(zzh2));
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
            zzh = this.zza.zzh();
        } catch (RemoteException e3) {
            W5.p.d("", e3);
        }
        zzbxb zzbxbVar = zzh != null ? new zzbxb(zzh) : null;
        this.zzc = zzbxbVar;
        try {
            if (this.zza.zzq() != null) {
                zzbwzVar = new zzbwz(this.zza.zzq());
            }
        } catch (RemoteException e4) {
            W5.p.d("", e4);
        }
        this.zzd = zzbwzVar;
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzy();
        } catch (RemoteException e) {
            W5.p.d("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzp();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzD();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final NativeAd.a getAdChoicesInfo() {
        return this.zzd;
    }

    public final String getAdvertiser() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle zzw = this.zza.zzw();
            if (zzw != null) {
                return zzw;
            }
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final NativeAd.b getIcon() {
        return this.zzc;
    }

    public final List getImages() {
        return this.zzb;
    }

    public final L5.o getMediaContent() {
        try {
            zzbmm zzbmmVar = this.zza;
            if (zzbmmVar.zzF() != null) {
                return new I1(zzbmmVar.zzF(), null);
            }
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        return null;
    }

    public final List getMuteThisAdReasons() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzK = this.zza.zzK();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzK);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    W5.p.d("Failed to getPlacementId", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final String getPrice() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final L5.z getResponseInfo() {
        d1 d1Var;
        try {
            d1Var = this.zza.zzH();
        } catch (RemoteException e) {
            W5.p.d("", e);
            d1Var = null;
        }
        return L5.z.g(d1Var);
    }

    public final Double getStarRating() {
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

    public final String getStore() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return false;
        }
    }

    public final void muteThisAd(L5.r rVar) {
        try {
            try {
                if (this.zza.zzA()) {
                    if (rVar == null) {
                        this.zza.zzB(null);
                        return;
                    } else if (rVar instanceof M0) {
                        this.zza.zzB(((M0) rVar).a());
                        return;
                    } else {
                        W5.p.c("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                W5.p.d("", e);
            }
            W5.p.c("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzr(bundle);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzJ(bundle);
        } catch (RemoteException e) {
            W5.p.d("Failed to record native event", e);
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

    public final void setMuteThisAdListener(L5.q qVar) {
        try {
            this.zza.zzC(new I0(qVar));
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void setOnPaidEventListener(L5.t tVar) {
        try {
            this.zza.zzI(new V1(tVar));
        } catch (RemoteException e) {
            W5.p.d("Failed to setOnPaidEventListener", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            this.zza.zzL(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            W5.p.d("Failed to setPlacementId", e);
        }
    }

    public final void setUnconfirmedClickListener(NativeAd.d dVar) {
        try {
            this.zza.zzx(new zzbxi(dVar));
        } catch (RemoteException e) {
            W5.p.d("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }
}
