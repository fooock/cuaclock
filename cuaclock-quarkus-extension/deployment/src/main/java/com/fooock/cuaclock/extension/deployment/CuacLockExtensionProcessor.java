package com.fooock.cuaclock.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

/**
 * Library main extension processor
 */
public class CuacLockExtensionProcessor {
    private static final String FEATURE = "cuaclock-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
