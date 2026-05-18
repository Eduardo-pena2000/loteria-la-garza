package org.apache.tika.pipes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.PipesResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PipesReporterBase extends PipesReporter implements Initializable {
    private StatusFilter statusFilter;
    private final Set includes = new HashSet();
    private final Set excludes = new HashSet();

    public static class AcceptAllFilter extends StatusFilter {
        public /* synthetic */ AcceptAllFilter(d dVar) {
            this();
        }

        public boolean accept(PipesResult.STATUS status) {
            return true;
        }

        private AcceptAllFilter() {
            super(null);
        }
    }

    public static class ExcludesFilter extends StatusFilter {
        private final Set excludes;

        public ExcludesFilter(Set set) {
            super(null);
            this.excludes = set;
        }

        public boolean accept(PipesResult.STATUS status) {
            return !this.excludes.contains(status);
        }
    }

    public static class IncludesFilter extends StatusFilter {
        private final Set includes;

        public /* synthetic */ IncludesFilter(Set set, d dVar) {
            this(set);
        }

        public boolean accept(PipesResult.STATUS status) {
            return this.includes.contains(status);
        }

        private IncludesFilter(Set set) {
            super(null);
            this.includes = set;
        }
    }

    public static abstract class StatusFilter {
        public /* synthetic */ StatusFilter(d dVar) {
            this();
        }

        public abstract boolean accept(PipesResult.STATUS status);

        private StatusFilter() {
        }
    }

    private StatusFilter buildStatusFilter(Set set, Set set2) throws TikaConfigException {
        if (set.size() <= 0 || set2.size() <= 0) {
            return set.size() > 0 ? new IncludesFilter(set, null) : set2.size() > 0 ? new ExcludesFilter(set2) : new AcceptAllFilter(null);
        }
        throw new TikaConfigException("Only one of includes and excludes may have any contents");
    }

    private String getOptionString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (PipesResult.STATUS status : PipesResult.STATUS.values()) {
            i++;
            if (i > 1) {
                sb.append(", ");
            }
            sb.append(status.name());
        }
        return sb.toString();
    }

    public boolean accept(PipesResult.STATUS status) {
        return this.statusFilter.accept(status);
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
    }

    public void initialize(Map map) throws TikaConfigException {
        this.statusFilter = buildStatusFilter(this.includes, this.excludes);
    }

    @Field
    public void setExcludes(List list) throws TikaConfigException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                this.excludes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e) {
                throw new TikaConfigException("I regret I don't recognize " + str + ". I only understand: " + getOptionString(), e);
            }
        }
    }

    @Field
    public void setIncludes(List list) throws TikaConfigException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                this.includes.add(PipesResult.STATUS.valueOf(str));
            } catch (IllegalArgumentException e) {
                throw new TikaConfigException("I regret I don't recognize " + str + ". I only understand: " + getOptionString(), e);
            }
        }
    }
}
