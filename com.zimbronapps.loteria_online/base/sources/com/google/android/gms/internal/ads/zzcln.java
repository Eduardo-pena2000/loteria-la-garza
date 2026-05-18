package com.google.android.gms.internal.ads;

import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcln extends MutableContextWrapper {
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcln(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.zzc.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzb = applicationContext;
        this.zza = context instanceof Activity ? (Activity) context : null;
        this.zzc = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zza;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
        }
    }

    public final void zza(Intent intent, int i) {
        if (this.zza == null) {
            intent.setFlags(268435456);
            this.zzb.startActivity(intent);
            return;
        }
        String valueOf = String.valueOf(intent.getData());
        StringBuilder sb = new StringBuilder(valueOf.length() + 63);
        sb.append("Starting activity for result with intent: ");
        sb.append(valueOf);
        sb.append(" and requestCode: 236");
        o0.k(sb.toString());
        this.zza.startActivityForResult(intent, 236);
    }

    public final Activity zzb() {
        return this.zza;
    }

    public final Context zzc() {
        return this.zzc;
    }
}
