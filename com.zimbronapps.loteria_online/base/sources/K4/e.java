package K4;

import android.app.job.JobInfo;
import android.net.NetworkRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ JobInfo.Builder a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        return builder.setRequiredNetwork(networkRequest);
    }
}
