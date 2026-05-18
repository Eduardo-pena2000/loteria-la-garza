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
public final class PaywallTransition {
    public static final Companion Companion = new Companion(null);
    private final PaywallAnimation animation;
    private final DisplacementStrategy displacementStrategy;
    private final TransitionType type;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallTransition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public enum DisplacementStrategy {
        GREEDY,
        LAZY;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return DisplacementStrategyDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    public enum TransitionType {
        FADE,
        FADE_AND_SCALE,
        SCALE,
        SLIDE;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return TransitionTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @e
    public /* synthetic */ PaywallTransition(int i, TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, t0 t0Var) {
        if (2 != (i & 2)) {
            f0.a(i, 2, PaywallTransition$$serializer.INSTANCE.getDescriptor());
        }
        this.type = (i & 1) == 0 ? TransitionType.FADE : transitionType;
        this.displacementStrategy = displacementStrategy;
        if ((i & 4) == 0) {
            this.animation = null;
        } else {
            this.animation = paywallAnimation;
        }
    }

    public static /* synthetic */ void getDisplacementStrategy$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallTransition paywallTransition, d dVar, qb.e eVar) {
        if (dVar.e(eVar, 0) || paywallTransition.type != TransitionType.FADE) {
            dVar.k(eVar, 0, TransitionTypeSerializer.INSTANCE, paywallTransition.type);
        }
        dVar.k(eVar, 1, DisplacementStrategyDeserializer.INSTANCE, paywallTransition.displacementStrategy);
        if (!dVar.e(eVar, 2) && paywallTransition.animation == null) {
            return;
        }
        dVar.j(eVar, 2, PaywallAnimation$$serializer.INSTANCE, paywallTransition.animation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallTransition)) {
            return false;
        }
        PaywallTransition paywallTransition = (PaywallTransition) obj;
        return this.type == paywallTransition.type && this.displacementStrategy == paywallTransition.displacementStrategy && t.c(this.animation, paywallTransition.animation);
    }

    public final /* synthetic */ PaywallAnimation getAnimation() {
        return this.animation;
    }

    public final /* synthetic */ DisplacementStrategy getDisplacementStrategy() {
        return this.displacementStrategy;
    }

    public final /* synthetic */ TransitionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.type.hashCode() * 31) + this.displacementStrategy.hashCode()) * 31;
        PaywallAnimation paywallAnimation = this.animation;
        return hashCode + (paywallAnimation == null ? 0 : paywallAnimation.hashCode());
    }

    public String toString() {
        return "PaywallTransition(type=" + this.type + ", displacementStrategy=" + this.displacementStrategy + ", animation=" + this.animation + ')';
    }

    public PaywallTransition(TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation) {
        t.g(transitionType, "type");
        t.g(displacementStrategy, "displacementStrategy");
        this.type = transitionType;
        this.displacementStrategy = displacementStrategy;
        this.animation = paywallAnimation;
    }

    public /* synthetic */ PaywallTransition(TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, int i, k kVar) {
        this((i & 1) != 0 ? TransitionType.FADE : transitionType, displacementStrategy, (i & 4) != 0 ? null : paywallAnimation);
    }
}
