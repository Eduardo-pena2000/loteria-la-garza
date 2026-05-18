package K6;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o extends l implements J6.c {
    public static final g a = new p();

    public o(int i) {
        super("parents", Collections.emptySet(), Arrays.asList(new String[]{"parentsExtra", "dbInstanceId", "parentsExtraHolder"}), 4100000);
    }

    public final /* synthetic */ Object zzb(Bundle bundle) {
        return zzb(bundle);
    }

    public final Collection zzc(Bundle bundle) {
        Collection zzb = super.zzb(bundle);
        if (zzb == null) {
            return null;
        }
        return new HashSet(zzb);
    }

    public final Collection zzd(DataHolder dataHolder, int i, int i2) {
        Bundle P1 = dataHolder.P1();
        ArrayList parcelableArrayList = P1.getParcelableArrayList("parentsExtra");
        if (parcelableArrayList == null) {
            if (P1.getParcelable("parentsExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder dataHolder2 = (DataHolder) dataHolder.P1().getParcelable("parentsExtraHolder");
                    if (dataHolder2 != null) {
                        try {
                            int count = dataHolder.getCount();
                            ArrayList arrayList = new ArrayList(count);
                            HashMap hashMap = new HashMap(count);
                            for (int i3 = 0; i3 < count; i3++) {
                                int S1 = dataHolder.S1(i3);
                                ParentDriveIdSet parentDriveIdSet = new ParentDriveIdSet();
                                arrayList.add(parentDriveIdSet);
                                hashMap.put(Long.valueOf(dataHolder.O1("sqlId", i3, S1)), parentDriveIdSet);
                            }
                            Bundle P12 = dataHolder2.P1();
                            String string = P12.getString("childSqlIdColumn");
                            String string2 = P12.getString("parentSqlIdColumn");
                            String string3 = P12.getString("parentResIdColumn");
                            int count2 = dataHolder2.getCount();
                            for (int i4 = 0; i4 < count2; i4++) {
                                int S12 = dataHolder2.S1(i4);
                                ((ParentDriveIdSet) hashMap.get(Long.valueOf(dataHolder2.O1(string, i4, S12)))).a.add(new q(dataHolder2.R1(string3, i4, S12), dataHolder2.O1(string2, i4, S12), 1));
                            }
                            dataHolder.P1().putParcelableArrayList("parentsExtra", arrayList);
                            dataHolder2.close();
                            dataHolder.P1().remove("parentsExtraHolder");
                        } catch (Throwable th) {
                            dataHolder2.close();
                            dataHolder.P1().remove("parentsExtraHolder");
                            throw th;
                        }
                    }
                }
                parcelableArrayList = P1.getParcelableArrayList("parentsExtra");
            }
            if (parcelableArrayList == null) {
                return null;
            }
        }
        long j = P1.getLong("dbInstanceId");
        ParentDriveIdSet parentDriveIdSet2 = (ParentDriveIdSet) parcelableArrayList.get(i);
        HashSet hashSet = new HashSet();
        for (q qVar : parentDriveIdSet2.a) {
            hashSet.add(new DriveId(qVar.a, qVar.b, j, qVar.c));
        }
        return hashSet;
    }

    public static void zzc(DataHolder dataHolder) {
        Bundle P1 = dataHolder.P1();
        if (P1 == null) {
            return;
        }
        synchronized (dataHolder) {
            try {
                DataHolder dataHolder2 = (DataHolder) P1.getParcelable("parentsExtraHolder");
                if (dataHolder2 != null) {
                    dataHolder2.close();
                    P1.remove("parentsExtraHolder");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzd(dataHolder, i, i2);
    }

    public static /* synthetic */ void zzd(DataHolder dataHolder) {
        zzc(dataHolder);
    }
}
