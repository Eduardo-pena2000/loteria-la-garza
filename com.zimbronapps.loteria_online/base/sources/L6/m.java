package l6;

import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface m {
    Task beginSignIn(c cVar);

    n getSignInCredentialFromIntent(Intent intent);

    Task getSignInIntent(h hVar);

    Task signOut();
}
