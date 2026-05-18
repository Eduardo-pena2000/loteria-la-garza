package com.unity3d.ads.core.data.datasource;

import Da.D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.recaptcha.internal.c;
import com.google.android.recaptcha.internal.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        t.g(context, "context");
        this.context = context;
    }

    public List fetchStores(List additionalStores) {
        t.g(additionalStores, "additionalStores");
        AndroidKnownStore[] values = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (AndroidKnownStore androidKnownStore : values) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List Z = D.Z(D.v0(arrayList, additionalStores));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : Z) {
            String str = (String) obj;
            try {
                if ((Build.VERSION.SDK_INT >= 33 ? d.a(packageManager, str, c.a(0L)) : packageManager.getPackageInfo(str, 0)) != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
