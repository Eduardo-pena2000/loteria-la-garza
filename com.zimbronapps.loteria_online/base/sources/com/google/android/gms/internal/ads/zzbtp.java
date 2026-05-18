package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtp extends zzbts {
    public final zzbtw zzb(String str) throws RemoteException {
        zzbuu zzbuuVar;
        try {
            try {
                Class cls = Class.forName(str, false, zzbtp.class.getClassLoader());
                if (Y5.g.class.isAssignableFrom(cls)) {
                    return new zzbuu((Y5.g) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                }
                if (Y5.a.class.isAssignableFrom(cls)) {
                    return new zzbuu((Y5.a) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                W5.p.f(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                W5.p.a("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbuuVar = new zzbuu(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                zzbuuVar = new zzbuu(new AdMobAdapter());
                return zzbuuVar;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            W5.p.g(sb2.toString(), th);
            throw new RemoteException();
        }
    }

    public final boolean zzc(String str) throws RemoteException {
        try {
            return Z5.a.class.isAssignableFrom(Class.forName(str, false, zzbtp.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            W5.p.f(sb.toString());
            return false;
        }
    }

    public final boolean zzd(String str) throws RemoteException {
        try {
            return Y5.a.class.isAssignableFrom(Class.forName(str, false, zzbtp.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            W5.p.f(sb.toString());
            return false;
        }
    }

    public final zzbvs zze(String str) throws RemoteException {
        return new zzbwf((RtbAdapter) Class.forName(str, false, zzbvw.class.getClassLoader()).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
    }
}
