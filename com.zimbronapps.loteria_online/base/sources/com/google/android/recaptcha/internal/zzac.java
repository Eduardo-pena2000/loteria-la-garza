package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.t;
import Ga.e;
import Ia.l;
import Qa.p;
import cb.O;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzac extends l implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, e eVar) {
        super(2, eVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    public final e create(Object obj, e eVar) {
        return new zzac(this.zzc, this.zzd, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((O) obj, (e) obj2).invokeSuspend(I.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        Object f = Ha.c.f();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i = 2;
            this.zzb = 2;
            if (e instanceof StandardIntegrityException) {
                int errorCode = e.getErrorCode();
                if (errorCode == -100) {
                    i = 44;
                } else if (errorCode == -12) {
                    i = 39;
                } else if (errorCode == -3) {
                    i = 30;
                } else if (errorCode == -2) {
                    i = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case -19:
                            i = 54;
                            break;
                        case -18:
                            i = 53;
                            break;
                        case -17:
                            i = 52;
                            break;
                        case -16:
                            i = 43;
                            break;
                        case -15:
                            i = 42;
                            break;
                        case -14:
                            i = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i = 36;
                                    break;
                                case -8:
                                    i = 35;
                                    break;
                                case -7:
                                    i = 34;
                                    break;
                                case -6:
                                    i = 33;
                                    break;
                                case -5:
                                    i = 32;
                                    break;
                            }
                    }
                } else {
                    i = 28;
                }
            } else {
                i = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i);
            zzf.zzr(15);
            obj = zzf.zzi();
            if (obj == f) {
                return f;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            t.b(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzg = zzae.zzg(zzaeVar2);
            String zzh = zzae.zzh(zzaeVar2);
            this.zza = zzb;
            this.zzb = 1;
            obj = zzg.zzc(zzh, this);
            zzenVar = zzb;
            if (obj == f) {
                return f;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                t.b(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzi());
            }
            zzen zzenVar2 = (zzen) this.zza;
            t.b(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzi());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzi());
    }
}
