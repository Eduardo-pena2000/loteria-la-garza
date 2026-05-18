package com.google.android.gms.internal.ads;

import V5.o0;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdym {
    private final E6.f zza;

    public zzdym(E6.f fVar) {
        this.zza = fVar;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            long a = this.zza.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                int i2 = o0.b;
                W5.p.d("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i3 = o0.b;
            W5.p.e("AD-DBG ".concat(valueOf));
        }
    }
}
