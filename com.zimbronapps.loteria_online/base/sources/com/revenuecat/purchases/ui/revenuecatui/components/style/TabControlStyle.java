package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface TabControlStyle extends ComponentStyle {

    public static final class Buttons implements TabControlStyle {
        public static final int $stable = 0;
        private final Size size;
        private final StackComponentStyle stack;
        private final boolean visible;

        public Buttons(StackComponentStyle stack) {
            t.g(stack, "stack");
            this.stack = stack;
            this.visible = stack.getVisible();
            this.size = stack.getSize();
        }

        public static /* synthetic */ Buttons copy$default(Buttons buttons, StackComponentStyle stackComponentStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                stackComponentStyle = buttons.stack;
            }
            return buttons.copy(stackComponentStyle);
        }

        public final StackComponentStyle component1() {
            return this.stack;
        }

        public final Buttons copy(StackComponentStyle stack) {
            t.g(stack, "stack");
            return new Buttons(stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Buttons) && t.c(this.stack, ((Buttons) obj).stack);
        }

        public Size getSize() {
            return this.size;
        }

        public final /* synthetic */ StackComponentStyle getStack() {
            return this.stack;
        }

        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        public String toString() {
            return "Buttons(stack=" + this.stack + ')';
        }
    }

    public static final class Toggle implements TabControlStyle {
        public static final int $stable = 0;
        private final Size size;
        private final StackComponentStyle stack;
        private final boolean visible;

        public Toggle(StackComponentStyle stack) {
            t.g(stack, "stack");
            this.stack = stack;
            this.visible = stack.getVisible();
            this.size = stack.getSize();
        }

        public static /* synthetic */ Toggle copy$default(Toggle toggle, StackComponentStyle stackComponentStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                stackComponentStyle = toggle.stack;
            }
            return toggle.copy(stackComponentStyle);
        }

        public final StackComponentStyle component1() {
            return this.stack;
        }

        public final Toggle copy(StackComponentStyle stack) {
            t.g(stack, "stack");
            return new Toggle(stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Toggle) && t.c(this.stack, ((Toggle) obj).stack);
        }

        public Size getSize() {
            return this.size;
        }

        public final /* synthetic */ StackComponentStyle getStack() {
            return this.stack;
        }

        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        public String toString() {
            return "Toggle(stack=" + this.stack + ')';
        }
    }
}
