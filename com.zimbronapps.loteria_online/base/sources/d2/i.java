package d2;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ Y1.g a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ i(Y1.g gVar, Exception exc) {
        this.a = gVar;
        this.b = exc;
    }

    public final void run() {
        CredentialProviderPlayServicesImpl.f.a(this.a, this.b);
    }
}
