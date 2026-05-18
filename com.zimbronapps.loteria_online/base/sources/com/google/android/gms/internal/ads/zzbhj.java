package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbhj {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));

    private final void zzg(Map map, zzbhs zzbhsVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbhsVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbhsVar.zza())) {
                sb.append("&it=");
                sb.append(zzbhsVar.zza());
            }
            if (!TextUtils.isEmpty(zzbhsVar.zzb())) {
                sb.append("&blat=");
                sb.append(zzbhsVar.zzb());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            R5.t.g();
            F0.q(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            int i = o0.b;
            W5.p.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                int i2 = o0.b;
                W5.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            int i3 = o0.b;
            W5.p.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    W5.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    int i4 = o0.b;
                    W5.p.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    public final void zza(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbiz.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfxl.zza().zza(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcei.zza.execute(new zzbhi(this));
        Map map2 = this.zzc;
        zzbhp zzbhpVar = zzbhp.zzb;
        map2.put("action", zzbhpVar);
        map2.put("ad_format", zzbhpVar);
        map2.put("e", zzbhp.zzc);
    }

    public final boolean zzb(zzbht zzbhtVar) {
        return this.zza.offer(zzbhtVar);
    }

    public final Map zzc(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zzd(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final zzbhp zzd(String str) {
        zzbhp zzbhpVar = (zzbhp) this.zzc.get(str);
        return zzbhpVar != null ? zzbhpVar : zzbhp.zza;
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    public final /* synthetic */ void zzf() {
        while (true) {
            try {
                zzbht zzbhtVar = (zzbht) this.zza.take();
                zzbhs zzc = zzbhtVar.zzc();
                if (!TextUtils.isEmpty(zzc.zza())) {
                    zzg(zzc(this.zzb, zzbhtVar.zze()), zzc);
                }
            } catch (InterruptedException e) {
                int i = o0.b;
                W5.p.g("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
