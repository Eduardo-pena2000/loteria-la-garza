package com.google.android.gms.internal.drive;

import K6.l;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhz extends l {
    public zzhz(int i) {
        super("spaces", Arrays.asList(new String[]{"inDriveSpace", "isAppData", "inGooglePhotosSpace"}), Collections.emptySet(), 7000000);
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzd(dataHolder, i, i2);
    }

    public final Collection zzd(DataHolder dataHolder, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (dataHolder.M1("inDriveSpace", i, i2)) {
            arrayList.add(DriveSpace.b);
        }
        if (dataHolder.M1("isAppData", i, i2)) {
            arrayList.add(DriveSpace.c);
        }
        if (dataHolder.M1("inGooglePhotosSpace", i, i2)) {
            arrayList.add(DriveSpace.d);
        }
        return arrayList;
    }
}
