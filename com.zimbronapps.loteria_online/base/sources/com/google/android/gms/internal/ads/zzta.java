package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzta extends zzuu implements zzlm {
    private final Context zzb;
    private final zzrb zzc;
    private final zzrj zzd;
    private final zzug zze;
    private final Set zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private zzv zzj;
    private final zzil zzk;
    private zzil zzl;
    private zzv zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private long zzt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzta(Context context, zzui zzuiVar, zzuw zzuwVar, boolean z, Handler handler, zzrc zzrcVar, zzrj zzrjVar) {
        super(1, zzuiVar, zzuwVar, false, 44100.0f);
        zzug zzugVar = Build.VERSION.SDK_INT >= 35 ? new zzug(zzuf.zzb) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzrjVar;
        this.zze = zzugVar;
        this.zzr = -1000;
        this.zzc = new zzrb(handler, zzrcVar);
        this.zzt = -9223372036854775807L;
        zzrjVar.zza(new zzsz(this, null));
        this.zzf = new HashSet();
        zzil zzilVar = zzil.zza;
        this.zzk = zzilVar;
        this.zzl = zzilVar;
    }

    public static /* synthetic */ zzmk zzat(zzta zztaVar) {
        return zztaVar.zzaY();
    }

    public static /* synthetic */ zzmk zzau(zzta zztaVar) {
        return zztaVar.zzaY();
    }

    public static /* synthetic */ void zzav(zzta zztaVar) {
        zztaVar.zzR();
    }

    private static List zzbg(zzuw zzuwVar, zzv zzvVar, boolean z, zzrj zzrjVar) throws zzuy {
        zzun zza;
        return zzvVar.zzo == null ? zzguf.zzi() : (!zzrjVar.zzd(zzvVar) || (zza = zzvg.zza()) == null) ? zzvg.zzc(zzuwVar, zzvVar, false, false) : zzguf.zzj(zza);
    }

    private final int zzbh(zzun zzunVar, zzv zzvVar) {
        "OMX.google.raw.decoder".equals(zzunVar.zza);
        return zzvVar.zzp;
    }

    private final void zzbi() {
        long zzg = this.zzd.zzg(zzZ());
        if (zzg != Long.MIN_VALUE) {
            if (!this.zzo) {
                zzg = Math.max(this.zzn, zzg);
            }
            this.zzn = zzg;
            this.zzo = false;
        }
    }

    public final void zzA(long j, boolean z, boolean z2) throws zziw {
        super.zzA(j, z, z2);
        this.zzd.zzA();
        this.zzn = j;
        this.zzt = -9223372036854775807L;
        this.zzq = false;
        this.zzo = true;
    }

    public final void zzB() {
        this.zzd.zzi();
        this.zzs = true;
    }

    public final void zzC() {
        zzbi();
        this.zzs = false;
        this.zzd.zzz();
    }

    public final void zzD() {
        this.zzp = true;
        this.zzj = null;
        this.zzt = -9223372036854775807L;
        try {
            this.zzd.zzA();
            super.zzD();
        } catch (Throwable th) {
            super.zzD();
            throw th;
        } finally {
            this.zzc.zzg(((zzuu) this).zza);
        }
    }

    public final void zzE() {
        this.zzq = false;
        this.zzt = -9223372036854775807L;
        try {
            super.zzE();
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
        } catch (Throwable th) {
            if (this.zzp) {
                this.zzp = false;
                this.zzd.zzB();
            }
            throw th;
        }
    }

    public final void zzF() {
        zzug zzugVar;
        this.zzd.zzC();
        if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
            return;
        }
        zzugVar.zzd();
    }

    public final String zzS() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzY() {
        return this.zzd.zzn();
    }

    public final boolean zzZ() {
        return super.zzZ() && this.zzd.zzm();
    }

    public final int zzac(zzuw zzuwVar, zzv zzvVar) throws zzuy {
        int i;
        boolean z;
        String str = zzvVar.zzo;
        if (!zzas.zza(str)) {
            return 128;
        }
        int i2 = zzvVar.zzN;
        boolean zzbd = zzuu.zzbd(zzvVar);
        int i3 = 1;
        if (!zzbd || (i2 != 0 && zzvg.zza() == null)) {
            i = 0;
        } else {
            zzrj zzrjVar = this.zzd;
            zzpz zzf = zzrjVar.zzf(zzvVar);
            if (zzf.zzb) {
                i = true != zzf.zzc ? 512 : 1536;
                if (zzf.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (zzrjVar.zzd(zzvVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.zzd.zzd(zzvVar)) {
            zzrj zzrjVar2 = this.zzd;
            if (zzrjVar2.zzd(zzfj.zzy(2, zzvVar.zzG, zzvVar.zzH))) {
                List zzbg = zzbg(zzuwVar, zzvVar, false, zzrjVar2);
                if (!zzbg.isEmpty()) {
                    if (zzbd) {
                        zzun zzunVar = (zzun) zzbg.get(0);
                        boolean zzc = zzunVar.zzc(zzvVar);
                        if (zzc) {
                            z = true;
                        } else {
                            for (int i4 = 1; i4 < zzbg.size(); i4++) {
                                zzun zzunVar2 = (zzun) zzbg.get(i4);
                                if (zzunVar2.zzc(zzvVar)) {
                                    z = false;
                                    zzc = true;
                                    zzunVar = zzunVar2;
                                    break;
                                }
                            }
                            z = true;
                        }
                        int i5 = true != zzc ? 3 : 4;
                        int i6 = 8;
                        if (zzc && zzunVar.zze(zzvVar)) {
                            i6 = 16;
                        }
                        return i5 | i6 | 32 | (true != zzunVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                    }
                    i3 = 2;
                }
            }
        }
        return i3 | 128;
    }

    public final List zzad(zzuw zzuwVar, zzv zzvVar, boolean z) throws zzuy {
        return zzvg.zze(zzbg(zzuwVar, zzvVar, false, this.zzd), zzvVar);
    }

    public final boolean zzae(zzv zzvVar) {
        zzJ();
        return this.zzd.zzd(zzvVar);
    }

    public final zzuh zzaf(zzun zzunVar, zzv zzvVar, MediaCrypto mediaCrypto, float f) {
        zzv[] zzI = zzI();
        int length = zzI.length;
        int zzbh = zzbh(zzunVar, zzvVar);
        if (length != 1) {
            for (zzv zzvVar2 : zzI) {
                if (zzunVar.zzf(zzvVar, zzvVar2).zzd != 0) {
                    zzbh = Math.max(zzbh, zzbh(zzunVar, zzvVar2));
                }
            }
        }
        this.zzg = zzbh;
        String str = zzunVar.zza;
        int i = Build.VERSION.SDK_INT;
        this.zzh = false;
        this.zzi = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zzunVar.zzc;
        int i2 = this.zzg;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i3 = zzvVar.zzG;
        mediaFormat.setInteger("channel-count", i3);
        int i4 = zzvVar.zzH;
        mediaFormat.setInteger("sample-rate", i4);
        zzeh.zza(mediaFormat, zzvVar.zzr);
        zzeh.zzb(mediaFormat, "max-input-size", i2);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = zzvVar.zzo;
        if ("audio/ac4".equals(str3)) {
            Pair zzd = zzdo.zzd(zzvVar);
            if (zzd != null) {
                zzeh.zzb(mediaFormat, "profile", ((Integer) zzd.first).intValue());
                zzeh.zzb(mediaFormat, "level", ((Integer) zzd.second).intValue());
            }
            if (i <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.zzd.zze(zzfj.zzy(4, i3, i4)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzr));
        }
        if (i >= 29) {
            this.zzk.zzb(mediaFormat);
        }
        this.zzm = (!"audio/raw".equals(zzunVar.zzb) || "audio/raw".equals(str3)) ? null : zzvVar;
        return zzuh.zza(zzunVar, mediaFormat, zzvVar, null, this.zze);
    }

    public final zzio zzag(zzun zzunVar, zzv zzvVar, zzv zzvVar2) {
        int i;
        int i2;
        zzio zzf = zzunVar.zzf(zzvVar, zzvVar2);
        int i3 = zzf.zze;
        if (zzaB(zzvVar2)) {
            i3 |= 32768;
        }
        if (zzbh(zzunVar, zzvVar2) > this.zzg) {
            i3 |= 64;
        }
        String str = zzunVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzf.zzd;
            i2 = 0;
        }
        return new zzio(str, zzvVar, zzvVar2, i, i2);
    }

    public final long zzah(long j, long j2, boolean z) {
        zzrj zzrjVar = this.zzd;
        boolean z2 = false;
        if (zzrjVar.zzn() && this.zzt != -9223372036854775807L) {
            z2 = true;
        }
        if (!this.zzs) {
            return (z2 || super.zzZ()) ? 1000000L : 10000L;
        }
        long zzw = zzrjVar.zzw();
        if (!z2 || zzw == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(zzw, this.zzt - j) / (zzj() != null ? zzj().zzb : 1.0f)) / 2.0f)) - (zzfj.zzq(zzL().zzb()) - j2));
    }

    public final float zzai(float f, zzv zzvVar, zzv[] zzvVarArr) {
        int i = -1;
        for (zzv zzvVar2 : zzvVarArr) {
            int i2 = zzvVar2.zzH;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    public final void zzaj(String str, zzuh zzuhVar, long j, long j2) {
        this.zzc.zzb(str, j, j2);
        if (Build.VERSION.SDK_INT >= 31) {
            Set set = this.zzf;
            if (set.isEmpty()) {
                return;
            }
            zzuk zzaE = zzaE();
            zzaE.getClass();
            zzaE.zzr(new ArrayList(set));
        }
    }

    public final void zzak(String str) {
        this.zzc.zzf(str);
    }

    public final void zzal(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    public final zzio zzam(zzlh zzlhVar) throws zziw {
        zzv zzvVar = zzlhVar.zzb;
        zzvVar.getClass();
        this.zzj = zzvVar;
        zzio zzam = super.zzam(zzlhVar);
        this.zzc.zzc(zzvVar, zzam);
        return zzam;
    }

    public final void zzan(zzv zzvVar, MediaFormat mediaFormat) throws zziw {
        int i;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 29 && mediaFormat != null) {
            Set<String> set = this.zzf;
            if (!set.isEmpty()) {
                zzil zzilVar = zzil.zza;
                zzik zzikVar = new zzik();
                for (String str : set) {
                    if (mediaFormat.containsKey(str)) {
                        int a = L.a(mediaFormat, str);
                        if (a == 1) {
                            zzikVar.zza(str, mediaFormat.getInteger(str));
                        } else if (a == 2) {
                            zzikVar.zzb(str, mediaFormat.getLong(str));
                        } else if (a == 3) {
                            zzikVar.zzc(str, mediaFormat.getFloat(str));
                        } else if (a == 4) {
                            zzikVar.zzd(str, mediaFormat.getString(str));
                        } else if (a == 5) {
                            zzikVar.zze(str, mediaFormat.getByteBuffer(str));
                        }
                    }
                }
                zzil zzg = zzikVar.zzg();
                if (!zzg.equals(this.zzl)) {
                    this.zzl = zzg;
                    this.zzc.zzn(zzg);
                }
            }
        }
        zzv zzvVar2 = this.zzm;
        int[] iArr = null;
        if (zzvVar2 != null) {
            zzvVar = zzvVar2;
        } else if (zzaE() != null) {
            mediaFormat.getClass();
            int integer = "audio/raw".equals(zzvVar.zzo) ? zzvVar.zzI : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? zzfj.zzz(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            zzt zztVar = new zzt();
            zztVar.zzm("audio/raw");
            zztVar.zzG(integer);
            zztVar.zzH(zzvVar.zzJ);
            zztVar.zzI(zzvVar.zzK);
            zztVar.zzk(zzvVar.zzl);
            zztVar.zza(zzvVar.zza);
            zztVar.zzc(zzvVar.zzb);
            zztVar.zzd(zzvVar.zzc);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzf(zzvVar.zze);
            zztVar.zzg(zzvVar.zzf);
            zztVar.zzE(mediaFormat.getInteger("channel-count"));
            zztVar.zzF(mediaFormat.getInteger("sample-rate"));
            zzv zzM = zztVar.zzM();
            if (this.zzh && zzM.zzG == 6 && (i = zzvVar.zzG) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            } else if (this.zzi) {
                int i3 = zzM.zzG;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzvVar = zzM;
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                if (zzaD()) {
                    zzJ();
                }
                if (i4 < 29) {
                    z = false;
                }
                zzgrc.zzi(z);
            }
            this.zzd.zzh(zzvVar, 0, iArr);
        } catch (zzre e) {
            throw zzN(e, e.zza, false, 5001);
        }
    }

    public final void zzao() {
        this.zzo = true;
    }

    public final void zzap() {
        this.zzd.zzj();
    }

    public final boolean zzaq(long j, long j2, zzuk zzukVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zziw {
        byteBuffer.getClass();
        this.zzt = -9223372036854775807L;
        if (this.zzm != null && (i2 & 2) != 0) {
            zzukVar.getClass();
            zzukVar.zzc(i, false);
            return true;
        }
        if (z) {
            if (zzukVar != null) {
                zzukVar.zzc(i, false);
            }
            ((zzuu) this).zza.zzf += i3;
            this.zzd.zzj();
            return true;
        }
        try {
            if (!this.zzd.zzk(byteBuffer, j3, i3)) {
                this.zzt = j3;
                return false;
            }
            if (zzukVar != null) {
                zzukVar.zzc(i, false);
            }
            ((zzuu) this).zza.zze += i3;
            return true;
        } catch (zzrf e) {
            zzv zzvVar2 = this.zzj;
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e, zzvVar2, false, 5001);
        } catch (zzri e2) {
            if (zzaD()) {
                zzJ();
            }
            throw zzN(e2, zzvVar, e2.zzb, 5002);
        }
    }

    public final void zzar() throws zziw {
        try {
            this.zzd.zzl();
            if (zzba() != -9223372036854775807L) {
                this.zzt = zzba();
            }
        } catch (zzri e) {
            throw zzN(e, e.zzc, e.zzb, true != zzaD() ? 5002 : 5003);
        }
    }

    public final void zzas(zzih zzihVar) {
        zzv zzvVar;
        if (Build.VERSION.SDK_INT < 29 || (zzvVar = zzihVar.zza) == null || !Objects.equals(zzvVar.zzo, "audio/opus") || !zzaD()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        byteBuffer.getClass();
        zzv zzvVar2 = zzihVar.zza;
        zzvVar2.getClass();
        int i = zzvVar2.zzJ;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzx(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    public final /* synthetic */ zzrb zzaw() {
        return this.zzc;
    }

    public final /* synthetic */ zzug zzax() {
        return this.zze;
    }

    public final /* synthetic */ void zzay(boolean z) {
        this.zzq = true;
    }

    public final zzlm zzd() {
        return this;
    }

    public final long zzg() {
        if (zze() == 2) {
            zzbi();
        }
        return this.zzn;
    }

    public final boolean zzh() {
        boolean z = this.zzq;
        this.zzq = false;
        return z;
    }

    public final void zzi(zzav zzavVar) {
        this.zzd.zzo(zzavVar);
    }

    public final zzav zzj() {
        return this.zzd.zzp();
    }

    public final void zzx(int i, Object obj) throws zziw {
        zzug zzugVar;
        if (i == 2) {
            zzrj zzrjVar = this.zzd;
            obj.getClass();
            zzrjVar.zzy(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzd zzdVar = (zzd) obj;
            zzrj zzrjVar2 = this.zzd;
            zzdVar.getClass();
            zzrjVar2.zzr(zzdVar);
            return;
        }
        if (i == 6) {
            zze zzeVar = (zze) obj;
            zzrj zzrjVar3 = this.zzd;
            zzeVar.getClass();
            zzrjVar3.zzt(zzeVar);
            return;
        }
        if (i == 12) {
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzr = ((Integer) obj).intValue();
            zzuk zzaE = zzaE();
            if (zzaE == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzr));
            zzaE.zzp(bundle);
            return;
        }
        if (i == 19) {
            zzrj zzrjVar4 = this.zzd;
            obj.getClass();
            zzrjVar4.zzv(((Integer) obj).intValue());
            return;
        }
        if (i == 9) {
            zzrj zzrjVar5 = this.zzd;
            obj.getClass();
            zzrjVar5.zzq(((Boolean) obj).booleanValue());
        } else {
            if (i != 10) {
                super.zzx(i, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzs(intValue);
            if (Build.VERSION.SDK_INT < 35 || (zzugVar = this.zze) == null) {
                return;
            }
            zzugVar.zza(intValue);
        }
    }

    public final void zzy(boolean z, boolean z2) throws zziw {
        super.zzy(z, z2);
        this.zzc.zza(((zzuu) this).zza);
        zzJ();
        zzrj zzrjVar = this.zzd;
        zzrjVar.zzb(zzK());
        zzrjVar.zzc(zzL());
    }
}
