package com.google.android.gms.internal.ads;

import L5.C;
import M5.a;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbov implements zzboh {
    private final zzecc zza;

    public zzbov(zzecc zzeccVar) {
        this.zza = zzeccVar;
    }

    private static final Bundle zzb(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    Object obj = jSONObject.get(str);
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                R5.t.l().zzg(e, "OutOfContextTestingGmsgHandler.generateNetworkExtras");
            }
        }
        return bundle;
    }

    private static final List zzc(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            R5.t.l().zzg(e, "OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2));
            return new ArrayList();
        }
    }

    public final void zza(Object obj, Map map) {
        AdRequest o;
        L5.h hVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkO)).booleanValue()) {
            zzecd zzecdVar = new zzecd();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                zzecdVar.zzh(str);
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzecdVar.zzi(str2);
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzkQ)).booleanValue()) {
                boolean z = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z = true;
                }
                zzecdVar.zzn(z);
                if (zzecdVar.zzg()) {
                    a.a aVar = new a.a();
                    if (map.containsKey("keywords")) {
                        Iterator it = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            aVar.c((String) it.next());
                        }
                    }
                    aVar.d(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String str3 = (String) keys.next();
                                aVar.a(str3, jSONObject.getString(str3));
                            }
                        } catch (JSONException e) {
                            R5.t.l().zzg(e, "OutOfContextTestingGmsgHandler.generateAdManagerAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        aVar.g((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        aVar.i(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        aVar.j((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        aVar.q((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = zzc((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            aVar.o((String) it2.next());
                        }
                    }
                    o = aVar.p();
                } else {
                    AdRequest.Builder builder = new AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = zzc((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            builder.c((String) it3.next());
                        }
                    }
                    builder.d(AdMobAdapter.class, zzb(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String str4 = (String) keys2.next();
                                builder.a(str4, jSONObject2.getString(str4));
                            }
                        } catch (JSONException e2) {
                            R5.t.l().zzg(e2, "OutOfContextTestingGmsgHandler.generateAdMobAdRequest");
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        builder.g((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.i(zzc((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.j((String) map.get("requestAgent"));
                    }
                    o = builder.o();
                }
                zzecdVar.zzj(o);
                String str5 = (String) map.get("width");
                String str6 = (String) map.get("height");
                if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6)) {
                    hVar = L5.h.i;
                } else {
                    try {
                        hVar = new L5.h(Integer.parseInt(str5), Integer.parseInt(str6));
                    } catch (NumberFormatException e3) {
                        R5.t.l().zzg(e3, "OutOfContextTestingGmsgHandler.generateAdSize");
                        hVar = L5.h.i;
                    }
                }
                zzecdVar.zzk(hVar);
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    C.a aVar2 = new C.a();
                    if (map.containsKey("startMuted")) {
                        aVar2.d(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        aVar2.c(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        aVar2.b(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    zzecdVar.zzm(aVar2.a());
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzecdVar.zzf() != null && zzecdVar.zzb().equals("NATIVE"))) {
                    b.a aVar3 = new b.a();
                    if (map.containsKey("disableImageLoading")) {
                        aVar3.g(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str7 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str7)) {
                            try {
                                aVar3.d(Integer.parseInt(str7));
                            } catch (NumberFormatException e4) {
                                R5.t.l().zzg(e4, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio");
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        aVar3.f(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str8 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str8)) {
                            try {
                                aVar3.c(Integer.parseInt(str8));
                            } catch (NumberFormatException e5) {
                                R5.t.l().zzg(e5, "OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition");
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        aVar3.e(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    L5.C zzf = zzecdVar.zzf();
                    if (zzf != null) {
                        aVar3.h(zzf);
                    }
                    zzecdVar.zzl(aVar3.a());
                }
            }
            String str9 = (String) map.get("action");
            if (TextUtils.isEmpty(str9) || TextUtils.isEmpty(zzecdVar.zza())) {
                return;
            }
            if (str9.equals("load") && !TextUtils.isEmpty(zzecdVar.zzb())) {
                this.zza.zzc(zzecdVar);
            } else if (str9.equals("show")) {
                this.zza.zzd(zzecdVar.zza());
            }
        }
    }
}
