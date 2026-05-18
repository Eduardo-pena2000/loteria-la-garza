package l6;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface a {
    Task authorize(AuthorizationRequest authorizationRequest);

    Task clearToken(ClearTokenRequest clearTokenRequest);

    b getAuthorizationResultFromIntent(Intent intent);

    Task revokeAccess(RevokeAccessRequest revokeAccessRequest);
}
