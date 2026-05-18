package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import Ca.o;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ActionSurrogate {
    public static final Companion Companion = new Companion(null);
    private final DestinationSurrogate destination;
    private final ButtonComponent.Destination.Sheet sheet;
    private final ActionTypeSurrogate type;
    private final UrlSurrogate url;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ActionSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DestinationSurrogate.values().length];
            try {
                iArr[DestinationSurrogate.customer_center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DestinationSurrogate.privacy_policy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DestinationSurrogate.terms.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DestinationSurrogate.url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DestinationSurrogate.sheet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DestinationSurrogate.unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionTypeSurrogate.values().length];
            try {
                iArr2[ActionTypeSurrogate.unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActionTypeSurrogate.restore_purchases.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_back.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ActionTypeSurrogate.navigate_to.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @e
    public /* synthetic */ ActionSurrogate(int i, ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ActionSurrogate$$serializer.INSTANCE.getDescriptor());
        }
        this.type = actionTypeSurrogate;
        if ((i & 2) == 0) {
            this.destination = null;
        } else {
            this.destination = destinationSurrogate;
        }
        if ((i & 4) == 0) {
            this.url = null;
        } else {
            this.url = urlSurrogate;
        }
        if ((i & 8) == 0) {
            this.sheet = null;
        } else {
            this.sheet = sheet;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ActionSurrogate actionSurrogate, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, ActionTypeSurrogateDeserializer.INSTANCE, actionSurrogate.type);
        if (dVar.e(eVar, 1) || actionSurrogate.destination != null) {
            dVar.j(eVar, 1, DestinationSurrogateDeserializer.INSTANCE, actionSurrogate.destination);
        }
        if (dVar.e(eVar, 2) || actionSurrogate.url != null) {
            dVar.j(eVar, 2, UrlSurrogate$$serializer.INSTANCE, actionSurrogate.url);
        }
        if (!dVar.e(eVar, 3) && actionSurrogate.sheet == null) {
            return;
        }
        dVar.j(eVar, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, actionSurrogate.sheet);
    }

    public final DestinationSurrogate getDestination() {
        return this.destination;
    }

    public final ButtonComponent.Destination.Sheet getSheet() {
        return this.sheet;
    }

    public final ActionTypeSurrogate getType() {
        return this.type;
    }

    public final UrlSurrogate getUrl() {
        return this.url;
    }

    public final ButtonComponent.Action toAction() {
        ButtonComponent.Destination destination;
        int i = WhenMappings.$EnumSwitchMapping$1[this.type.ordinal()];
        if (i == 1) {
            return ButtonComponent.Action.Unknown.INSTANCE;
        }
        if (i == 2) {
            return ButtonComponent.Action.RestorePurchases.INSTANCE;
        }
        if (i == 3) {
            return ButtonComponent.Action.NavigateBack.INSTANCE;
        }
        if (i != 4) {
            throw new o();
        }
        DestinationSurrogate destinationSurrogate = this.destination;
        switch (destinationSurrogate == null ? -1 : WhenMappings.$EnumSwitchMapping$0[destinationSurrogate.ordinal()]) {
            case -1:
                throw new IllegalStateException("`destination` cannot be null when `action` is `navigate_to`.");
            case 0:
            default:
                throw new o();
            case 1:
                destination = ButtonComponent.Destination.CustomerCenter.INSTANCE;
                break;
            case 2:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `privacy_policy`.");
                }
                destination = new ButtonComponent.Destination.PrivacyPolicy(this.url.getUrl_lid-z7Tp-4o(), this.url.getMethod(), null);
                break;
            case 3:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `terms`.");
                }
                destination = new ButtonComponent.Destination.Terms(this.url.getUrl_lid-z7Tp-4o(), this.url.getMethod(), null);
                break;
            case 4:
                if (this.url == null) {
                    throw new IllegalStateException("`url` cannot be null when `destination` is `url`.");
                }
                destination = new ButtonComponent.Destination.Url(this.url.getUrl_lid-z7Tp-4o(), this.url.getMethod(), null);
                break;
            case 5:
                destination = this.sheet;
                if (destination == null) {
                    throw new IllegalStateException("`sheet` cannot be null when `destination` is `sheet`.");
                }
                break;
            case 6:
                destination = ButtonComponent.Destination.Unknown.INSTANCE;
                break;
        }
        return new ButtonComponent.Action.NavigateTo(destination);
    }

    public ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet) {
        t.g(actionTypeSurrogate, "type");
        this.type = actionTypeSurrogate;
        this.destination = destinationSurrogate;
        this.url = urlSurrogate;
        this.sheet = sheet;
    }

    public /* synthetic */ ActionSurrogate(ActionTypeSurrogate actionTypeSurrogate, DestinationSurrogate destinationSurrogate, UrlSurrogate urlSurrogate, ButtonComponent.Destination.Sheet sheet, int i, k kVar) {
        this(actionTypeSurrogate, (i & 2) != 0 ? null : destinationSurrogate, (i & 4) != 0 ? null : urlSurrogate, (i & 8) != 0 ? null : sheet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ActionSurrogate(com.revenuecat.purchases.paywalls.components.ButtonComponent.Action r9) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ActionSurrogate.<init>(com.revenuecat.purchases.paywalls.components.ButtonComponent$Action):void");
    }
}
