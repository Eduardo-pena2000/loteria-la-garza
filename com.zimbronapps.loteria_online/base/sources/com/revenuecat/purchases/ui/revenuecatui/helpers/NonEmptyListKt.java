package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.o;
import Da.D;
import Da.r;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class NonEmptyListKt {
    public static final /* synthetic */ Result flatten(NonEmptyList nonEmptyList) {
        t.g(nonEmptyList, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = nonEmptyList.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            if (result instanceof Result.Success) {
                if (arrayList2.isEmpty()) {
                    arrayList.add(((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList2.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = toNonEmptyListOrNull(arrayList2);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList);
        if (error instanceof Result.Success) {
            NonEmptyList nonEmptyListOrNull2 = toNonEmptyListOrNull((List) ((Result.Success) error).getValue());
            t.d(nonEmptyListOrNull2);
            return new Result.Success(nonEmptyListOrNull2);
        }
        if (error instanceof Result.Error) {
            return error;
        }
        throw new o();
    }

    public static final /* synthetic */ NonEmptyList nonEmptyListOf(Object obj, Object... t) {
        t.g(t, "t");
        return new NonEmptyList(obj, r.S0(t));
    }

    public static final /* synthetic */ NonEmptyList toNonEmptyListOrNull(Iterable iterable) {
        t.g(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return new NonEmptyList(it.next(), D.L0(new NonEmptyListKt$toNonEmptyListOrNull$$inlined$Iterable$1(it)));
        }
        return null;
    }
}
