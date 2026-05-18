package com.unity3d.ads.core.data.repository;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface FocusState {

    public static final class Focused implements FocusState {
        private final WeakReference activity;

        public Focused(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = focused.getActivity();
            }
            return focused.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Focused copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Focused(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Focused) && t.c(getActivity(), ((Focused) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Focused(activity=" + getActivity() + ')';
        }
    }

    public static final class Unfocused implements FocusState {
        private final WeakReference activity;

        public Unfocused(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = unfocused.getActivity();
            }
            return unfocused.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Unfocused copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Unfocused(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unfocused) && t.c(getActivity(), ((Unfocused) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Unfocused(activity=" + getActivity() + ')';
        }
    }

    WeakReference getActivity();
}
