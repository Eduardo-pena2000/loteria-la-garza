package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjr implements zzjv {
    private final ContentResolver zzc;
    private final Uri zzd;
    private final Runnable zze;
    private volatile Map zzi;
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    public static final String[] zza = {"key", "value"};
    private ContentObserver zzf = null;
    private volatile boolean zzg = true;
    private final Object zzh = new Object();
    private final List zzj = new ArrayList();

    private zzjr(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        m.j(contentResolver);
        m.j(uri);
        this.zzc = contentResolver;
        this.zzd = uri;
        this.zze = runnable;
    }

    public static zzjr zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzjr zzjrVar = (zzjr) zzb.computeIfAbsent(uri, new zzjq(contentResolver, uri, runnable));
        try {
            if (zzjrVar.zzg) {
                synchronized (zzjrVar) {
                    try {
                        if (zzjrVar.zzg) {
                            zzjo zzjoVar = new zzjo(zzjrVar, null);
                            zzjrVar.zzc.registerContentObserver(zzjrVar.zzd, false, zzjoVar);
                            zzjrVar.zzf = zzjoVar;
                            zzjrVar.zzg = false;
                        }
                    } finally {
                    }
                }
            }
            return zzjrVar;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void zzd() {
        Iterator it = zzb.values().iterator();
        while (it.hasNext()) {
            zzjr zzjrVar = (zzjr) it.next();
            synchronized (zzjrVar) {
                try {
                    if (zzjrVar.zzg) {
                        zzjrVar.zzg = false;
                    } else {
                        ContentObserver contentObserver = zzjrVar.zzf;
                        if (contentObserver != null) {
                            zzjrVar.zzc.unregisterContentObserver(contentObserver);
                            zzjrVar.zzf = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    public static /* synthetic */ zzjr zzf(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new zzjr(contentResolver, uri, runnable);
    }

    public final Map zzb() {
        Map emptyMap;
        Map map = this.zzi;
        if (map == null) {
            synchronized (this.zzh) {
                map = this.zzi;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            emptyMap = (Map) zzjv.zzh(new zzjp(this));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SecurityException | SQLiteException | IllegalStateException e) {
                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                        emptyMap = Collections.emptyMap();
                    }
                    this.zzi = emptyMap;
                    map = emptyMap;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void zzc() {
        synchronized (this.zzh) {
            this.zzi = null;
            this.zze.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((zzjs) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object zze(String str) {
        return (String) zzb().get(str);
    }

    public final /* synthetic */ Map zzg() {
        Map emptyMap;
        Cursor query;
        Map emptyMap2;
        ContentResolver contentResolver = this.zzc;
        Uri uri = this.zzd;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.emptyMap();
            }
            try {
                query = acquireUnstableContentProviderClient.query(uri, zza, (String) null, (String[]) null, (String) null);
                try {
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                emptyMap = Collections.emptyMap();
            }
            if (query == null) {
                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                emptyMap = Collections.emptyMap();
                acquireUnstableContentProviderClient.release();
                return emptyMap;
            }
            int count = query.getCount();
            if (count == 0) {
                emptyMap2 = Collections.emptyMap();
            } else {
                w.a aVar = count <= 256 ? new w.a(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    aVar.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return aVar;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                emptyMap2 = Collections.emptyMap();
            }
            query.close();
            acquireUnstableContentProviderClient.release();
            return emptyMap2;
        } catch (Throwable th3) {
            acquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
