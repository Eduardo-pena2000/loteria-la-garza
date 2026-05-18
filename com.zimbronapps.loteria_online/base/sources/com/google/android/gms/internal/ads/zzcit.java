package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcit extends zzcfv implements zzhz, zzna {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcid zzc;
    private final zzaaa zzd;
    private final zzcgd zze;
    private final WeakReference zzf;
    private final zzxt zzg;
    private zzjh zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcfu zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcig zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcit(android.content.Context r4, com.google.android.gms.internal.ads.zzcgd r5, com.google.android.gms.internal.ads.zzcge r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcit.<init>(android.content.Context, com.google.android.gms.internal.ads.zzcgd, com.google.android.gms.internal.ads.zzcge, java.lang.Integer):void");
    }

    private final boolean zzY() {
        return this.zzt != null && this.zzt.zzl();
    }

    public final void finalize() {
        zzcfv.zzf().decrementAndGet();
        if (o0.m()) {
            o0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final void zzA(int i) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcic zzcicVar = (zzcic) ((WeakReference) it.next()).get();
            if (zzcicVar != null) {
                zzcicVar.zzk(i);
            }
        }
    }

    public final boolean zzB() {
        return this.zzh != null;
    }

    public final int zzC() {
        return this.zzh.zzh();
    }

    public final long zzD() {
        return this.zzh.zzu();
    }

    public final void zzE(boolean z) {
        this.zzh.zzj(z);
    }

    public final void zzF(int i) {
        this.zzc.zzk(i);
    }

    public final void zzG(int i) {
        this.zzc.zzl(i);
    }

    public final long zzH() {
        return this.zzh.zzt();
    }

    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzl;
    }

    public final long zzJ() {
        if (zzY() && this.zzt.zzm()) {
            return Math.min(this.zzl, this.zzt.zzo());
        }
        return 0L;
    }

    public final long zzK() {
        if (zzY()) {
            return this.zzt.zzp();
        }
        synchronized (this.zzq) {
            while (true) {
                ArrayList arrayList = this.zzs;
                if (!arrayList.isEmpty()) {
                    long j = this.zzn;
                    Map zzj = ((zzhu) arrayList.remove(0)).zzj();
                    long j2 = 0;
                    if (zzj != null) {
                        Iterator it = zzj.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzgql.zze("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzn = j + j2;
                }
            }
        }
        return this.zzn;
    }

    public final int zzL() {
        return this.zzm;
    }

    public final void zzM(boolean z) {
        if (this.zzh == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzh.zzF();
            if (i >= 2) {
                return;
            }
            zzaaa zzaaaVar = this.zzd;
            zzzk zzd = zzaaaVar.zzc().zzd();
            zzd.zzy(i, !z);
            zzaaaVar.zzf(zzd);
            i++;
        }
    }

    public final long zzN() {
        return this.zzh.zzv();
    }

    public final long zzO() {
        return this.zzl;
    }

    public final zzwm zzR(Uri uri) {
        zzz zzzVar = new zzz();
        zzzVar.zzb(uri);
        zzak zzc = zzzVar.zzc();
        zzxt zzxtVar = this.zzg;
        zzxtVar.zza(this.zze.zzf);
        return zzxtVar.zzb(zzc);
    }

    public final /* synthetic */ zzhb zzS(String str, boolean z) {
        zzcit zzcitVar = true != z ? null : this;
        zzcgd zzcgdVar = this.zze;
        return new zzciw(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzm, zzcgdVar.zzn);
    }

    public final /* synthetic */ zzhb zzT(String str, boolean z) {
        zzhi zzhiVar = new zzhi();
        zzhiVar.zzb(str);
        zzhiVar.zzf(true != z ? null : this);
        zzcgd zzcgdVar = this.zze;
        zzhiVar.zzc(zzcgdVar.zzd);
        zzhiVar.zzd(zzcgdVar.zze);
        zzhiVar.zze(true);
        return zzhiVar.zza();
    }

    public final /* synthetic */ zzhb zzU(String str, boolean z) {
        zzcit zzcitVar = true != z ? null : this;
        zzcgd zzcgdVar = this.zze;
        zzcic zzcicVar = new zzcic(str, zzcitVar, zzcgdVar.zzd, zzcgdVar.zze, zzcgdVar.zzh);
        this.zzu.add(new WeakReference(zzcicVar));
        return zzcicVar;
    }

    public final /* synthetic */ zzhb zzV(zzha zzhaVar) {
        zzhb zza2 = zzhaVar.zza();
        zzcir zzcirVar = new zzcir(this);
        return new zzcig(this.zzb, zza2, this.zzo, this.zzp, this, zzcirVar);
    }

    public final /* synthetic */ zzml[] zzW(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzuw zzuwVar = zzuw.zzb;
        Context context = this.zzb;
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new zzsp(context).zza());
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.zza(zzuwVar);
        zzacaVar.zzb(handler);
        zzacaVar.zzc(zzadmVar);
        return new zzml[]{zztaVar, zzacaVar.zzd()};
    }

    public final /* synthetic */ void zzX(boolean z, long j) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzr(z, j);
        }
    }

    public final void zza(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    public final void zzb(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
        if (zzhbVar instanceof zzhu) {
            synchronized (this.zzq) {
                this.zzs.add((zzhu) zzhbVar);
            }
        } else if (zzhbVar instanceof zzcig) {
            this.zzt = (zzcig) zzhbVar;
            zzcge zzcgeVar = (zzcge) this.zzf.get();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() && zzcgeVar != null && this.zzt.zzk()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzt.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzt.zzn()));
                F0.l.post(new zzcis(zzcgeVar, hashMap));
            }
        }
    }

    public final void zzc(zzhb zzhbVar, zzhf zzhfVar, boolean z, int i) {
        this.zzl += i;
    }

    public final void zzd(zzhb zzhbVar, zzhf zzhfVar, boolean z) {
    }

    public final void zze(zzmy zzmyVar, int i) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzs(i);
        }
    }

    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzu("onPlayerError", zzauVar);
        }
    }

    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            if (this.zze.zzj) {
                zzcfuVar.zzv("onLoadException", iOException);
            } else {
                zzcfuVar.zzu("onLoadError", iOException);
            }
        }
    }

    public final Integer zzj() {
        return this.zzr;
    }

    public final void zzk(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("audioMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("audioSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("audioCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    public final void zzl(zzmy zzmyVar, zzv zzvVar, zzio zzioVar) {
        zzcge zzcgeVar = (zzcge) this.zzf.get();
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() || zzcgeVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzvVar.zzz));
        hashMap.put("bitRate", String.valueOf(zzvVar.zzj));
        int i = zzvVar.zzv;
        int i2 = zzvVar.zzw;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        String str = zzvVar.zzn;
        if (str != null) {
            hashMap.put("videoMime", str);
        }
        String str2 = zzvVar.zzo;
        if (str2 != null) {
            hashMap.put("videoSampleMime", str2);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            hashMap.put("videoCodec", str3);
        }
        zzcgeVar.zze("onMetadataEvent", hashMap);
    }

    public final void zzm(zzmy zzmyVar, int i, long j) {
        this.zzm += i;
    }

    public final void zzn(Integer num) {
        this.zzr = num;
    }

    public final void zzo(zzmy zzmyVar, Object obj, long j) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzD();
        }
    }

    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzcfu zzcfuVar = this.zzk;
        if (zzcfuVar != null) {
            zzcfuVar.zzt(zzbvVar.zzb, zzbvVar.zzc);
        }
    }

    public final void zzq(Uri[] uriArr, String str) {
        zzr(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzr(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzwm zzxbVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z;
            int length = uriArr.length;
            if (length == 1) {
                zzxbVar = zzR(uriArr[0]);
            } else {
                zzwm[] zzwmVarArr = new zzwm[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzwmVarArr[i] = zzR(uriArr[i]);
                }
                zzxbVar = new zzxb(false, false, new zzvv(), zzwmVarArr);
            }
            this.zzh.zzG(zzxbVar);
            this.zzh.zzg();
            zzcfv.zzi().incrementAndGet();
        }
    }

    public final void zzs(zzcfu zzcfuVar) {
        this.zzk = zzcfuVar;
    }

    public final void zzt() {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzE(this);
            this.zzh.zzH();
            this.zzh = null;
            zzcfv.zzi().decrementAndGet();
        }
    }

    public final void zzu(Surface surface, boolean z) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzC(surface);
        }
    }

    public final void zzv(float f, boolean z) {
        zzjh zzjhVar = this.zzh;
        if (zzjhVar != null) {
            zzjhVar.zzB(f);
        }
    }

    public final void zzw() {
        this.zzh.zzo();
    }

    public final void zzx(long j) {
        this.zzh.zzb(j);
    }

    public final void zzy(int i) {
        this.zzc.zzm(i);
    }

    public final void zzz(int i) {
        this.zzc.zzn(i);
    }
}
