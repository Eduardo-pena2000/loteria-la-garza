package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.I;
import Ca.o;
import Ca.q;
import Ca.x;
import Da.v;
import Da.w;
import Qa.l;
import Qa.p;
import Qa.r;
import Qa.s;
import Qa.u;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ResultKt {
    public static final /* synthetic */ List access$collectErrors(List list) {
        return collectErrors(list);
    }

    private static final List collectErrors(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            Result.Error error = result instanceof Result.Error ? (Result.Error) result : null;
            NonEmptyList nonEmptyList = error != null ? (NonEmptyList) error.getValue() : null;
            if (nonEmptyList != null) {
                arrayList.add(nonEmptyList);
            }
        }
        return w.A(arrayList);
    }

    public static final /* synthetic */ Result errorIfNull(Object obj, Object obj2) {
        return obj != null ? new Result.Success(obj) : new Result.Error(obj2);
    }

    public static final /* synthetic */ Object errorOrNull(Result result) {
        t.g(result, "<this>");
        if (result instanceof Result.Success) {
            return null;
        }
        if (result instanceof Result.Error) {
            return ((Result.Error) result).getValue();
        }
        throw new o();
    }

    public static final /* synthetic */ Result flatMap(Result result, l transform) {
        t.g(result, "<this>");
        t.g(transform, "transform");
        if (result instanceof Result.Success) {
            return (Result) transform.invoke(((Result.Success) result).getValue());
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new o();
    }

    public static final /* synthetic */ Result flatMapError(Result result, l transform) {
        t.g(result, "<this>");
        t.g(transform, "transform");
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Error) {
            return (Result) transform.invoke(((Result.Error) result).getValue());
        }
        throw new o();
    }

    public static final /* synthetic */ Object getOrElse(Result result, l onFailure) {
        t.g(result, "<this>");
        t.g(onFailure, "onFailure");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return onFailure.invoke(((Result.Error) result).getValue());
        }
        throw new o();
    }

    public static final /* synthetic */ Object getOrNull(Result result) {
        t.g(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return null;
        }
        throw new o();
    }

    public static final /* synthetic */ Object getOrThrow(Result result) {
        t.g(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (!(result instanceof Result.Error)) {
            throw new o();
        }
        Result.Error error = (Result.Error) result;
        if (error.getValue() instanceof Throwable) {
            throw ((Throwable) error.getValue());
        }
        throw new IllegalStateException(("Result was unsuccessful: " + error.getValue()).toString());
    }

    public static final /* synthetic */ boolean isError(Result result) {
        t.g(result, "<this>");
        return result instanceof Result.Error;
    }

    public static final /* synthetic */ boolean isSuccess(Result result) {
        t.g(result, "<this>");
        return result instanceof Result.Success;
    }

    public static final /* synthetic */ Result map(Result result, l transform) {
        t.g(result, "<this>");
        t.g(transform, "transform");
        if (result instanceof Result.Success) {
            return new Result.Success(transform.invoke(((Result.Success) result).getValue()));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new o();
    }

    public static final /* synthetic */ Result mapError(Result result, l transform) {
        t.g(result, "<this>");
        t.g(transform, "transform");
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Error) {
            return new Result.Error(transform.invoke(((Result.Error) result).getValue()));
        }
        throw new o();
    }

    public static final /* synthetic */ Result mapOrAccumulate(Iterable iterable, l transform) {
        t.g(iterable, "<this>");
        t.g(transform, "transform");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            if (result instanceof Result.Success) {
                if (arrayList2.isEmpty()) {
                    arrayList.add(transform.invoke(((Result.Success) result).getValue()));
                }
            } else if (result instanceof Result.Error) {
                arrayList2.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList2);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList);
    }

    public static final /* synthetic */ Result mapValuesOrAccumulate(Map map, l transform) {
        t.g(map, "<this>");
        t.g(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Result result = (Result) entry.getValue();
            if (result instanceof Result.Success) {
                if (arrayList.isEmpty()) {
                    linkedHashMap.put(key, transform.invoke(((Result.Success) result).getValue()));
                }
            } else if (result instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(linkedHashMap);
    }

    public static final /* synthetic */ Result onError(Result result, l block) {
        t.g(result, "<this>");
        t.g(block, "block");
        if (!(result instanceof Result.Success) && (result instanceof Result.Error)) {
            block.invoke(((Result.Error) result).getValue());
        }
        return result;
    }

    public static final /* synthetic */ Result orSuccessfullyNull(Result result) {
        return result == null ? new Result.Success(null) : result;
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, p transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(transform, "transform");
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        Result.Success success4 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        return new Result.Success(transform.invoke(value, value2));
    }

    public static final /* synthetic */ Result mapValuesOrAccumulate(NonEmptyMap nonEmptyMap, l transform) {
        t.g(nonEmptyMap, "<this>");
        t.g(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result result = (Result) nonEmptyMap.getEntry().getValue();
        if (result instanceof Result.Success) {
            result = new Result.Success(transform.invoke(((Result.Success) result).getValue()));
        } else if (!(result instanceof Result.Error)) {
            throw new o();
        }
        if (result instanceof Result.Success) {
            result = new Result.Success(x.a(nonEmptyMap.getEntry().getKey(), ((Result.Success) result).getValue()));
        } else if (!(result instanceof Result.Error)) {
            throw new o();
        }
        if (!(result instanceof Result.Success) && (result instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) result).getValue());
        }
        for (Map.Entry entry : nonEmptyMap.entrySet()) {
            Object key = entry.getKey();
            Result result2 = (Result) entry.getValue();
            if (result2 instanceof Result.Success) {
                if (arrayList.isEmpty() && !t.c(key, nonEmptyMap.getEntry().getKey())) {
                    linkedHashMap.put(key, transform.invoke(((Result.Success) result2).getValue()));
                }
            } else if (result2 instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) result2).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(NonEmptyMapKt.nonEmptyMapOf((q) getOrThrow(result), (Map) linkedHashMap));
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, Result third, Qa.q transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(third, "third");
        t.g(transform, "transform");
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, third, success, success2, success3)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = success.getValue();
        Object value5 = success2.getValue();
        return new Result.Success(transform.invoke(value, value2, value3));
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, Result third, Result fourth, r transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(third, "third");
        t.g(fourth, "fourth");
        t.g(transform, "transform");
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, third, fourth, success, success2)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = ((Result.Success) fourth).getValue();
        Object value5 = success.getValue();
        return new Result.Success(transform.invoke(value, value2, value3, value4));
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, Result third, Result fourth, Result fifth, s transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(third, "third");
        t.g(fourth, "fourth");
        t.g(fifth, "fifth");
        t.g(transform, "transform");
        Result.Success success = new Result.Success(I.a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, third, fourth, fifth, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = ((Result.Success) fourth).getValue();
        Object value5 = ((Result.Success) fifth).getValue();
        return new Result.Success(transform.invoke(value, value2, value3, value4, value5));
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, Result third, Result fourth, Result fifth, Result sixth, Qa.t transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(third, "third");
        t.g(fourth, "fourth");
        t.g(fifth, "fifth");
        t.g(sixth, "sixth");
        t.g(transform, "transform");
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, third, fourth, fifth, sixth)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(transform.invoke(((Result.Success) first).getValue(), ((Result.Success) second).getValue(), ((Result.Success) third).getValue(), ((Result.Success) fourth).getValue(), ((Result.Success) fifth).getValue(), ((Result.Success) sixth).getValue()));
    }

    public static final /* synthetic */ Result zipOrAccumulate(Result first, Result second, Result third, Result fourth, Result fifth, Result sixth, Result seventh, u transform) {
        t.g(first, "first");
        t.g(second, "second");
        t.g(third, "third");
        t.g(fourth, "fourth");
        t.g(fifth, "fifth");
        t.g(sixth, "sixth");
        t.g(seventh, "seventh");
        t.g(transform, "transform");
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(access$collectErrors(v.q(first, second, third, fourth, fifth, sixth)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(transform.d(((Result.Success) first).getValue(), ((Result.Success) second).getValue(), ((Result.Success) third).getValue(), ((Result.Success) fourth).getValue(), ((Result.Success) fifth).getValue(), ((Result.Success) sixth).getValue(), ((Result.Success) seventh).getValue()));
    }
}
