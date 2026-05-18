package com.google.android.gms.internal.firebase-auth-api;

import B7.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzagl {
    private static final Map zza = new a();
    private static final Map zzb = new a();

    private static String zza(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }

    public static String zzb(String str) {
        zzagk zzagkVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzagkVar = (zzagk) map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "www.googleapis.com/identitytoolkit/v3/relyingparty";
    }

    public static String zzc(String str) {
        zzagk zzagkVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzagkVar = (zzagk) map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "identitytoolkit.googleapis.com/v2";
    }

    public static String zzd(String str) {
        zzagk zzagkVar;
        String str2;
        Map map = zza;
        synchronized (map) {
            zzagkVar = (zzagk) map.get(str);
        }
        if (zzagkVar != null) {
            str2 = "" + zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":"));
        } else {
            str2 = "https://";
        }
        return str2 + "securetoken.googleapis.com/v1";
    }

    public static String zza(String str) {
        zzagk zzagkVar;
        Map map = zza;
        synchronized (map) {
            zzagkVar = (zzagk) map.get(str);
        }
        if (zzagkVar != null) {
            return zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(":")) + "emulator/auth/handler";
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    ((List) map.get(str)).add(new WeakReference(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(g gVar, String str, int i) {
        String b = gVar.r().b();
        Map map = zza;
        synchronized (map) {
            map.put(b, new zzagk(str, i));
        }
        Map map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(b)) {
                    Iterator it = ((List) map2.get(b)).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = (zzagn) ((WeakReference) it.next()).get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z = true;
                        }
                    }
                    if (!z) {
                        zza.remove(b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(g gVar) {
        return zza.containsKey(gVar.r().b());
    }
}
