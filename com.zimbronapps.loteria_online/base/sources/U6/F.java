package u6;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class f implements Continuation {
    public static final /* synthetic */ f a = new f();

    public final Object then(Task task) {
        Intent parcelable = ((Bundle) task.getResult()).getParcelable("notification_data");
        if (parcelable != null) {
            return new a(parcelable);
        }
        return null;
    }
}
