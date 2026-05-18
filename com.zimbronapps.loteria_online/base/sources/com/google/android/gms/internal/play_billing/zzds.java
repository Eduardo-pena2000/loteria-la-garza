package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzds implements zzgl {
    protected int zza = 0;

    public static void zzg(Iterable iterable, List list) {
        byte[] bArr = zzfo.zzb;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof zzgt) {
            ((zzgt) list).zzf(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj = list2.get(i);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] zzM() {
        try {
            int zzj = zzj();
            byte[] bArr = new byte[zzj];
            int i = zzep.zzb;
            zzem zzemVar = new zzem(bArr, 0, zzj);
            zzL(zzemVar);
            zzemVar.zzE();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public int zze(zzgv zzgvVar) {
        throw null;
    }

    public final zzei zzf() {
        try {
            int zzj = zzj();
            zzei zzeiVar = zzei.zzb;
            byte[] bArr = new byte[zzj];
            int i = zzep.zzb;
            zzem zzemVar = new zzem(bArr, 0, zzj);
            zzL(zzemVar);
            return zzee.zza(zzemVar, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
