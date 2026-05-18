package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import h7.e;
import h7.j;
import h7.k;
import java.lang.reflect.InvocationTargetException;

@VisibleForTesting
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzz implements e {
    public final i flushLocations(h hVar) {
        return hVar.b(new zzq(this, hVar));
    }

    public final Location getLastLocation(h hVar) {
        String str;
        zzaz a = k.a(hVar);
        Context e = hVar.e();
        if (Build.VERSION.SDK_INT < 30 || e == null) {
            str = null;
        } else {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", (Class[]) null).invoke(e, (Object[]) null);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException unused) {
            }
        }
        try {
            return a.zzz(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(h hVar) {
        try {
            return k.a(hVar).zzA();
        } catch (Exception unused) {
            return null;
        }
    }

    public final i removeLocationUpdates(h hVar, PendingIntent pendingIntent) {
        return hVar.b(new zzw(this, hVar, pendingIntent));
    }

    public final i requestLocationUpdates(h hVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return hVar.b(new zzu(this, hVar, locationRequest, pendingIntent));
    }

    public final i setMockLocation(h hVar, Location location) {
        return hVar.b(new zzp(this, hVar, location));
    }

    public final i setMockMode(h hVar, boolean z) {
        return hVar.b(new zzo(this, hVar, z));
    }

    public final i removeLocationUpdates(h hVar, h7.i iVar) {
        return hVar.b(new zzn(this, hVar, iVar));
    }

    public final i requestLocationUpdates(h hVar, LocationRequest locationRequest, h7.i iVar, Looper looper) {
        return hVar.b(new zzt(this, hVar, locationRequest, iVar, looper));
    }

    public final i removeLocationUpdates(h hVar, j jVar) {
        return hVar.b(new zzv(this, hVar, jVar));
    }

    public final i requestLocationUpdates(h hVar, LocationRequest locationRequest, j jVar) {
        t.m(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return hVar.b(new zzr(this, hVar, locationRequest, jVar));
    }

    public final i requestLocationUpdates(h hVar, LocationRequest locationRequest, j jVar, Looper looper) {
        return hVar.b(new zzs(this, hVar, locationRequest, jVar, looper));
    }
}
