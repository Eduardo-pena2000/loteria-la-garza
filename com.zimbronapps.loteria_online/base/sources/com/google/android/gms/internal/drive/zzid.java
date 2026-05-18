package com.google.android.gms.internal.drive;

import J6.a;
import K6.c;
import K6.g;
import K6.m;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import java.util.Arrays;
import w.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzid extends m {
    public static final g zzlc = new zzie();

    public zzid(int i) {
        super("customProperties", Arrays.asList(new String[]{"hasCustomProperties", "sqlId"}), Arrays.asList(new String[]{"customPropertiesExtra", "customPropertiesExtraHolder"}), 5000000);
    }

    private static void zzc(DataHolder dataHolder) {
        Bundle P1 = dataHolder.P1();
        if (P1 == null) {
            return;
        }
        synchronized (dataHolder) {
            try {
                DataHolder parcelable = P1.getParcelable("customPropertiesExtraHolder");
                if (parcelable != null) {
                    parcelable.close();
                    P1.remove("customPropertiesExtraHolder");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzd(DataHolder dataHolder) {
        zzc(dataHolder);
    }

    private static AppVisibleCustomProperties zzf(DataHolder dataHolder, int i, int i2) {
        Bundle P1 = dataHolder.P1();
        SparseArray sparseParcelableArray = P1.getSparseParcelableArray("customPropertiesExtra");
        if (sparseParcelableArray == null) {
            if (P1.getParcelable("customPropertiesExtraHolder") != null) {
                synchronized (dataHolder) {
                    DataHolder parcelable = dataHolder.P1().getParcelable("customPropertiesExtraHolder");
                    if (parcelable != null) {
                        try {
                            Bundle P12 = parcelable.P1();
                            String string = P12.getString("entryIdColumn");
                            String string2 = P12.getString("keyColumn");
                            String string3 = P12.getString("visibilityColumn");
                            String string4 = P12.getString("valueColumn");
                            x xVar = new x();
                            for (int i3 = 0; i3 < parcelable.getCount(); i3++) {
                                int S1 = parcelable.S1(i3);
                                long O1 = parcelable.O1(string, i3, S1);
                                String R1 = parcelable.R1(string2, i3, S1);
                                int N1 = parcelable.N1(string3, i3, S1);
                                c cVar = new c(new a(R1, N1), parcelable.R1(string4, i3, S1));
                                AppVisibleCustomProperties.a aVar = (AppVisibleCustomProperties.a) xVar.d(O1);
                                if (aVar == null) {
                                    aVar = new AppVisibleCustomProperties.a();
                                    xVar.h(O1, aVar);
                                }
                                aVar.a(cVar);
                            }
                            SparseArray sparseArray = new SparseArray();
                            for (int i4 = 0; i4 < dataHolder.getCount(); i4++) {
                                AppVisibleCustomProperties.a aVar2 = (AppVisibleCustomProperties.a) xVar.d(dataHolder.O1("sqlId", i4, dataHolder.S1(i4)));
                                if (aVar2 != null) {
                                    sparseArray.append(i4, aVar2.b());
                                }
                            }
                            dataHolder.P1().putSparseParcelableArray("customPropertiesExtra", sparseArray);
                            parcelable.close();
                            dataHolder.P1().remove("customPropertiesExtraHolder");
                        } catch (Throwable th) {
                            parcelable.close();
                            dataHolder.P1().remove("customPropertiesExtraHolder");
                            throw th;
                        }
                    }
                }
                sparseParcelableArray = P1.getSparseParcelableArray("customPropertiesExtra");
            }
            if (sparseParcelableArray == null) {
                return AppVisibleCustomProperties.b;
            }
        }
        return (AppVisibleCustomProperties) sparseParcelableArray.get(i, AppVisibleCustomProperties.b);
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        return zzf(dataHolder, i, i2);
    }
}
