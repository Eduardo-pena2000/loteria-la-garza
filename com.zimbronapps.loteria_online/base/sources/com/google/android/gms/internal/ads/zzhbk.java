package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhbk implements zzhjj {
    private final List zza;
    private final zzhjr zzb;
    private final zzhbk zzc;

    private zzhbk(List list, zzhjr zzhjrVar, zzhbk zzhbkVar) {
        this.zza = list;
        this.zzb = zzhjrVar;
        this.zzc = zzhbkVar;
    }

    public static final zzhbk zza(zzhql zzhqlVar) throws GeneralSecurityException {
        if (zzhqlVar == null || zzhqlVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhbk(zzi(zzhqlVar), zzhjr.zza);
    }

    public static final zzhbk zzf(zzhbp zzhbpVar) throws GeneralSecurityException {
        zzhbf zzhbfVar = new zzhbf();
        zzhbd zzhbdVar = new zzhbd(zzhbpVar, null);
        zzhbdVar.zzb();
        zzhbdVar.zza();
        zzhbfVar.zza(zzhbdVar);
        return zzhbfVar.zzb();
    }

    public static /* synthetic */ zzhbk zzh(zzhbk zzhbkVar) {
        zzhjr zzhjrVar = zzhbkVar.zzb;
        if (zzhjrVar.zza()) {
            return zzhbkVar;
        }
        zzhbj zzhbjVar = new zzhbj(zzhbkVar, zzhjrVar);
        List<zzhbi> list = zzhbkVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhbi zzhbiVar : list) {
            arrayList.add(new zzhbi(zzhbiVar.zzf(), zzhbiVar.zzj(), zzhbiVar.zzg(), zzhbiVar.zzh(), zzhbiVar.zzi(), zzhbjVar, null));
        }
        return new zzhbk((List) arrayList, zzhjrVar, zzhbkVar);
    }

    private static List zzi(zzhql zzhqlVar) throws GeneralSecurityException {
        zzhaz zzhjoVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzhqlVar.zzc());
        for (zzhqk zzhqkVar : zzhqlVar.zzb()) {
            int zzc = zzhqkVar.zzc();
            try {
                zzhlb zzk = zzk(zzhqkVar);
                zzhkg zza = zzhkg.zza();
                zzhbt zza2 = zzhbt.zza();
                zzhaz zzhjoVar2 = !zza.zzf(zzk) ? new zzhjo(zzk, zza2) : zza.zzg(zzk, zza2);
                z = false;
                zzhjoVar = zzhjoVar2;
            } catch (GeneralSecurityException e) {
                if (zzhib.zza.zza()) {
                    throw e;
                }
                zzhjoVar = new zzhjo(zzk(zzhqkVar), zzhbt.zza());
                z = true;
            }
            if (zzhib.zza.zza() && !zzl(zzhqkVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzhbi(zzhjoVar, zzhqkVar.zzk(), zzc, zzc == zzhqlVar.zza(), z, zzhbi.zze(), null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhbk zzj() {
        zzhbk zzhbkVar = this.zzc;
        return zzhbkVar == null ? this : zzhbkVar;
    }

    private static zzhlb zzk(zzhqk zzhqkVar) throws GeneralSecurityException {
        return zzhlb.zza(zzhqkVar.zzb().zza(), zzhqkVar.zzb().zzb(), zzhqkVar.zzb().zzc(), zzhqkVar.zzd(), zzhqkVar.zzd() == zzhqy.zzd ? null : Integer.valueOf(zzhqkVar.zzc()));
    }

    private static boolean zzl(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzhql zzb = zzb();
        int i = zzhbw.zza;
        zzhqm zza = zzhqp.zza();
        zza.zza(zzb.zza());
        for (zzhqk zzhqkVar : zzb.zzb()) {
            zzhqn zza2 = zzhqo.zza();
            zza2.zza(zzhqkVar.zzb().zza());
            zza2.zzd(zzhqkVar.zzk());
            zza2.zzc(zzhqkVar.zzd());
            zza2.zzb(zzhqkVar.zzc());
            zza.zzb((zzhqo) zza2.zzbm());
        }
        return ((zzhqp) zza.zzbm()).toString();
    }

    public final zzhql zzb() {
        try {
            zzhqi zzh = zzhql.zzh();
            for (zzhbi zzhbiVar : this.zza) {
                zzhaz zza = zzhbiVar.zza();
                int zzj = zzhbiVar.zzj();
                int zzc = zzhbiVar.zzc();
                zzhlb zzhlbVar = (zzhlb) zzhkg.zza().zzh(zza, zzhlb.class, zzhbt.zza());
                Integer zzb = zza.zzb();
                if (zzb != null && zzb.intValue() != zzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhqj zze = zzhqk.zze();
                zzhqa zzd = zzhqc.zzd();
                zzd.zza(zzhlbVar.zzg());
                zzd.zzb(zzhlbVar.zzb());
                zzd.zzc(zzhlbVar.zzc());
                zze.zzb(zzd);
                zze.zze(zzj);
                zze.zzc(zzc);
                zze.zzd(zzhlbVar.zzd());
                zzh.zzb((zzhqk) zze.zzbm());
                if (zzhbiVar.zzd()) {
                    zzh.zza(zzhbiVar.zzc());
                }
            }
            return (zzhql) zzh.zzbm();
        } catch (GeneralSecurityException e) {
            throw new zzhlm((Throwable) e);
        }
    }

    public final zzhbi zzc() {
        for (zzhbi zzhbiVar : this.zza) {
            if (zzhbiVar != null && zzhbiVar.zzd()) {
                if (zzhbiVar.zzb() == zzhbb.zza) {
                    return zzhbiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final int zzd() {
        return this.zza.size();
    }

    public final zzhbi zze(int i) {
        if (i < 0 || i >= zzd()) {
            int zzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(zzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(zzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhbi zzhbiVar = (zzhbi) list.get(i);
        if (!zzl(zzhbiVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzhbiVar.zzi()) {
            return (zzhbi) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    public final Object zzg(zzhaw zzhawVar, Class cls) throws GeneralSecurityException {
        if (!(zzhawVar instanceof zzhix)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhix zzhixVar = (zzhix) zzhawVar;
        zzhql zzb = zzj().zzb();
        int i = zzhbw.zza;
        int zza = zzb.zza();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzhqk zzhqkVar : zzb.zzb()) {
            if (zzhqkVar.zzk() == 3) {
                if (!zzhqkVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzhqkVar.zzc())}));
                }
                if (zzhqkVar.zzd() == zzhqy.zza) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzhqkVar.zzc())}));
                }
                if (zzhqkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzhqkVar.zzc())}));
                }
                if (zzhqkVar.zzc() == zza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhqkVar.zzb().zzc() == zzhqb.zzd;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhbi) list.get(i3)).zzi() || !zzl(((zzhbi) list.get(i3)).zzj())) {
                String zza2 = zzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(zza2).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhixVar.zza(zzj(), this.zzb, cls);
    }

    public /* synthetic */ zzhbk(List list, zzhjr zzhjrVar, byte[] bArr) {
        this(list, zzhjrVar);
    }

    private zzhbk(List list, zzhjr zzhjrVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhjrVar;
        if (zzhib.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zzhbi zzhbiVar = (zzhbi) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhbiVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhbiVar.zzc()));
                    z |= zzhbiVar.zzd();
                } else {
                    int zzc = zzhbiVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 121);
                    sb.append("KeyID ");
                    sb.append(zzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if (!z) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
