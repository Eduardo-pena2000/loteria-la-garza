package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfiu {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfit zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfiu(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        zzfit zzfitVar = null;
        long j = -1;
        long j2 = -1;
        long j3 = 0;
        int i3 = -1;
        int i4 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = V5.S.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j3 = jsonReader.nextLong();
            } else {
                String str8 = str3;
                if (((Boolean) S5.D.c().zzd(zzbhe.zzjD)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfitVar = new zzfit(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzlR)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzhI)).booleanValue()) {
                            try {
                                try {
                                    Bundle l = V5.S.l(V5.S.d(jsonReader));
                                    if (l != null) {
                                        bundle = l;
                                    }
                                } catch (IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (JSONException | IOException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzkJ)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzkJ)).booleanValue()) {
                            str4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        zzbgv zzbgvVar = zzbhe.zzkK;
                        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = V5.S.d(jsonReader);
                        } else if (Objects.equals(nextName, "max_parallel_renderers")) {
                            i4 = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) S5.D.c().zzd(zzbhe.zzkS)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = V5.S.d(jsonReader);
                            } else {
                                if (((Boolean) S5.D.c().zzd(zzbhe.zzcL)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        Bundle l2 = V5.S.l(V5.S.d(jsonReader));
                                        if (l2 != null) {
                                            j2 = zza(l2.getDouble("start_time"));
                                            j = zza(l2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str3 = str8;
            }
        }
        String str9 = str3;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        if (((Boolean) zzbjk.zzd.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbio zzbioVar = zzbis.zza;
            if (((Long) zzbioVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbioVar.zze()).intValue();
            } else {
                this.zzd = i3;
            }
        }
        this.zzb = str;
        this.zze = str6;
        this.zzf = i2;
        this.zzg = j3;
        this.zzj = zzfitVar;
        this.zzh = z;
        this.zzi = str7;
        this.zzk = bundle;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = str2;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str9;
        zzbio zzbioVar2 = zzbji.zza;
        this.zzr = ((Long) zzbioVar2.zze()).longValue() > 0 ? ((Long) zzbioVar2.zze()).intValue() : i4;
        this.zzs = j2;
        this.zzt = j;
    }

    private static final long zza(double d) {
        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d;
    }
}
