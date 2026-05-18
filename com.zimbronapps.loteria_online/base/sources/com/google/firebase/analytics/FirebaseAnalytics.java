package com.google.firebase.analytics;

import E7.c;
import E7.d;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k7.c5;
import m8.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final zzfb a;
    public ExecutorService b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(zzfb zzfbVar) {
        t.l(zzfbVar);
        this.a = zzfbVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(zzfb.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return c;
    }

    @Keep
    public static c5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzfb zza = zzfb.zza(context, bundle);
        if (zza == null) {
            return null;
        }
        return new d(zza);
    }

    public Task a() {
        try {
            return Tasks.call(l(), new E7.b(this));
        } catch (RuntimeException e) {
            this.a.zzD(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public Task b() {
        try {
            return Tasks.call(l(), new c(this));
        } catch (RuntimeException e) {
            this.a.zzD(5, "Failed to schedule task for getSessionId", null, null, null);
            return Tasks.forException(e);
        }
    }

    public void c(String str, Bundle bundle) {
        this.a.zzh(str, bundle);
    }

    public void d() {
        this.a.zzs();
    }

    public void e(boolean z) {
        this.a.zzq(Boolean.valueOf(z));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.a.zzr(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.a.zzL(bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(g.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public void h(long j) {
        this.a.zzt(j);
    }

    public void i(String str) {
        this.a.zzo(str);
    }

    public void j(String str, String str2) {
        this.a.zzk(null, str, str2, false);
    }

    public final /* synthetic */ zzfb k() {
        return this.a;
    }

    public final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.b == null) {
                    this.b = new E7.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.zzp(zzdf.zza(activity), str, str2);
    }
}
