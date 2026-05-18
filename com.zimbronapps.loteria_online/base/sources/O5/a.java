package o5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean a(Context context, Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        return context.bindService(intent, i, executor, serviceConnection);
    }
}
