package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzasn implements zzarr {
    protected final zzasp zza;
    private final zzasm zzb;

    public zzasn(zzasm zzasmVar) {
        zzasp zzaspVar = new zzasp(4096);
        this.zzb = zzasmVar;
        this.zza = zzaspVar;
    }

    public zzaru zza(zzary zzaryVar) throws zzash {
        byte[] bArr;
        zzash zzartVar;
        String str;
        int zzo;
        Map map;
        zzasw zza;
        int zza2;
        List zzb;
        byte[] bArr2;
        zzasp zzaspVar;
        zzata zzataVar;
        byte[] bArr3;
        byte[] byteArray;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzasw zzaswVar = null;
            try {
                zzarh zzk = zzaryVar.zzk();
                if (zzk == null) {
                    map = Collections.emptyMap();
                } else {
                    Map hashMap = new HashMap();
                    String str2 = zzk.zzb;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j = zzk.zzd;
                    if (j > 0) {
                        hashMap.put("If-Modified-Since", zzasv.zzc(j));
                    }
                    map = hashMap;
                }
                zza = this.zzb.zza(zzaryVar, map);
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
            try {
                zza2 = zza.zza();
                zzb = zza.zzb();
                if (zza2 == 304) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    zzarh zzk2 = zzaryVar.zzk();
                    if (zzk2 == null) {
                        return new zzaru(304, (byte[]) null, true, elapsedRealtime2, zzb);
                    }
                    TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if (!zzb.isEmpty()) {
                        Iterator it = zzb.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((zzarq) it.next()).zza());
                        }
                    }
                    ArrayList arrayList = new ArrayList(zzb);
                    List list = zzk2.zzh;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (zzarq zzarqVar : zzk2.zzh) {
                                if (!treeSet.contains(zzarqVar.zza())) {
                                    arrayList.add(zzarqVar);
                                }
                            }
                        }
                    } else if (!zzk2.zzg.isEmpty()) {
                        for (Map.Entry entry : zzk2.zzg.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new zzaru(304, zzk2.zza, true, elapsedRealtime2, (List) arrayList);
                }
                InputStream zzd = zza.zzd();
                if (zzd == null) {
                    bArr2 = new byte[0];
                    break;
                }
                int zzc = zza.zzc();
                zzaspVar = this.zza;
                zzataVar = new zzata(zzaspVar, zzc);
                try {
                    bArr3 = zzaspVar.zza(1024);
                    while (true) {
                        try {
                            int read = zzd.read(bArr3);
                            if (read == -1) {
                                break;
                            }
                            zzataVar.write(bArr3, 0, read);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                zzd.close();
                                break;
                            } catch (IOException unused) {
                                zzask.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaspVar.zzb(bArr3);
                            zzataVar.close();
                            throw th;
                        }
                    }
                    byteArray = zzataVar.toByteArray();
                    try {
                        zzd.close();
                        break;
                    } catch (IOException unused2) {
                        zzask.zza("Error occurred when closing InputStream", new Object[0]);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bArr3 = null;
                }
            } catch (IOException e2) {
                e = e2;
                bArr = null;
                zzaswVar = zza;
                if (e instanceof SocketTimeoutException) {
                    zzartVar = new zzasg();
                    str = "socket";
                } else {
                    if (e instanceof MalformedURLException) {
                        throw new RuntimeException("Bad URL ".concat(String.valueOf(zzaryVar.zzh())), e);
                    }
                    if (zzaswVar == null) {
                        throw new zzarv(e);
                    }
                    int zza3 = zzaswVar.zza();
                    zzask.zzc("Unexpected response code %d for %s", Integer.valueOf(zza3), zzaryVar.zzh());
                    if (bArr != null) {
                        zzaru zzaruVar = new zzaru(zza3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzaswVar.zzb());
                        if (zza3 != 401 && zza3 != 403) {
                            if (zza3 < 400 || zza3 > 499) {
                                throw new zzasf(zzaruVar);
                            }
                            throw new zzarl(zzaruVar);
                        }
                        zzartVar = new zzarg(zzaruVar);
                        str = "auth";
                    } else {
                        zzartVar = new zzart();
                        str = "network";
                    }
                }
                zzarm zzy = zzaryVar.zzy();
                zzo = zzaryVar.zzo();
                try {
                    zzy.zzc(zzartVar);
                    zzaryVar.zzc(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(zzo)}));
                } catch (zzash e3) {
                    zzaryVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(zzo)}));
                    throw e3;
                }
            }
            zzaryVar.zzc(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(zzo)}));
        }
        zzaspVar.zzb(bArr3);
        zzataVar.close();
        bArr2 = byteArray;
        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (zzask.zzb || elapsedRealtime3 > 3000) {
            zzask.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzaryVar, Long.valueOf(elapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(zza2), Integer.valueOf(zzaryVar.zzy().zzb()));
        }
        if (zza2 < 200 || zza2 > 299) {
            throw new IOException();
        }
        return new zzaru(zza2, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
    }
}
