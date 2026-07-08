package com.microsoft.gctoolkit.integration.shared;

import com.microsoft.gctoolkit.aggregator.Aggregation;
import com.microsoft.gctoolkit.parser.UnifiedG1GCParser;

public abstract class SharedAggregation extends Aggregation {

    public double getRuntimeDuration() { return super.estimatedRuntime(); }

    public void setParser(UnifiedG1GCParser parser) {}

}
