package com.unity3d.ads.core.domain;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface LifecycleEvent {

    public static final class Created implements LifecycleEvent {
        private final WeakReference activity;
        private final Bundle bundle;

        public Created(WeakReference activity, Bundle bundle) {
            t.g(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final Created copy(WeakReference activity, Bundle bundle) {
            t.g(activity, "activity");
            return new Created(activity, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Created)) {
                return false;
            }
            Created created = (Created) obj;
            return t.c(getActivity(), created.getActivity()) && t.c(this.bundle, created.bundle);
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int hashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    public static final class Destroyed implements LifecycleEvent {
        private final WeakReference activity;

        public Destroyed(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Destroyed copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Destroyed(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Destroyed) && t.c(getActivity(), ((Destroyed) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }
    }

    public static final class Paused implements LifecycleEvent {
        private final WeakReference activity;

        public Paused(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Paused copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Paused(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && t.c(getActivity(), ((Paused) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }
    }

    public static final class Resumed implements LifecycleEvent {
        private final WeakReference activity;

        public Resumed(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Resumed copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Resumed(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resumed) && t.c(getActivity(), ((Resumed) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }
    }

    public static final class SaveInstanceState implements LifecycleEvent {
        private final WeakReference activity;
        private final Bundle bundle;

        public SaveInstanceState(WeakReference activity, Bundle bundle) {
            t.g(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Bundle component2() {
            return this.bundle;
        }

        public final SaveInstanceState copy(WeakReference activity, Bundle bundle) {
            t.g(activity, "activity");
            return new SaveInstanceState(activity, bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) obj;
            return t.c(getActivity(), saveInstanceState.getActivity()) && t.c(this.bundle, saveInstanceState.bundle);
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int hashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return hashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        public String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    public static final class Started implements LifecycleEvent {
        private final WeakReference activity;

        public Started(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Started copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Started(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && t.c(getActivity(), ((Started) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Started(activity=" + getActivity() + ')';
        }
    }

    public static final class Stopped implements LifecycleEvent {
        private final WeakReference activity;

        public Stopped(WeakReference activity) {
            t.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i, Object obj) {
            if ((i & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        public final WeakReference component1() {
            return getActivity();
        }

        public final Stopped copy(WeakReference activity) {
            t.g(activity, "activity");
            return new Stopped(activity);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && t.c(getActivity(), ((Stopped) obj).getActivity());
        }

        public WeakReference getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        public String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }
    }

    WeakReference getActivity();
}
