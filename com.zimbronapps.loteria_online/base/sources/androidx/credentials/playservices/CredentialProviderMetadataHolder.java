package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final a a = new a();

    public final class a extends Binder {
        public a() {
        }
    }

    public IBinder onBind(Intent intent) {
        t.g(intent, "intent");
        return this.a;
    }
}
