package com.google.android.gms.internal.ads;

import V5.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbej {
    private final int zza;
    private final zzbeg zzb = new zzbel();

    public zzbej(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbei zzbeiVar = new zzbei();
        int i2 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzbeh(this));
        for (String str : split) {
            String[] zzb = zzbek.zzb(str, false);
            if (zzb.length != 0) {
                zzben.zza(zzb, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbeiVar.zzb.write(this.zzb.zza(((zzbem) it.next()).zzb));
            } catch (IOException e) {
                int i3 = o0.b;
                W5.p.d("Error while writing hash to byteStream", e);
            }
        }
        return zzbeiVar.toString();
    }
}
