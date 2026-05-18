package Y1;

import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class z {
    public static /* bridge */ /* synthetic */ void a(CredentialManager credentialManager, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, OutcomeReceiver outcomeReceiver) {
        credentialManager.clearCredentialState(clearCredentialStateRequest, cancellationSignal, executor, outcomeReceiver);
    }
}
