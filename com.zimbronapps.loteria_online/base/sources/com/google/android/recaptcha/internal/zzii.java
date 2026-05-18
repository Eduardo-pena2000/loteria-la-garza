package com.google.android.recaptcha.internal;

import Ca.q;
import Ca.x;
import Da.S;
import android.content.Context;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = S.l(new q[]{x.a(2, Context.ACTIVITY_SERVICE), x.a(3, Context.TELEPHONY_SERVICE), x.a(4, Context.INPUT_METHOD_SERVICE), x.a(5, Context.AUDIO_SERVICE)});

    public zzii(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
