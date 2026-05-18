package d2;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.jvm.internal.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Y1.g a;
    public final /* synthetic */ O b;

    public /* synthetic */ g(Y1.g gVar, O o) {
        this.a = gVar;
        this.b = o;
    }

    public final void run() {
        CredentialProviderPlayServicesImpl.d.a(this.a, this.b);
    }
}
