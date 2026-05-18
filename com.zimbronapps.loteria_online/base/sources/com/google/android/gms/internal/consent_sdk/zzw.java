package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;
    private final zzcr zzi;

    public zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbq zzbqVar, zzn zznVar, zzz zzzVar, zze zzeVar, zzcr zzcrVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
        this.zzi = zzcrVar;
    }

    public static /* synthetic */ void zza(zzw zzwVar, Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzct.zza(zzwVar.zza) + "\") to set this as a debug device.");
            }
            zzab zzb = zzwVar.zzg.zzb(zzwVar.zzd(zzwVar.zzf.zzc(activity, consentRequestParameters)));
            zzaq zzaqVar = zzwVar.zzd;
            zzaqVar.zzg(zzb.zza);
            zzaqVar.zzi(zzb.zzb);
            zzwVar.zze.zzd(zzb.zzc);
            zzwVar.zzi.zzg(null);
            zzwVar.zzh.zza().execute(new zzu(zzwVar, onConsentInfoUpdateSuccessListener, zzb));
        } catch (zzg e) {
            zzwVar.zzi.zzg("RequestConsentUpdate exception. Error: " + e.getMessage() + ", cause: " + String.valueOf(e.getCause()));
            zzwVar.zzb.post(new zzr(onConsentInfoUpdateFailureListener, e));
        } catch (RuntimeException e2) {
            zzwVar.zzi.zzg("RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e2.getMessage())));
            zzwVar.zzb.post(new zzs(onConsentInfoUpdateFailureListener, new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))))));
        }
    }

    public static /* synthetic */ void zzb(zzw zzwVar, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzab zzabVar) {
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        zzwVar.zzb.post(new zzt(onConsentInfoUpdateSuccessListener));
        if (zzabVar.zzb != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzwVar.zze.zzc();
        }
    }

    private final zzcn zzd(zzcl zzclVar) throws zzg {
        try {
            HttpURLConnection openConnection = new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            openConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            openConnection.setConnectTimeout(10000);
            openConnection.setReadTimeout(30000);
            openConnection.setDoOutput(true);
            openConnection.setRequestMethod("POST");
            openConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzclVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = zzclVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("consent_syncing_id");
                        jsonWriter.value(str2);
                    }
                    zzch zzchVar = zzclVar.zzc;
                    if (zzchVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = zzchVar.zzc;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            int i2 = i - 1;
                            if (i2 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i2 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = zzchVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = zzchVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = zzclVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = zzclVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzclVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzclVar.zzg;
                    if (zzcjVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcjVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcjVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = zzcjVar.zzc;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<zzci> list = zzcjVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzci zzciVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzciVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzciVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzciVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzciVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcf zzcfVar = zzclVar.zzh;
                    if (zzcfVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = zzcfVar.zza;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzcfVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzcfVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    zzck zzckVar = zzclVar.zzi;
                    if (zzckVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = zzckVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzclVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch (((zzcg) it.next()).ordinal()) {
                                case 0:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case 1:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case 2:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case 3:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case 4:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case 5:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case 6:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case 7:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = openConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(openConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = openConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcn zza = zzcn.zza(new JsonReader(new StringReader(headerField)));
                        zza.zza = new Scanner(openConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcn zza2 = zzcn.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zza2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            throw new zzg(2, "Error making request.", e);
        } catch (SocketTimeoutException e2) {
            throw new zzg(4, "The server timed out.", e2);
        }
    }

    public final void zzc(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzc.execute(new zzv(this, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener));
    }
}
