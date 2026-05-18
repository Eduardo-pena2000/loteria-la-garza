package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzasz extends zzasm {
    public zzasz() {
        throw null;
    }

    public static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzarq((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public final zzasw zza(zzary zzaryVar, Map map) throws IOException, zzarg {
        String zzh = zzaryVar.zzh();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzaryVar.zzm());
        URL url = new URL(zzh);
        HttpURLConnection openConnection = url.openConnection();
        openConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzo = zzaryVar.zzo();
        openConnection.setConnectTimeout(zzo);
        openConnection.setReadTimeout(zzo);
        boolean z = false;
        openConnection.setUseCaches(false);
        openConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (String str : hashMap.keySet()) {
                openConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzaryVar.zza() != 0) {
                openConnection.setRequestMethod("POST");
                byte[] zzn = zzaryVar.zzn();
                if (zzn != null) {
                    openConnection.setDoOutput(true);
                    if (!openConnection.getRequestProperties().containsKey("Content-Type")) {
                        openConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(openConnection.getOutputStream());
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                openConnection.setRequestMethod("GET");
            }
            int responseCode = openConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzaryVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzasw zzaswVar = new zzasw(responseCode, zzb(openConnection.getHeaderFields()), -1, null);
                openConnection.disconnect();
                return zzaswVar;
            }
            try {
                return new zzasw(responseCode, zzb(openConnection.getHeaderFields()), openConnection.getContentLength(), new zzasx(openConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    openConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public zzasz(zzasy zzasyVar, SSLSocketFactory sSLSocketFactory) {
    }
}
