package com.revenuecat.purchases;

import Ca.o;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum Store {
    APP_STORE,
    MAC_APP_STORE,
    PLAY_STORE,
    STRIPE,
    PROMOTIONAL,
    UNKNOWN_STORE,
    AMAZON,
    RC_BILLING,
    EXTERNAL,
    PADDLE,
    TEST_STORE,
    GALAXY;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final /* synthetic */ Store fromString(String str) {
            t.g(str, "text");
            switch (str.hashCode()) {
                case -1820761141:
                    if (str.equals("external")) {
                        return Store.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (str.equals("rc_billing")) {
                        return Store.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (str.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -1253268720:
                    if (str.equals("galaxy")) {
                        return Store.GALAXY;
                    }
                    break;
                case -995842198:
                    if (str.equals("paddle")) {
                        return Store.PADDLE;
                    }
                    break;
                case -891985843:
                    if (str.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (str.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (str.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (str.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (str.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
                case 2070440692:
                    if (str.equals("test_store")) {
                        return Store.TEST_STORE;
                    }
                    break;
            }
            return Store.UNKNOWN_STORE;
        }

        public final ob.b serializer() {
            return StoreSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.APP_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.MAC_APP_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Store.STRIPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Store.PROMOTIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Store.UNKNOWN_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Store.RC_BILLING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Store.EXTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Store.PADDLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Store.TEST_STORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final /* synthetic */ String getManagementUrl$purchases_defaultsBc8Release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 3) {
            return "https://play.google.com/store/account/subscriptions";
        }
        if (i != 12) {
            return null;
        }
        return "samsungapps://SubscriptionList/";
    }

    public final String getStringValue$purchases_defaultsBc8Release() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return "app_store";
            case 2:
                return "mac_app_store";
            case 3:
                return "play_store";
            case 4:
                return "stripe";
            case 5:
                return "promotional";
            case 6:
                return "unknown";
            case 7:
                return "amazon";
            case 8:
                return "rc_billing";
            case 9:
                return "external";
            case 10:
                return "paddle";
            case 11:
                return "test_store";
            case 12:
                return "galaxy";
            default:
                throw new o();
        }
    }
}
