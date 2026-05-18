package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzsi implements zzqm {
    private final Context zza;
    private final zzsh zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzps zze;
    private zzpx zzf;
    private Looper zzg;
    private Context zzh;
    private final zzsm zzi;

    public /* synthetic */ zzsi(zzsg zzsgVar, byte[] bArr) {
        this.zza = zzsgVar.zzd();
        zzsm zzg = zzsgVar.zzg();
        zzg.getClass();
        this.zzi = zzg;
        this.zze = zzsgVar.zze();
        this.zzb = zzsgVar.zzd() != null ? new zzsh(this, null) : null;
        this.zzd = zzdn.zza;
    }

    private final void zzj(zzqf zzqfVar) {
        Context context;
        zzk();
        zzpx zzpxVar = this.zzf;
        if (zzpxVar == null && (context = this.zza) != null) {
            zzpx zzpxVar2 = new zzpx(context, new zzsf(this), zzqfVar.zzb, zzqfVar.zzc);
            this.zzf = zzpxVar2;
            this.zze = zzpxVar2.zzd();
        } else if (zzpxVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqfVar.zzc;
            if (audioDeviceInfo != null) {
                zzpxVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqfVar.zzb);
        }
        this.zze.getClass();
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        String zzl = zzl(looper);
        String zzl2 = zzl(myLooper);
        if (!z) {
            throw new IllegalStateException(zzgrt.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzl, zzl2));
        }
        this.zzg = myLooper;
    }

    private static String zzl(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzqh zza(com.google.android.gms.internal.ads.zzqf r7) {
        /*
            r6 = this;
            r6.zzj(r7)
            com.google.android.gms.internal.ads.zzsm r0 = r6.zzi
            com.google.android.gms.internal.ads.zzv r1 = r7.zza
            com.google.android.gms.internal.ads.zzd r7 = r7.zzb
            com.google.android.gms.internal.ads.zzpz r0 = r0.zza(r1, r7)
            com.google.android.gms.internal.ads.zzqg r2 = new com.google.android.gms.internal.ads.zzqg
            r2.<init>()
            java.lang.String r3 = r1.zzo
            java.lang.String r4 = "audio/raw"
            boolean r3 = java.util.Objects.equals(r3, r4)
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L4d
            int r7 = r1.zzI
            boolean r1 = com.google.android.gms.internal.ads.zzfj.zzA(r7)
            if (r1 != 0) goto L47
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 22
            r3.<init>(r1)
            java.lang.String r1 = "Invalid PCM encoding: "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            java.lang.String r1 = "ATAudioOutputProvider"
            com.google.android.gms.internal.ads.zzee.zzc(r1, r7)
            goto L56
        L47:
            if (r7 == r5) goto L4b
            r4 = 1
            goto L56
        L4b:
            r4 = r5
            goto L56
        L4d:
            com.google.android.gms.internal.ads.zzps r3 = r6.zze
            android.util.Pair r7 = r3.zzd(r1, r7)
            if (r7 == 0) goto L56
            goto L4b
        L56:
            r2.zzd(r4)
            boolean r7 = r0.zzb
            r2.zza(r7)
            boolean r7 = r0.zzc
            r2.zzb(r7)
            boolean r7 = r0.zzd
            r2.zzc(r7)
            com.google.android.gms.internal.ads.zzqh r7 = r2.zze()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsi.zza(com.google.android.gms.internal.ads.zzqf):com.google.android.gms.internal.ads.zzqh");
    }

    public final zzql zzb(zzqf zzqfVar) throws zzqd {
        int i;
        int intValue;
        int i2;
        int i3;
        int i4;
        zzj(zzqfVar);
        zzv zzvVar = zzqfVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            i4 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i4));
            i = zzvVar.zzH;
            int i5 = zzvVar.zzG;
            intValue = zzfj.zzB(i5);
            i3 = zzfj.zzD(i4) * i5;
            i2 = 0;
        } else {
            i = zzvVar.zzH;
            zzpz zzpzVar = zzpz.zza;
            Pair zzd = this.zze.zzd(zzvVar, zzqfVar.zzb);
            if (zzd == null) {
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
            int intValue2 = ((Integer) zzd.first).intValue();
            intValue = ((Integer) zzd.second).intValue();
            i2 = 2;
            i3 = -1;
            i4 = intValue2;
        }
        int i6 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i6 == -1) {
            i6 = 768000;
        }
        int i7 = i6;
        int i8 = zzqfVar.zzf;
        if (i8 == -1) {
            zzgrc.zzi(AudioTrack.getMinBufferSize(i, intValue, i4) != -2);
            int i9 = i3 != -1 ? i3 : 1;
            i8 = (((Math.max(r0, zzsy.zzb(r0, i4, i2, i9, i, i7)) + i9) - 1) / i9) * i9;
        }
        zzqk zzqkVar = new zzqk();
        zzqkVar.zzb(i);
        zzqkVar.zzc(intValue);
        zzqkVar.zza(i4);
        zzqkVar.zze(i8);
        zzqkVar.zzg(zzqfVar.zzd);
        zzqkVar.zzf(zzqfVar.zzb);
        zzqkVar.zzd(false);
        zzqkVar.zzh(zzqfVar.zze);
        return new zzql(zzqkVar, null);
    }

    public final void zzc(zzqj zzqjVar) {
        zzk();
        if (this.zzc == null) {
            zzed zzedVar = new zzed(Thread.currentThread());
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqjVar);
    }

    public final void zzd(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    public final void zze() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpx zzpxVar = this.zzf;
        if (zzpxVar != null) {
            zzpxVar.zze();
        }
    }

    public final zzsd zzf(zzql zzqlVar) throws zzqi {
        Context context;
        try {
            int i = zzqlVar.zzg;
            int i2 = zzqlVar.zzh;
            Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzh;
                if (context3 == null || I.a(context3) != i2) {
                    this.zzh = J.a(context, i2);
                }
                context2 = this.zzh;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqlVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqlVar.zzb).setChannelMask(zzqlVar.zzc).setEncoding(zzqlVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqlVar.zze).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                V2.P.a(sessionId, false);
            }
            if (i3 >= 34 && context2 != null) {
                K.a(sessionId, context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zzsd(build, zzqlVar, this.zzb, this.zzd);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzqi();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzqi(e);
        } catch (UnsupportedOperationException e2) {
            e = e2;
            throw new zzqi(e);
        }
    }

    public final void zzg(zzps zzpsVar) {
        zzk();
        zzps zzpsVar2 = this.zze;
        if (zzpsVar2 == null || zzpsVar.equals(zzpsVar2)) {
            return;
        }
        this.zze = zzpsVar;
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzd(-1, zzse.zza);
            zzedVar.zze();
        }
    }

    public final /* synthetic */ void zzh(zzps zzpsVar) {
        this.zze = zzpsVar;
    }

    public final /* synthetic */ zzpx zzi() {
        return this.zzf;
    }
}
