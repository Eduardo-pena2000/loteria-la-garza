package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzasl implements zzarx {
    private final Map zza = new HashMap();
    private final zzark zzb;
    private final BlockingQueue zzc;
    private final zzarp zzd;

    public zzasl(zzark zzarkVar, BlockingQueue blockingQueue, zzarp zzarpVar) {
        this.zzd = zzarpVar;
        this.zzb = zzarkVar;
        this.zzc = blockingQueue;
    }

    public final void zza(zzary zzaryVar, zzase zzaseVar) {
        List list;
        zzarh zzarhVar = zzaseVar.zzb;
        if (zzarhVar == null || zzarhVar.zza(System.currentTimeMillis())) {
            zzb(zzaryVar);
            return;
        }
        String zzi = zzaryVar.zzi();
        synchronized (this) {
            list = (List) this.zza.remove(zzi);
        }
        if (list != null) {
            if (zzask.zzb) {
                zzask.zza("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzi);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zza((zzary) it.next(), zzaseVar, null);
            }
        }
    }

    public final synchronized void zzb(zzary zzaryVar) {
        try {
            Map map = this.zza;
            String zzi = zzaryVar.zzi();
            List list = (List) map.remove(zzi);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzask.zzb) {
                zzask.zza("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzi);
            }
            zzary zzaryVar2 = (zzary) list.remove(0);
            map.put(zzi, list);
            zzaryVar2.zzu(this);
            try {
                this.zzc.put(zzaryVar2);
            } catch (InterruptedException e) {
                zzask.zzc("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzc(zzary zzaryVar) {
        try {
            Map map = this.zza;
            String zzi = zzaryVar.zzi();
            if (!map.containsKey(zzi)) {
                map.put(zzi, (Object) null);
                zzaryVar.zzu(this);
                if (zzask.zzb) {
                    zzask.zzb("new request, sending to network %s", zzi);
                }
                return false;
            }
            ArrayList arrayList = (List) map.get(zzi);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzaryVar.zzc("waiting-for-response");
            arrayList.add(zzaryVar);
            map.put(zzi, arrayList);
            if (zzask.zzb) {
                zzask.zzb("Request for cacheKey=%s is in flight, putting on hold.", zzi);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
