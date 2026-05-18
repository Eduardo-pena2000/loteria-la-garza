package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzalv extends zzalt {
    private zzalu zza;
    private int zzb;
    private boolean zzc;
    private zzagm zzd;
    private zzagk zze;

    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    public final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i = !zzaluVar.zzd[(b >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(copyOf, copyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzerVar.zzi();
        zzi[zzerVar.zze() - 4] = (byte) (j & 255);
        zzi[zzerVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzerVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzerVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    public final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzagm zzagmVar;
        long j2;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar2 = this.zzd;
        int i5 = 4;
        if (zzagmVar2 == null) {
            zzagn.zzd(1, zzerVar, false);
            int zzI = zzerVar.zzI();
            int zzs = zzerVar.zzs();
            int zzI2 = zzerVar.zzI();
            int zzC = zzerVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzerVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzerVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzerVar.zzs();
            this.zzd = new zzagm(zzI, zzs, zzI2, i6, i7, i8, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i9 = zzagmVar2.zza;
                int i10 = 5;
                zzagn.zzd(5, zzerVar, false);
                int zzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzs3) {
                        zzagm zzagmVar3 = zzagmVar2;
                        int i14 = 6;
                        int zzb = zzagjVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzagjVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzagjVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int zzb4 = zzagjVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzagjVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzagjVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzagjVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzagjVar.zzb(i18) + 1;
                                        int zzb7 = zzagjVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzagjVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzagjVar.zzc(i12);
                                    int zzb8 = zzagjVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzagjVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzagjVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int zzb10 = zzagjVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzagjVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzagjVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzagjVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i = 1;
                                            i2 = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int zzb13 = zzagjVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzagjVar.zzc(zzagn.zza(i39));
                                                zzagjVar.zzc(zzagn.zza(i39));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzagjVar.zzb(6);
                                int i42 = zzb14 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzaglVarArr[i43] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar3, zzagkVar, bArr, zzaglVarArr, zzagn.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int zzd = zzagjVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzagjVar.zzb(16);
                        int zzb16 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(5);
                            for (int i44 = 0; i44 < zzb16; i44 += zzagjVar.zzb(zzagn.zza(zzb16 - i44))) {
                            }
                        } else {
                            boolean zza = zzagjVar.zza();
                            for (int i45 = 0; i45 < zzb16; i45++) {
                                if (!zza) {
                                    zzagjVar.zzc(5);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzagjVar.zzb(i5);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 != 1) {
                            if (zzb17 != 2) {
                                zzagmVar = zzagmVar2;
                            }
                            i11++;
                            zzagmVar2 = zzagmVar;
                            i5 = 4;
                        } else {
                            i12 = zzb17;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int zzb18 = zzagjVar.zzb(i5) + 1;
                        zzagjVar.zzc(1);
                        if (i12 != 1) {
                            zzagmVar = zzagmVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzagmVar = zzagmVar2;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzagmVar = zzagmVar2;
                            j2 = 0;
                        }
                        zzagjVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzagmVar2 = zzagmVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        List arrayList = new ArrayList();
        zzagm zzagmVar4 = zzaluVar.zza;
        arrayList.add(zzagmVar4.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar4.zzd);
        zztVar.zzi(zzagmVar4.zzc);
        zztVar.zzE(zzagmVar4.zza);
        zztVar.zzF(zzagmVar4.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }
}
