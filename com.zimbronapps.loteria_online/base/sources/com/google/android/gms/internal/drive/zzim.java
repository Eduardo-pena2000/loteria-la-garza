package com.google.android.gms.internal.drive;

import K6.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzim extends m {
    public static final zzim zzlj = new zzim();

    private zzim() {
        super("driveId", Arrays.asList(new String[]{"sqlId", "resourceId", "mimeType"}), Arrays.asList(new String[]{"dbInstanceId"}), 4100000);
    }

    public final boolean zzb(DataHolder dataHolder, int i, int i2) {
        Iterator it = zzaz().iterator();
        while (it.hasNext()) {
            if (!dataHolder.T1((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        long j = dataHolder.P1().getLong("dbInstanceId");
        boolean equals = "application/vnd.google-apps.folder".equals(dataHolder.R1(zzhs.zzki.getName(), i, i2));
        String R1 = dataHolder.R1("resourceId", i, i2);
        return new DriveId("generated-android-null".equals(R1) ? null : R1, dataHolder.O1("sqlId", i, i2), j, equals ? 1 : 0);
    }
}
