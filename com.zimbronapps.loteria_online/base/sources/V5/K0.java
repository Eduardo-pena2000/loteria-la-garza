package V5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbhe;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k0 {
    public boolean d;
    public Context e;
    public boolean c = false;
    public final Map b = new WeakHashMap();
    public final BroadcastReceiver a = new j0(this);

    public final synchronized void a(Context context) {
        try {
            if (this.c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            if (applicationContext == null) {
                this.e = context;
            }
            zzbhe.zza(this.e);
            this.d = ((Boolean) S5.D.c().zzd(zzbhe.zzeI)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.e.registerReceiver(this.a, intentFilter);
            } else {
                o5.p.a(this.e, this.a, intentFilter, 4);
            }
            this.c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbhe.zza(context);
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            o5.p.a(context, broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(Context context, Intent intent) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
