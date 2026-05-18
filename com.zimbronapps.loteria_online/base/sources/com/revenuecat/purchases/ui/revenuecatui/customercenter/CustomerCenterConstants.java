package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterConstants {
    public static final int $stable = 0;
    public static final CustomerCenterConstants INSTANCE = new CustomerCenterConstants();

    public static final class Card {
        public static final int $stable = 0;
        private static final float BADGE_CORNER_SIZE;
        private static final float CARD_PADDING;
        public static final long COLOR_BADGE_ACTIVE = 2568082563L;
        public static final int COLOR_BADGE_CANCELLED = 871519323;
        public static final int COLOR_BADGE_EXPIRED = 438115104;
        public static final int COLOR_BADGE_FREE_TRIAL = 1542834780;
        public static final float LIFETIME_BORDER_ALPHA = 0.29f;
        private static final float MIDDLE_CORNER_SIZE;
        private static final float ROUNDED_CORNER_SIZE;
        private static final float TITLE_ROW_BOTTOM_PADDING;
        public static final Card INSTANCE = new Card();
        private static final float BADGE_HORIZONTAL_PADDING = h.g(8);
        private static final float BADGE_VERTICAL_PADDING = h.g(2);

        static {
            float f = 24;
            ROUNDED_CORNER_SIZE = h.g(f);
            float f2 = 4;
            MIDDLE_CORNER_SIZE = h.g(f2);
            BADGE_CORNER_SIZE = h.g(f2);
            CARD_PADDING = h.g(f);
            TITLE_ROW_BOTTOM_PADDING = h.g(f2);
        }

        private Card() {
        }

        public final float getBADGE_CORNER_SIZE-D9Ej5fM() {
            return BADGE_CORNER_SIZE;
        }

        public final float getBADGE_HORIZONTAL_PADDING-D9Ej5fM() {
            return BADGE_HORIZONTAL_PADDING;
        }

        public final float getBADGE_VERTICAL_PADDING-D9Ej5fM() {
            return BADGE_VERTICAL_PADDING;
        }

        public final float getCARD_PADDING-D9Ej5fM() {
            return CARD_PADDING;
        }

        public final float getMIDDLE_CORNER_SIZE-D9Ej5fM() {
            return MIDDLE_CORNER_SIZE;
        }

        public final float getROUNDED_CORNER_SIZE-D9Ej5fM() {
            return ROUNDED_CORNER_SIZE;
        }

        public final float getTITLE_ROW_BOTTOM_PADDING-D9Ej5fM() {
            return TITLE_ROW_BOTTOM_PADDING;
        }
    }

    public static final class Layout {
        public static final int $stable = 0;
        private static final float BUTTONS_BOTTOM_PADDING;
        private static final float BUTTONS_TOP_PADDING;
        private static final float SECTION_SPACING;
        private static final float SECTION_TITLE_BOTTOM_PADDING;
        private static final float TOP_PADDING_AFTER_TOP_BAR;
        public static final Layout INSTANCE = new Layout();
        private static final float HORIZONTAL_PADDING = h.g(16);
        private static final float ITEMS_SPACING = h.g(2);
        private static final float BUTTONS_SPACING = h.g(12);

        static {
            float f = 8;
            TOP_PADDING_AFTER_TOP_BAR = h.g(f);
            float f2 = 24;
            SECTION_SPACING = h.g(f2);
            SECTION_TITLE_BOTTOM_PADDING = h.g(f);
            BUTTONS_TOP_PADDING = h.g(f2);
            BUTTONS_BOTTOM_PADDING = h.g(f2);
        }

        private Layout() {
        }

        public final float getBUTTONS_BOTTOM_PADDING-D9Ej5fM() {
            return BUTTONS_BOTTOM_PADDING;
        }

        public final float getBUTTONS_SPACING-D9Ej5fM() {
            return BUTTONS_SPACING;
        }

        public final float getBUTTONS_TOP_PADDING-D9Ej5fM() {
            return BUTTONS_TOP_PADDING;
        }

        public final float getHORIZONTAL_PADDING-D9Ej5fM() {
            return HORIZONTAL_PADDING;
        }

        public final float getITEMS_SPACING-D9Ej5fM() {
            return ITEMS_SPACING;
        }

        public final float getSECTION_SPACING-D9Ej5fM() {
            return SECTION_SPACING;
        }

        public final float getSECTION_TITLE_BOTTOM_PADDING-D9Ej5fM() {
            return SECTION_TITLE_BOTTOM_PADDING;
        }

        public final float getTOP_PADDING_AFTER_TOP_BAR-D9Ej5fM() {
            return TOP_PADDING_AFTER_TOP_BAR;
        }
    }

    public static final class Management {
        public static final int $stable = 0;
        public static final Management INSTANCE = new Management();
        public static final String MANAGEMENT_URL = "https://play.google.com/store/account/subscriptions";

        private Management() {
        }
    }

    private CustomerCenterConstants() {
    }
}
