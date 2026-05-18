package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzd {
    public final long zza;
    public final int[] zzb;

    private zzdzd(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzguf zza(JsonReader jsonReader) throws IOException {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzguf zzi = zzguf.zzi();
            jsonReader.beginObject();
            zzdzd zzdzdVar = null;
            Long l = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzguc zzgucVar2 = new zzguc();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgucVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgucVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l != null && !zzi.isEmpty()) {
                long longValue = l.longValue();
                int[] iArr = new int[zzi.size()];
                for (int i2 = 0; i2 < zzi.size(); i2++) {
                    iArr[i2] = ((Integer) zzi.get(i2)).intValue();
                }
                zzdzdVar = new zzdzd(longValue, iArr);
            }
            if (zzdzdVar != null) {
                zzgucVar.zzf(zzdzdVar);
            }
        }
        jsonReader.endArray();
        return zzgucVar.zzi();
    }
}
