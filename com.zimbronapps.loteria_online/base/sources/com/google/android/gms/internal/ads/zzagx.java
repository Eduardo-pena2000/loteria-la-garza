package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzagx implements zzagq {
    public final zzguf zza;
    private final int zzb;

    private zzagx(int i, zzguf zzgufVar) {
        this.zzb = i;
        this.zza = zzgufVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzagx zzb(int i, zzer zzerVar) {
        zzagq zzagyVar;
        String str;
        zzguc zzgucVar = new zzguc();
        int zze = zzerVar.zze();
        int i2 = -2;
        while (zzerVar.zzd() > 8) {
            int zzC = zzerVar.zzC();
            int zzg = zzerVar.zzg() + zzerVar.zzC();
            zzerVar.zzf(zzg);
            if (zzC != 1414744396) {
                zzagy zzagyVar2 = null;
                switch (zzC) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzerVar.zzk(4);
                            int zzC2 = zzerVar.zzC();
                            int zzC3 = zzerVar.zzC();
                            zzerVar.zzk(4);
                            int zzC4 = zzerVar.zzC();
                            switch (zzC4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzC4).length() + 44);
                                sb.append("Ignoring track with unsupported compression ");
                                sb.append(zzC4);
                                zzee.zzc("StreamFormatChunk", sb.toString());
                            } else {
                                zzt zztVar = new zzt();
                                zztVar.zzt(zzC2);
                                zztVar.zzu(zzC3);
                                zztVar.zzm(str);
                                zzagyVar2 = new zzagy(zztVar.zzM());
                            }
                        } else if (i2 == 1) {
                            int zzu = zzerVar.zzu();
                            String str2 = zzu != 1 ? zzu != 85 ? zzu != 255 ? zzu != 8192 ? zzu != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int zzu2 = zzerVar.zzu();
                                int zzC5 = zzerVar.zzC();
                                zzerVar.zzk(6);
                                int zzz = zzfj.zzz(zzerVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                int zzu3 = zzerVar.zzd() > 0 ? zzerVar.zzu() : 0;
                                zzt zztVar2 = new zzt();
                                zztVar2.zzm(str2);
                                zztVar2.zzE(zzu2);
                                zztVar2.zzF(zzC5);
                                if (str2.equals("audio/raw") && zzz != 0) {
                                    zztVar2.zzG(zzz);
                                }
                                if (str2.equals("audio/mp4a-latm") && zzu3 > 0) {
                                    byte[] bArr = new byte[zzu3];
                                    zzerVar.zzm(bArr, 0, zzu3);
                                    zztVar2.zzp(zzguf.zzj(bArr));
                                }
                                zzagyVar = new zzagy(zztVar2.zzM());
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(zzu).length() + 43);
                                sb2.append("Ignoring track with unsupported format tag ");
                                sb2.append(zzu);
                                zzee.zzc("StreamFormatChunk", sb2.toString());
                            }
                        } else {
                            zzee.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfj.zzP(i2)));
                        }
                        zzagyVar = zzagyVar2;
                        break;
                    case 1751742049:
                        zzagyVar = zzagu.zzb(zzerVar);
                        break;
                    case 1752331379:
                        zzagyVar = zzagv.zzb(zzerVar);
                        break;
                    case 1852994675:
                        zzagyVar = zzagz.zzb(zzerVar);
                        break;
                    default:
                        zzagyVar = zzagyVar2;
                        break;
                }
            } else {
                zzagyVar = zzb(zzerVar.zzC(), zzerVar);
            }
            if (zzagyVar != null) {
                if (zzagyVar.zza() == 1752331379) {
                    i2 = ((zzagv) zzagyVar).zzc();
                }
                zzgucVar.zzf(zzagyVar);
            }
            zzerVar.zzh(zzg);
            zzerVar.zzf(zze);
        }
        return new zzagx(i, zzgucVar.zzi());
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzagq zzc(Class cls) {
        zzguf zzgufVar = this.zza;
        int size = zzgufVar.size();
        int i = 0;
        while (i < size) {
            zzagq zzagqVar = (zzagq) zzgufVar.get(i);
            i++;
            if (zzagqVar.getClass() == cls) {
                return zzagqVar;
            }
        }
        return null;
    }
}
