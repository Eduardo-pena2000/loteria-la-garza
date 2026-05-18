package r7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements ServiceConnection {
    public final /* synthetic */ f a;

    public /* synthetic */ e(f fVar, d dVar) {
        this.a = fVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f.f(this.a).d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.a.c().post(new b(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        f.f(this.a).d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.a.c().post(new c(this));
    }
}
