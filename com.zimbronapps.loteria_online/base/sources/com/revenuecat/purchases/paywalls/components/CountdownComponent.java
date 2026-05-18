package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import java.lang.annotation.Annotation;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import rb.d;
import sb.A;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CountdownComponent implements PaywallComponent {
    private final CountFrom countFrom;
    private final StackComponent countdownStack;
    private final StackComponent endStack;
    private final StackComponent fallback;
    private final CountdownStyle style;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, CountFrom.Companion.serializer(), null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return CountdownComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public enum CountFrom {
        DAYS,
        HOURS,
        MINUTES;

        public static final Companion Companion = new Companion(null);
        private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

        public static final class Companion {

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.CountdownComponent.CountFrom", CountFrom.values(), new String[]{"days", "hours", "minutes"}, new Annotation[][]{null, null, null}, (Annotation[]) null);
                }
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) CountFrom.access$get$cachedSerializer$delegate$cp().getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
            return $cachedSerializer$delegate;
        }
    }

    @InternalRevenueCatAPI
    public static final class CountdownStyle {
        public static final Companion Companion = new Companion(null);
        private final Date date;
        private final String type;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CountdownComponent$CountdownStyle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ CountdownStyle(int i, String str, Date date, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, CountdownComponent$CountdownStyle$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            this.date = date;
        }

        public static /* synthetic */ void getDate$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CountdownStyle countdownStyle, d dVar, qb.e eVar) {
            dVar.v(eVar, 0, countdownStyle.type);
            dVar.k(eVar, 1, ISO8601DateSerializer.INSTANCE, countdownStyle.date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountdownStyle)) {
                return false;
            }
            CountdownStyle countdownStyle = (CountdownStyle) obj;
            return t.c(this.type, countdownStyle.type) && t.c(this.date, countdownStyle.date);
        }

        public final /* synthetic */ Date getDate() {
            return this.date;
        }

        public final /* synthetic */ String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CountdownStyle(type=" + this.type + ", date=" + this.date + ')';
        }

        public CountdownStyle(String str, Date date) {
            t.g(str, "type");
            t.g(date, "date");
            this.type = str;
            this.date = date;
        }
    }

    @e
    public /* synthetic */ CountdownComponent(int i, CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, t0 t0Var) {
        if (5 != (i & 5)) {
            f0.a(i, 5, CountdownComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.style = countdownStyle;
        if ((i & 2) == 0) {
            this.countFrom = CountFrom.DAYS;
        } else {
            this.countFrom = countFrom;
        }
        this.countdownStack = stackComponent;
        if ((i & 8) == 0) {
            this.endStack = null;
        } else {
            this.endStack = stackComponent2;
        }
        if ((i & 16) == 0) {
            this.fallback = null;
        } else {
            this.fallback = stackComponent3;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getCountFrom$annotations() {
    }

    public static /* synthetic */ void getCountdownStack$annotations() {
    }

    public static /* synthetic */ void getEndStack$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CountdownComponent countdownComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, CountdownComponent$CountdownStyle$$serializer.INSTANCE, countdownComponent.style);
        if (dVar.e(eVar, 1) || countdownComponent.countFrom != CountFrom.DAYS) {
            dVar.k(eVar, 1, kVarArr[1], countdownComponent.countFrom);
        }
        StackComponent$$serializer stackComponent$$serializer = StackComponent$$serializer.INSTANCE;
        dVar.k(eVar, 2, stackComponent$$serializer, countdownComponent.countdownStack);
        if (dVar.e(eVar, 3) || countdownComponent.endStack != null) {
            dVar.j(eVar, 3, stackComponent$$serializer, countdownComponent.endStack);
        }
        if (!dVar.e(eVar, 4) && countdownComponent.fallback == null) {
            return;
        }
        dVar.j(eVar, 4, stackComponent$$serializer, countdownComponent.fallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownComponent)) {
            return false;
        }
        CountdownComponent countdownComponent = (CountdownComponent) obj;
        return t.c(this.style, countdownComponent.style) && this.countFrom == countdownComponent.countFrom && t.c(this.countdownStack, countdownComponent.countdownStack) && t.c(this.endStack, countdownComponent.endStack) && t.c(this.fallback, countdownComponent.fallback);
    }

    public final /* synthetic */ CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ StackComponent getCountdownStack() {
        return this.countdownStack;
    }

    public final /* synthetic */ StackComponent getEndStack() {
        return this.endStack;
    }

    public final /* synthetic */ StackComponent getFallback() {
        return this.fallback;
    }

    public final /* synthetic */ CountdownStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int hashCode = ((((this.style.hashCode() * 31) + this.countFrom.hashCode()) * 31) + this.countdownStack.hashCode()) * 31;
        StackComponent stackComponent = this.endStack;
        int hashCode2 = (hashCode + (stackComponent == null ? 0 : stackComponent.hashCode())) * 31;
        StackComponent stackComponent2 = this.fallback;
        return hashCode2 + (stackComponent2 != null ? stackComponent2.hashCode() : 0);
    }

    public String toString() {
        return "CountdownComponent(style=" + this.style + ", countFrom=" + this.countFrom + ", countdownStack=" + this.countdownStack + ", endStack=" + this.endStack + ", fallback=" + this.fallback + ')';
    }

    public CountdownComponent(CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3) {
        t.g(countdownStyle, "style");
        t.g(countFrom, "countFrom");
        t.g(stackComponent, "countdownStack");
        this.style = countdownStyle;
        this.countFrom = countFrom;
        this.countdownStack = stackComponent;
        this.endStack = stackComponent2;
        this.fallback = stackComponent3;
    }

    public /* synthetic */ CountdownComponent(CountdownStyle countdownStyle, CountFrom countFrom, StackComponent stackComponent, StackComponent stackComponent2, StackComponent stackComponent3, int i, k kVar) {
        this(countdownStyle, (i & 2) != 0 ? CountFrom.DAYS : countFrom, stackComponent, (i & 8) != 0 ? null : stackComponent2, (i & 16) != 0 ? null : stackComponent3);
    }
}
