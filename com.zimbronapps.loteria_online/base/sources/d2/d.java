package d2;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class d implements OnFailureListener {
    public final /* synthetic */ CredentialProviderPlayServicesImpl a;
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Y1.g d;

    public /* synthetic */ d(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        this.a = credentialProviderPlayServicesImpl;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = gVar;
    }

    public final void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.$r8$lambda$EEPRZu6PiJcReImfv141-6oqzqk(this.a, this.b, this.c, this.d, exc);
    }
}
