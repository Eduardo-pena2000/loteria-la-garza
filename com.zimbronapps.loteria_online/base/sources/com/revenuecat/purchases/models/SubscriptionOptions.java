package com.revenuecat.purchases.models;

import Ca.q;
import Da.u;
import Ra.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionOptions implements List, a {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String RC_IGNORE_OFFER_TAG = "rc-ignore-offer";
    private final List subscriptionOptions;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public SubscriptionOptions(List list) {
        t.g(list, "subscriptionOptions");
        this.subscriptionOptions = list;
    }

    private final SubscriptionOption findLongestFreeTrial(List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase freePhase = subscriptionOption.getFreePhase();
            q qVar = freePhase != null ? new q(subscriptionOption, Integer.valueOf(billingPeriodToDays$purchases_defaultsBc8Release(freePhase.getBillingPeriod()))) : null;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((q) next).d()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((q) next2).d()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        q qVar2 = (q) next;
        if (qVar2 != null) {
            return (SubscriptionOption) qVar2.c();
        }
        return null;
    }

    private final SubscriptionOption findLowestNonFreeOffer(List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption subscriptionOption = (SubscriptionOption) it.next();
            PricingPhase introPhase = subscriptionOption.getIntroPhase();
            q qVar = introPhase != null ? new q(subscriptionOption, Long.valueOf(introPhase.getPrice().getAmountMicros())) : null;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long longValue = ((Number) ((q) next).d()).longValue();
                do {
                    Object next2 = it2.next();
                    long longValue2 = ((Number) ((q) next2).d()).longValue();
                    if (longValue > longValue2) {
                        next = next2;
                        longValue = longValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        q qVar2 = (q) next;
        if (qVar2 != null) {
            return (SubscriptionOption) qVar2.c();
        }
        return null;
    }

    public static /* synthetic */ void getDefaultOffer$annotations() {
    }

    public void add(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int billingPeriodToDays$purchases_defaultsBc8Release(Period period) {
        t.g(period, "period");
        Integer num = (Integer) SubscriptionOptionsKt.access$getDAYS_IN_UNIT$p().get(period.getUnit());
        return period.getValue() * (num != null ? num.intValue() : 0);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SubscriptionOption subscriptionOption) {
        t.g(subscriptionOption, "element");
        return this.subscriptionOptions.contains(subscriptionOption);
    }

    public boolean containsAll(Collection collection) {
        t.g(collection, "elements");
        return this.subscriptionOptions.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (t.c(SubscriptionOptions.class, obj != null ? obj.getClass() : null)) {
            return (obj instanceof SubscriptionOptions ? (SubscriptionOptions) obj : null) != null && t.c(u.e(this.subscriptionOptions), u.e(((SubscriptionOptions) obj).subscriptionOptions));
        }
        return false;
    }

    public SubscriptionOption get(int i) {
        return (SubscriptionOption) this.subscriptionOptions.get(i);
    }

    public final SubscriptionOption getBasePlan() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).isBasePlan()) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public final SubscriptionOption getDefaultOffer() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).isBasePlan()) {
                break;
            }
        }
        SubscriptionOption subscriptionOption = (SubscriptionOption) obj;
        if (subscriptionOption == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this) {
            if (!((SubscriptionOption) obj2).isBasePlan()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((SubscriptionOption) obj3).getTags().contains("rc-ignore-offer")) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (!((SubscriptionOption) obj4).getTags().contains("rc-customer-center")) {
                arrayList3.add(obj4);
            }
        }
        SubscriptionOption findLongestFreeTrial = findLongestFreeTrial(arrayList3);
        if (findLongestFreeTrial != null) {
            return findLongestFreeTrial;
        }
        SubscriptionOption findLowestNonFreeOffer = findLowestNonFreeOffer(arrayList3);
        return findLowestNonFreeOffer == null ? subscriptionOption : findLowestNonFreeOffer;
    }

    public final SubscriptionOption getFreeTrial() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).getFreePhase() != null) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public final SubscriptionOption getIntroOffer() {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SubscriptionOption) obj).getIntroPhase() != null) {
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    public int getSize() {
        return this.subscriptionOptions.size();
    }

    public int hashCode() {
        return u.e(this.subscriptionOptions).hashCode();
    }

    public int indexOf(SubscriptionOption subscriptionOption) {
        t.g(subscriptionOption, "element");
        return this.subscriptionOptions.indexOf(subscriptionOption);
    }

    public boolean isEmpty() {
        return this.subscriptionOptions.isEmpty();
    }

    public Iterator iterator() {
        return this.subscriptionOptions.iterator();
    }

    public int lastIndexOf(SubscriptionOption subscriptionOption) {
        t.g(subscriptionOption, "element");
        return this.subscriptionOptions.lastIndexOf(subscriptionOption);
    }

    public ListIterator listIterator() {
        return this.subscriptionOptions.listIterator();
    }

    public SubscriptionOption remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SubscriptionOption removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SubscriptionOption removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public SubscriptionOption set(int i, SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return this.subscriptionOptions.subList(i, i2);
    }

    public Object[] toArray() {
        return j.a(this);
    }

    public final List withTag(String str) {
        t.g(str, "tag");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this) {
            if (((SubscriptionOption) obj).getTags().contains(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return contains((SubscriptionOption) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return indexOf((SubscriptionOption) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SubscriptionOption) {
            return lastIndexOf((SubscriptionOption) obj);
        }
        return -1;
    }

    public ListIterator listIterator(int i) {
        return this.subscriptionOptions.listIterator(i);
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        t.g(objArr, "array");
        return j.b(this, objArr);
    }

    public boolean add(SubscriptionOption subscriptionOption) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
