package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzxh;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbn {
    private final List zza = new ArrayList();
    private zzok zzb = zzok.zza;
    private boolean zzc = false;

    public static /* synthetic */ void zza(zzbn zzbnVar) {
        zzbnVar.zzb();
    }

    private final void zzb() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzbq.zza((zzbq) it.next(), false);
        }
    }

    public final zzbn zza(zzbq zzbqVar) {
        if (zzbq.zzc(zzbqVar) != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzbq.zze(zzbqVar)) {
            zzb();
        }
        zzbq.zza(zzbqVar, this);
        this.zza.add(zzbqVar);
        return this;
    }

    public final zzbm zza() throws GeneralSecurityException {
        int zza;
        if (!this.zzc) {
            this.zzc = true;
            zzxh.zza zzc = zzxh.zzc();
            ArrayList arrayList = new ArrayList(this.zza.size());
            List list = this.zza;
            for (int i = 0; i < list.size() - 1; i++) {
                if (zzbq.zzb((zzbq) list.get(i)) == zzbp.zza() && zzbq.zzb((zzbq) list.get(i + 1)) != zzbp.zza()) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzbq zzbqVar : this.zza) {
                if (zzbq.zza(zzbqVar) != null) {
                    if (zzbq.zzb(zzbqVar) != null) {
                        if (zzbq.zzb(zzbqVar) == zzbp.zza()) {
                            zza = 0;
                            while (true) {
                                if (zza != 0 && !hashSet.contains(Integer.valueOf(zza))) {
                                    break;
                                }
                                zza = zzqn.zza();
                            }
                        } else {
                            zza = zzbp.zza(zzbq.zzb(zzbqVar));
                        }
                        if (!hashSet.contains(Integer.valueOf(zza))) {
                            hashSet.add(Integer.valueOf(zza));
                            zzbi zza2 = zzop.zza().zza(zzbq.zzd(zzbqVar), zzbq.zzd(zzbqVar).zza() ? Integer.valueOf(zza) : null);
                            zzbs zzbsVar = new zzbs(zza2, zzbm.zza(zzbq.zza(zzbqVar)), zza, zzbq.zze(zzbqVar), false, zzbs.zzd(), null);
                            zzc.zza(zzbm.zza(zza2, zzbm.zza(zzbq.zza(zzbqVar)), zza));
                            if (zzbq.zze(zzbqVar)) {
                                if (num == null) {
                                    num = Integer.valueOf(zza);
                                    if (zzbq.zza(zzbqVar) != zzbk.zza) {
                                        throw new GeneralSecurityException("Primary key is not enabled");
                                    }
                                } else {
                                    throw new GeneralSecurityException("Two primaries were set");
                                }
                            }
                            arrayList.add(zzbsVar);
                        } else {
                            throw new GeneralSecurityException("Id " + zza + " is used twice in the keyset");
                        }
                    } else {
                        throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                    }
                } else {
                    throw new GeneralSecurityException("Key Status not set.");
                }
            }
            if (num != null) {
                zzc.zza(num.intValue());
                zzxh zzxhVar = (zzxh) ((zzalf) zzc.zze());
                zzbm.zzb(zzxhVar);
                return zzbm.zza(new zzbm(zzxhVar, arrayList, this.zzb, null));
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
