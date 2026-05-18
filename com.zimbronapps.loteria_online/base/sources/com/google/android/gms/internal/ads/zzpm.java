package com.google.android.gms.internal.ads;

import U2.A0;
import U2.B0;
import U2.C0;
import U2.D0;
import U2.E0;
import U2.G0;
import U2.H0;
import U2.I0;
import U2.M0;
import U2.P0;
import U2.Q0;
import U2.R0;
import U2.X0;
import U2.Y0;
import U2.Z0;
import U2.a1;
import U2.c1;
import U2.d1;
import U2.e1;
import U2.f1;
import U2.g1;
import U2.k1;
import U2.l1;
import U2.n1;
import U2.o1;
import U2.p1;
import U2.q1;
import U2.r1;
import U2.s1;
import U2.t1;
import U2.u0;
import U2.u1;
import U2.v0;
import U2.w0;
import U2.x0;
import U2.y0;
import U2.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzpm implements zzna, zzpn {
    private boolean zzA;
    private final Context zza;
    private final zzpo zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzau zzo;
    private zzpl zzp;
    private zzpl zzq;
    private zzpl zzr;
    private zzv zzs;
    private zzv zzt;
    private zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzdh.zza();
    private final zzbe zzf = new zzbe();
    private final zzbd zzg = new zzbd();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpm(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzpf zzpfVar = new zzpf(zzpf.zza);
        this.zzc = zzpfVar;
        zzpfVar.zza(this);
    }

    private final void zzA(int i, long j, zzv zzvVar, int i2) {
        TrackChangeEvent.Builder a = s1.a(u0.a(i), j - this.zze);
        if (zzvVar != null) {
            x0.a(a, 1);
            A0.a(a, i2 != 1 ? 1 : 2);
            String str = zzvVar.zzn;
            if (str != null) {
                B0.a(a, str);
            }
            String str2 = zzvVar.zzo;
            if (str2 != null) {
                C0.a(a, str2);
            }
            String str3 = zzvVar.zzk;
            if (str3 != null) {
                D0.a(a, str3);
            }
            int i3 = zzvVar.zzj;
            if (i3 != -1) {
                E0.a(a, i3);
            }
            int i4 = zzvVar.zzv;
            if (i4 != -1) {
                G0.a(a, i4);
            }
            int i5 = zzvVar.zzw;
            if (i5 != -1) {
                H0.a(a, i5);
            }
            int i6 = zzvVar.zzG;
            if (i6 != -1) {
                I0.a(a, i6);
            }
            int i7 = zzvVar.zzH;
            if (i7 != -1) {
                t1.a(a, i7);
            }
            String str4 = zzvVar.zzd;
            if (str4 != null) {
                String str5 = zzfj.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                u1.a(a, (String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    v0.a(a, (String) obj);
                }
            }
            float f = zzvVar.zzz;
            if (f != -1.0f) {
                w0.a(a, f);
            }
        } else {
            x0.a(a, 0);
        }
        this.zzA = true;
        this.zzb.execute(new zzpi(this, y0.a(a)));
    }

    private final void zzB(zzbf zzbfVar, zzwk zzwkVar) {
        int zze;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzwkVar == null || (zze = zzbfVar.zze(zzwkVar.zza)) == -1) {
            return;
        }
        zzbd zzbdVar = this.zzg;
        int i = 0;
        zzbfVar.zzd(zze, zzbdVar, false);
        zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int zzF = zzfj.zzF(zzagVar.zza);
            i = zzF != 0 ? zzF != 1 ? zzF != 2 ? 1 : 4 : 5 : 3;
        }
        n1.a(builder, i);
        long j = zzbeVar.zzm;
        if (j != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            o1.a(builder, zzfj.zzp(j));
        }
        p1.a(builder, true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            Y0.a(builder, this.zzz);
            Z0.a(this.zzk, this.zzx);
            a1.a(this.zzk, this.zzy);
            Long l = (Long) this.zzh.get(this.zzj);
            c1.a(this.zzk, l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzi.get(this.zzj);
            d1.a(this.zzk, l2 == null ? 0L : l2.longValue());
            e1.a(this.zzk, (l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzb.execute(new zzpj(this, f1.a(this.zzk)));
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzD(int i) {
        switch (zzfj.zzE(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    public static zzpm zza(Context context) {
        MediaMetricsManager a = q1.a(context.getSystemService("media_metrics"));
        if (a == null) {
            return null;
        }
        return new zzpm(context, r1.a(a));
    }

    private final boolean zzw(zzpl zzplVar) {
        if (zzplVar != null) {
            return zzplVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j, zzvVar, i2);
    }

    private final void zzy(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j, zzvVar, i2);
    }

    private final void zzz(long j, zzv zzvVar, int i) {
        if (Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j, zzvVar, i2);
    }

    public final LogSessionId zzb() {
        return l1.a(this.zzd);
    }

    public final void zzc(zzmy zzmyVar, String str) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = R0.a(P0.a(Q0.a(), "AndroidXMedia3"), "1.9.0-beta01");
            zzB(zzmyVar.zzb, zzwkVar);
        }
    }

    public final void zzd(zzmy zzmyVar, String str, boolean z) {
        zzwk zzwkVar = zzmyVar.zzd;
        if ((zzwkVar == null || !zzwkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    public final void zzde(zzmy zzmyVar, zzba zzbaVar, zzba zzbaVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    public final void zzdf(zzmy zzmyVar, zzwg zzwgVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return;
        }
        zzv zzvVar = zzwgVar.zzb;
        zzvVar.getClass();
        zzpl zzplVar = new zzpl(zzvVar, 0, this.zzc.zzb(zzmyVar.zzb, zzwkVar));
        int i = zzwgVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzplVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzplVar;
                return;
            }
        }
        this.zzp = zzplVar;
    }

    public final void zzdg(zzmy zzmyVar, int i, long j, long j2) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar != null) {
            String zzb = this.zzc.zzb(zzmyVar.zzb, zzwkVar);
            HashMap hashMap = this.zzi;
            Long l = (Long) hashMap.get(zzb);
            HashMap hashMap2 = this.zzh;
            Long l2 = (Long) hashMap2.get(zzb);
            hashMap.put(zzb, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(zzb, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    public final void zzdh(zzmy zzmyVar, zzin zzinVar) {
        this.zzx += zzinVar.zzg;
        this.zzy += zzinVar.zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzdi(com.google.android.gms.internal.ads.zzbb r20, com.google.android.gms.internal.ads.zzmz r21) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpm.zzdi(com.google.android.gms.internal.ads.zzbb, com.google.android.gms.internal.ads.zzmz):void");
    }

    public final void zzg(zzmy zzmyVar, zzau zzauVar) {
        this.zzo = zzauVar;
    }

    public final void zzh(zzmy zzmyVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
    }

    public final void zzp(zzmy zzmyVar, zzbv zzbvVar) {
        zzpl zzplVar = this.zzp;
        if (zzplVar != null) {
            zzv zzvVar = zzplVar.zza;
            if (zzvVar.zzw == -1) {
                zzt zza = zzvVar.zza();
                zza.zzt(zzbvVar.zzb);
                zza.zzu(zzbvVar.zzc);
                this.zzp = new zzpl(zza.zzM(), 0, zzplVar.zzc);
            }
        }
    }

    public final /* synthetic */ void zzr(PlaybackErrorEvent playbackErrorEvent) {
        X0.a(this.zzd, playbackErrorEvent);
    }

    public final /* synthetic */ void zzs(NetworkEvent networkEvent) {
        M0.a(this.zzd, networkEvent);
    }

    public final /* synthetic */ void zzt(PlaybackStateEvent playbackStateEvent) {
        k1.a(this.zzd, playbackStateEvent);
    }

    public final /* synthetic */ void zzu(TrackChangeEvent trackChangeEvent) {
        z0.a(this.zzd, trackChangeEvent);
    }

    public final /* synthetic */ void zzv(PlaybackMetrics playbackMetrics) {
        g1.a(this.zzd, playbackMetrics);
    }
}
