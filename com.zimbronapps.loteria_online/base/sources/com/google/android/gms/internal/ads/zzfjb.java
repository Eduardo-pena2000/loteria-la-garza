package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfjb {
    public final List zza;
    public final zzfiu zzb;
    public final List zzc;
    public final Bundle zzd;

    public zzfjb(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            bundle.putLong(zzdxh.zzt.zza(), R5.t.o().a());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfiu zzfiuVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfir(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfiuVar = new zzfiu(jsonReader);
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzcL)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdxh.zzq.zza(), zzfiuVar.zzs);
                            bundle.putLong(zzdxh.zzr.zza(), zzfiuVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = V5.S.d(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfja(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfiuVar == null ? new zzfiu(new JsonReader(new StringReader("{}"))) : zzfiuVar;
    }

    public static zzfjb zza(Reader reader, Bundle bundle) throws zzfiv {
        try {
            try {
                return new zzfjb(new JsonReader(reader), bundle);
            } finally {
                E6.m.b(reader);
            }
        } catch (NumberFormatException | IllegalStateException | AssertionError | IOException | JSONException e) {
            throw new zzfiv("unable to parse ServerResponse", e);
        }
    }
}
