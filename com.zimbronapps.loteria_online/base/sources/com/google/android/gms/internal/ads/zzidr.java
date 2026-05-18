package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzidr {
    public static final /* synthetic */ zzian zza(zzian zzianVar, zzian zzianVar2, ArrayDeque arrayDeque) {
        zzb(zzianVar, arrayDeque);
        zzb(zzianVar2, arrayDeque);
        zzian zzianVar3 = (zzian) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzianVar3 = new zzidt((zzian) arrayDeque.pop(), zzianVar3, null);
        }
        return zzianVar3;
    }

    private static final void zzb(zzian zzianVar, ArrayDeque arrayDeque) {
        if (!zzianVar.zzq()) {
            if (!(zzianVar instanceof zzidt)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzianVar.getClass())));
            }
            zzidt zzidtVar = (zzidt) zzianVar;
            zzb(zzidtVar.zzo(), arrayDeque);
            zzb(zzidtVar.zzE(), arrayDeque);
            return;
        }
        int zzc = zzc(zzianVar.zzc(), arrayDeque);
        int zzn = zzidt.zzn(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= zzn) {
            arrayDeque.push(zzianVar);
            return;
        }
        int zzn2 = zzidt.zzn(zzc);
        zzian zzianVar2 = (zzian) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zzian) arrayDeque.peek()).zzc() < zzn2) {
            zzianVar2 = new zzidt((zzian) arrayDeque.pop(), zzianVar2, null);
        }
        zzidt zzidtVar2 = new zzidt(zzianVar2, zzianVar, null);
        while (!arrayDeque.isEmpty()) {
            if (((zzian) arrayDeque.peek()).zzc() >= zzidt.zzn(zzc(zzidtVar2.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzidtVar2 = new zzidt((zzian) arrayDeque.pop(), zzidtVar2, null);
            }
        }
        arrayDeque.push(zzidtVar2);
    }

    private static final int zzc(int i, ArrayDeque arrayDeque) {
        int binarySearch = Arrays.binarySearch(zzidt.zzb, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
