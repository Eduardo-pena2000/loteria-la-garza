package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzakl implements zzanc {
    private final zzakh zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzakl(zzakh zzakhVar) {
        zzakh zzakhVar2 = (zzakh) zzalh.zza(zzakhVar, "input");
        this.zza = zzakhVar2;
        zzakhVar2.zzc = this;
    }

    public final double zza() throws IOException {
        zzb(1);
        return this.zza.zza();
    }

    public final float zzb() throws IOException {
        zzb(5);
        return this.zza.zzb();
    }

    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i2 = this.zzb;
        if (i2 == 0 || i2 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzb(0);
        return this.zza.zzd();
    }

    public final int zzf() throws IOException {
        zzb(5);
        return this.zza.zze();
    }

    public final int zzg() throws IOException {
        zzb(0);
        return this.zza.zzf();
    }

    public final int zzh() throws IOException {
        zzb(5);
        return this.zza.zzg();
    }

    public final int zzi() throws IOException {
        zzb(0);
        return this.zza.zzh();
    }

    public final int zzj() throws IOException {
        zzb(0);
        return this.zza.zzj();
    }

    public final long zzk() throws IOException {
        zzb(1);
        return this.zza.zzk();
    }

    public final long zzl() throws IOException {
        zzb(0);
        return this.zza.zzl();
    }

    public final long zzm() throws IOException {
        zzb(1);
        return this.zza.zzn();
    }

    public final long zzn() throws IOException {
        zzb(0);
        return this.zza.zzo();
    }

    public final long zzo() throws IOException {
        zzb(0);
        return this.zza.zzp();
    }

    public final zzajv zzp() throws IOException {
        zzb(2);
        return this.zza.zzq();
    }

    public final String zzq() throws IOException {
        zzb(2);
        return this.zza.zzr();
    }

    public final String zzr() throws IOException {
        zzb(2);
        return this.zza.zzs();
    }

    public final boolean zzs() throws IOException {
        zzb(0);
        return this.zza.zzx();
    }

    public final boolean zzt() throws IOException {
        int i;
        if (this.zza.zzw() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zze(i);
    }

    private final void zzd(Object obj, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        int zzj = this.zza.zzj();
        this.zza.zzt();
        int zzb = this.zza.zzb(zzj);
        this.zza.zza++;
        zzanbVar.zza(obj, this, zzakuVar);
        this.zza.zzc(0);
        r4.zza--;
        this.zza.zzd(zzb);
    }

    public static zzakl zza(zzakh zzakhVar) {
        zzakl zzaklVar = zzakhVar.zzc;
        return zzaklVar != null ? zzaklVar : new zzakl(zzakhVar);
    }

    private final Object zzb(zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        Object zza = zzanbVar.zza();
        zzd(zza, zzanbVar, zzakuVar);
        zzanbVar.zzd(zza);
        return zza;
    }

    public final void zze(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaliVar.zzc(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i == 5) {
                do {
                    zzaliVar.zzc(this.zza.zze());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zze()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    public final void zzf(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzalxVar.zza(this.zza.zzk());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzalxVar.zza(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzk()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzg(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzald) {
            zzald zzaldVar = (zzald) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaldVar.zza(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i == 5) {
                do {
                    zzaldVar.zza(this.zza.zzb());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Float.valueOf(this.zza.zzb()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    public final void zzh(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzf());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzi(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzalxVar.zza(this.zza.zzl());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzl());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzl()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzj(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzc(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaliVar.zzc(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i == 5) {
                do {
                    zzaliVar.zzc(this.zza.zzg());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzc(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    public final void zzk(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzalxVar.zza(this.zza.zzn());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzalxVar.zza(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzl(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzh());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzh());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzm(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzalxVar.zza(this.zza.zzo());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzn(List list) throws IOException {
        zza(list, false);
    }

    public final void zzo(List list) throws IOException {
        zza(list, true);
    }

    public final void zzp(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzj());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzq(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzalx) {
            zzalx zzalxVar = (zzalx) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzalxVar.zza(this.zza.zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzalxVar.zza(this.zza.zzp());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    private final Object zza(zzaog zzaogVar, Class cls, zzaku zzakuVar) throws IOException {
        switch (zzako.zza[zzaogVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzamx.zza().zza(cls), zzakuVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zzc(Object obj, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzanbVar.zza(obj, this, zzakuVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzall.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    public final void zzb(Object obj, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        zzb(2);
        zzd(obj, zzanbVar, zzakuVar);
    }

    public final void zzb(List list) throws IOException {
        int zzi;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    public final void zzd(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzali) {
            zzali zzaliVar = (zzali) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzaliVar.zzc(this.zza.zzd());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzaliVar.zzc(this.zza.zzd());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    public final void zzb(List list, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        int zzi;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                list.add(zzb(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    public final void zzc(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzaks) {
            zzaks zzaksVar = (zzaks) list;
            int i = this.zzb & 7;
            if (i == 1) {
                do {
                    zzaksVar.zza(this.zza.zza());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzj = this.zza.zzj();
                zzd(zzj);
                int zzc = this.zza.zzc() + zzj;
                do {
                    zzaksVar.zza(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzj2 = this.zza.zzj();
            zzd(zzj2);
            int zzc2 = this.zza.zzc() + zzj2;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < zzc2);
            return;
        }
        throw zzall.zza();
    }

    private final void zzb(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzall.zza();
        }
    }

    private final Object zza(zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        Object zza = zzanbVar.zza();
        zzc(zza, zzanbVar, zzakuVar);
        zzanbVar.zzd(zza);
        return zza;
    }

    public final void zza(Object obj, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        zzb(3);
        zzc(obj, zzanbVar, zzakuVar);
    }

    public final void zza(List list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzajt) {
            zzajt zzajtVar = (zzajt) list;
            int i = this.zzb & 7;
            if (i == 0) {
                do {
                    zzajtVar.zza(this.zza.zzx());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            if (i == 2) {
                int zzc = this.zza.zzc() + this.zza.zzj();
                do {
                    zzajtVar.zza(this.zza.zzx());
                } while (this.zza.zzc() < zzc);
                zza(zzc);
                return;
            }
            throw zzall.zza();
        }
        int i2 = this.zzb & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        if (i2 == 2) {
            int zzc2 = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzx()));
            } while (this.zza.zzc() < zzc2);
            zza(zzc2);
            return;
        }
        throw zzall.zza();
    }

    private static void zzd(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzall.zzg();
        }
    }

    private static void zzc(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzall.zzg();
        }
    }

    @Deprecated
    public final void zza(List list, zzanb zzanbVar, zzaku zzakuVar) throws IOException {
        int zzi;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                list.add(zza(zzanbVar, zzakuVar));
                if (this.zza.zzw() || this.zzd != 0) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == i);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0062, code lost:
    
        r7.zza.zzd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.util.Map r8, com.google.android.gms.internal.firebase-auth-api.zzamd r9, com.google.android.gms.internal.firebase-auth-api.zzaku r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzakh r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzakh r2 = r7.zza
            int r1 = r2.zzb(r1)
            java.lang.Object r2 = r9.zzb
            java.lang.Object r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L39
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5f
            com.google.android.gms.internal.firebase-auth-api.zzakh r5 = r7.zza     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.zzw()     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5f
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L4a
            if (r4 == r0) goto L3d
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzall r4 = new com.google.android.gms.internal.firebase-auth-api.zzall     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            throw r4     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
        L39:
            r8 = move-exception
            goto L68
        L3b:
            r4 = move-exception
            goto L52
        L3d:
            com.google.android.gms.internal.firebase-auth-api.zzaog r4 = r9.zzc     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            java.lang.Object r5 = r9.zzd     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            goto L14
        L4a:
            com.google.android.gms.internal.firebase-auth-api.zzaog r4 = r9.zza     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.firebase-auth-api.zzalo -> L3b
            goto L14
        L52:
            boolean r5 = r7.zzt()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L59
            goto L14
        L59:
            com.google.android.gms.internal.firebase-auth-api.zzall r8 = new com.google.android.gms.internal.firebase-auth-api.zzall     // Catch: java.lang.Throwable -> L39
            r8.<init>(r6, r4)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Throwable -> L39
        L5f:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.firebase-auth-api.zzakh r8 = r7.zza
            r8.zzd(r1)
            return
        L68:
            com.google.android.gms.internal.firebase-auth-api.zzakh r9 = r7.zza
            r9.zzd(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase-auth-api.zzakl.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzamd, com.google.android.gms.internal.firebase-auth-api.zzaku):void");
    }

    private final void zza(List list, boolean z) throws IOException {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzalt) && !z) {
                zzalt zzaltVar = (zzalt) list;
                do {
                    zzaltVar.zza(zzp());
                    if (this.zza.zzw()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z ? zzr() : zzq());
                if (this.zza.zzw()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzall.zza();
    }

    private final void zza(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw zzall.zzj();
        }
    }
}
