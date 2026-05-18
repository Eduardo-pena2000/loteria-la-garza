package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallAnimation {
    public static final Companion Companion = new Companion(null);
    private final int msDelay;
    private final int msDuration;
    private final AnimationType type;

    public enum AnimationType {
        EASE_IN,
        EASE_OUT,
        EASE_IN_OUT,
        LINEAR;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return AnimationTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallAnimation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PaywallAnimation(int i, AnimationType animationType, int i2, int i3, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, PaywallAnimation$$serializer.INSTANCE.getDescriptor());
        }
        this.type = animationType;
        this.msDelay = i2;
        this.msDuration = i3;
    }

    public static /* synthetic */ void getMsDelay$annotations() {
    }

    public static /* synthetic */ void getMsDuration$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallAnimation paywallAnimation, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, AnimationTypeSerializer.INSTANCE, paywallAnimation.type);
        dVar.n(eVar, 1, paywallAnimation.msDelay);
        dVar.n(eVar, 2, paywallAnimation.msDuration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallAnimation)) {
            return false;
        }
        PaywallAnimation paywallAnimation = (PaywallAnimation) obj;
        return this.type == paywallAnimation.type && this.msDelay == paywallAnimation.msDelay && this.msDuration == paywallAnimation.msDuration;
    }

    public final /* synthetic */ int getMsDelay() {
        return this.msDelay;
    }

    public final /* synthetic */ int getMsDuration() {
        return this.msDuration;
    }

    public final /* synthetic */ AnimationType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.msDelay) * 31) + this.msDuration;
    }

    public String toString() {
        return "PaywallAnimation(type=" + this.type + ", msDelay=" + this.msDelay + ", msDuration=" + this.msDuration + ')';
    }

    public PaywallAnimation(AnimationType animationType, int i, int i2) {
        t.g(animationType, "type");
        this.type = animationType;
        this.msDelay = i;
        this.msDuration = i2;
    }
}
