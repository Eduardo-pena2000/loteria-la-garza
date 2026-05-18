package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjl implements zzjh {
    private final AtomicBoolean zza = new AtomicBoolean();
    private HashMap zzb = null;
    private final HashMap zzc = new HashMap(16, 1.0f);
    private final HashMap zzd = new HashMap(16, 1.0f);
    private final HashMap zze = new HashMap(16, 1.0f);
    private final HashMap zzf = new HashMap(16, 1.0f);
    private Object zzg = null;
    private boolean zzh = false;
    private final String[] zzi = new String[0];

    public final String zza(ContentResolver contentResolver, String str, String str2) {
        String str3;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str4 = null;
                if (this.zzb == null) {
                    this.zza.set(false);
                    this.zzb = new HashMap(16, 1.0f);
                    this.zzg = new Object();
                    contentResolver.registerContentObserver(zzjg.zza, true, new zzjj(this, null));
                } else if (this.zza.getAndSet(false)) {
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd.clear();
                    this.zze.clear();
                    this.zzf.clear();
                    this.zzg = new Object();
                    this.zzh = false;
                }
                Object obj = this.zzg;
                if (this.zzb.containsKey(str)) {
                    String str5 = (String) this.zzb.get(str);
                    if (str5 != null) {
                        str4 = str5;
                    }
                    return str4;
                }
                try {
                    Uri uri = zzjg.zza;
                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (acquireUnstableContentProviderClient == null) {
                            throw new zzjk("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, new String[]{str}, (String) null);
                            try {
                                if (query == null) {
                                    throw new zzjk("ContentProvider query returned null cursor");
                                }
                                if (query.moveToFirst()) {
                                    str3 = query.getString(1);
                                    query.close();
                                } else {
                                    query.close();
                                    str3 = null;
                                }
                                if (str3 != null && str3.equals((Object) null)) {
                                    str3 = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.zzg) {
                                            this.zzb.put(str, str3);
                                        }
                                    } finally {
                                    }
                                }
                                if (str3 != null) {
                                    return str3;
                                }
                                return null;
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
                            throw new zzjk("ContentProvider query failed", e);
                        }
                    } finally {
                        acquireUnstableContentProviderClient.release();
                    }
                } catch (zzjk unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ AtomicBoolean zzb() {
        return this.zza;
    }
}
