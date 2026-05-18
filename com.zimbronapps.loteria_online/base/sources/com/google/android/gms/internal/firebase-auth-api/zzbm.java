package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzwx;
import com.google.android.gms.internal.firebase-auth-api.zzxh;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbm implements zzob {
    private final List zza;
    private final zzok zzb;
    private final zzbm zzc;

    public /* synthetic */ zzbm(zzxh zzxhVar, List list, zzok zzokVar, zzbt zzbtVar) {
        this(zzxhVar, list, zzokVar);
    }

    public static /* synthetic */ zzbm zza(zzbm zzbmVar) {
        return zzb(zzbmVar);
    }

    public static /* synthetic */ void zzb(zzxh zzxhVar) {
        zzd(zzxhVar);
    }

    private final zzbm zze() {
        zzbm zzbmVar = this.zzc;
        return zzbmVar == null ? this : zzbmVar;
    }

    public final String toString() {
        return zzcm.zza(zzd()).toString();
    }

    public final /* synthetic */ zzoa zzc() {
        for (zzbs zzbsVar : this.zza) {
            if (zzbsVar != null && zzbsVar.zze()) {
                if (zzbsVar.zzc() == zzbk.zza) {
                    return zzbsVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzxh zzd() {
        try {
            zzxh.zza zzc = zzxh.zzc();
            for (zzbs zzbsVar : this.zza) {
                zzc.zza(zzb(zzbsVar.zzb(), zzbs.zzc(zzbsVar), zzbsVar.zza()));
                if (zzbsVar.zze()) {
                    zzc.zza(zzbsVar.zza());
                }
            }
            return (zzxh) ((zzalf) zzc.zze());
        } catch (GeneralSecurityException e) {
            throw new zzql((Throwable) e);
        }
    }

    private zzbm(zzxh zzxhVar, List list, zzok zzokVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzokVar;
        if (zziu.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxh.zzb zzbVar : zzxhVar.zze()) {
                if (hashSet.contains(Integer.valueOf(zzbVar.zza()))) {
                    throw new GeneralSecurityException("KeyID " + zzbVar.zza() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(zzbVar.zza()));
            }
            if (!hashSet.contains(Integer.valueOf(zzxhVar.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    public static /* synthetic */ zzxh.zzb zza(zzbi zzbiVar, zzxc zzxcVar, int i) {
        return zzb(zzbiVar, zzxcVar, i);
    }

    private static zzbm zzb(zzbm zzbmVar) {
        zzok zzokVar = zzbmVar.zzb;
        if (zzokVar.zza()) {
            return zzbmVar;
        }
        zzbl zzblVar = new zzbl(zzbmVar, zzokVar);
        ArrayList arrayList = new ArrayList(zzbmVar.zza.size());
        for (zzbs zzbsVar : zzbmVar.zza) {
            arrayList.add(new zzbs(zzbs.zzb(zzbsVar), zzbs.zzc(zzbsVar), zzbs.zza(zzbsVar), zzbs.zze(zzbsVar), zzbs.zzf(zzbsVar), zzblVar, null));
        }
        return new zzbm((List) arrayList, zzokVar, zzbmVar);
    }

    public final int zza() {
        return this.zza.size();
    }

    private static zzbi zza(zzxh.zzb zzbVar) throws GeneralSecurityException {
        zzqb zzb = zzb(zzbVar);
        zzoz zza = zzoz.zza();
        zzch zza2 = zzch.zza();
        if (!zza.zzb(zzb)) {
            return new zzof(zzb, zza2);
        }
        return zza.zza(zzb, zza2);
    }

    private static List zzc(zzxh zzxhVar) throws GeneralSecurityException {
        zzbi zzofVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzxhVar.zza());
        for (zzxh.zzb zzbVar : zzxhVar.zze()) {
            int zza = zzbVar.zza();
            try {
                zzofVar = zza(zzbVar);
                z = false;
            } catch (GeneralSecurityException e) {
                if (!zziu.zza.zza()) {
                    zzofVar = new zzof(zzb(zzbVar), zzch.zza());
                    z = true;
                } else {
                    throw e;
                }
            }
            if (zziu.zza.zza() && !zza(zzbVar.zzc())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new zzbs(zzofVar, zzbVar.zzc(), zza, zza == zzxhVar.zzb(), z, zzbs.zzd(), null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzd(zzxh zzxhVar) throws GeneralSecurityException {
        if (zzxhVar == null || zzxhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.firebase-auth-api.zzbi] */
    public final zzbm zzb() throws GeneralSecurityException {
        zzof zzofVar;
        boolean z;
        zzbs zzbsVar;
        zzxh.zzb zzbVar;
        zzxh zzd = zzd();
        zzxh.zza zzc = zzxh.zzc();
        ArrayList arrayList = new ArrayList(this.zza.size());
        int i = 0;
        for (zzbs zzbsVar2 : this.zza) {
            if (zzbsVar2.zzb() instanceof zzce) {
                zzbi zzc2 = ((zzce) zzbsVar2.zzb()).zzc();
                zzbs zzbsVar3 = new zzbs(zzc2, zzbs.zzc(zzbsVar2), zzbsVar2.zza(), zzbsVar2.zze(), false, zzbs.zzd(), null);
                zzbVar = zzb(zzc2, zzbs.zzc(zzbsVar2), zzbsVar2.zza());
                zzbsVar = zzbsVar3;
            } else {
                zzxh.zzb zza = zzd.zza(i);
                zzwx zzb = zza.zzb();
                if (zzb.zzb() == zzwx.zzb.ASYMMETRIC_PRIVATE) {
                    zzxh.zzb zzbVar2 = (zzxh.zzb) ((zzalf) ((zzxh.zzb.zza) zza.zzn()).zza(zzci.zza(zzb.zzf(), zzb.zze())).zze());
                    try {
                        zzofVar = zza(zzbVar2);
                        z = false;
                    } catch (GeneralSecurityException e) {
                        if (!zziu.zza.zza()) {
                            zzofVar = new zzof(zzb(zzbVar2), zzch.zza());
                            z = true;
                        } else {
                            throw e;
                        }
                    }
                    int zza2 = zzbVar2.zza();
                    zzbsVar = new zzbs(zzofVar, zzbs.zzc(zzbsVar2), zza2, zza2 == zzd.zzb(), z, zzbs.zzd(), null);
                    zzbVar = zzbVar2;
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc.zza(zzbVar);
            arrayList.add(zzbsVar);
            i++;
        }
        zzc.zza(zzd.zzb());
        return zzb(new zzbm((zzxh) ((zzalf) zzc.zze()), (List) arrayList, this.zzb));
    }

    public static final zzbm zza(zzxh zzxhVar) throws GeneralSecurityException {
        zzd(zzxhVar);
        return new zzbm(zzxhVar, zzc(zzxhVar), zzok.zza);
    }

    public static final zzbm zza(zzbj zzbjVar) throws GeneralSecurityException {
        return new zzbn().zza(new zzbq(zzbjVar.zza(), null).zzb().zza()).zza();
    }

    private zzbm(List list, zzok zzokVar, zzbm zzbmVar) {
        this.zza = list;
        this.zzb = zzokVar;
        this.zzc = zzbmVar;
    }

    @Deprecated
    public static final zzbm zza(zzbv zzbvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzvv zza = zzbvVar.zza();
        if (zza != null && zza.zzc().zzb() != 0) {
            return zza(zza(zza, zzbaVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final /* synthetic */ zzoa zza(int i) {
        if (i >= 0 && i < zza()) {
            zzbs zzbsVar = (zzbs) this.zza.get(i);
            if (zza(zzbs.zzc(zzbsVar))) {
                if (!zzbs.zzf(zzbsVar)) {
                    return (zzbs) this.zza.get(i);
                }
                throw new IllegalStateException("Keyset-Entry at position " + i + " didn't parse correctly");
            }
            throw new IllegalStateException("Keyset-Entry at position " + i + " has wrong status");
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + zza());
    }

    public static /* synthetic */ zzxc zza(zzbk zzbkVar) {
        if (zzbk.zza.equals(zzbkVar)) {
            return zzxc.ENABLED;
        }
        if (zzbk.zzb.equals(zzbkVar)) {
            return zzxc.DISABLED;
        }
        if (zzbk.zzc.equals(zzbkVar)) {
            return zzxc.DESTROYED;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static zzxh zza(zzvv zzvvVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzxh zza = zzxh.zza(zzbaVar.zza(zzvvVar.zzc().zzd(), bArr), zzaku.zza());
            zzd(zza);
            return zza;
        } catch (zzall unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzqb zzb(zzxh.zzb zzbVar) throws GeneralSecurityException {
        return zzqb.zza(zzbVar.zzb().zzf(), zzbVar.zzb().zze(), zzbVar.zzb().zzb(), zzbVar.zzf(), zzbVar.zzf() == zzxz.RAW ? null : Integer.valueOf(zzbVar.zza()));
    }

    public final Object zza(zzbb zzbbVar, Class cls) throws GeneralSecurityException {
        if (zzbbVar instanceof zznp) {
            zznp zznpVar = (zznp) zzbbVar;
            zzxh zzd = zze().zzd();
            zzcm.zzb(zzd);
            for (int i = 0; i < zza(); i++) {
                if (zzbs.zzf((zzbs) this.zza.get(i)) || !zza(zzbs.zzc((zzbs) this.zza.get(i)))) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i + " and type_url " + zzd.zza(i).zzb().zzf() + " failed, unable to get primitive");
                }
            }
            return zznpVar.zza(zze(), this.zzb, cls);
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    private static zzxh.zzb zzb(zzbi zzbiVar, zzxc zzxcVar, int i) throws GeneralSecurityException {
        zzqb zzqbVar = (zzqb) zzoz.zza().zza(zzbiVar, zzqb.class, zzch.zza());
        Integer zze = zzqbVar.zze();
        if (zze != null && zze.intValue() != i) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        return (zzxh.zzb) ((zzalf) zzxh.zzb.zzd().zza(zzwx.zza().zza(zzqbVar.zzf()).zza(zzqbVar.zzd()).zza(zzqbVar.zza())).zza(zzxcVar).zza(i).zza(zzqbVar.zzb()).zze());
    }

    @Deprecated
    public final void zza(zzby zzbyVar) throws GeneralSecurityException, IOException {
        zzxh zzd = zzd();
        for (zzxh.zzb zzbVar : zzd.zze()) {
            if (zzbVar.zzb().zzb() == zzwx.zzb.UNKNOWN_KEYMATERIAL || zzbVar.zzb().zzb() == zzwx.zzb.SYMMETRIC || zzbVar.zzb().zzb() == zzwx.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", new Object[]{zzbVar.zzb().zzb().name(), zzbVar.zzb().zzf()}));
            }
        }
        zzbyVar.zza(zzd);
    }

    @Deprecated
    public final void zza(zzby zzbyVar, zzba zzbaVar, byte[] bArr) throws GeneralSecurityException, IOException {
        zzxh zzd = zzd();
        zzbyVar.zza((zzvv) ((zzalf) zzvv.zza().zza(zzajv.zza(zzbaVar.zzb(zzd.zzk(), bArr))).zza(zzcm.zza(zzd)).zze()));
    }

    private static boolean zza(zzxc zzxcVar) {
        int i = zzbo.zza[zzxcVar.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
